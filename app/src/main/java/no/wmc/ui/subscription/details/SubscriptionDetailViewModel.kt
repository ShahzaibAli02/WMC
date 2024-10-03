package no.wmc.ui.subscription.details

import no.wmc.domain.model.usecase.CancelSubscriptionUseCase
import no.wmc.domain.model.usecase.DeleteSubscriptionUserUseCase
import no.wmc.domain.model.usecase.GetSubscriptionDetailUseCase
import no.wmc.ui.base.BaseViewModel
import no.wmc.ui.base.ViewEvent
import no.wmc.ui.base.ViewState
import no.wmc.ui.subscription.details.SubscriptionDetailViewAction.CancelSubscriptionViewAction
import no.wmc.ui.subscription.details.SubscriptionDetailViewAction.DeleteSubscriptionUserViewAction
import no.wmc.ui.subscription.details.SubscriptionDetailViewAction.GetSubscriptionDetailViewAction
import no.wmc.ui.subscription.details.SubscriptionDetailViewEvent.CancelSubscriptionViewEvent
import no.wmc.ui.subscription.details.SubscriptionDetailViewEvent.DeleteSubscriptionUserViewEvent
import no.wmc.ui.subscription.details.SubscriptionDetailViewEvent.GetSubscriptionDetailViewEvent
import no.wmc.utils.AppDispatchers

class SubscriptionDetailViewModel(
    private val getSubscriptionDetailUseCase: GetSubscriptionDetailUseCase,
    private val deleteSubscriptionUserUseCase: DeleteSubscriptionUserUseCase,
    private val cancelSubscriptionUseCase: CancelSubscriptionUseCase,
    override val viewState: SubscriptionDetailViewState,
    appDispatchers: AppDispatchers
) : BaseViewModel<SubscriptionDetailViewState>(appDispatchers) {
    override suspend fun handleViewEvent(event: ViewEvent) {
        when (event) {
            is GetSubscriptionDetailViewEvent -> handleGetSubscriptionDetailEvent(event.id)
            is DeleteSubscriptionUserViewEvent ->
                handleDeleteSubscriptionUserEvent(event.subscriptionId, event.customerId)
            is CancelSubscriptionViewEvent -> handleCancelSubscriptionEvent(event.subscriptionId)
            else -> throwEventNotSupported(event)
        }
    }

    private suspend fun handleGetSubscriptionDetailEvent(id: Int) {
        postAction(GetSubscriptionDetailViewAction(ViewState.Loading()))
        postAction(
            GetSubscriptionDetailViewAction(
                getViewState(
                    state = getSubscriptionDetailUseCase(id)
                )
            )
        )
    }

    private suspend fun handleDeleteSubscriptionUserEvent(subscriptionId: Int, customerId: Int) {
        postAction(DeleteSubscriptionUserViewAction(ViewState.Loading()))
        postAction(
            DeleteSubscriptionUserViewAction(
                getViewState(
                    state = deleteSubscriptionUserUseCase(subscriptionId, customerId)
                )
            )
        )
    }

    private suspend fun handleCancelSubscriptionEvent(subscriptionId: Int) {
        postAction(CancelSubscriptionViewAction(ViewState.Loading()))
        postAction(
            CancelSubscriptionViewAction(
                getViewState(
                    state = cancelSubscriptionUseCase(subscriptionId)
                )
            )
        )
    }
}
