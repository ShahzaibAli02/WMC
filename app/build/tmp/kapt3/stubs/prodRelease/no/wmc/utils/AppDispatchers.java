package no.wmc.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/utils/AppDispatchers;", "", "getDefaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getIODispatcher", "getMainDispatcher", "wmc-3.1.40-b11_prodRelease"})
public abstract interface AppDispatchers {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.CoroutineDispatcher getIODispatcher();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.CoroutineDispatcher getDefaultDispatcher();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.CoroutineDispatcher getMainDispatcher();
}