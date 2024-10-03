package no.wmc.ui.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\u001a\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lno/wmc/ui/splash/SplashFragment;", "Lno/wmc/ui/base/BaseFragment;", "Lno/wmc/databinding/SplashScreenBinding;", "()V", "localDataManager", "Lno/wmc/data/local/manager/LocalDataManager;", "getLocalDataManager", "()Lno/wmc/data/local/manager/LocalDataManager;", "localDataManager$delegate", "Lkotlin/Lazy;", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "getCountryCodeFromLocation", "location", "Landroid/location/Location;", "getUserLocation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadUserLocation", "", "onPause", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showNextScreen", "wmc-3.1.40-b11_prodRelease"})
public final class SplashFragment extends no.wmc.ui.base.BaseFragment<no.wmc.databinding.SplashScreenBinding> {
    private final kotlin.Lazy localDataManager$delegate = null;
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> requestPermissionLauncher = null;
    
    public SplashFragment() {
        super(0);
    }
    
    private final no.wmc.data.local.manager.LocalDataManager getLocalDataManager() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void loadUserLocation() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCountryCodeFromLocation(@org.jetbrains.annotations.NotNull
    android.location.Location location) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final java.lang.Object getUserLocation(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super android.location.Location> continuation) {
        return null;
    }
    
    private final void showNextScreen() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
}