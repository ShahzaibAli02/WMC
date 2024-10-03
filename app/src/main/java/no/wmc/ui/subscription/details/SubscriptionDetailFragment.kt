package no.wmc.ui.subscription.details

import android.os.Bundle
import android.text.Html
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import no.wmc.R
import no.wmc.data.remote.SUCCESS
import no.wmc.databinding.SubscriptionDetailScreenBinding
import no.wmc.domain.model.Subscription
import no.wmc.ui.base.BaseViewStateFragment
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState
import no.wmc.ui.custom.SubscriptionMemberItem
import no.wmc.ui.subscription.details.SubscriptionDetailViewAction.CancelSubscriptionViewAction
import no.wmc.ui.subscription.details.SubscriptionDetailViewAction.DeleteSubscriptionUserViewAction
import no.wmc.ui.subscription.details.SubscriptionDetailViewAction.GetSubscriptionDetailViewAction
import no.wmc.ui.subscription.details.SubscriptionDetailViewEvent.CancelSubscriptionViewEvent
import no.wmc.ui.subscription.details.SubscriptionDetailViewEvent.DeleteSubscriptionUserViewEvent
import no.wmc.ui.subscription.details.SubscriptionDetailViewEvent.GetSubscriptionDetailViewEvent
import no.wmc.ui.subscription.overview.SubscriptionOverviewFragment.Companion.CANCEL_SUBSCRIPTION_RESULT
import no.wmc.utils.ext.safeNavigate
import no.wmc.utils.ext.showSnackBar
import timber.log.Timber

