package no.wmc.data.remote.model

import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class SubscriptionDtoModel(
    @SerialName("id") val id: Int,
    @SerialName("name") val name: String?,
    @SerialName("teamName") val teamName: String?,
    @SerialName("subscriptionOwner") val subscriptionOwner: String?,
    @SerialName("totalMembers") val totalMembers: Int,
    @SerialName("currentMembers") val currentMembers: Int,
    @SerialName("expireOn") val expireOn: Instant,
    @SerialName("number") val number: String?,
    @SerialName("paymentMethod") val paymentMethod: String?,
    @SerialName("paymentMethodTitle") val paymentMethodTitle: String?,
    @SerialName("members") val members: List<SubscriptionMemberDtoModel>?
) {
    @Serializable
    class SubscriptionMemberDtoModel(
        @SerialName("id") val id: Int,
        @SerialName("name") val name: String,
        @SerialName("email") val email: String
    )
}
