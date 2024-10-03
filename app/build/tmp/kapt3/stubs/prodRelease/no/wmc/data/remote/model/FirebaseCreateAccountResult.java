package no.wmc.data.remote.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lno/wmc/data/remote/model/FirebaseCreateAccountResult;", "", "()V", "AccountCreatedSuccessfully", "AccountExist", "UnknownCreateAccountError", "WeakPassword", "Lno/wmc/data/remote/model/FirebaseCreateAccountResult$AccountCreatedSuccessfully;", "Lno/wmc/data/remote/model/FirebaseCreateAccountResult$AccountExist;", "Lno/wmc/data/remote/model/FirebaseCreateAccountResult$UnknownCreateAccountError;", "Lno/wmc/data/remote/model/FirebaseCreateAccountResult$WeakPassword;", "wmc-3.1.40-b11_prodRelease"})
public abstract class FirebaseCreateAccountResult {
    
    private FirebaseCreateAccountResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lno/wmc/data/remote/model/FirebaseCreateAccountResult$AccountCreatedSuccessfully;", "Lno/wmc/data/remote/model/FirebaseCreateAccountResult;", "()V", "wmc-3.1.40-b11_prodRelease"})
    public static final class AccountCreatedSuccessfully extends no.wmc.data.remote.model.FirebaseCreateAccountResult {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.remote.model.FirebaseCreateAccountResult.AccountCreatedSuccessfully INSTANCE = null;
        
        private AccountCreatedSuccessfully() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/data/remote/model/FirebaseCreateAccountResult$AccountExist;", "Lno/wmc/data/remote/model/FirebaseCreateAccountResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "wmc-3.1.40-b11_prodRelease"})
    public static final class AccountExist extends no.wmc.data.remote.model.FirebaseCreateAccountResult {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String message = null;
        
        public AccountExist(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/data/remote/model/FirebaseCreateAccountResult$WeakPassword;", "Lno/wmc/data/remote/model/FirebaseCreateAccountResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "wmc-3.1.40-b11_prodRelease"})
    public static final class WeakPassword extends no.wmc.data.remote.model.FirebaseCreateAccountResult {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String message = null;
        
        public WeakPassword(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/data/remote/model/FirebaseCreateAccountResult$UnknownCreateAccountError;", "Lno/wmc/data/remote/model/FirebaseCreateAccountResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "wmc-3.1.40-b11_prodRelease"})
    public static final class UnknownCreateAccountError extends no.wmc.data.remote.model.FirebaseCreateAccountResult {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String message = null;
        
        public UnknownCreateAccountError(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMessage() {
            return null;
        }
    }
}