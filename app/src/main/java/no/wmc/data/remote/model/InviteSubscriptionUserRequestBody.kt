package no.wmc.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class InviteSubscriptionUserRequestBody(
    @SerialName("subscriptionId") val subscriptionId: Int,
    @SerialName("email") val email: String
)
