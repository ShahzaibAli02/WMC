package no.wmc.domain.repo

import no.wmc.data.remote.model.SubscriptionDtoModel
import no.wmc.domain.DataState

interface SubscriptionRepository {
    suspend fun getMyOwnSubscriptions(): DataState<List<SubscriptionDtoModel>>

    suspend fun getMyMemberSubscriptions(): DataState<List<SubscriptionDtoModel>>

    suspend fun getSubscriptionDetail(id: Int): DataState<SubscriptionDtoModel>

    suspend fun inviteSubscriptionUser(subscriptionId: Int, email: String): DataState<Unit>

    suspend fun deleteSubscriptionUser(subscriptionId: Int, customerId: Int): DataState<Unit>

    suspend fun cancelSubscription(subscriptionId: Int): DataState<Unit>
}
