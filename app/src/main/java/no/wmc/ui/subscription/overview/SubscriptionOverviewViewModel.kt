package no.wmc.ui.subscription.overview

import no.wmc.domain.model.usecase.GetMyMemberSubscriptionsUseCase
import no.wmc.domain.model.usecase.GetMyOwnSubscriptionsUseCase
import no.wmc.ui.base.BaseViewModel
import no.wmc.ui.base.ViewEvent
import no.wmc.ui.base.ViewState
import no.wmc.ui.subscription.overview.SubscriptionOverviewViewAction.GetMyMemberSubscriptionsViewAction
import no.wmc.ui.subscription.overview.SubscriptionOverviewViewAction.GetMyOwnSubscriptionsViewAction
import no.wmc.ui.subscription.overview.SubscriptionOverviewViewEvent.GetMyMemberSubscriptionsViewEvent
import no.wmc.ui.subscription.overview.SubscriptionOverviewViewEvent.GetMyOwnSubscriptionsViewEvent
import no.wmc.utils.AppDispatchers

class SubscriptionOverviewViewModel(
    private val getMyOwnSubscriptionsUseCase: GetMyOwnSubscriptionsUseCase,
    private val getMyMemberSubscriptionsUseCase: GetMyMemberSubscriptionsUseCase,
    override val viewState: SubscriptionOverviewViewState,
    appDispatchers: AppDispatchers
) : BaseViewModel<SubscriptionOverviewViewState>(appDispatchers) {
    override suspend fun handleViewEvent(event: ViewEvent) {
        when (event) {
            is GetMyOwnSubscriptionsViewEvent -> handleGetSubscriptionsEvent()
            is GetMyMemberSubscriptionsViewEvent -> handleGetMyMemberSubscriptionsEvent()
            else -> throwEventNotSupported(event)
        }
    }

    fun isCurrentSubscriptionLoading() = viewState.isCurrentSubscriptionLoading()

    fun removeSubscriptionItem(id: Int) = viewState.removeSubscriptionItem(id)

    private suspend fun handleGetSubscriptionsEvent() {
        viewState.setMyOwnSubscriptionsLoading()
        postAction(GetMyOwnSubscriptionsViewAction(ViewState.Loading()))
        postAction(
            GetMyOwnSubscriptionsViewAction(
                getViewState(
                    state = getMyOwnSubscriptionsUseCase()
                ) {
                    viewState.appendMyOwnSubscriptions(data)
                    viewState.getMySubscriptions()
                }
            )
        )
    }

    private suspend fun handleGetMyMemberSubscriptionsEvent() {
        viewState.setMyMemberSubscriptionsLoading()
        postAction(GetMyMemberSubscriptionsViewAction(ViewState.Loading()))
        postAction(
            GetMyMemberSubscriptionsViewAction(
                getViewState(
                    state = getMyMemberSubscriptionsUseCase()
                ) {
                    viewState.appendMyMemberSubscriptions(data)
                    viewState.getMySubscriptions()
                }
            )
        )
    }
}
