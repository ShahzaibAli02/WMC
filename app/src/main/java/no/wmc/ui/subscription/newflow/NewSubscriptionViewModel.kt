package no.wmc.ui.subscription.newflow

import no.wmc.data.remote.model.firestore.SubscriptionFsModel
import no.wmc.domain.model.usecase.AddSubscriptionFireStoreUseCase
import no.wmc.ui.base.BaseViewModel
import no.wmc.ui.base.ViewEvent
import no.wmc.ui.base.ViewState
import no.wmc.utils.AppDispatchers

class NewSubscriptionViewModel(
    private val addSubscriptionFireStoreUseCase: AddSubscriptionFireStoreUseCase,
    override val viewState: NewSubscriptionViewState = NewSubscriptionViewState(), appDispatchers: AppDispatchers) :
    BaseViewModel<NewSubscriptionViewState>(appDispatchers) {
    override suspend fun handleViewEvent(event: ViewEvent) {
        when (event) {
            is NewSubscriptionViewEvent.AddSubscriptionInFireStore -> handlePurchaseSubscriptionViewEvent(event.subscription)
            else -> throwEventNotSupported(event)
        }
    }

    private suspend fun handlePurchaseSubscriptionViewEvent(subscription: SubscriptionFsModel) {
        postAction(NewSubscriptionViewAction.SubscriptionAddedInFireStore(ViewState.Loading()))
        postAction(
            NewSubscriptionViewAction.SubscriptionAddedInFireStore(
                getViewState(
                    state = addSubscriptionFireStoreUseCase(subscription)
                )
            )
        )
    }
}
