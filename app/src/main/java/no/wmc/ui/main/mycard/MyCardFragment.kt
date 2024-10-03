package no.wmc.ui.main.mycard

import android.app.AlertDialog
import android.app.ProgressDialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.android.billingclient.api.AcknowledgePurchaseParams
import com.android.billingclient.api.BillingClient
import com.android.billingclient.api.BillingClientStateListener
import com.android.billingclient.api.BillingFlowParams
import com.android.billingclient.api.BillingResult
import com.android.billingclient.api.ConsumeParams
import com.android.billingclient.api.ProductDetails
import com.android.billingclient.api.Purchase
import com.android.billingclient.api.PurchasesResponseListener
import com.android.billingclient.api.PurchasesUpdatedListener
import com.android.billingclient.api.QueryProductDetailsParams
import com.android.billingclient.api.QueryPurchasesParams
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.common.collect.ImmutableList
import com.google.firebase.firestore.DocumentSnapshot
import com.google.gson.Gson

import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import no.wmc.BuildConfig
import no.wmc.R
import no.wmc.data.local.manager.LocalDataManager
import no.wmc.data.local.manager.SharedPrefManager
import no.wmc.data.manager.RedeemCodeManager
import no.wmc.data.remote.API_TIMEOUT
import no.wmc.data.remote.model.ProfileDtoModel

import no.wmc.data.remote.providers.FireStoreProvider
import no.wmc.data.remote.service.CardOrderApiService
import no.wmc.databinding.DialogConfirmOrderCardBinding
import no.wmc.databinding.FragmentMyCardBinding
import no.wmc.domain.DataState
import no.wmc.domain.model.Profile
import no.wmc.firebase.helper.FireStoreHelper
import no.wmc.firebase.interfaces.FireStoreGetUserInterface
import no.wmc.utils.Utility
import no.wmc.utils.ext.setAuth
import no.wmc.utils.ext.setEmptyResponseHandler
import no.wmc.utils.ext.showToast
import okhttp3.Interceptor
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import retrofit2.Retrofit
import retrofit2.await
import retrofit2.converter.scalars.ScalarsConverterFactory
import timber.log.Timber
import java.net.SocketTimeoutException
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.concurrent.TimeUnit

class MyCardFragment : Fragment()
{

    companion object
    {
        var isShown = false
        var cardOrdered = false
    }

    private val sharedPrefManage: SharedPrefManager by inject()
    private val localDataManager: LocalDataManager by inject()
    private val fireStoreProvider: FireStoreProvider by inject()
    private val redeemCodeManager by lazy { RedeemCodeManager(get()) }
    private lateinit var binding: FragmentMyCardBinding
    private var hasActiveSub: Boolean = false;
    private var CARD_REORDER_ID = "wmc_card_reorder"
    private lateinit var billingClient: BillingClient
    private val cardOrderApiService: CardOrderApiService by lazy {
        val client = okhttp3.OkHttpClient.Builder()
            .connectTimeout(240, TimeUnit.SECONDS)
            .readTimeout(240, TimeUnit.SECONDS)
            .addInterceptor(RetryInterceptor(3))
            .writeTimeout(240, TimeUnit.SECONDS).build()

        Retrofit.Builder().baseUrl(BuildConfig.API_BASE_URL_NEW)
            .addConverterFactory(ScalarsConverterFactory.create()).client(client).build()
            .create(CardOrderApiService::class.java)
    }

