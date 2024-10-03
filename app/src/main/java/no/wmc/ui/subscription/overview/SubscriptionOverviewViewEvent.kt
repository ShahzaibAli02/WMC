package no.wmc.ui.subscription.overview

import no.wmc.ui.base.ViewEvent

sealed class SubscriptionOverviewViewEvent : ViewEvent() {
    object GetMyOwnSubscriptionsViewEvent : SubscriptionOverviewViewEvent()

    object GetMyMemberSubscriptionsViewEvent : SubscriptionOverviewViewEvent()
}
