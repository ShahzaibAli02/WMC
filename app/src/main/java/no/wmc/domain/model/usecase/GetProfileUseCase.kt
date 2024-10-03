package no.wmc.domain.model.usecase

import no.wmc.domain.DataState
import no.wmc.domain.model.Profile

interface GetProfileUseCase {
    suspend operator fun invoke(uid:String): DataState<Profile>
}
