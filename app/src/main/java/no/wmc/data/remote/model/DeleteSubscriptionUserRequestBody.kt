package no.wmc.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class DeleteSubscriptionUserRequestBody(
    @SerialName("subscriptionId") val subscriptionId: Int,
    @SerialName("customerId") val customerId: Int
)
