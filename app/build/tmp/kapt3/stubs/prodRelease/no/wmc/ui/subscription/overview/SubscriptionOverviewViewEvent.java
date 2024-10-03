package no.wmc.ui.subscription.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewEvent;", "Lno/wmc/ui/base/ViewEvent;", "()V", "GetMyMemberSubscriptionsViewEvent", "GetMyOwnSubscriptionsViewEvent", "Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewEvent$GetMyMemberSubscriptionsViewEvent;", "Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewEvent$GetMyOwnSubscriptionsViewEvent;", "wmc-3.1.40-b11_prodRelease"})
public abstract class SubscriptionOverviewViewEvent extends no.wmc.ui.base.ViewEvent {
    
    private SubscriptionOverviewViewEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewEvent$GetMyOwnSubscriptionsViewEvent;", "Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewEvent;", "()V", "wmc-3.1.40-b11_prodRelease"})
    public static final class GetMyOwnSubscriptionsViewEvent extends no.wmc.ui.subscription.overview.SubscriptionOverviewViewEvent {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.subscription.overview.SubscriptionOverviewViewEvent.GetMyOwnSubscriptionsViewEvent INSTANCE = null;
        
        private GetMyOwnSubscriptionsViewEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewEvent$GetMyMemberSubscriptionsViewEvent;", "Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewEvent;", "()V", "wmc-3.1.40-b11_prodRelease"})
    public static final class GetMyMemberSubscriptionsViewEvent extends no.wmc.ui.subscription.overview.SubscriptionOverviewViewEvent {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.subscription.overview.SubscriptionOverviewViewEvent.GetMyMemberSubscriptionsViewEvent INSTANCE = null;
        
        private GetMyMemberSubscriptionsViewEvent() {
            super();
        }
    }
}