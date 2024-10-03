package no.wmc.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\f\b\u0001\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u001d\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u00a2\u0006\u0002\u0010\nJ)\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0002\u00a2\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u001dH\u0004J\u001a\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020(H\u0004J\u0012\u0010)\u001a\u00020\u001d2\b\b\u0001\u0010*\u001a\u00020\u0007H\u0004J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0016H\u0004J%\u0010+\u001a\u00020\u001d2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0004\u00a2\u0006\u0002\u0010,J\u0012\u0010-\u001a\u00020\u001d2\b\b\u0002\u0010.\u001a\u00020\u0016H\u0004J3\u0010/\u001a\u00020\u001d\"\b\b\u0002\u00100*\u00020\u001f2\u0006\u0010\u001e\u001a\u0002H02\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u0002H0\u0012\u0004\u0012\u00020\u001d02H\u0002\u00a2\u0006\u0002\u00103J\b\u00104\u001a\u00020\u001dH\u0002J\u0010\u00105\u001a\u00020\u001d2\u0006\u00101\u001a\u00020\u001fH\u0004R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00028\u00018DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0012\u0010\u0013\u00a8\u00066"}, d2 = {"Lno/wmc/ui/base/BaseViewStateFragment;", "DB", "Landroidx/databinding/ViewDataBinding;", "VM", "Lno/wmc/ui/base/BaseViewModel;", "Lno/wmc/ui/base/BaseFragment;", "layout", "", "viewModelClazz", "Lkotlin/reflect/KClass;", "(ILkotlin/reflect/KClass;)V", "loadingDialog", "Landroid/app/Dialog;", "getLoadingDialog", "()Landroid/app/Dialog;", "loadingDialog$delegate", "Lkotlin/Lazy;", "viewModel", "getViewModel", "()Lno/wmc/ui/base/BaseViewModel;", "viewModel$delegate", "getErrorMessage", "", "context", "Landroid/content/Context;", "errorCode", "errorMessage", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "handleViewAction", "", "viewAction", "Lno/wmc/ui/base/ViewAction;", "hideDialog", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "sendViewEvent", "viewEvent", "Lno/wmc/ui/base/ViewEvent;", "showErrorDialog", "errorRes", "showErrorMessage", "(Ljava/lang/String;Ljava/lang/Integer;)V", "showLoadingDialog", "message", "singleAction", "T", "action", "Lkotlin/Function1;", "(Lno/wmc/ui/base/ViewAction;Lkotlin/jvm/functions/Function1;)V", "subscribe", "throwActionNotSupported", "wmc-3.1.40-b11_devDebug"})
public class BaseViewStateFragment<DB extends androidx.databinding.ViewDataBinding, VM extends no.wmc.ui.base.BaseViewModel<?>> extends no.wmc.ui.base.BaseFragment<DB> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy loadingDialog$delegate = null;
    
    public BaseViewStateFragment(@androidx.annotation.LayoutRes
    int layout, @org.jetbrains.annotations.NotNull
    kotlin.reflect.KClass<VM> viewModelClazz) {
        super(0);
    }
    
    @org.jetbrains.annotations.NotNull
    protected final VM getViewModel() {
        return null;
    }
    
    private final android.app.Dialog getLoadingDialog() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    protected final void sendViewEvent(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewEvent viewEvent) {
    }
    
    /**
     * Subscribes for action events from ViewModel to View
     */
    private final void subscribe() {
    }
    
    protected void handleViewAction(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewAction viewAction) {
    }
    
    protected final void throwActionNotSupported(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewAction action) {
    }
    
    private final <T extends no.wmc.ui.base.ViewAction>void singleAction(T viewAction, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> action) {
    }
    
    protected final void hideDialog() {
    }
    
    protected final void showLoadingDialog(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    protected final void showErrorMessage(@org.jetbrains.annotations.Nullable
    java.lang.String errorMessage, @org.jetbrains.annotations.Nullable
    java.lang.Integer errorCode) {
    }
    
    protected final void showErrorDialog(@androidx.annotation.StringRes
    int errorRes) {
    }
    
    protected final void showErrorDialog(@org.jetbrains.annotations.NotNull
    java.lang.String errorMessage) {
    }
    
    private final java.lang.String getErrorMessage(android.content.Context context, java.lang.Integer errorCode, java.lang.String errorMessage) {
        return null;
    }
}