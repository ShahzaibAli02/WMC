package no.wmc.domain.model.usecase.impl

import no.wmc.domain.DataState
import no.wmc.domain.mapper.toModel
import no.wmc.domain.model.Subscription
import no.wmc.domain.model.usecase.GetMyOwnSubscriptionsUseCase
import no.wmc.domain.repo.SubscriptionRepository

class GetMyOwnSubscriptionsUseCaseImpl(
    private val subscriptionRepository: SubscriptionRepository
) : BaseUseCase(), GetMyOwnSubscriptionsUseCase {
    override suspend fun invoke(): DataState<List<Subscription>> {
        return getDataState(subscriptionRepository.getMyOwnSubscriptions()) { subscriptions ->
            subscriptions?.map { it.toModel(isMySubscription = true) }
        }
    }
}
