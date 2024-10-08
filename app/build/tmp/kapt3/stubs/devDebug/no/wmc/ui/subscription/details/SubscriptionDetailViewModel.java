package no.wmc.ui.subscription.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0002X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lno/wmc/ui/subscription/details/SubscriptionDetailViewModel;", "Lno/wmc/ui/base/BaseViewModel;", "Lno/wmc/ui/subscription/details/SubscriptionDetailViewState;", "getSubscriptionDetailUseCase", "Lno/wmc/domain/model/usecase/GetSubscriptionDetailUseCase;", "deleteSubscriptionUserUseCase", "Lno/wmc/domain/model/usecase/DeleteSubscriptionUserUseCase;", "cancelSubscriptionUseCase", "Lno/wmc/domain/model/usecase/CancelSubscriptionUseCase;", "viewState", "appDispatchers", "Lno/wmc/utils/AppDispatchers;", "(Lno/wmc/domain/model/usecase/GetSubscriptionDetailUseCase;Lno/wmc/domain/model/usecase/DeleteSubscriptionUserUseCase;Lno/wmc/domain/model/usecase/CancelSubscriptionUseCase;Lno/wmc/ui/subscription/details/SubscriptionDetailViewState;Lno/wmc/utils/AppDispatchers;)V", "getViewState", "()Lno/wmc/ui/subscription/details/SubscriptionDetailViewState;", "handleCancelSubscriptionEvent", "", "subscriptionId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleDeleteSubscriptionUserEvent", "customerId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGetSubscriptionDetailEvent", "id", "handleViewEvent", "event", "Lno/wmc/ui/base/ViewEvent;", "(Lno/wmc/ui/base/ViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_devDebug"})
public final class SubscriptionDetailViewModel extends no.wmc.ui.base.BaseViewModel<no.wmc.ui.subscription.details.SubscriptionDetailViewState> {
    private final no.wmc.domain.model.usecase.GetSubscriptionDetailUseCase getSubscriptionDetailUseCase = null;
    private final no.wmc.domain.model.usecase.DeleteSubscriptionUserUseCase deleteSubscriptionUserUseCase = null;
    private final no.wmc.domain.model.usecase.CancelSubscriptionUseCase cancelSubscriptionUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final no.wmc.ui.subscription.details.SubscriptionDetailViewState viewState = null;
    
    public SubscriptionDetailViewModel(@org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.GetSubscriptionDetailUseCase getSubscriptionDetailUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.DeleteSubscriptionUserUseCase deleteSubscriptionUserUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.CancelSubscriptionUseCase cancelSubscriptionUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.ui.subscription.details.SubscriptionDetailViewState viewState, @org.jetbrains.annotations.NotNull
    no.wmc.utils.AppDispatchers appDispatchers) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected no.wmc.ui.subscription.details.SubscriptionDetailViewState getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected java.lang.Object handleViewEvent(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewEvent event, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleGetSubscriptionDetailEvent(int id, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleDeleteSubscriptionUserEvent(int subscriptionId, int customerId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleCancelSubscriptionEvent(int subscriptionId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}