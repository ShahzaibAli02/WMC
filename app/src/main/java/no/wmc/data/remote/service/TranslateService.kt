package no.wmc.data.remote.service

import no.wmc.data.remote.model.TranslateModel
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.Response
interface TranslateService {
    @GET("translate_a/single?client=gtx")
    suspend fun translate(
        @Query("sl") sourceLanguage: String = "auto",
        @Query("tl") targetLanguage: String,
        @Query("dt") dt: String = "t",
        @Query("q") text: String
    ):Response<TranslateModel>

}
