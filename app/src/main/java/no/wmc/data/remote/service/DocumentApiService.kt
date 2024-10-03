package no.wmc.data.remote.service

import no.wmc.data.remote.model.DocumentListDtoModel
import no.wmc.data.remote.model.DocumentTypeDtoModel
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query

interface DocumentApiService {
    @GET("documents")
    suspend fun getDocuments(
        @Query("Page") page: Int,
        @Query("PageSize") pageSize: Int
    ): DocumentListDtoModel

    @GET("documents/categories")
    suspend fun getDocumentType(
        @Query("Page") page: Int,
        @Query("PageSize") pageSize: Int,
        @Query("lang") lang: String
    ): DocumentTypeDtoModel

    @Multipart
    @POST("documents")
    suspend fun uploadDocument(
        @Part title: MultipartBody.Part?,
        @Part description: MultipartBody.Part?,
        @Part categoryId: MultipartBody.Part?,
        @Part document: MultipartBody.Part?
    )

    @GET("documents/file/{document_id}")
    suspend fun downloadDocument(
        @Path("document_id") documentId: Int
    ): ResponseBody

    @DELETE("documents/{document_id}")
    suspend fun removeDocument(
        @Path("document_id") documentId: Int
    )

    @Multipart
    @PUT("documents/{id}")
    suspend fun editDocument(
        @Path("id") id: String,
        @Part title: MultipartBody.Part?,
        @Part description: MultipartBody.Part?,
        @Part categoryId: MultipartBody.Part?,
        @Part document: MultipartBody.Part?
    )
}