    class RetryInterceptor(private val maxRetries: Int) : Interceptor
    {
        override fun intercept(chain: Interceptor.Chain): Response
        {
            var request = chain.request()
            var response = chain.proceed(request)
            var tryCount = 0

            while (!response.isSuccessful && tryCount < maxRetries) {
                tryCount++
                response.close()
                request = request.newBuilder().build()
                response = chain.proceed(request)
            }

            return response
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View
    {

        binding = FragmentMyCardBinding.inflate(inflater, container, false)
        return binding.root
    }


    private val purchasesUpdatedListener = PurchasesUpdatedListener { billingResult, purchases ->
        if (billingResult.responseCode == BillingClient.BillingResponseCode.OK && purchases != null)
        {
            purchases.firstOrNull()?.let {
                handlePurchase(it)

            }
        } else if (billingResult.responseCode == BillingClient.BillingResponseCode.USER_CANCELED)
        {
            showToast(getString(R.string.transaction_cancelled))
        } else if (billingResult.responseCode == BillingClient.BillingResponseCode.ITEM_ALREADY_OWNED)
        {
            orderCard()
        } else
        {
            showToast("${getString(R.string.something_went_wrong)} - 1003")
        }
    }

    private var purchase: Purchase? = null
    fun queryPreviousPurchases()
    {

        billingClient.queryPurchasesAsync(
            QueryPurchasesParams.newBuilder().setProductType(BillingClient.ProductType.INAPP)
                .build()
        ) { p0, purchases ->
            if (p0.responseCode == BillingClient.BillingResponseCode.OK)
            {

                if (purchases.isNotEmpty() && purchases[0].purchaseState == Purchase.PurchaseState.PURCHASED)
                {
                    if (purchases.first().isAcknowledged.not())
                    {
                        purchase = purchases.first();
                    } //    consumePurchase(purchases.first())
                }

            }
        }
    }


    private fun handlePurchase(purchase: Purchase)
    {
        if (purchase.purchaseState == Purchase.PurchaseState.PURCHASED)
        {
            this.purchase = purchase;
            orderCard()
            consumePurchase(purchase)
        } else
        {
            showToast("${getString(R.string.something_went_wrong)} - Purchase State: ${purchase.purchaseState} - 1005")
        }
    }

    private fun consumePurchase(purchase: Purchase)
    {
        val consumeParams = ConsumeParams.newBuilder().setPurchaseToken(purchase.purchaseToken)
            .build()
        billingClient.consumeAsync(consumeParams) { billingResult, purchaseToken -> //
        }
        if (!purchase.isAcknowledged)
        {
            val acknowledgePurchaseParams = AcknowledgePurchaseParams.newBuilder()
                .setPurchaseToken(purchase.purchaseToken)
            billingClient.acknowledgePurchase(acknowledgePurchaseParams.build()) {}
        }
    }

    private var reorderProduct: ProductDetails? = null
    private fun getProducts()
    {
        val queryProductDetailsParams = QueryProductDetailsParams.newBuilder().setProductList(
            ImmutableList.of(
                QueryProductDetailsParams.Product.newBuilder().setProductId(CARD_REORDER_ID)
                    .setProductType(BillingClient.ProductType.INAPP).build()
            )
        ).build()
        billingClient.queryProductDetailsAsync(queryProductDetailsParams) { billingResult, productDetailsList ->
            if (billingResult.responseCode == BillingClient.BillingResponseCode.OK)
            {

                productDetailsList.firstOrNull()?.let {
                    reorderProduct = it;
                }


            } else
            {
                showToast("${getString(R.string.something_went_wrong)} - 1002")
            }
        }
    }

    private fun initPlayBilling()
    {
        billingClient = BillingClient.newBuilder(context!!).setListener(purchasesUpdatedListener)
            .enablePendingPurchases().build()
        billingClient.startConnection(object : BillingClientStateListener
        {
            override fun onBillingSetupFinished(billingResult: BillingResult)
            {
                if (billingResult.responseCode == BillingClient.BillingResponseCode.OK)
                {
                    Timber.e("Connected")
                    getProducts();
                    queryPreviousPurchases()
                } else
                {
                    showToast("${getString(R.string.something_went_wrong)} - 1001")
                }
            }

            override fun onBillingServiceDisconnected()
            {
                Timber.e("Disconnected")
                showToast(getString(R.string.play_store_disconnected))
            }
        })
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)


        loadActiveSub()
        binding.lytInvite.setOnClickListener {
            Utility.shareAppLink(requireContext())
        }
        binding.lytShare.setOnClickListener {
            shareUserDate()
        }
        binding.lytDocument.setOnClickListener {

            Bundle().apply {
                putBoolean("view_doc", true)
                findNavController().navigate(R.id.homeNew2, this)
            }

        }
        binding.imgReorder.setOnClickListener { confirmCardInfoCorrect(true) }

        initPlayBilling()
    }

    private fun initPurchase()
    {
        try
        {

            if (reorderProduct == null)
            {

                showToast("Product not loaded yet")
                return
            }
            val productDetailsParamsList = listOf(
                BillingFlowParams.ProductDetailsParams.newBuilder()
                    .setProductDetails(reorderProduct!!).build()
            )
            val billingFlowParams = BillingFlowParams.newBuilder()
                .setProductDetailsParamsList(productDetailsParamsList).build()
            val billingResult = billingClient.launchBillingFlow(activity!!, billingFlowParams)
            Timber.e("GooglePlay - ${billingResult.responseCode} / ${billingResult.debugMessage}")

        } catch (e: Exception)
        {
            showToast("Error buying product..")
            e.printStackTrace()
        }
    }

