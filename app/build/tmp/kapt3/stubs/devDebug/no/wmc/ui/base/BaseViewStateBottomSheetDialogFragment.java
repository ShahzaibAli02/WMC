package no.wmc.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\f\b\u0001\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u001d\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t\u00a2\u0006\u0002\u0010\nJ)\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0002\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u001a\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0004J%\u0010#\u001a\u00020\u00182\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0004\u00a2\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0018H\u0002J\u0010\u0010&\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\u001aH\u0004R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00028\u00018BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006("}, d2 = {"Lno/wmc/ui/base/BaseViewStateBottomSheetDialogFragment;", "DB", "Landroidx/databinding/ViewDataBinding;", "VM", "Lno/wmc/ui/base/BaseViewModel;", "Lno/wmc/ui/base/BaseBottomSheetDialogFragment;", "layoutId", "", "clazz", "Lkotlin/reflect/KClass;", "(ILkotlin/reflect/KClass;)V", "viewModel", "getViewModel", "()Lno/wmc/ui/base/BaseViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getErrorMessage", "", "context", "Landroid/content/Context;", "errorCode", "errorMessage", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/String;", "handleViewAction", "", "viewAction", "Lno/wmc/ui/base/ViewAction;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "sendViewEvent", "viewEvent", "Lno/wmc/ui/base/ViewEvent;", "showErrorMessage", "(Ljava/lang/String;Ljava/lang/Integer;)V", "subscribe", "throwActionNotSupported", "action", "wmc-3.1.40-b11_devDebug"})
public class BaseViewStateBottomSheetDialogFragment<DB extends androidx.databinding.ViewDataBinding, VM extends no.wmc.ui.base.BaseViewModel<?>> extends no.wmc.ui.base.BaseBottomSheetDialogFragment<DB> {
    private final int layoutId = 0;
    private final kotlin.Lazy viewModel$delegate = null;
    
    public BaseViewStateBottomSheetDialogFragment(@androidx.annotation.LayoutRes
    int layoutId, @org.jetbrains.annotations.NotNull
    kotlin.reflect.KClass<VM> clazz) {
        super(0);
    }
    
    private final VM getViewModel() {
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
    
    private final void subscribe() {
    }
    
    protected void handleViewAction(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewAction viewAction) {
    }
    
    protected final void throwActionNotSupported(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewAction action) {
    }
    
    protected final void showErrorMessage(@org.jetbrains.annotations.Nullable
    java.lang.String errorMessage, @org.jetbrains.annotations.Nullable
    java.lang.Integer errorCode) {
    }
    
    private final java.lang.String getErrorMessage(android.content.Context context, java.lang.Integer errorCode, java.lang.String errorMessage) {
        return null;
    }
}