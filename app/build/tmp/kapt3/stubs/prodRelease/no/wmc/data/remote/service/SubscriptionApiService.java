package no.wmc.data.remote.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\u0012\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\u0013H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lno/wmc/data/remote/service/SubscriptionApiService;", "", "cancelSubscription", "", "subscriptionId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSubscriptionUser", "body", "Lno/wmc/data/remote/model/DeleteSubscriptionUserRequestBody;", "(Lno/wmc/data/remote/model/DeleteSubscriptionUserRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyMemberSubscriptions", "", "Lno/wmc/data/remote/model/SubscriptionDtoModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyOwnSubscriptions", "getSubscriptionDetail", "id", "inviteSubscriptionUser", "Lno/wmc/data/remote/model/InviteSubscriptionUserRequestBody;", "(Lno/wmc/data/remote/model/InviteSubscriptionUserRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_prodRelease"})
public abstract interface SubscriptionApiService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/users/subscriptions")
    public abstract java.lang.Object getMyOwnSubscriptions(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<no.wmc.data.remote.model.SubscriptionDtoModel>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/users/subscriptions/member")
    public abstract java.lang.Object getMyMemberSubscriptions(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<no.wmc.data.remote.model.SubscriptionDtoModel>> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/users/subscriptions/detail")
    public abstract java.lang.Object getSubscriptionDetail(@retrofit2.http.Query(value = "id")
    int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.data.remote.model.SubscriptionDtoModel> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "/users/subscriptions/member")
    public abstract java.lang.Object inviteSubscriptionUser(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    no.wmc.data.remote.model.InviteSubscriptionUserRequestBody body, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.HTTP(method = "DELETE", path = "/users/subscriptions/member", hasBody = true)
    public abstract java.lang.Object deleteSubscriptionUser(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Body
    no.wmc.data.remote.model.DeleteSubscriptionUserRequestBody body, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.PUT(value = "/users/subscriptions")
    public abstract java.lang.Object cancelSubscription(@retrofit2.http.Query(value = "id")
    int subscriptionId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}