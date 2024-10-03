package no.wmc.ui.subscription.overview

import no.wmc.domain.model.Subscription
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState

sealed class SubscriptionOverviewViewAction : ViewAction() {
    class GetMyOwnSubscriptionsViewAction(val viewState: ViewState<List<Subscription>>) :
        SubscriptionOverviewViewAction()

    class GetMyMemberSubscriptionsViewAction(val viewState: ViewState<List<Subscription>>) :
        SubscriptionOverviewViewAction()
}
