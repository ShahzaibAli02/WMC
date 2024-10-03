package no.wmc.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0012\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u0006\u0010\u0013\u001a\u00020\bJ\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0002J\b\u0010\u0018\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lno/wmc/ui/MainActivity;", "Lno/wmc/ui/base/BaseActivity;", "()V", "binding", "Lno/wmc/databinding/ActivityMainBinding;", "navController", "Landroidx/navigation/NavController;", "handleDeepLink", "", "uri", "Landroid/net/Uri;", "isNotificationPermissionGranted", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "requestNotificationPermission", "setWindowFlag", "bits", "", "on", "updateInsets", "wmc-3.1.40-b11_prodRelease"})
public final class MainActivity extends no.wmc.ui.base.BaseActivity {
    private no.wmc.databinding.ActivityMainBinding binding;
    private androidx.navigation.NavController navController;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onNewIntent(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
    }
    
    private final void handleDeepLink(android.net.Uri uri) {
    }
    
    public final void requestNotificationPermission() {
    }
    
    public final boolean isNotificationPermissionGranted() {
        return false;
    }
    
    private final void setWindowFlag(int bits, boolean on) {
    }
    
    private final void updateInsets() {
    }
}