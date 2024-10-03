package no.wmc.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/login/LoginViewAction;", "Lno/wmc/ui/base/ViewAction;", "()V", "AuthWithEmailAndPasswordAction", "AuthWithGoogleViewAction", "GetProfileAction", "Lno/wmc/ui/login/LoginViewAction$AuthWithEmailAndPasswordAction;", "Lno/wmc/ui/login/LoginViewAction$AuthWithGoogleViewAction;", "Lno/wmc/ui/login/LoginViewAction$GetProfileAction;", "wmc-3.1.40-b11_devDebug"})
public abstract class LoginViewAction extends no.wmc.ui.base.ViewAction {
    
    private LoginViewAction() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lno/wmc/ui/login/LoginViewAction$AuthWithGoogleViewAction;", "Lno/wmc/ui/login/LoginViewAction;", "viewState", "Lno/wmc/ui/base/ViewState;", "", "(Lno/wmc/ui/base/ViewState;)V", "getViewState", "()Lno/wmc/ui/base/ViewState;", "wmc-3.1.40-b11_devDebug"})
    public static final class AuthWithGoogleViewAction extends no.wmc.ui.login.LoginViewAction {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.ui.base.ViewState<kotlin.Unit> viewState = null;
        
        public AuthWithGoogleViewAction(@org.jetbrains.annotations.NotNull
        no.wmc.ui.base.ViewState<kotlin.Unit> viewState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.ui.base.ViewState<kotlin.Unit> getViewState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lno/wmc/ui/login/LoginViewAction$AuthWithEmailAndPasswordAction;", "Lno/wmc/ui/login/LoginViewAction;", "viewState", "Lno/wmc/ui/base/ViewState;", "Lno/wmc/data/remote/model/FirebaseAuthResult;", "(Lno/wmc/ui/base/ViewState;)V", "getViewState", "()Lno/wmc/ui/base/ViewState;", "wmc-3.1.40-b11_devDebug"})
    public static final class AuthWithEmailAndPasswordAction extends no.wmc.ui.login.LoginViewAction {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.ui.base.ViewState<no.wmc.data.remote.model.FirebaseAuthResult> viewState = null;
        
        public AuthWithEmailAndPasswordAction(@org.jetbrains.annotations.NotNull
        no.wmc.ui.base.ViewState<no.wmc.data.remote.model.FirebaseAuthResult> viewState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.ui.base.ViewState<no.wmc.data.remote.model.FirebaseAuthResult> getViewState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lno/wmc/ui/login/LoginViewAction$GetProfileAction;", "Lno/wmc/ui/login/LoginViewAction;", "viewState", "Lno/wmc/ui/base/ViewState;", "Lno/wmc/domain/model/Profile;", "(Lno/wmc/ui/base/ViewState;)V", "getViewState", "()Lno/wmc/ui/base/ViewState;", "wmc-3.1.40-b11_devDebug"})
    public static final class GetProfileAction extends no.wmc.ui.login.LoginViewAction {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.ui.base.ViewState<no.wmc.domain.model.Profile> viewState = null;
        
        public GetProfileAction(@org.jetbrains.annotations.NotNull
        no.wmc.ui.base.ViewState<no.wmc.domain.model.Profile> viewState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.ui.base.ViewState<no.wmc.domain.model.Profile> getViewState() {
            return null;
        }
    }
}