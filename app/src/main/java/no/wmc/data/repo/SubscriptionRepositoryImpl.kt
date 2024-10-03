package no.wmc.data.repo

import no.wmc.data.local.manager.LocalDataManager
import no.wmc.data.manager.NetworkStateManager
import no.wmc.data.remote.model.DeleteSubscriptionUserRequestBody
import no.wmc.data.remote.model.InviteSubscriptionUserRequestBody
import no.wmc.data.remote.model.SubscriptionDtoModel
import no.wmc.data.remote.service.SubscriptionApiService
import no.wmc.domain.DataState
import no.wmc.domain.repo.SubscriptionRepository

class SubscriptionRepositoryImpl(
    private val subscriptionApiService: SubscriptionApiService,
    localDataManager: LocalDataManager,
    networkStateManager: NetworkStateManager
) : BaseRepository(networkStateManager, localDataManager), SubscriptionRepository {
    override suspend fun getMyOwnSubscriptions(): DataState<List<SubscriptionDtoModel>> {
        // If no active subscription in Profile just returning empty subscriptions list to avoid
        // 403 Forbidden API response since that request is forbidden in that case
//        return if (!localDataManager.getProfile().isActiveSubscription) DataState.Success()
//        else execute { subscriptionApiService.getMyOwnSubscriptions() }
        return TODO("Provide the return value")
    }

    override suspend fun getMyMemberSubscriptions(): DataState<List<SubscriptionDtoModel>> {
        // If no active subscription in Profile just returning empty subscriptions list to avoid
        // 403 Forbidden API response since that request is forbidden in that case
//        return if (!localDataManager.getProfile().isActiveSubscription) DataState.Success()
//        else execute { subscriptionApiService.getMyMemberSubscriptions() }
        return TODO("Provide the return value")
    }

    override suspend fun getSubscriptionDetail(id: Int): DataState<SubscriptionDtoModel> {
        return execute {
            subscriptionApiService.getSubscriptionDetail(id)
        }
    }

    override suspend fun inviteSubscriptionUser(
        subscriptionId: Int,
        email: String
    ): DataState<Unit> {
        return execute {
            subscriptionApiService.inviteSubscriptionUser(
                InviteSubscriptionUserRequestBody(subscriptionId, email)
            )
        }
    }

    override suspend fun deleteSubscriptionUser(
        subscriptionId: Int,
        customerId: Int
    ): DataState<Unit> {
        return execute {
            subscriptionApiService.deleteSubscriptionUser(
                DeleteSubscriptionUserRequestBody(subscriptionId, customerId)
            )
        }
    }

    override suspend fun cancelSubscription(subscriptionId: Int): DataState<Unit> {
        return execute {
            subscriptionApiService.cancelSubscription(subscriptionId)
        }
    }
}
