package no.wmc.domain.model.usecase.impl

import no.wmc.domain.DataState
import no.wmc.domain.mapper.toModel
import no.wmc.domain.model.Subscription
import no.wmc.domain.model.usecase.GetMyMemberSubscriptionsUseCase
import no.wmc.domain.repo.SubscriptionRepository

class GetMyMemberSubscriptionsUseCaseImpl(
    private val subscriptionRepository: SubscriptionRepository
) : BaseUseCase(), GetMyMemberSubscriptionsUseCase {
    override suspend fun invoke(): DataState<List<Subscription>> {
        return getDataState(subscriptionRepository.getMyMemberSubscriptions()) { subscriptions ->
            subscriptions?.map { it.toModel(isMySubscription = false) }
        }
    }
}
