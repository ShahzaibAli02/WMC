package no.wmc.ui.subscription.invitation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0002X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lno/wmc/ui/subscription/invitation/SubscriptionInvitationViewModel;", "Lno/wmc/ui/base/BaseViewModel;", "Lno/wmc/ui/subscription/invitation/SubscriptionInvitationViewState;", "inviteSubscriptionUserUseCase", "Lno/wmc/domain/model/usecase/InviteSubscriptionUserUseCase;", "viewState", "appDispatchers", "Lno/wmc/utils/AppDispatchers;", "(Lno/wmc/domain/model/usecase/InviteSubscriptionUserUseCase;Lno/wmc/ui/subscription/invitation/SubscriptionInvitationViewState;Lno/wmc/utils/AppDispatchers;)V", "getViewState", "()Lno/wmc/ui/subscription/invitation/SubscriptionInvitationViewState;", "handleInviteSubscriptionUserEvent", "", "subscriptionId", "", "email", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleViewEvent", "event", "Lno/wmc/ui/base/ViewEvent;", "(Lno/wmc/ui/base/ViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_prodRelease"})
public final class SubscriptionInvitationViewModel extends no.wmc.ui.base.BaseViewModel<no.wmc.ui.subscription.invitation.SubscriptionInvitationViewState> {
    private final no.wmc.domain.model.usecase.InviteSubscriptionUserUseCase inviteSubscriptionUserUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final no.wmc.ui.subscription.invitation.SubscriptionInvitationViewState viewState = null;
    
    public SubscriptionInvitationViewModel(@org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.InviteSubscriptionUserUseCase inviteSubscriptionUserUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.ui.subscription.invitation.SubscriptionInvitationViewState viewState, @org.jetbrains.annotations.NotNull
    no.wmc.utils.AppDispatchers appDispatchers) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected no.wmc.ui.subscription.invitation.SubscriptionInvitationViewState getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected java.lang.Object handleViewEvent(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewEvent event, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleInviteSubscriptionUserEvent(int subscriptionId, java.lang.String email, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}