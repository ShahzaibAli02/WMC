package no.wmc.domain.model.usecase.impl

import no.wmc.domain.DataState
import no.wmc.domain.model.ProfileUpdate
import no.wmc.domain.model.usecase.UpdateProfileUseCase
import no.wmc.domain.repo.ProfileRepository

class UpdateProfileUseCaseImpl(
    private val profileRepo: ProfileRepository
) : BaseUseCase(), UpdateProfileUseCase {

    override suspend fun invoke(email:String,profileUpdate: ProfileUpdate): DataState<Unit> {
        return getDataState(profileRepo.updateProfile(email,profileUpdate))
    }
}
