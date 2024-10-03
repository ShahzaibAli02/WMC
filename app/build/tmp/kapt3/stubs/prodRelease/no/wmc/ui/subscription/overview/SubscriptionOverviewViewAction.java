package no.wmc.ui.subscription.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewAction;", "Lno/wmc/ui/base/ViewAction;", "()V", "GetMyMemberSubscriptionsViewAction", "GetMyOwnSubscriptionsViewAction", "Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewAction$GetMyMemberSubscriptionsViewAction;", "Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewAction$GetMyOwnSubscriptionsViewAction;", "wmc-3.1.40-b11_prodRelease"})
public abstract class SubscriptionOverviewViewAction extends no.wmc.ui.base.ViewAction {
    
    private SubscriptionOverviewViewAction() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\u0002\u0010\u0006R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewAction$GetMyOwnSubscriptionsViewAction;", "Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewAction;", "viewState", "Lno/wmc/ui/base/ViewState;", "", "Lno/wmc/domain/model/Subscription;", "(Lno/wmc/ui/base/ViewState;)V", "getViewState", "()Lno/wmc/ui/base/ViewState;", "wmc-3.1.40-b11_prodRelease"})
    public static final class GetMyOwnSubscriptionsViewAction extends no.wmc.ui.subscription.overview.SubscriptionOverviewViewAction {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.Subscription>> viewState = null;
        
        public GetMyOwnSubscriptionsViewAction(@org.jetbrains.annotations.NotNull
        no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.Subscription>> viewState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.Subscription>> getViewState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\u0002\u0010\u0006R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewAction$GetMyMemberSubscriptionsViewAction;", "Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewAction;", "viewState", "Lno/wmc/ui/base/ViewState;", "", "Lno/wmc/domain/model/Subscription;", "(Lno/wmc/ui/base/ViewState;)V", "getViewState", "()Lno/wmc/ui/base/ViewState;", "wmc-3.1.40-b11_prodRelease"})
    public static final class GetMyMemberSubscriptionsViewAction extends no.wmc.ui.subscription.overview.SubscriptionOverviewViewAction {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.Subscription>> viewState = null;
        
        public GetMyMemberSubscriptionsViewAction(@org.jetbrains.annotations.NotNull
        no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.Subscription>> viewState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.Subscription>> getViewState() {
            return null;
        }
    }
}