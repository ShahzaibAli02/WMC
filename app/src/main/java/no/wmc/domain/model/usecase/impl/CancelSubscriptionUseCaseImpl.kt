package no.wmc.domain.model.usecase.impl

import no.wmc.domain.DataState
import no.wmc.domain.model.usecase.CancelSubscriptionUseCase
import no.wmc.domain.repo.SubscriptionRepository

class CancelSubscriptionUseCaseImpl(
    private val subscriptionRepository: SubscriptionRepository
) : BaseUseCase(), CancelSubscriptionUseCase {
    override suspend fun invoke(subscriptionId: Int): DataState<Unit> {
        return getDataState(subscriptionRepository.cancelSubscription(subscriptionId))
    }
}
