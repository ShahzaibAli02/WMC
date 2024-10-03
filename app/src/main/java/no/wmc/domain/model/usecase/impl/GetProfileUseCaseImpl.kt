package no.wmc.domain.model.usecase.impl


import no.wmc.domain.DataState
import no.wmc.domain.model.Profile
import no.wmc.domain.model.usecase.GetProfileUseCase
import no.wmc.domain.repo.ProfileRepository

class GetProfileUseCaseImpl(
    private val profileRepo: ProfileRepository
) : BaseUseCase(), GetProfileUseCase {

    override suspend fun invoke(uid:String): DataState<Profile> {
        return getDataState(profileRepo.getProfileFromFireStore(uid)) {
            it
        }
    }
}