class SubscriptionDetailFragment :
    BaseViewStateFragment<SubscriptionDetailScreenBinding, SubscriptionDetailViewModel>(
        R.layout.subscription_detail_screen, SubscriptionDetailViewModel::class
    ) {

    private val args: SubscriptionDetailFragmentArgs by navArgs()

    private lateinit var addSubscriptionMemberResultObserver: Unit

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
        getSubscriptionDetail(args.id)
        observeAddSubscriptionMemberResult()
    }

    private fun initViews() {
        binding.toolbar.setNavigationIcon(R.drawable.ic_back)
        binding.toolbar.setNavigationOnClickListener { findNavController().popBackStack() }
        binding.cancelSubscriptionButton.setOnClickListener {
            showConfirmCancelSubscriptionDialog()
        }
    }

    private fun getSubscriptionDetail(id: Int) {
        sendViewEvent(GetSubscriptionDetailViewEvent(id))
    }

    private fun deleteSubscriptionUser(customerId: Int) {
        sendViewEvent(DeleteSubscriptionUserViewEvent(args.id, customerId))
    }

    private fun cancelSubscription() {
        sendViewEvent(CancelSubscriptionViewEvent(args.id))
    }

    override fun handleViewAction(viewAction: ViewAction) {
        when (viewAction) {
            is GetSubscriptionDetailViewAction ->
                handleGetSubscriptionDetailAction(viewAction.viewState)
            is DeleteSubscriptionUserViewAction ->
                handleDeleteSubscriptionUserAction(viewAction.viewState)
            is CancelSubscriptionViewAction -> handleCancelSubscriptionAction(viewAction.viewState)
            else -> throwActionNotSupported(viewAction)
        }
    }

    private fun handleGetSubscriptionDetailAction(viewState: ViewState<Subscription>) {
        binding.isLoading = viewState is ViewState.Loading
        when (viewState) {
            is ViewState.Loading -> {
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
            is ViewState.Success -> {
                viewState.data?.let {
                    binding.model = it

                    binding.subscriptionManagerTitle.text =
                        detailStringBuilder(
                            binding.root.context.getString(
                                R.string.subscription_overview_item_subscription_manager_title
                            ),
                            it.subscriptionOwner
                        )
                    binding.membershipOccupancyTitle.text =
                        detailStringBuilder(
                            binding.root.context.getString(
                                R.string.subscription_overview_item_membership_occupancy_title
                            ),
                            "${it.currentMembers}/${it.totalMembers}"
                        )

                    val date = Instant.fromEpochMilliseconds(it.expireOn.toEpochMilliseconds())
                        .toLocalDateTime(TimeZone.UTC)
                    binding.expiredTitle.text =
                        detailStringBuilder(
                            binding.root.context.getString(
                                R.string.subscription_overview_item_expired_title
                            ),
                            "${date.monthNumber}/${date.year}"
                        )

                    binding.membershipHint.text = Html.fromHtml(
                        if (it.currentMembers == 0) {
                            getString(
                                R.string.subscription_detail_membership_left_full_title,
                                it.totalMembers
                            )
                        } else {
                            getString(
                                R.string.subscription_detail_membership_left_title,
                                it.totalMembers - it.currentMembers
                            )
                        }, HtmlCompat.FROM_HTML_MODE_COMPACT
                    )

                    binding.membersLayout.removeAllViews()
                    it.members?.forEach {
                        binding.membersLayout.addView(
                            SubscriptionMemberItem(requireContext(), null).apply {
                                init(it) { subscriptionMember ->
                                    showConfirmDeleteDialog(subscriptionMember.id)
                                }
                            }
                        )
                    }

                    binding.addMemberButton.isVisible = it.currentMembers < it.totalMembers
                    binding.addMemberButton.setOnClickListener { _ ->
                        findNavController().safeNavigate(
                            SubscriptionDetailFragmentDirections
                                .subscriptionDetailToSubscriptionInvitation(
                                    it.id
                                )
                        )
                    }
                }
            }
        }
    }

    private fun detailStringBuilder(
        titleString: String,
        detailString: String?
    ): SpannableStringBuilder {
        val title = setTextSpanColor(
            titleString,
            ContextCompat.getColor(binding.root.context, R.color.memberSinceByline)
        )
        val detail = detailString?.let {
            setTextSpanColor(
                it,
                ContextCompat.getColor(binding.root.context, R.color.switchThumbDisabled)
            )
        }
        val spannableStringBuilder = SpannableStringBuilder().apply {
            append(title)
            append(" ")
            append(detail)
        }
        return spannableStringBuilder
    }

    private fun setTextSpanColor(text: String, color: Int) =
        SpannableString(text).apply {
            setSpan(
                ForegroundColorSpan(color),
                0,
                text.length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )
        }

    private fun showConfirmDeleteDialog(customerId: Int) {
        MaterialAlertDialogBuilder(
            requireContext(),
            R.style.App_MaterialAlertDialog_DeleteMember
        ).apply {
            setIcon(R.drawable.ic_delete_subscription)
            setTitle(R.string.subscription_delete_member_dialog_title)
            setMessage(R.string.subscription_delete_member_dialog_message)
            setPositiveButton(R.string.subscription_delete_member_dialog_positive_button) { _, _ ->
                deleteSubscriptionUser(customerId)
            }
            setNegativeButton(R.string.subscription_delete_member_dialog_negative_button) { _, _ ->
            }
        }.show()
    }

    private fun handleDeleteSubscriptionUserAction(viewState: ViewState<Unit>) {
        binding.isLoading = viewState is ViewState.Loading
        when (viewState) {
            is ViewState.Loading -> {
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
            is ViewState.Success -> {
                getSubscriptionDetail(args.id)
            }
        }
    }

    private fun handleCancelSubscriptionAction(viewState: ViewState<Unit>) {
        binding.isLoading = viewState is ViewState.Loading
        when (viewState) {
            is ViewState.Loading -> {
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
            is ViewState.Success -> {
                findNavController().previousBackStackEntry?.savedStateHandle?.set(
                    CANCEL_SUBSCRIPTION_RESULT,
                    args.id
                )
                findNavController().navigateUp()
            }
        }
    }

    private fun showConfirmCancelSubscriptionDialog() {
        MaterialAlertDialogBuilder(
            requireContext(),
            R.style.App_MaterialAlertDialog_DeleteMember
        ).apply {
            setIcon(R.drawable.ic_remove_membership)
            setTitle(R.string.subscription_detail_alert_cancel_subcription_title)
            setMessage(R.string.subscription_detail_alert_cancel_subcription_message)
            setPositiveButton(
                R.string.subscription_detail_alert_cancel_subcription_confirm
            ) { _, _ -> cancelSubscription() }
            setNegativeButton(
                R.string.subscription_detail_alert_cancel_subcription_cancel
            ) { _, _ -> }
        }.show()
    }

    private fun observeAddSubscriptionMemberResult() {
        if (!::addSubscriptionMemberResultObserver.isInitialized) {
            findNavController().currentBackStackEntry?.let {
                addSubscriptionMemberResultObserver =
                    it.savedStateHandle.getLiveData<String>(ADD_SUBSCRIPTION_MEMBER_RESULT)
                        .observe(it) { result ->
                            if (result == SUCCESS) {
                                showSnackBar(R.string.subscription_add_member_alert_invite_message)
                            }
                        }
            }
        }
    }

    companion object {
        const val ADD_SUBSCRIPTION_MEMBER_RESULT = "ADD_SUBSCRIPTION_MEMBER_RESULT"
    }
}
