package no.wmc.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005JH\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u001c\"\u0004\b\u0001\u0010\u001e\"\u0006\b\u0002\u0010\u001d\u0018\u00012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001e0 2\u0018\b\u0002\u0010!\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u0001H\u001e\u0012\u0006\u0012\u0004\u0018\u0001H\u001d0\"H\u0084\b\u00f8\u0001\u0000JH\u0010#\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u001c\"\u0004\b\u0001\u0010\u001e\"\u0006\b\u0002\u0010\u001d\u0018\u00012\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u001e0%2\u0018\b\u0002\u0010!\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u0001H\u001e\u0012\u0006\u0012\u0004\u0018\u0001H\u001d0\"H\u0084\b\u00f8\u0001\u0000J\u00b4\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u001c\"\u0004\b\u0001\u0010\u001e\"\u0006\b\u0002\u0010\u001d\u0018\u00012\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u001e0&2\u0016\b\u0002\u0010\'\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u001d\u0012\u0004\u0012\u00020(0\"2)\b\u0002\u0010)\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001e0 \u0012\u0006\u0012\u0004\u0018\u0001H\u001e\u0012\u0006\u0012\u0004\u0018\u0001H\u001d0*\u00a2\u0006\u0002\b+2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u001d\u0012\u0004\u0012\u00020(0\"2)\b\u0002\u0010-\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001e0%\u0012\u0006\u0012\u0004\u0018\u0001H\u001e\u0012\u0006\u0012\u0004\u0018\u0001H\u001d0*\u00a2\u0006\u0002\b+H\u0084\b\u00f8\u0001\u0000J\u0019\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020\u000fH\u00a4@\u00f8\u0001\u0001\u00a2\u0006\u0002\u00100J\b\u00101\u001a\u00020(H\u0014J\u0019\u00102\u001a\u00020(2\u0006\u00103\u001a\u00020\bH\u0084@\u00f8\u0001\u0001\u00a2\u0006\u0002\u00104J\b\u00105\u001a\u00020(H\u0002J\u0010\u00106\u001a\u00020(2\u0006\u0010/\u001a\u00020\u000fH\u0004R!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0016\u0010\nR\u0012\u0010\u0018\u001a\u00028\u0000X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019\u00a8\u00067"}, d2 = {"Lno/wmc/ui/base/BaseViewModel;", "VS", "Landroidx/lifecycle/ViewModel;", "dispatchers", "Lno/wmc/utils/AppDispatchers;", "(Lno/wmc/utils/AppDispatchers;)V", "_viewActionObservable", "Landroidx/lifecycle/MutableLiveData;", "Lno/wmc/ui/base/ViewAction;", "get_viewActionObservable", "()Landroidx/lifecycle/MutableLiveData;", "_viewActionObservable$delegate", "Lkotlin/Lazy;", "observer", "Landroidx/lifecycle/Observer;", "Lno/wmc/ui/base/ViewEvent;", "viewActionObservable", "Landroidx/lifecycle/LiveData;", "getViewActionObservable", "()Landroidx/lifecycle/LiveData;", "viewActionObservable$delegate", "viewEventObservable", "getViewEventObservable", "viewEventObservable$delegate", "viewState", "getViewState", "()Ljava/lang/Object;", "getErrorState", "Lno/wmc/ui/base/ViewState;", "ViewData", "Data", "errorState", "Lno/wmc/domain/DataState$Error;", "convert", "Lkotlin/Function1;", "getSuccessState", "state", "Lno/wmc/domain/DataState$Success;", "Lno/wmc/domain/DataState;", "errorCallback", "", "errorConverter", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "successCallback", "successConverter", "handleViewEvent", "event", "(Lno/wmc/ui/base/ViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "postAction", "viewAction", "(Lno/wmc/ui/base/ViewAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribeObservable", "throwEventNotSupported", "wmc-3.1.40-b11_devDebug"})
public abstract class BaseViewModel<VS extends java.lang.Object> extends androidx.lifecycle.ViewModel {
    private final no.wmc.utils.AppDispatchers dispatchers = null;
    private final kotlin.Lazy _viewActionObservable$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewActionObservable$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewEventObservable$delegate = null;
    private final androidx.lifecycle.Observer<no.wmc.ui.base.ViewEvent> observer = null;
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull
    no.wmc.utils.AppDispatchers dispatchers) {
        super();
    }
    
    private final androidx.lifecycle.MutableLiveData<no.wmc.ui.base.ViewAction> get_viewActionObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<no.wmc.ui.base.ViewAction> getViewActionObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<no.wmc.ui.base.ViewEvent> getViewEventObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    protected final java.lang.Object postAction(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewAction viewAction, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void subscribeObservable() {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    protected final void throwEventNotSupported(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewEvent event) {
    }
    
    /**
     * Handle events received from View by ViewModel to run proper
     * actions (i.e request data from repository)
     */
    @org.jetbrains.annotations.Nullable
    protected abstract java.lang.Object handleViewEvent(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewEvent event, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    protected abstract VS getViewState();
}