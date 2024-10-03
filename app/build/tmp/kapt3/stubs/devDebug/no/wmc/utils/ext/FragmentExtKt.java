package no.wmc.utils.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a \u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0002\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\r\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\r\u00a8\u0006\u0010"}, d2 = {"hideKeyboard", "", "Landroidx/fragment/app/Fragment;", "setBackAction", "lifeCycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "action", "Lkotlin/Function0;", "showKeyboard", "showSnackBar", "messageId", "", "message", "", "showToast", "text", "wmc-3.1.40-b11_devDebug"})
public final class FragmentExtKt {
    
    public static final void showSnackBar(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$showSnackBar, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    public static final void showSnackBar(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$showSnackBar, @androidx.annotation.StringRes
    int messageId) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$hideKeyboard) {
    }
    
    public static final void showKeyboard(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$showKeyboard) {
    }
    
    public static final void setBackAction(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$setBackAction, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner lifeCycleOwner, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
    }
    
    public static final void showToast(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$showToast, @org.jetbrains.annotations.NotNull
    java.lang.String text) {
    }
}