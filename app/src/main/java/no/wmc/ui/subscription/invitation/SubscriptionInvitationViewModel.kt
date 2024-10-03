package no.wmc.ui.subscription.invitation

import no.wmc.domain.model.usecase.InviteSubscriptionUserUseCase
import no.wmc.ui.base.BaseViewModel
import no.wmc.ui.base.ViewEvent
import no.wmc.ui.base.ViewState
import no.wmc.ui.subscription.invitation.SubscriptionInvitationViewAction.InviteSubscriptionUserViewAction
import no.wmc.ui.subscription.invitation.SubscriptionInvitationViewEvent.InviteSubscriptionUserViewEvent
import no.wmc.utils.AppDispatchers

class SubscriptionInvitationViewModel(
    private val inviteSubscriptionUserUseCase: InviteSubscriptionUserUseCase,
    override val viewState: SubscriptionInvitationViewState,
    appDispatchers: AppDispatchers
) : BaseViewModel<SubscriptionInvitationViewState>(appDispatchers) {
    override suspend fun handleViewEvent(event: ViewEvent) {
        when (event) {
            is InviteSubscriptionUserViewEvent ->
                handleInviteSubscriptionUserEvent(event.subscriptionId, event.email)
            else -> throwEventNotSupported(event)
        }
    }

    private suspend fun handleInviteSubscriptionUserEvent(subscriptionId: Int, email: String) {
        postAction(InviteSubscriptionUserViewAction(ViewState.Loading()))
        postAction(
            InviteSubscriptionUserViewAction(
                getViewState(
                    state = inviteSubscriptionUserUseCase(subscriptionId, email)
                )
            )
        )
    }
}
