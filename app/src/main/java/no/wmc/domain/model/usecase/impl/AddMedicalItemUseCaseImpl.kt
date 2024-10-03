package no.wmc.domain.model.usecase.impl

import no.wmc.domain.DataState
import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.domain.model.ProfileItem
import no.wmc.domain.model.usecase.AddMedicalItemUseCase
import no.wmc.domain.repo.ProfileRepository

class AddMedicalItemUseCaseImpl(
    private val profileRepository: ProfileRepository
) : BaseUseCase(), AddMedicalItemUseCase {
    override suspend fun invoke(
        profileItemEnum: ProfileItemEnum,
        profileItem: ProfileItem.Item
    ): DataState<Unit> {

        return DataState.Error(errorMessage = "UNKNOWN ERROR")
//        return getDataState(
//            profileRepository.addMedicalItem(
//                profileItemEnum,
//                profileItem
//            )
//        )
    }


}
