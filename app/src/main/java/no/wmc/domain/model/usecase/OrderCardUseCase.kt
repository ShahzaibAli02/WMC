package no.wmc.domain.model.usecase

import no.wmc.domain.DataState

interface OrderCardUseCase {
    suspend operator fun invoke(): DataState<Unit>
}
