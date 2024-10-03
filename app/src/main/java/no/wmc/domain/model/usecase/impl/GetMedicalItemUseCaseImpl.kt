package no.wmc.domain.model.usecase.impl

import no.wmc.domain.DataState
import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.domain.mapper.toModel
import no.wmc.domain.model.ProfileItem
import no.wmc.domain.model.usecase.GetMedicalItemUseCase
import no.wmc.domain.repo.ProfileRepository

class GetMedicalItemUseCaseImpl(
    private val profileRepository: ProfileRepository
) : BaseUseCase(), GetMedicalItemUseCase {
    override suspend fun invoke(
        profileItemEnum: ProfileItemEnum,
        keyword: String,
        page: Int
    ): DataState<ProfileItem> {

        throw Exception("TODO REMOVE CODE")
//        return getDataState(profileRepository.getMedicalItem(profileItemEnum, keyword, page)) {
//            it?.toModel()
//        }
    }
}
