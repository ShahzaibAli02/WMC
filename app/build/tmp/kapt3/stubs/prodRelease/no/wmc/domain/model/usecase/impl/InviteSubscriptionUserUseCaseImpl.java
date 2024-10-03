package no.wmc.domain.model.usecase.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lno/wmc/domain/model/usecase/impl/InviteSubscriptionUserUseCaseImpl;", "Lno/wmc/domain/model/usecase/impl/BaseUseCase;", "Lno/wmc/domain/model/usecase/InviteSubscriptionUserUseCase;", "subscriptionRepository", "Lno/wmc/domain/repo/SubscriptionRepository;", "(Lno/wmc/domain/repo/SubscriptionRepository;)V", "invoke", "Lno/wmc/domain/DataState;", "", "subscriptionId", "", "email", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_prodRelease"})
public final class InviteSubscriptionUserUseCaseImpl extends no.wmc.domain.model.usecase.impl.BaseUseCase implements no.wmc.domain.model.usecase.InviteSubscriptionUserUseCase {
    private final no.wmc.domain.repo.SubscriptionRepository subscriptionRepository = null;
    
    public InviteSubscriptionUserUseCaseImpl(@org.jetbrains.annotations.NotNull
    no.wmc.domain.repo.SubscriptionRepository subscriptionRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object invoke(int subscriptionId, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<kotlin.Unit>> continuation) {
        return null;
    }
}