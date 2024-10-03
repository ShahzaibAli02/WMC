package no.wmc.ui.subscription.overview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0011\u0010\r\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0002X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewModel;", "Lno/wmc/ui/base/BaseViewModel;", "Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewState;", "getMyOwnSubscriptionsUseCase", "Lno/wmc/domain/model/usecase/GetMyOwnSubscriptionsUseCase;", "getMyMemberSubscriptionsUseCase", "Lno/wmc/domain/model/usecase/GetMyMemberSubscriptionsUseCase;", "viewState", "appDispatchers", "Lno/wmc/utils/AppDispatchers;", "(Lno/wmc/domain/model/usecase/GetMyOwnSubscriptionsUseCase;Lno/wmc/domain/model/usecase/GetMyMemberSubscriptionsUseCase;Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewState;Lno/wmc/utils/AppDispatchers;)V", "getViewState", "()Lno/wmc/ui/subscription/overview/SubscriptionOverviewViewState;", "handleGetMyMemberSubscriptionsEvent", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGetSubscriptionsEvent", "handleViewEvent", "event", "Lno/wmc/ui/base/ViewEvent;", "(Lno/wmc/ui/base/ViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCurrentSubscriptionLoading", "", "removeSubscriptionItem", "", "Lno/wmc/domain/model/Subscription;", "id", "", "wmc-3.1.40-b11_prodRelease"})
public final class SubscriptionOverviewViewModel extends no.wmc.ui.base.BaseViewModel<no.wmc.ui.subscription.overview.SubscriptionOverviewViewState> {
    private final no.wmc.domain.model.usecase.GetMyOwnSubscriptionsUseCase getMyOwnSubscriptionsUseCase = null;
    private final no.wmc.domain.model.usecase.GetMyMemberSubscriptionsUseCase getMyMemberSubscriptionsUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final no.wmc.ui.subscription.overview.SubscriptionOverviewViewState viewState = null;
    
    public SubscriptionOverviewViewModel(@org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.GetMyOwnSubscriptionsUseCase getMyOwnSubscriptionsUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.GetMyMemberSubscriptionsUseCase getMyMemberSubscriptionsUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.ui.subscription.overview.SubscriptionOverviewViewState viewState, @org.jetbrains.annotations.NotNull
    no.wmc.utils.AppDispatchers appDispatchers) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected no.wmc.ui.subscription.overview.SubscriptionOverviewViewState getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected java.lang.Object handleViewEvent(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewEvent event, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final boolean isCurrentSubscriptionLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<no.wmc.domain.model.Subscription> removeSubscriptionItem(int id) {
        return null;
    }
    
    private final java.lang.Object handleGetSubscriptionsEvent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleGetMyMemberSubscriptionsEvent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}