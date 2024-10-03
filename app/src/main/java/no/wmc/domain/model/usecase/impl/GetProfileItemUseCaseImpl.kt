package no.wmc.domain.model.usecase.impl

import no.wmc.domain.DataState
import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.domain.mapper.toModel
import no.wmc.domain.model.ProfileItem
import no.wmc.domain.model.usecase.GetProfileItemUseCase
import no.wmc.domain.repo.ProfileRepository

class GetProfileItemUseCaseImpl(
    private val profileRepository: ProfileRepository
) : BaseUseCase(), GetProfileItemUseCase {
    override suspend fun invoke(
        profileItemEnum: ProfileItemEnum,
        language: String
    ): DataState<ProfileItem> {

        throw Exception("TODO REMOVE CODE")
//        return getDataState(profileRepository.getProfileItem(profileItemEnum, language)) {
//            it?.toModel()
//        }
    }
}
