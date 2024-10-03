package no.wmc.ui.subscription.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\u001c\u0010\u0010\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012H\u0002J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0014J\b\u0010\u0018\u001a\u00020\fH\u0002J\b\u0010\u0019\u001a\u00020\fH\u0002J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0014H\u0002J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0014H\u0002J\u001a\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0004\n\u0002\u0010\r\u00a8\u0006#"}, d2 = {"Lno/wmc/ui/subscription/overview/SubscriptionOverviewFragment;", "Lno/wmc/ui/base/BaseViewStateFragment;", "Lno/wmc/databinding/SubscriptionOverviewScreenBinding;", "Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewModel;", "()V", "adapter", "Lno/wmc/ui/subscription/overview/list/SubscriptionOverviewAdapter;", "getAdapter", "()Lno/wmc/ui/subscription/overview/list/SubscriptionOverviewAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "cancelSubscriptionResultObserver", "", "Lkotlin/Unit;", "getMyMemberSubscriptions", "getMyOwnSubscriptions", "handleGetSubscriptionsViewState", "viewState", "Lno/wmc/ui/base/ViewState;", "", "Lno/wmc/domain/model/Subscription;", "handleViewAction", "viewAction", "Lno/wmc/ui/base/ViewAction;", "initViews", "observeCancelSubscriptionResult", "onRemoveMembershipClicked", "subscription", "onSubscriptionItemClicked", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "wmc-3.1.40-b11_prodRelease"})
public final class SubscriptionOverviewFragment extends no.wmc.ui.base.BaseViewStateFragment<no.wmc.databinding.SubscriptionOverviewScreenBinding, no.wmc.ui.subscription.overview.SubscriptionOverviewViewModel> {
    private kotlin.Unit cancelSubscriptionResultObserver;
    private final kotlin.Lazy adapter$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final no.wmc.ui.subscription.overview.SubscriptionOverviewFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CANCEL_SUBSCRIPTION_RESULT = "CANCEL_SUBSCRIPTION_RESULT";
    
    public SubscriptionOverviewFragment() {
        super(0, null);
    }
    
    private final no.wmc.ui.subscription.overview.list.SubscriptionOverviewAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
    
    private final void getMyOwnSubscriptions() {
    }
    
    private final void getMyMemberSubscriptions() {
    }
    
    @java.lang.Override
    protected void handleViewAction(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewAction viewAction) {
    }
    
    private final void handleGetSubscriptionsViewState(no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.Subscription>> viewState) {
    }
    
    private final void onSubscriptionItemClicked(no.wmc.domain.model.Subscription subscription) {
    }
    
    private final void onRemoveMembershipClicked(no.wmc.domain.model.Subscription subscription) {
    }
    
    private final void observeCancelSubscriptionResult() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lno/wmc/ui/subscription/overview/SubscriptionOverviewFragment$Companion;", "", "()V", "CANCEL_SUBSCRIPTION_RESULT", "", "wmc-3.1.40-b11_prodRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}