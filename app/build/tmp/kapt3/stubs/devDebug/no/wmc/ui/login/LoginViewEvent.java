package no.wmc.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/ui/login/LoginViewEvent;", "Lno/wmc/ui/base/ViewEvent;", "()V", "AuthWithEmailAndPasswordViewEvent", "AuthWithGoogleViewEvent", "Lno/wmc/ui/login/LoginViewEvent$AuthWithEmailAndPasswordViewEvent;", "Lno/wmc/ui/login/LoginViewEvent$AuthWithGoogleViewEvent;", "wmc-3.1.40-b11_devDebug"})
public abstract class LoginViewEvent extends no.wmc.ui.base.ViewEvent {
    
    private LoginViewEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/ui/login/LoginViewEvent$AuthWithGoogleViewEvent;", "Lno/wmc/ui/login/LoginViewEvent;", "intent", "Landroid/content/Intent;", "(Landroid/content/Intent;)V", "getIntent", "()Landroid/content/Intent;", "wmc-3.1.40-b11_devDebug"})
    public static final class AuthWithGoogleViewEvent extends no.wmc.ui.login.LoginViewEvent {
        @org.jetbrains.annotations.NotNull
        private final android.content.Intent intent = null;
        
        public AuthWithGoogleViewEvent(@org.jetbrains.annotations.NotNull
        android.content.Intent intent) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Intent getIntent() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lno/wmc/ui/login/LoginViewEvent$AuthWithEmailAndPasswordViewEvent;", "Lno/wmc/ui/login/LoginViewEvent;", "email", "", "password", "isRemember", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getEmail", "()Ljava/lang/String;", "()Z", "setRemember", "(Z)V", "getPassword", "wmc-3.1.40-b11_devDebug"})
    public static final class AuthWithEmailAndPasswordViewEvent extends no.wmc.ui.login.LoginViewEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String email = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String password = null;
        private boolean isRemember;
        
        public AuthWithEmailAndPasswordViewEvent(@org.jetbrains.annotations.NotNull
        java.lang.String email, @org.jetbrains.annotations.NotNull
        java.lang.String password, boolean isRemember) {
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
        
        public final boolean isRemember() {
            return false;
        }
        
        public final void setRemember(boolean p0) {
        }
    }
}