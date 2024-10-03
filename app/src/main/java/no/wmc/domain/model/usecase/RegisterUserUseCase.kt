package no.wmc.domain.model.usecase

import no.wmc.domain.DataState
import no.wmc.domain.model.Profile

interface RegisterUserUseCase {
    suspend operator fun invoke(
        profile: Profile
    ): DataState<String>
}
