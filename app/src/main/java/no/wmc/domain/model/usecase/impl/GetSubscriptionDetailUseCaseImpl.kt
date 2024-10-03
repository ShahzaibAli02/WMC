package no.wmc.domain.model.usecase.impl

import no.wmc.domain.DataState
import no.wmc.domain.mapper.toModel
import no.wmc.domain.model.Subscription
import no.wmc.domain.model.usecase.GetSubscriptionDetailUseCase
import no.wmc.domain.repo.SubscriptionRepository

class GetSubscriptionDetailUseCaseImpl(
    private val subscriptionRepository: SubscriptionRepository
) : BaseUseCase(), GetSubscriptionDetailUseCase {
    override suspend fun invoke(id: Int): DataState<Subscription> {
        return getDataState(subscriptionRepository.getSubscriptionDetail(id)) {
            it?.toModel()
        }
    }
}