    private fun loadActiveSub()
    {
        lifecycleScope.launch {
            val email = localDataManager.getCredentials()!!.email
            val uid = localDataManager.getCredentials()!!.id
            val hasActivePromo = redeemCodeManager.hasActivePromo(uid)
            if (hasActivePromo is DataState.Success)
            {
                hasActiveSub = true
            } else
            {
                val subscription = fireStoreProvider.getSubscription(uid)
                if (subscription)
                {
                    hasActiveSub = true
                }
            }
            binding.imgOrderFree.setOnClickListener {
                if (hasActiveSub)
                {
                    confirmCardInfoCorrect(false)
                } else
                {
                    initPurchase()
                }
            }

            loadData()

        }

    }

    private fun shareUserDate()
    {

        lifecycleScope.launch {

            val jsonUser = sharedPrefManage.getString("user_date")
            if (jsonUser != null)
            {
                val gsn = Gson()
                val diagnoses = sharedPrefManage.getString("diagnoses", "")
                val medicine = sharedPrefManage.getString("medicine", "")
                val allergies = sharedPrefManage.getString("allergies", "")
                val vaccines = sharedPrefManage.getString("vaccines", "")
                val requireModel: Profile = gsn.fromJson(jsonUser.toString(), Profile::class.java)
                var shareText = requireModel.toString()


                shareText = "$shareText\n\nDiagnoses : $diagnoses"
                shareText = "$shareText\n\nMedicines : $medicine"
                shareText = "$shareText\n\nAllergies : $allergies"
                shareText = "$shareText\n\nVaccines  : $vaccines"
                Utility.shareText(requireContext(), shareText)
            }

        }
    }

    fun confirmCardInfoCorrect(needPurchase: Boolean)
    {


        val dialogConfirmBinding = DialogConfirmOrderCardBinding.inflate(LayoutInflater.from(requireContext()))

        dialogConfirmBinding.lytNewCard.txtName.text = binding.lytNewCard.txtName.text
        dialogConfirmBinding.lytNewCard.txtBirthDate.text = binding.lytNewCard.txtBirthDate.text
        dialogConfirmBinding.lytNewCard.txtNationalId.text = binding.lytNewCard.txtNationalId.text
        dialogConfirmBinding.lytNewCard.txtIssuedOn.text = "--"

        dialogConfirmBinding.lytNewCard.txtPolicyNumber.text = binding.lytNewCard.txtPolicyNumber.text
        dialogConfirmBinding.lytNewCard.txtEmergencyPhone.text = binding.lytNewCard.txtEmergencyPhone.text
        dialogConfirmBinding.lytNewCard.txtNationality.text = binding.lytNewCard.txtNationality.text
        dialogConfirmBinding.lytNewCard.txtBirthDate.text = binding.lytNewCard.txtBirthDate.text
        dialogConfirmBinding.lytNewCard.txtOrganDonation.text = binding.lytNewCard.txtOrganDonation.text
        dialogConfirmBinding.lytNewCard.txtTravelInsuranceCompanyName.text = binding.lytNewCard.txtTravelInsuranceCompanyName.text

        val dialog=AlertDialog.Builder(requireContext()).setView(dialogConfirmBinding.root).show()
        dialogConfirmBinding.btnOrder.setOnClickListener {
            dialog.dismiss()
            if (needPurchase)
            {
                initPurchase()
                return@setOnClickListener
            }
            orderCard()
        }
        dialogConfirmBinding.btnCancel.setOnClickListener {
            dialog.dismiss()
        }
    }

    suspend fun getUserFromFirebase()
    {

        localDataManager.getCredentials()?.id?.let {
            FireStoreHelper().getUser(it, object : FireStoreGetUserInterface
            {

                override fun onSuccess(chatsData: DocumentSnapshot)
                {

                    val jsonData = Utility.convertToJson(chatsData.data)
                    lifecycleScope.launch { sharedPrefManage.putString("user_date", jsonData) }
                    show(jsonData)
                }

                override fun onError(error: String)
                {
                    Timber.e("onError: " + error)
                }
            })
        }
    }

    private fun loadData()
    {

        lifecycleScope.launch {
            val jsonUser = sharedPrefManage.getString("user_date")
            if (jsonUser != null)
            {
                show(jsonUser)
            } else
            {
                getUserFromFirebase()
            }

        }
    }

    var progressDialog: ProgressDialog? = null
    fun showLoadingDialog()
    {
        if (progressDialog == null)
        {
            progressDialog = ProgressDialog(requireContext())
            progressDialog?.setMessage("Please Wait..");
        }
        if (progressDialog!!.isShowing)
        {
            progressDialog?.dismiss()
        }
        progressDialog?.show()

    }

