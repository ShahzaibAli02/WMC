package no.wmc.ui.subscription.newflow

import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.android.billingclient.api.*
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.common.collect.ImmutableList
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import no.wmc.R
import no.wmc.data.local.manager.LocalDataManager
import no.wmc.data.manager.RedeemCodeManager
import no.wmc.data.remote.model.Promo
import no.wmc.data.remote.model.firestore.SubscriptionFsModel
import no.wmc.databinding.FragmentNewSubscriptionBinding
import no.wmc.domain.DataState
import no.wmc.domain.model.Credential
import no.wmc.domain.model.NewSubscription
import no.wmc.ui.base.BaseViewStateFragment
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState
import no.wmc.ui.subscription.newflow.list.SubscriptionListAdapter
import no.wmc.utils.Const.FireStoreDateFormat
import no.wmc.utils.ext.safeNavigate
import no.wmc.utils.ext.setShow
import no.wmc.utils.ext.showToast
import org.koin.android.ext.android.get
import timber.log.Timber
import java.text.SimpleDateFormat
import java.util.*

class NewSubscriptionFragment : BaseViewStateFragment<FragmentNewSubscriptionBinding, NewSubscriptionViewModel>(R.layout.fragment_new_subscription,
    NewSubscriptionViewModel::class) {

    private lateinit var billingClient: BillingClient
    private val args: NewSubscriptionFragmentArgs by navArgs()
    private val redeemCodeManager by lazy { RedeemCodeManager(get()) }
    private val localDataManager:LocalDataManager = get()
    private val adapter by lazy {
        SubscriptionListAdapter(context!!, onItemClicked = ::onSubscriptionItemClicked)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (args.email.isEmpty()) {
            showToast(getString(R.string.user_reference_not_found))
            findNavController().popBackStack()
        }

        val uid=FirebaseAuth.getInstance().uid!!
        lifecycleScope.launch(Dispatchers.Main){

            if(args.email.isBlank().not() && args.password.isBlank().not())
            {
                localDataManager.saveCredentials(Credential(uid,args.email,args.password))
            }

            initView()
            initPlayBilling()
        }
    }

    private fun initPlayBilling() {
        billingClient = BillingClient.newBuilder(context!!).setListener(purchasesUpdatedListener).enablePendingPurchases().build()
        billingClient.startConnection(object : BillingClientStateListener {
            override fun onBillingSetupFinished(billingResult: BillingResult) {
                if (billingResult.responseCode == BillingClient.BillingResponseCode.OK) {
                    Timber.e("Connected")
                    getProducts();
                }
                else {
                    showToast("${getString(R.string.something_went_wrong)} - 1001")
                }
            }

            override fun onBillingServiceDisconnected() {
                Timber.e("Disconnected")
//                showToast(getString(R.string.play_store_disconnected))
            }
        })
    }

    private lateinit var productDetails: ProductDetails
    private fun getProducts()
    {
        val queryProductDetailsParams = QueryProductDetailsParams.newBuilder()
            .setProductList(ImmutableList.of(QueryProductDetailsParams.Product.newBuilder().setProductId("wmc_personal_safety")
                .setProductType(BillingClient.ProductType.SUBS).build())).build()
        billingClient.queryProductDetailsAsync(queryProductDetailsParams) { billingResult, productDetailsList ->
            if (billingResult.responseCode == BillingClient.BillingResponseCode.OK) {
                productDetailsList.firstOrNull()?.let {
                    productDetails=it
                    it.subscriptionOfferDetails?.getOrNull(0)?.pricingPhases?.pricingPhaseList?.get(0)?.formattedPrice?.let {
                        val price=String.format("%s / year", it)
                        prepareSubscriptionList(price)
                    }
                }
            }
            else {
                showToast("${getString(R.string.something_went_wrong)} - 1002")
            }
        }
    }

    private fun initView() {
        binding.apply {
            toolbar.title = getString(R.string.subscription)
            toolbar.setNavigationIcon(R.drawable.ic_back)
            toolbar.setNavigationOnClickListener { findNavController().popBackStack() }
            subscriptionList.adapter = adapter
            adapter.onClickSub={
                startPurchase()
            }
            adapter.onClickRedeem={
                redeemCode()
            }
        }
        prepareSubscriptionList()
    }

    private fun redeemCode()
    {

        val redeemCodeDialog=RedeemCodeDialog()
        var job:Job?=null
        redeemCodeDialog.onInit={binding->

            fun redeemError(message:String)
            {
                binding.progressBar.visibility=View.GONE
                binding.btnRedeemNow.visibility=View.VISIBLE
                binding.etCode.error=message
            }

            binding.btnCancel.setOnClickListener {
                job?.cancel()
                redeemCodeDialog.dismiss()
            }
            binding.btnRedeemNow.setOnClickListener {
                val code=binding.etCode.editText!!.text.toString()
                if(code.isEmpty())
                    return@setOnClickListener
                binding.progressBar.visibility=View.VISIBLE
                binding.btnRedeemNow.visibility=View.INVISIBLE
                job=lifecycleScope.launch {
                    val uid=FirebaseAuth.getInstance().uid
                    if(uid==null )
                    {
                        redeemError("Error")
                        return@launch
                    }
                    val result=redeemCodeManager.redeemCode(uid,code)
                    if (result is DataState.Error) {
                        redeemError(result.errorMessage!!)
                    }
                    else if (result is DataState.Success)
                    {
                        redeemCodeDialog.dismiss()
                        showSuccesDialog(result.data!!)
                    }
               }
            }
        }
        redeemCodeDialog.showNow(childFragmentManager,"")

    }

    private fun showSuccesDialog(data: Promo)
    {
        MaterialAlertDialogBuilder(requireContext(),R.style.materialDialogTheme)
            .setTitle("Congratulations")
            .setMessage("Promo applied successfully!\nYou got "+data.duration+" for Free")
            .setCancelable(false)
            .setNegativeButton("Great!") { p0, p1 ->
                findNavController().safeNavigate(NewSubscriptionFragmentDirections.subscribeToLogin())
            }
            .show()
    }

    private fun startPurchase()
    {
        if (billingClient.connectionState == BillingClient.ConnectionState.CONNECTED)
        {
            if (::productDetails.isInitialized)
            {
                initPurchase(productDetails)
            }
        } else
        {
            showToast(getString(R.string.play_store_disconnected))
        }
    }

    private fun prepareSubscriptionList(price:String="loading..") {
        val arrayList: ArrayList<NewSubscription> = arrayListOf()
        val benefits: ArrayList<String> = arrayListOf()
        benefits.add("Medical Conditions")
        benefits.add("Insurance Information")
        benefits.add("Emergency Contacts")
        benefits.add("Share Health Profile Online")
        benefits.add("20 different languages")
        benefits.add("Donor Information")
        benefits.add("Covid Vaccine Documentation")
        benefits.add("Printed card with medical information")
        benefits.add("Emergency Code")
        arrayList.add(NewSubscription(name ="Premium",
            price = price,
            R.drawable.img_subscription_plan_3,
            benefits))
        adapter.submitList(arrayList)
    }

    private fun onSubscriptionItemClicked(subscription: NewSubscription) {
        //updateUserInformation()
    }

    private fun initPurchase(productDetails: ProductDetails) {
        try {
            val offerToken = productDetails.subscriptionOfferDetails?.get(0)?.offerToken
            offerToken?.let {
                val productDetailsParamsList =
                    listOf(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).setOfferToken(offerToken).build())
                val billingFlowParams = BillingFlowParams.newBuilder().setProductDetailsParamsList(productDetailsParamsList).build()
                val billingResult = billingClient.launchBillingFlow(activity!!, billingFlowParams)
                Timber.e("GooglePlay - ${billingResult.responseCode} / ${billingResult.debugMessage}")
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private val purchasesUpdatedListener = PurchasesUpdatedListener { billingResult, purchases ->
        if (billingResult.responseCode == BillingClient.BillingResponseCode.OK && purchases != null) {
            for (purchase in purchases) {
                handlePurchase(purchase)
            }
        }
        else if (billingResult.responseCode == BillingClient.BillingResponseCode.USER_CANCELED) {
            showToast(getString(R.string.transaction_cancelled))
        }
        else {
            showToast("${getString(R.string.something_went_wrong)} - 1003")
        }
    }

    private fun handlePurchase(purchase: Purchase) {
        if (purchase.purchaseState == Purchase.PurchaseState.PURCHASED) {

            if (!purchase.isAcknowledged) {
                val acknowledgePurchaseParams = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(purchase.purchaseToken)
                billingClient.acknowledgePurchase(acknowledgePurchaseParams.build()) {
                    if (it.responseCode == BillingClient.BillingResponseCode.OK) {

                    }
                    else {
                        showToast("${getString(R.string.something_went_wrong)} - 1004")
                    }
                }
            }
            updateUserInformation(purchase)
        }
        else {
            showToast("${getString(R.string.something_went_wrong)} - Purchase State: ${purchase.purchaseState} - 1005")
        }
    }

    private fun updateUserInformation(purchase: Purchase) {
        try {
            val dateFormat = SimpleDateFormat(FireStoreDateFormat, Locale.getDefault())
            val purchaseDate = Date(purchase.purchaseTime)
            val calendar = Calendar.getInstance()
            calendar.time = purchaseDate
            calendar.add(Calendar.YEAR, 1)
            val subscription = SubscriptionFsModel(
                email = localDataManager.getCredentials()!!.email,
                content_id = "1",
                created_at = dateFormat.format(purchaseDate),
                expires_at = dateFormat.format(calendar.time),
                sbr_id = purchase.purchaseToken,
                status = "Active",
                trn_id = purchase.orderId,
                updated_at = dateFormat.format(purchaseDate),
                user_id = localDataManager.getCredentials()!!.id)
            CoroutineScope(Dispatchers.Main).launch {
                sendViewEvent(NewSubscriptionViewEvent.AddSubscriptionInFireStore(subscription))
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    override fun handleViewAction(viewAction: ViewAction) {
        super.handleViewAction(viewAction)
        when (viewAction) {
            is NewSubscriptionViewAction.SubscriptionAddedInFireStore -> handleSubscriptionAddedInFireStore(viewAction.viewState)
            else -> throwActionNotSupported(viewAction)
        }
    }

    private fun handleSubscriptionAddedInFireStore(viewState: ViewState<String>) {
        when (viewState) {
            is ViewState.Loading -> {
                binding.loading.setShow(true)
            }
            is ViewState.Success -> {
                binding.loading.setShow(false)
                showToast(getString(R.string.account_created_successfully))
                findNavController().safeNavigate(NewSubscriptionFragmentDirections.subscribeToHome())
            }
            is ViewState.StateError -> {
                binding.loading.setShow(false)
                showErrorMessage(viewState.errorMessage)
                Timber.e(viewState.errorMessage)
            }
        }
    }
}