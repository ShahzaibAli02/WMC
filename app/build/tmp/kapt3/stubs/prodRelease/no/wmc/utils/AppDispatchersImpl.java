package no.wmc.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\b"}, d2 = {"Lno/wmc/utils/AppDispatchersImpl;", "Lno/wmc/utils/AppDispatchers;", "()V", "getDefaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIODispatcher", "getMainDispatcher", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "wmc-3.1.40-b11_prodRelease"})
public final class AppDispatchersImpl implements no.wmc.utils.AppDispatchers {
    
    public AppDispatchersImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.CoroutineDispatcher getIODispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.CoroutineDispatcher getDefaultDispatcher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.MainCoroutineDispatcher getMainDispatcher() {
        return null;
    }
}