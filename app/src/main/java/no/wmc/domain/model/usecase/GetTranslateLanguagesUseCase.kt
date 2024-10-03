package no.wmc.domain.model.usecase

import no.wmc.domain.DataState
import no.wmc.domain.model.Translation

interface GetTranslateLanguagesUseCase {
    suspend operator fun invoke(): DataState<List<Translation>>
}
