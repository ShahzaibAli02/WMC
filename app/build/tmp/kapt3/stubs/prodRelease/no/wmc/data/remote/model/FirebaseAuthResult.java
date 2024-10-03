package no.wmc.data.remote.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"}, d2 = {"Lno/wmc/data/remote/model/FirebaseAuthResult;", "", "()V", "AppNotAuthorizedError", "CodeSentResult", "FirebaseApiNotAvailableError", "SignInSuccessResult", "TooManyRequestsError", "UnknownAuthError", "UserNotFoundError", "WrongPasswordError", "Lno/wmc/data/remote/model/FirebaseAuthResult$AppNotAuthorizedError;", "Lno/wmc/data/remote/model/FirebaseAuthResult$CodeSentResult;", "Lno/wmc/data/remote/model/FirebaseAuthResult$FirebaseApiNotAvailableError;", "Lno/wmc/data/remote/model/FirebaseAuthResult$SignInSuccessResult;", "Lno/wmc/data/remote/model/FirebaseAuthResult$TooManyRequestsError;", "Lno/wmc/data/remote/model/FirebaseAuthResult$UnknownAuthError;", "Lno/wmc/data/remote/model/FirebaseAuthResult$UserNotFoundError;", "Lno/wmc/data/remote/model/FirebaseAuthResult$WrongPasswordError;", "wmc-3.1.40-b11_prodRelease"})
public abstract class FirebaseAuthResult {
    
    private FirebaseAuthResult() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lno/wmc/data/remote/model/FirebaseAuthResult$CodeSentResult;", "Lno/wmc/data/remote/model/FirebaseAuthResult;", "()V", "wmc-3.1.40-b11_prodRelease"})
    public static final class CodeSentResult extends no.wmc.data.remote.model.FirebaseAuthResult {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.remote.model.FirebaseAuthResult.CodeSentResult INSTANCE = null;
        
        private CodeSentResult() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lno/wmc/data/remote/model/FirebaseAuthResult$SignInSuccessResult;", "Lno/wmc/data/remote/model/FirebaseAuthResult;", "()V", "wmc-3.1.40-b11_prodRelease"})
    public static final class SignInSuccessResult extends no.wmc.data.remote.model.FirebaseAuthResult {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.remote.model.FirebaseAuthResult.SignInSuccessResult INSTANCE = null;
        
        private SignInSuccessResult() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/data/remote/model/FirebaseAuthResult$WrongPasswordError;", "Lno/wmc/data/remote/model/FirebaseAuthResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "wmc-3.1.40-b11_prodRelease"})
    public static final class WrongPasswordError extends no.wmc.data.remote.model.FirebaseAuthResult {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String message = null;
        
        public WrongPasswordError(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/data/remote/model/FirebaseAuthResult$UserNotFoundError;", "Lno/wmc/data/remote/model/FirebaseAuthResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "wmc-3.1.40-b11_prodRelease"})
    public static final class UserNotFoundError extends no.wmc.data.remote.model.FirebaseAuthResult {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String message = null;
        
        public UserNotFoundError(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/data/remote/model/FirebaseAuthResult$TooManyRequestsError;", "Lno/wmc/data/remote/model/FirebaseAuthResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "wmc-3.1.40-b11_prodRelease"})
    public static final class TooManyRequestsError extends no.wmc.data.remote.model.FirebaseAuthResult {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String message = null;
        
        public TooManyRequestsError(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/data/remote/model/FirebaseAuthResult$FirebaseApiNotAvailableError;", "Lno/wmc/data/remote/model/FirebaseAuthResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "wmc-3.1.40-b11_prodRelease"})
    public static final class FirebaseApiNotAvailableError extends no.wmc.data.remote.model.FirebaseAuthResult {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String message = null;
        
        public FirebaseApiNotAvailableError(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/data/remote/model/FirebaseAuthResult$AppNotAuthorizedError;", "Lno/wmc/data/remote/model/FirebaseAuthResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "wmc-3.1.40-b11_prodRelease"})
    public static final class AppNotAuthorizedError extends no.wmc.data.remote.model.FirebaseAuthResult {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String message = null;
        
        public AppNotAuthorizedError(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/data/remote/model/FirebaseAuthResult$UnknownAuthError;", "Lno/wmc/data/remote/model/FirebaseAuthResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "wmc-3.1.40-b11_prodRelease"})
    public static final class UnknownAuthError extends no.wmc.data.remote.model.FirebaseAuthResult {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String message = null;
        
        public UnknownAuthError(@org.jetbrains.annotations.NotNull
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getMessage() {
            return null;
        }
    }
}