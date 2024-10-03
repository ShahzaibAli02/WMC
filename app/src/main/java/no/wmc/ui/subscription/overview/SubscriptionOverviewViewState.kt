package no.wmc.ui.subscription.overview

import no.wmc.domain.model.Subscription

class SubscriptionOverviewViewState {
    private val currentSubscriptions = mutableListOf<Subscription>()
    private val myOwnSubscriptions = mutableListOf<Subscription>()
    private val myMemberSubscription = mutableListOf<Subscription>()
    private var isMyOwnSubscriptionsLoading = false
    private var isMyMemberSubscriptionsLoading = false

    fun appendMyOwnSubscriptions(subscriptions: List<Subscription>?) {
        myOwnSubscriptions.clear()
        subscriptions?.let {
            myOwnSubscriptions.addAll(it)
        }
        isMyOwnSubscriptionsLoading = false
    }

    fun appendMyMemberSubscriptions(subscriptions: List<Subscription>?) {
        myMemberSubscription.clear()
        subscriptions?.let {
            myMemberSubscription.addAll(it)
        }
        isMyMemberSubscriptionsLoading = false
    }

    fun getMySubscriptions(): List<Subscription> {
        currentSubscriptions.clear()
        currentSubscriptions.addAll(myOwnSubscriptions)
        currentSubscriptions.addAll(myMemberSubscription)
        return currentSubscriptions.toList()
    }

    fun removeSubscriptionItem(id: Int): List<Subscription> {
        currentSubscriptions.removeIf { it.id == id }
        return currentSubscriptions.toList()
    }

    fun setMyOwnSubscriptionsLoading() {
        isMyOwnSubscriptionsLoading = true
    }

    fun setMyMemberSubscriptionsLoading() {
        isMyMemberSubscriptionsLoading = true
    }

    fun isCurrentSubscriptionLoading() =
        isMyOwnSubscriptionsLoading || isMyMemberSubscriptionsLoading
}
