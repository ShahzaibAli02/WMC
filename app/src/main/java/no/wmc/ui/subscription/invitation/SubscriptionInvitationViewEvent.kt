package no.wmc.ui.subscription.invitation

import no.wmc.ui.base.ViewEvent

sealed class SubscriptionInvitationViewEvent : ViewEvent() {
    class InviteSubscriptionUserViewEvent(val subscriptionId: Int, val email: String) :
        SubscriptionInvitationViewEvent()
}
