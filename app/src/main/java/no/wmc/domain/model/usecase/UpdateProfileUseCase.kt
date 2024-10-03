package no.wmc.domain.model.usecase

import no.wmc.domain.DataState
import no.wmc.domain.model.ProfileUpdate

interface UpdateProfileUseCase {
    suspend operator fun invoke(email:String,profileUpdate: ProfileUpdate): DataState<Unit>
}
