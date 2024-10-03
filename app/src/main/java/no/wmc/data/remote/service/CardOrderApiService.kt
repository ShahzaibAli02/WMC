package no.wmc.data.remote.service

import retrofit2.http.Body
import retrofit2.http.HTTP
import retrofit2.http.POST
import retrofit2.http.Query
import retrofit2.Call
import retrofit2.http.GET
interface CardOrderApiService {

    @GET("/PdfGenerator/Get")
    fun orderCard(@Query("userId") userId: String):Call<String>
}
