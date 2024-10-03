package no.wmc.data.local.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0011\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0012\u0010\u0012\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H&J\u001b\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lno/wmc/data/local/manager/LocalDataManager;", "Lno/wmc/data/local/manager/SharedPrefManager;", "Lno/wmc/data/local/manager/DatabaseManager;", "Lno/wmc/data/local/manager/SessionManager;", "getAccessToken", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccessTokenSync", "getCredentials", "Lno/wmc/domain/model/Credential;", "getIsLoggedIn", "", "isLoggedIn", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAccessToken", "token", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAccessTokenSync", "saveCredentials", "credential", "(Lno/wmc/domain/model/Credential;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_prodRelease"})
public abstract interface LocalDataManager extends no.wmc.data.local.manager.SharedPrefManager, no.wmc.data.local.manager.DatabaseManager, no.wmc.data.local.manager.SessionManager {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object isLoggedIn(boolean isLoggedIn, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getIsLoggedIn(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object saveAccessToken(@org.jetbrains.annotations.Nullable
    java.lang.String token, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAccessToken(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getAccessTokenSync();
    
    public abstract void saveAccessTokenSync(@org.jetbrains.annotations.Nullable
    java.lang.String token);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object saveCredentials(@org.jetbrains.annotations.Nullable
    no.wmc.domain.model.Credential credential, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract no.wmc.domain.model.Credential getCredentials();
}