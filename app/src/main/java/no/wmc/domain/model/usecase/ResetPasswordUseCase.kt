package no.wmc.domain.model.usecase

import no.wmc.domain.DataState

interface ResetPasswordUseCase {
    suspend operator fun invoke(email: String): DataState<Unit>
}
