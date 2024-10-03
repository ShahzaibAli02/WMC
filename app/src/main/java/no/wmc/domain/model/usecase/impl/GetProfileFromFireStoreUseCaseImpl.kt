package no.wmc.domain.model.usecase.impl

import no.wmc.domain.DataState
import no.wmc.domain.model.Profile
import no.wmc.domain.model.usecase.GetProfileFromFireStoreUseCase
import no.wmc.domain.repo.ProfileRepository

class GetProfileFromFireStoreUseCaseImpl(
    private val profileRepo: ProfileRepository
) : BaseUseCase(), GetProfileFromFireStoreUseCase {

    override suspend fun invoke(uId: String): DataState<Profile> {
        return getDataState(profileRepo.getProfileFromFireStore(uId)) {
            it
        }
    }
}
