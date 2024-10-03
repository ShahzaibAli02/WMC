package no.wmc.ui.registration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ!\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0002X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lno/wmc/ui/registration/RegisterViewModel;", "Lno/wmc/ui/base/BaseViewModel;", "Lno/wmc/ui/registration/RegisterViewState;", "registerUserUseCase", "Lno/wmc/domain/model/usecase/RegisterUserUseCase;", "validateEmailWithFireStoreUseCase", "Lno/wmc/domain/model/usecase/ValidateEmailWithFireStoreUseCase;", "registerWithEmailAndPasswordUseCase", "Lno/wmc/domain/model/usecase/RegisterWithEmailAndPasswordUseCase;", "viewState", "appDispatchers", "Lno/wmc/utils/AppDispatchers;", "(Lno/wmc/domain/model/usecase/RegisterUserUseCase;Lno/wmc/domain/model/usecase/ValidateEmailWithFireStoreUseCase;Lno/wmc/domain/model/usecase/RegisterWithEmailAndPasswordUseCase;Lno/wmc/ui/registration/RegisterViewState;Lno/wmc/utils/AppDispatchers;)V", "getViewState", "()Lno/wmc/ui/registration/RegisterViewState;", "handleCreateUserInFirebaseAuthViewEvent", "", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleRegisterUserViewEvent", "profile", "Lno/wmc/domain/model/Profile;", "(Lno/wmc/domain/model/Profile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleViewEvent", "event", "Lno/wmc/ui/base/ViewEvent;", "(Lno/wmc/ui/base/ViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateEmail", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_devDebug"})
public final class RegisterViewModel extends no.wmc.ui.base.BaseViewModel<no.wmc.ui.registration.RegisterViewState> {
    private final no.wmc.domain.model.usecase.RegisterUserUseCase registerUserUseCase = null;
    private final no.wmc.domain.model.usecase.ValidateEmailWithFireStoreUseCase validateEmailWithFireStoreUseCase = null;
    private final no.wmc.domain.model.usecase.RegisterWithEmailAndPasswordUseCase registerWithEmailAndPasswordUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final no.wmc.ui.registration.RegisterViewState viewState = null;
    
    public RegisterViewModel(@org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.RegisterUserUseCase registerUserUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.ValidateEmailWithFireStoreUseCase validateEmailWithFireStoreUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.RegisterWithEmailAndPasswordUseCase registerWithEmailAndPasswordUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.ui.registration.RegisterViewState viewState, @org.jetbrains.annotations.NotNull
    no.wmc.utils.AppDispatchers appDispatchers) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected no.wmc.ui.registration.RegisterViewState getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected java.lang.Object handleViewEvent(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewEvent event, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleRegisterUserViewEvent(no.wmc.domain.model.Profile profile, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleCreateUserInFirebaseAuthViewEvent(java.lang.String email, java.lang.String password, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object validateEmail(java.lang.String email, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}