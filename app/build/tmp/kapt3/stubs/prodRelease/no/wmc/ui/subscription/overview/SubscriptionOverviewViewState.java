package no.wmc.ui.subscription.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eJ\u0006\u0010\u0011\u001a\u00020\u0007J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewState;", "", "()V", "currentSubscriptions", "", "Lno/wmc/domain/model/Subscription;", "isMyMemberSubscriptionsLoading", "", "isMyOwnSubscriptionsLoading", "myMemberSubscription", "myOwnSubscriptions", "appendMyMemberSubscriptions", "", "subscriptions", "", "appendMyOwnSubscriptions", "getMySubscriptions", "isCurrentSubscriptionLoading", "removeSubscriptionItem", "id", "", "setMyMemberSubscriptionsLoading", "setMyOwnSubscriptionsLoading", "wmc-3.1.40-b11_prodRelease"})
public final class SubscriptionOverviewViewState {
    private final java.util.List<no.wmc.domain.model.Subscription> currentSubscriptions = null;
    private final java.util.List<no.wmc.domain.model.Subscription> myOwnSubscriptions = null;
    private final java.util.List<no.wmc.domain.model.Subscription> myMemberSubscription = null;
    private boolean isMyOwnSubscriptionsLoading = false;
    private boolean isMyMemberSubscriptionsLoading = false;
    
    public SubscriptionOverviewViewState() {
        super();
    }
    
    public final void appendMyOwnSubscriptions(@org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.Subscription> subscriptions) {
    }
    
    public final void appendMyMemberSubscriptions(@org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.Subscription> subscriptions) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<no.wmc.domain.model.Subscription> getMySubscriptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<no.wmc.domain.model.Subscription> removeSubscriptionItem(int id) {
        return null;
    }
    
    public final void setMyOwnSubscriptionsLoading() {
    }
    
    public final void setMyMemberSubscriptionsLoading() {
    }
    
    public final boolean isCurrentSubscriptionLoading() {
        return false;
    }
}