package no.wmc.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006Jk\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2$\b\u0002\u0010\u000e\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\u001c\u0010\u0011\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0084@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\nH\u0002JC\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b2\u001c\u0010\u0016\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lno/wmc/data/repo/BaseRepository;", "", "networkStateManager", "Lno/wmc/data/manager/NetworkStateManager;", "localDataManager", "Lno/wmc/data/local/manager/LocalDataManager;", "(Lno/wmc/data/manager/NetworkStateManager;Lno/wmc/data/local/manager/LocalDataManager;)V", "getLocalDataManager", "()Lno/wmc/data/local/manager/LocalDataManager;", "execute", "Lno/wmc/domain/DataState;", "Data", "shouldRetry", "", "fallback", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "onOnline", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginUser", "", "retryLogin", "callback", "apiException", "Lno/wmc/data/remote/ApiException;", "(Lkotlin/jvm/functions/Function1;Lno/wmc/data/remote/ApiException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_devDebug"})
public class BaseRepository {
    private final no.wmc.data.manager.NetworkStateManager networkStateManager = null;
    @org.jetbrains.annotations.NotNull
    private final no.wmc.data.local.manager.LocalDataManager localDataManager = null;
    
    public BaseRepository(@org.jetbrains.annotations.NotNull
    no.wmc.data.manager.NetworkStateManager networkStateManager, @org.jetbrains.annotations.NotNull
    no.wmc.data.local.manager.LocalDataManager localDataManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final no.wmc.data.local.manager.LocalDataManager getLocalDataManager() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    protected final <Data extends java.lang.Object>java.lang.Object execute(boolean shouldRetry, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<Data>>, ? extends java.lang.Object> fallback, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super Data>, ? extends java.lang.Object> onOnline, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<Data>> continuation) {
        return null;
    }
    
    private final <Data extends java.lang.Object>java.lang.Object retryLogin(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super Data>, ? extends java.lang.Object> callback, no.wmc.data.remote.ApiException apiException, kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<Data>> continuation) {
        return null;
    }
    
    private final no.wmc.domain.DataState<kotlin.Unit> loginUser() {
        return null;
    }
}