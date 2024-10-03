package no.wmc.data.manager.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u000f\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lno/wmc/data/manager/impl/NetworkStateManagerImpl;", "Lno/wmc/data/manager/NetworkStateManager;", "context", "Landroid/content/Context;", "appDispatchers", "Lno/wmc/utils/AppDispatchers;", "networkBroadcaster", "Lno/wmc/data/broadcaster/Broadcaster;", "", "(Landroid/content/Context;Lno/wmc/utils/AppDispatchers;Lno/wmc/data/broadcaster/Broadcaster;)V", "availableNetwork", "", "", "connectivityManager", "Landroid/net/ConnectivityManager;", "isOnline", "broadcastOnlineState", "", "wmc-3.1.40-b11_devDebug"})
public final class NetworkStateManagerImpl implements no.wmc.data.manager.NetworkStateManager {
    private final no.wmc.utils.AppDispatchers appDispatchers = null;
    private final no.wmc.data.broadcaster.Broadcaster<java.lang.Boolean> networkBroadcaster = null;
    private android.net.ConnectivityManager connectivityManager;
    private boolean isOnline = false;
    private final java.util.Set<java.lang.String> availableNetwork = null;
    
    public NetworkStateManagerImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    no.wmc.utils.AppDispatchers appDispatchers, @org.jetbrains.annotations.NotNull
    no.wmc.data.broadcaster.Broadcaster<java.lang.Boolean> networkBroadcaster) {
        super();
    }
    
    @java.lang.Override
    public boolean isOnline() {
        return false;
    }
    
    private final void broadcastOnlineState() {
    }
}