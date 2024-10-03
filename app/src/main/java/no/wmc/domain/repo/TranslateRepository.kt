package no.wmc.domain.repo

import no.wmc.data.remote.model.TranslationDtoModel
import no.wmc.domain.DataState

interface TranslateRepository {
    suspend fun getTranslateLanguages(): DataState<List<TranslationDtoModel>>
}
