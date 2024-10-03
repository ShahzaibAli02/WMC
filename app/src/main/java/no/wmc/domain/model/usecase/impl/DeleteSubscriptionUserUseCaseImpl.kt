package no.wmc.domain.model.usecase.impl

import no.wmc.domain.DataState
import no.wmc.domain.model.usecase.DeleteSubscriptionUserUseCase
import no.wmc.domain.repo.SubscriptionRepository

class DeleteSubscriptionUserUseCaseImpl(
    private val subscriptionRepository: SubscriptionRepository
) : BaseUseCase(), DeleteSubscriptionUserUseCase {
    override suspend fun invoke(subscriptionId: Int, customerId: Int): DataState<Unit> {
        return getDataState(
            subscriptionRepository.deleteSubscriptionUser(
                subscriptionId,
                customerId
            )
        )
    }
}
