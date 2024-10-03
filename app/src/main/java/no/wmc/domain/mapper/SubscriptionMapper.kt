package no.wmc.domain.mapper

import no.wmc.data.remote.model.SubscriptionDtoModel
import no.wmc.data.remote.model.SubscriptionDtoModel.SubscriptionMemberDtoModel
import no.wmc.domain.model.Subscription
import no.wmc.domain.model.Subscription.SubscriptionMember

fun SubscriptionDtoModel.toModel(isMySubscription: Boolean = false) = Subscription(
    id = id,
    name = name,
    teamName = teamName,
    subscriptionOwner = subscriptionOwner,
    totalMembers = totalMembers,
    currentMembers = currentMembers,
    expireOn = expireOn,
    number = number,
    paymentMethod = paymentMethod,
    paymentMethodTitle = paymentMethodTitle,
    members = members?.map { it.toModel() },
    isMySubscription = isMySubscription
)

fun SubscriptionMemberDtoModel.toModel() = SubscriptionMember(
    id = id,
    name = name,
    email = email
)
