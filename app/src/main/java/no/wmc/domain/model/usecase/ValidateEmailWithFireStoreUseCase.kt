package no.wmc.domain.model.usecase

import no.wmc.domain.DataState
import no.wmc.domain.model.Profile

interface ValidateEmailWithFireStoreUseCase {
    suspend operator fun invoke(
        email: String
    ): DataState<Boolean>
}
