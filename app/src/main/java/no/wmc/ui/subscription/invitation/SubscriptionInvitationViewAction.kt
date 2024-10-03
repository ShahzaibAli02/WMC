package no.wmc.ui.subscription.invitation

import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState

sealed class SubscriptionInvitationViewAction : ViewAction() {
    class InviteSubscriptionUserViewAction(val viewState: ViewState<Unit>) :
        SubscriptionInvitationViewAction()
}
