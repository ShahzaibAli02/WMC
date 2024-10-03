package no.wmc.domain.model.usecase.impl

import no.wmc.domain.DataState
import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.domain.model.ProfileItem
import no.wmc.domain.model.usecase.RemoveMedicalItemUseCase
import no.wmc.domain.repo.ProfileRepository

class RemoveMedicalItemUseCaseImpl(
    private val profileRepository: ProfileRepository
) : BaseUseCase(), RemoveMedicalItemUseCase {
    override suspend fun invoke(
        profileItemEnum: ProfileItemEnum,
        profileItem: ProfileItem.Item
    ): DataState<Unit> {

        throw Exception("TODO REMOVE CODE")
//        return getDataState(
//            profileRepository.removeMedicalItem(
//                profileItemEnum,
//                profileItem.toDtoModel()
//            )
//        )
    }
}
