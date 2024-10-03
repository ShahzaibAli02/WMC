package no.wmc.data.broadcaster.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lno/wmc/data/broadcaster/impl/NetworkStateBroadcaster;", "Lno/wmc/data/broadcaster/Broadcaster;", "", "appDispatchers", "Lno/wmc/utils/AppDispatchers;", "(Lno/wmc/utils/AppDispatchers;)V", "networkStateObservable", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "broadcast", "", "value", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observable", "Lkotlinx/coroutines/flow/SharedFlow;", "wmc-3.1.40-b11_prodRelease"})
public final class NetworkStateBroadcaster implements no.wmc.data.broadcaster.Broadcaster<java.lang.Boolean> {
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.Boolean> networkStateObservable = null;
    
    public NetworkStateBroadcaster(@org.jetbrains.annotations.NotNull
    no.wmc.utils.AppDispatchers appDispatchers) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object broadcast(boolean value, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.SharedFlow<java.lang.Boolean> observable() {
        return null;
    }
}