package no.wmc.ui.subscription.invitation

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import no.wmc.R
import no.wmc.data.remote.SUCCESS
import no.wmc.databinding.SubscriptionInvitationScreenBinding
import no.wmc.ui.base.BaseViewStateFragment
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState
import no.wmc.ui.subscription.details.SubscriptionDetailFragment.Companion.ADD_SUBSCRIPTION_MEMBER_RESULT
import no.wmc.ui.subscription.invitation.SubscriptionInvitationViewAction.InviteSubscriptionUserViewAction
import no.wmc.ui.subscription.invitation.SubscriptionInvitationViewEvent.InviteSubscriptionUserViewEvent
import timber.log.Timber

class SubscriptionInvitationFragment :
    BaseViewStateFragment<SubscriptionInvitationScreenBinding, SubscriptionInvitationViewModel>(
        R.layout.subscription_invitation_screen,
        SubscriptionInvitationViewModel::class
    ) {

    private val args: SubscriptionInvitationFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        binding.toolbar.setNavigationIcon(R.drawable.ic_back)
        binding.toolbar.setNavigationOnClickListener { findNavController().popBackStack() }
        binding.addMemberButton.setOnClickListener {
            inviteSubscriptionUser()
        }
    }

    private fun inviteSubscriptionUser() {
        sendViewEvent(
            InviteSubscriptionUserViewEvent(
                args.subscriptionId,
                binding.email.editText?.text.toString()
            )
        )
    }

    override fun handleViewAction(viewAction: ViewAction) {
        when (viewAction) {
            is InviteSubscriptionUserViewAction ->
                handleInviteSubscriptionUserAction(viewAction.viewState)
            else -> throwActionNotSupported(viewAction)
        }
    }

    private fun handleInviteSubscriptionUserAction(viewState: ViewState<Unit>) {
        binding.isLoading = viewState is ViewState.Loading
        when (viewState) {
            is ViewState.Loading -> {
                binding.email.isEnabled = false
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
            is ViewState.Success -> {
                findNavController().previousBackStackEntry?.savedStateHandle?.set(
                    ADD_SUBSCRIPTION_MEMBER_RESULT,
                    SUCCESS
                )
                findNavController().navigateUp()
            }
        }
    }
}
