package no.wmc.domain.model.usecase

import no.wmc.domain.DataState
import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.domain.model.ProfileItem

interface RemoveMedicalItemUseCase {
    suspend operator fun invoke(
        profileItemEnum: ProfileItemEnum,
        profileItem: ProfileItem.Item
    ): DataState<Unit>
}
