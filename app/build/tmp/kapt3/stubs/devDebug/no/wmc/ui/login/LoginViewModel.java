package no.wmc.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J)\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0019\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u000e\u0010\'\u001a\u00020\u00182\u0006\u0010\'\u001a\u00020\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0002X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006("}, d2 = {"Lno/wmc/ui/login/LoginViewModel;", "Lno/wmc/ui/base/BaseViewModel;", "Lno/wmc/ui/login/LoginViewState;", "authWithFirebaseUseCase", "Lno/wmc/domain/model/usecase/AuthWithFirebaseUseCase;", "authWithEmailAndPasswordUseCase", "Lno/wmc/domain/model/usecase/AuthWithEmailAndPasswordUseCase;", "registerWithEmailAndPasswordUseCase", "Lno/wmc/domain/model/usecase/RegisterWithEmailAndPasswordUseCase;", "getProfileUseCase", "Lno/wmc/domain/model/usecase/GetProfileUseCase;", "getProfileFromFireStoreUseCase", "Lno/wmc/domain/model/usecase/GetProfileFromFireStoreUseCase;", "localDataManager", "Lno/wmc/data/local/manager/LocalDataManager;", "viewState", "appDispatchers", "Lno/wmc/utils/AppDispatchers;", "(Lno/wmc/domain/model/usecase/AuthWithFirebaseUseCase;Lno/wmc/domain/model/usecase/AuthWithEmailAndPasswordUseCase;Lno/wmc/domain/model/usecase/RegisterWithEmailAndPasswordUseCase;Lno/wmc/domain/model/usecase/GetProfileUseCase;Lno/wmc/domain/model/usecase/GetProfileFromFireStoreUseCase;Lno/wmc/data/local/manager/LocalDataManager;Lno/wmc/ui/login/LoginViewState;Lno/wmc/utils/AppDispatchers;)V", "getViewState", "()Lno/wmc/ui/login/LoginViewState;", "getGoogleAccount", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "handleAuthWithEmailAndPasswordViewEvent", "", "email", "", "password", "isRemember", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleAuthWithGoogleViewEvent", "intent", "Landroid/content/Intent;", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleViewEvent", "event", "Lno/wmc/ui/base/ViewEvent;", "(Lno/wmc/ui/base/ViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isLoggedIn", "wmc-3.1.40-b11_devDebug"})
public final class LoginViewModel extends no.wmc.ui.base.BaseViewModel<no.wmc.ui.login.LoginViewState> {
    private final no.wmc.domain.model.usecase.AuthWithFirebaseUseCase authWithFirebaseUseCase = null;
    private final no.wmc.domain.model.usecase.AuthWithEmailAndPasswordUseCase authWithEmailAndPasswordUseCase = null;
    private final no.wmc.domain.model.usecase.RegisterWithEmailAndPasswordUseCase registerWithEmailAndPasswordUseCase = null;
    private final no.wmc.domain.model.usecase.GetProfileUseCase getProfileUseCase = null;
    private final no.wmc.domain.model.usecase.GetProfileFromFireStoreUseCase getProfileFromFireStoreUseCase = null;
    private final no.wmc.data.local.manager.LocalDataManager localDataManager = null;
    @org.jetbrains.annotations.NotNull
    private final no.wmc.ui.login.LoginViewState viewState = null;
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.AuthWithFirebaseUseCase authWithFirebaseUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.AuthWithEmailAndPasswordUseCase authWithEmailAndPasswordUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.RegisterWithEmailAndPasswordUseCase registerWithEmailAndPasswordUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.GetProfileUseCase getProfileUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.GetProfileFromFireStoreUseCase getProfileFromFireStoreUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.data.local.manager.LocalDataManager localDataManager, @org.jetbrains.annotations.NotNull
    no.wmc.ui.login.LoginViewState viewState, @org.jetbrains.annotations.NotNull
    no.wmc.utils.AppDispatchers appDispatchers) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected no.wmc.ui.login.LoginViewState getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected java.lang.Object handleViewEvent(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewEvent event, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleAuthWithGoogleViewEvent(android.content.Intent intent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount getGoogleAccount() {
        return null;
    }
    
    private final java.lang.Object handleAuthWithEmailAndPasswordViewEvent(java.lang.String email, java.lang.String password, boolean isRemember, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void isLoggedIn(boolean isLoggedIn) {
    }
}