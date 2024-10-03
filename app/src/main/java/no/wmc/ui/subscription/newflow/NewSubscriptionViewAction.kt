package no.wmc.ui.subscription.newflow

import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState

sealed class NewSubscriptionViewAction : ViewAction() {
    class SubscriptionAddedInFireStore(val viewState: ViewState<String>) : NewSubscriptionViewAction()
}
