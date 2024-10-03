package no.wmc.domain.model.usecase.impl

import no.wmc.domain.DataState
import no.wmc.domain.model.usecase.OrderCardUseCase
import no.wmc.domain.repo.ProfileRepository

class OrderCardUseCaseImpl(
    private val profileRepository: ProfileRepository
) : BaseUseCase(), OrderCardUseCase {
    override suspend fun invoke(): DataState<Unit> {
        return getDataState(profileRepository.orderCard())
    }
}
