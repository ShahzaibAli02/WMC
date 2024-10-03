package no.wmc.data.remote.service

import retrofit2.http.POST
import retrofit2.http.Query

interface ProfileApiService {

//    @GET("users/profile")
//    suspend fun getProfile(): ProfileDtoModel
//
//    @POST("users/profile")
//    suspend fun updateProfile(@Body updateDtoModel: ProfileUpdateDtoModel)
//
//    @GET("profiles/items")
//    suspend fun getProfileItem(
//        @Query("Page") page: Int,
//        @Query("PageSize") pageSize: Int,
//        @Query("type") type: String,
//        @Query("lang") lang: String
//    ): ProfileItemDtoModel
//
//    @GET("profiles/items/search")
//    suspend fun getMedicalItem(
//        @Query("Page") page: Int,
//        @Query("PageSize") pageSize: Int,
//        @Query("type") type: String,
//        @Query("key") keyword: String,
//        @Query("lang") lang: String
//    ): ProfileItemDtoModel
//
//    @POST("profiles/items")
//    suspend fun addMedicalItem(
//        @Query("type") type: String,
//        @Query("lang") lang: String,
//        @Body profileItem: ProfileItemDtoModel.ItemDtoModel
//    )
//
//    @HTTP(method = "DELETE", path = "profiles/items", hasBody = true)
//    suspend fun removeMedicalItem(
//        @Query("type") type: String,
//        @Query("lang") lang: String,
//        @Body profileItem: ProfileItemDtoModel.ItemDtoModel
//    )
//
//    @GET("profiles/items/share")
//    suspend fun shareMedicalItem(
//        @Query("type") shareType: ShareType,
//        @Query("lang") lang: String,
//        @Query("outputFormat") outputFormat: String
//    ): ResponseBody

    @POST("users/card")
    suspend fun orderCard(@Query("lang") lang: String)
}
