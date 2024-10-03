package no.wmc.utils.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0002\u001a \u0010\t\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e\u001a\n\u0010\u000f\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0010\u001a\u00020\u0004*\u00020\u0002\u001a\u0014\u0010\u0011\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0001\u001a\u0012\u0010\u0011\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014\u001a\n\u0010\u0015\u001a\u00020\u0004*\u00020\u0002\u001a\u0012\u0010\u0016\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0014\u00a8\u0006\u0018"}, d2 = {"getWindowHeight", "", "Landroid/app/Activity;", "hideKeyboard", "", "view", "Landroid/view/View;", "hideNavigationBar", "hideStatusBar", "setBackAction", "Landroidx/activity/ComponentActivity;", "lifeCycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "action", "Lkotlin/Function0;", "showKeyboard", "showNavigationBar", "showSnackBar", "messageId", "message", "", "showStatusBAr", "showToast", "text", "wmc-3.1.40-b11_devDebug"})
public final class ActivityExtKt {
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$hideKeyboard, @org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$hideKeyboard) {
    }
    
    public static final void showKeyboard(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$showKeyboard) {
    }
    
    /**
     * Custom behavior for back button at Fragments from Android Navigation Component
     */
    public static final void setBackAction(@org.jetbrains.annotations.NotNull
    androidx.activity.ComponentActivity $this$setBackAction, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner lifeCycleOwner, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    public static final void showToast(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$showToast, @org.jetbrains.annotations.NotNull
    java.lang.String text) {
    }
    
    public static final void showSnackBar(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$showSnackBar, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    public static final void showSnackBar(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$showSnackBar, @androidx.annotation.StringRes
    int messageId) {
    }
    
    public static final int getWindowHeight(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$getWindowHeight) {
        return 0;
    }
    
    public static final void showNavigationBar(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$showNavigationBar) {
    }
    
    public static final void hideStatusBar(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$hideStatusBar) {
    }
    
    public static final void showStatusBAr(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$showStatusBAr) {
    }
    
    public static final void hideNavigationBar(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$hideNavigationBar) {
    }
}