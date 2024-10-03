package no.wmc.domain.model.usecase

import no.wmc.domain.DataState
import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.domain.model.ProfileItem

interface GetMedicalItemUseCase {
    suspend operator fun invoke(
        profileItemEnum: ProfileItemEnum,
        keyword: String,
        page: Int
    ): DataState<ProfileItem>
}
