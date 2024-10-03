package no.wmc.domain.model.usecase

import no.wmc.domain.DataState
import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.domain.model.ProfileItem
import no.wmc.utils.ext.getCurrentLocaleLang

interface GetProfileItemUseCase {
    suspend operator fun invoke(
        profileItemEnum: ProfileItemEnum,
        language: String = getCurrentLocaleLang()
    ): DataState<ProfileItem>
}
