package no.wmc.domain.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0011\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lno/wmc/domain/repo/SubscriptionRepository;", "", "cancelSubscription", "Lno/wmc/domain/DataState;", "", "subscriptionId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSubscriptionUser", "customerId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyMemberSubscriptions", "", "Lno/wmc/data/remote/model/SubscriptionDtoModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyOwnSubscriptions", "getSubscriptionDetail", "id", "inviteSubscriptionUser", "email", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_devDebug"})
public abstract interface SubscriptionRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMyOwnSubscriptions(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<java.util.List<no.wmc.data.remote.model.SubscriptionDtoModel>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMyMemberSubscriptions(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<java.util.List<no.wmc.data.remote.model.SubscriptionDtoModel>>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getSubscriptionDetail(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<no.wmc.data.remote.model.SubscriptionDtoModel>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object inviteSubscriptionUser(int subscriptionId, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<kotlin.Unit>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteSubscriptionUser(int subscriptionId, int customerId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<kotlin.Unit>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object cancelSubscription(int subscriptionId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<kotlin.Unit>> continuation);
}