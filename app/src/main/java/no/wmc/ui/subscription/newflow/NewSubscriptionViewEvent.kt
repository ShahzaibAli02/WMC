package no.wmc.ui.subscription.newflow

import no.wmc.data.remote.model.firestore.SubscriptionFsModel
import no.wmc.domain.model.Profile
import no.wmc.ui.base.ViewEvent

sealed class NewSubscriptionViewEvent : ViewEvent() {
    class AddSubscriptionInFireStore(val subscription: SubscriptionFsModel) : NewSubscriptionViewEvent()
}
