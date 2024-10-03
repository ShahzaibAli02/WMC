package no.wmc.ui.registration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/registration/RegisterViewEvent;", "Lno/wmc/ui/base/ViewEvent;", "()V", "AddUserToFireStoreEvent", "CreateUserInFireBaseAuth", "ValidateEmailEvent", "Lno/wmc/ui/registration/RegisterViewEvent$AddUserToFireStoreEvent;", "Lno/wmc/ui/registration/RegisterViewEvent$CreateUserInFireBaseAuth;", "Lno/wmc/ui/registration/RegisterViewEvent$ValidateEmailEvent;", "wmc-3.1.40-b11_prodRelease"})
public abstract class RegisterViewEvent extends no.wmc.ui.base.ViewEvent {
    
    private RegisterViewEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/ui/registration/RegisterViewEvent$AddUserToFireStoreEvent;", "Lno/wmc/ui/registration/RegisterViewEvent;", "profile", "Lno/wmc/domain/model/Profile;", "(Lno/wmc/domain/model/Profile;)V", "getProfile", "()Lno/wmc/domain/model/Profile;", "wmc-3.1.40-b11_prodRelease"})
    public static final class AddUserToFireStoreEvent extends no.wmc.ui.registration.RegisterViewEvent {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.domain.model.Profile profile = null;
        
        public AddUserToFireStoreEvent(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.Profile profile) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.domain.model.Profile getProfile() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/ui/registration/RegisterViewEvent$ValidateEmailEvent;", "Lno/wmc/ui/registration/RegisterViewEvent;", "email", "", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "wmc-3.1.40-b11_prodRelease"})
    public static final class ValidateEmailEvent extends no.wmc.ui.registration.RegisterViewEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String email = null;
        
        public ValidateEmailEvent(@org.jetbrains.annotations.NotNull
        java.lang.String email) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getEmail() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/registration/RegisterViewEvent$CreateUserInFireBaseAuth;", "Lno/wmc/ui/registration/RegisterViewEvent;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPassword", "wmc-3.1.40-b11_prodRelease"})
    public static final class CreateUserInFireBaseAuth extends no.wmc.ui.registration.RegisterViewEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String email = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String password = null;
        
        public CreateUserInFireBaseAuth(@org.jetbrains.annotations.NotNull
        java.lang.String email, @org.jetbrains.annotations.NotNull
        java.lang.String password) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getEmail() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getPassword() {
            return null;
        }
    }
}