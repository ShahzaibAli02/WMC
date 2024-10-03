package no.wmc.data.remote.service

import no.wmc.data.remote.model.DeleteSubscriptionUserRequestBody
import no.wmc.data.remote.model.InviteSubscriptionUserRequestBody
import no.wmc.data.remote.model.SubscriptionDtoModel
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.HTTP
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface SubscriptionApiService {
    @GET("/users/subscriptions")
    suspend fun getMyOwnSubscriptions(): List<SubscriptionDtoModel>

    @GET("/users/subscriptions/member")
    suspend fun getMyMemberSubscriptions(): List<SubscriptionDtoModel>

    @GET("/users/subscriptions/detail")
    suspend fun getSubscriptionDetail(@Query("id") id: Int): SubscriptionDtoModel

    @POST("/users/subscriptions/member")
    suspend fun inviteSubscriptionUser(@Body body: InviteSubscriptionUserRequestBody)

    @HTTP(method = "DELETE", path = "/users/subscriptions/member", hasBody = true)
    suspend fun deleteSubscriptionUser(@Body body: DeleteSubscriptionUserRequestBody)

    @PUT("/users/subscriptions")
    suspend fun cancelSubscription(@Query("id") subscriptionId: Int)
}
