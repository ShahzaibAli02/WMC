package no.wmc.ui.subscription.details

import no.wmc.domain.model.Subscription
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState

sealed class SubscriptionDetailViewAction : ViewAction() {
    class GetSubscriptionDetailViewAction(val viewState: ViewState<Subscription>) :
        SubscriptionDetailViewAction()

    class DeleteSubscriptionUserViewAction(val viewState: ViewState<Unit>) :
        SubscriptionDetailViewAction()

    class CancelSubscriptionViewAction(val viewState: ViewState<Unit>) :
        SubscriptionDetailViewAction()
}
