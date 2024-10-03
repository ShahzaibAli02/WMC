package no.wmc.ui.subscription.overview

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import no.wmc.R
import no.wmc.data.remote.StatusCode
import no.wmc.databinding.SubscriptionOverviewScreenBinding
import no.wmc.domain.model.Subscription
import no.wmc.ui.base.BaseViewStateFragment
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState
import no.wmc.ui.subscription.overview.SubscriptionOverviewViewAction.GetMyMemberSubscriptionsViewAction
import no.wmc.ui.subscription.overview.SubscriptionOverviewViewAction.GetMyOwnSubscriptionsViewAction
import no.wmc.ui.subscription.overview.SubscriptionOverviewViewEvent.GetMyMemberSubscriptionsViewEvent
import no.wmc.ui.subscription.overview.SubscriptionOverviewViewEvent.GetMyOwnSubscriptionsViewEvent
import no.wmc.ui.subscription.overview.list.SubscriptionOverviewAdapter
import no.wmc.utils.ext.dpToPx
import no.wmc.utils.ext.safeNavigate
import timber.log.Timber

class SubscriptionOverviewFragment :
    BaseViewStateFragment<SubscriptionOverviewScreenBinding, SubscriptionOverviewViewModel>(
        R.layout.subscription_overview_screen, SubscriptionOverviewViewModel::class
    ) {

    private lateinit var cancelSubscriptionResultObserver: Unit

    private val adapter by lazy {
        SubscriptionOverviewAdapter(
            ::onSubscriptionItemClicked,
            ::onRemoveMembershipClicked
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
        getMyOwnSubscriptions()
        getMyMemberSubscriptions()
        observeCancelSubscriptionResult()
    }

    private fun initViews() {
        binding.toolbar.setNavigationIcon(R.drawable.ic_back)
        binding.toolbar.setNavigationOnClickListener { findNavController().popBackStack() }

        binding.subscriptionList.adapter = adapter

        if (adapter.currentList.isNotEmpty()) {
            binding.currentSubscription.text =
                getString(R.string.subscription_overview_subtitle, adapter.currentList.size)
        }

        binding.addSubscriptionLayout.isVisible = adapter.currentList.isNotEmpty()
        binding.addSubscriptionButton.setOnClickListener {
            startActivity(
                Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse(getString(R.string.purchase_subscription_web_link))
                }
            )
        }
    }

    private fun getMyOwnSubscriptions() {
        sendViewEvent(GetMyOwnSubscriptionsViewEvent)
    }

    private fun getMyMemberSubscriptions() {
        sendViewEvent(GetMyMemberSubscriptionsViewEvent)
    }

    override fun handleViewAction(viewAction: ViewAction) {
        when (viewAction) {
            is GetMyOwnSubscriptionsViewAction ->
                handleGetSubscriptionsViewState(viewAction.viewState)
            is GetMyMemberSubscriptionsViewAction ->
                handleGetSubscriptionsViewState(viewAction.viewState)
            else -> throwActionNotSupported(viewAction)
        }
    }

    private fun handleGetSubscriptionsViewState(viewState: ViewState<List<Subscription>>) {
        binding.isLoading = viewState is ViewState.Loading ||
                viewModel.isCurrentSubscriptionLoading()
        when (viewState) {
            is ViewState.Loading -> {
            }
            is ViewState.StateError -> {
                showErrorMessage(
                    when (viewState.errorCode) {
                        StatusCode.TIMEOUT_ERROR -> {
                            getString(R.string.subscription_time_out_dialog_message)
                        }
                        else -> viewState.errorMessage ?: getString(R.string.error_message)
                    }
                )
                Timber.e(viewState.errorMessage)
            }
            is ViewState.Success -> {
                if (!viewModel.isCurrentSubscriptionLoading()) {
                    binding.addSubscriptionLayout.isVisible = true
                    binding.currentSubscription.text =
                        getString(
                            R.string.subscription_overview_subtitle,
                            viewState.data?.size ?: 0
                        )
                    viewState.data?.let {
                        binding.noSubscriptionLayout.isVisible = it.isEmpty()
                        binding.addSubscriptionLayout.apply {
                            elevation = if (it.isEmpty()) 0f else 16f.dpToPx(requireContext())
                            setBackgroundColor(
                                ContextCompat.getColor(
                                    context,
                                    if (it.isEmpty()) R.color.mainBgColor else R.color.white
                                )
                            )
                        }
                        adapter.submitList(viewState.data)
                    } ?: run {
                        binding.noSubscriptionLayout.isVisible = true
                        binding.addSubscriptionLayout.apply {
                            elevation = 0f
                            setBackgroundColor(ContextCompat.getColor(context, R.color.mainBgColor))
                        }
                    }
                }
            }
        }
    }

    private fun onSubscriptionItemClicked(subscription: Subscription) {
        if (subscription.isMySubscription) {
            findNavController().safeNavigate(
                SubscriptionOverviewFragmentDirections.subscriptionOverviewToSubscriptionDetail(
                    id = subscription.id
                )
            )
        } else {
            MaterialAlertDialogBuilder(
                requireContext(),
                R.style.App_MaterialAlertDialog
            ).apply {
                setTitle(R.string.subscription_overview_item_selected_alert_not_owner_title)
                setMessage(R.string.subscription_overview_item_selected_alert_not_owner_message)
                setPositiveButton(R.string.ok_button_title) { _, _ -> }
            }.show()
        }
    }

    private fun onRemoveMembershipClicked(subscription: Subscription) {
        MaterialAlertDialogBuilder(
            requireContext(),
            R.style.App_MaterialAlertDialog_DeleteMember
        ).apply {
            setIcon(R.drawable.ic_remove_membership)
            setTitle(R.string.subscription_remove_membership_dialog_title)
            setMessage(R.string.subscription_remove_membership_dialog_text)
            setPositiveButton(R.string.subscription_delete_member_dialog_positive_button) { _, _ ->
                // TODO: Implement API call for remove user for the subscription
            }
            setNegativeButton(R.string.subscription_delete_member_dialog_negative_button) { _, _ ->
            }
        }.show()
    }

    private fun observeCancelSubscriptionResult() {
        if (!::cancelSubscriptionResultObserver.isInitialized) {
            findNavController().currentBackStackEntry?.let {
                cancelSubscriptionResultObserver =
                    it.savedStateHandle.getLiveData<Int>(CANCEL_SUBSCRIPTION_RESULT)
                        .observe(it) { result ->
                            Handler(Looper.getMainLooper()).post {
                                val currentSubscriptions = viewModel.removeSubscriptionItem(result)
                                adapter.submitList(currentSubscriptions)
                                binding.currentSubscription.text =
                                    getString(
                                        R.string.subscription_overview_subtitle,
                                        currentSubscriptions.size
                                    )
                            }
                        }
            }
        }
    }

    companion object {
        const val CANCEL_SUBSCRIPTION_RESULT = "CANCEL_SUBSCRIPTION_RESULT"
    }
}