    fun hideLoadingDialog()
    {
        if (progressDialog?.isShowing == true)
        {
            progressDialog?.dismiss()
        }
    }


    private fun show(jsonUser: String?)
    {

        jsonUser?.let {
            val gsn = Gson()
            val profile: Profile = gsn.fromJson(it, Profile::class.java)
            profile.apply {
                binding.lytNewCard.txtName.setText("$firstName $lastName")
                binding.lytNewCard.txtBirthDate.text = birthDate
                binding.lytNewCard.txtNationalId.text = if (ssn.isNullOrEmpty()) "---" else ssn
                binding.lytNewCard.txtIssuedOn.text = cardOrderDate ?: "---"

                binding.lytNewCard.txtTravelInsuranceCompanyName.text =profile.insurances?.find { (it.company!=null && it.company!!.isBlank().not()) }?.company?:"N/A"
                binding.lytNewCard.txtPolicyNumber.text =profile.insurances?.find { (it.policy!=null && it.policy!!.isBlank().not()) }?.policy?:"N/A"
                binding.lytNewCard.txtEmergencyPhone.text =profile.emergencyContact?.find { (it.phone!=null && it.phone!!.isBlank().not()) }?.phone?:"N/A"
                binding.lytNewCard.txtNationality.text =profile.nationality?:"N/A"
                binding.lytNewCard.txtBirthDate.text =profile.birthDate?:"N/A"
                binding.lytNewCard.txtOrganDonation.text = if(profile.organDonation==true) "Yes" else "No"


                binding.lytNewCard.txtIssuedOn.text = cardOrderDate ?: "---"

                cardOrdered = sharedPrefManage.getBoolean("card_ordered", false);
                if (hasActiveSub && cardOrderDate.isNullOrEmpty() && cardOrdered.not() && isShown.not())
                {
                    isShown = true
                    showOrderCardDialog()
                }
                if (cardOrderDate.isNullOrEmpty().not())
                {
                    showMedicalInfo(profile)
                } else
                {
                    binding.lytOrderCard.visibility = View.VISIBLE
                }
            }
        }

    }

    private fun showMedicalInfo(profile: Profile)
    {
        binding.lytOrderCard.visibility = View.GONE
        binding.lytCardInfo.visibility = View.VISIBLE
        binding.txtMedicalInfo.text = "Name :" + profile.firstName + " " + profile.lastName
        binding.txtMedicalInfo.append("\n\nId No :" + profile.ssn)
        binding.txtMedicalInfo.append("\n\nDob :" + profile.birthDate)
        binding.txtMedicalInfo.append("\n\nIssued :" + profile.cardOrderDate)

    }

    fun orderCard()
    {
        showLoadingDialog()
        lifecycleScope.launch {
            val email = localDataManager.getCredentials()?.email!!
            val uid = localDataManager.getCredentials()?.id!!
            try
            {

                val result = cardOrderApiService.orderCard(uid).await()
                val profileFsModel = Profile(
                    cardOrderDate = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH).format(Date()),
                    cardOrderStatus = Profile.CardOrderStatus.Registered,
                )
                fireStoreProvider.updateProfile(email, profileFsModel.mapOfOrderCard())
                if (result.lowercase().contains("failed").not())
                {
                    sharedPrefManage.putString("user_date", null)
                    sharedPrefManage.putBoolean("card_ordered", true);
                    loadData()
                    showMessage("Card ordered successfully", "Great")

                } else
                {
                    showMessage("Failed to order card", "Ok");
                }

            } catch (e: Exception)
            {
                e.printStackTrace()
                if (e is SocketTimeoutException)
                {
                    showMessage("Socket Time out. Please try again.", "Ok");
                    return@launch
                }
                showMessage("Failed to order card", "Ok");
            }
            hideLoadingDialog()
        }
    }

    private fun showMessage(message: String, btn: String)
    {
        MaterialAlertDialogBuilder(requireContext()).setMessage(message)
            .setPositiveButton(btn, null).show()
    }

    private fun showOrderCardDialog()
    {
        val orderCard = OrderCardDialog()
        orderCard.onInit = {
            it.orderNowButton.setOnClickListener {
                orderCard.dismiss()
                confirmCardInfoCorrect(false)
            }
        }
        if (lifecycle.currentState == Lifecycle.State.RESUMED) orderCard.showNow(childFragmentManager, "")

    }


}


