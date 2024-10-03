package no.wmc.ui.main.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0002J\b\u0010\u001e\u001a\u00020\u001cH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\u0011\u0010 \u001a\u00020\u001cH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u0012\u0010\"\u001a\u00020\u001c2\b\b\u0002\u0010#\u001a\u00020$H\u0002J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u001a\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0010\u0010/\u001a\u00020\u001c2\u0006\u00100\u001a\u00020&H\u0002J\b\u00101\u001a\u00020\u001cH\u0002J\u0012\u00102\u001a\u00020\u001c2\b\u00103\u001a\u0004\u0018\u000104H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00065"}, d2 = {"Lno/wmc/ui/main/dashboard/DashFragment;", "Landroidx/fragment/app/Fragment;", "()V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "getAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "auth$delegate", "Lkotlin/Lazy;", "binding", "Lno/wmc/databinding/FragmentDashBinding;", "localDataManager", "Lno/wmc/data/local/manager/LocalDataManager;", "getLocalDataManager", "()Lno/wmc/data/local/manager/LocalDataManager;", "localDataManager$delegate", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "sharedPrefManage", "Lno/wmc/data/local/manager/SharedPrefManager;", "getSharedPrefManage", "()Lno/wmc/data/local/manager/SharedPrefManager;", "sharedPrefManage$delegate", "closeDrawer", "", "confirmDelete", "confirmLogOut", "deleteUser", "getUserFromFirebase", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logOutUser", "eraseData", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "onclickDrawerItem", "v", "showUserData", "showUserOnDrawer", "jsonData", "", "wmc-3.1.40-b11_prodRelease"})
public final class DashFragment extends androidx.fragment.app.Fragment {
    private no.wmc.databinding.FragmentDashBinding binding;
    private final kotlin.Lazy sharedPrefManage$delegate = null;
    private final kotlin.Lazy localDataManager$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy auth$delegate = null;
    public androidx.navigation.NavController navController;
    
    public DashFragment() {
        super();
    }
    
    private final no.wmc.data.local.manager.SharedPrefManager getSharedPrefManage() {
        return null;
    }
    
    private final no.wmc.data.local.manager.LocalDataManager getLocalDataManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.auth.FirebaseAuth getAuth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public final void setNavController(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void onclickDrawerItem(android.view.View v) {
    }
    
    private final void confirmLogOut() {
    }
    
    private final void confirmDelete() {
    }
    
    private final void deleteUser() {
    }
    
    private final void logOutUser(boolean eraseData) {
    }
    
    private final void showUserData() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getUserFromFirebase(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void showUserOnDrawer(java.lang.String jsonData) {
    }
    
    private final void closeDrawer() {
    }
}