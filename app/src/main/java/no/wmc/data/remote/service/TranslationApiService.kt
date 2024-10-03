package no.wmc.data.remote.service

import no.wmc.data.remote.model.TranslationDtoModel
import retrofit2.http.GET

interface TranslationApiService {
    @GET("translations/languages")
    suspend fun getTranslateLanguages(): List<TranslationDtoModel>
}
