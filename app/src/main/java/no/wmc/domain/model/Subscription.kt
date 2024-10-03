package no.wmc.domain.model

import kotlinx.datetime.Instant

data class Subscription(
    val id: Int,
    val name: String?,
    val teamName: String?,
    val subscriptionOwner: String?,
    val totalMembers: Int,
    val currentMembers: Int,
    val expireOn: Instant,
    val number: String?,
    val paymentMethod: String?,
    val paymentMethodTitle: String?,
    val members: List<SubscriptionMember>?,
    val isMySubscription: Boolean
) {
    data class SubscriptionMember(
        val id: Int,
        val name: String,
        val email: String
    )
}
