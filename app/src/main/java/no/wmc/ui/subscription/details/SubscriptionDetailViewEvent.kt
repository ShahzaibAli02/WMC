package no.wmc.ui.subscription.details

import no.wmc.ui.base.ViewEvent

sealed class SubscriptionDetailViewEvent : ViewEvent() {
    class GetSubscriptionDetailViewEvent(val id: Int) : SubscriptionDetailViewEvent()

    class DeleteSubscriptionUserViewEvent(val subscriptionId: Int, val customerId: Int) :
        SubscriptionDetailViewEvent()

    class CancelSubscriptionViewEvent(val subscriptionId: Int) : SubscriptionDetailViewEvent()
}
