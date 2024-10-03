package no.wmc.domain.model.usecase.impl

import no.wmc.domain.DataState
import no.wmc.domain.model.usecase.InviteSubscriptionUserUseCase
import no.wmc.domain.repo.SubscriptionRepository

class InviteSubscriptionUserUseCaseImpl(
    private val subscriptionRepository: SubscriptionRepository
) : BaseUseCase(), InviteSubscriptionUserUseCase {
    override suspend operator fun invoke(subscriptionId: Int, email: String): DataState<Unit> {
        return getDataState(subscriptionRepository.inviteSubscriptionUser(subscriptionId, email))
    }
}
