package no.wmc.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lno/wmc/ui/base/ViewState;", "Data", "", "()V", "Loading", "StateError", "Success", "Lno/wmc/ui/base/ViewState$Loading;", "Lno/wmc/ui/base/ViewState$StateError;", "Lno/wmc/ui/base/ViewState$Success;", "wmc-3.1.40-b11_devDebug"})
public abstract class ViewState<Data extends java.lang.Object> {
    
    private ViewState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0004R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lno/wmc/ui/base/ViewState$Loading;", "Data", "Lno/wmc/ui/base/ViewState;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "wmc-3.1.40-b11_devDebug"})
    public static final class Loading<Data extends java.lang.Object> extends no.wmc.ui.base.ViewState<Data> {
        @org.jetbrains.annotations.Nullable
        private final Data data = null;
        
        public Loading() {
            super();
        }
        
        public Loading(@org.jetbrains.annotations.Nullable
        Data data) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final Data getData() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lno/wmc/ui/base/ViewState$Success;", "Data", "Lno/wmc/ui/base/ViewState;", "data", "message", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "wmc-3.1.40-b11_devDebug"})
    public static final class Success<Data extends java.lang.Object> extends no.wmc.ui.base.ViewState<Data> {
        @org.jetbrains.annotations.Nullable
        private final Data data = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String message = null;
        
        public Success() {
            super();
        }
        
        public Success(@org.jetbrains.annotations.Nullable
        Data data, @org.jetbrains.annotations.Nullable
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final Data getData() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bR\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lno/wmc/ui/base/ViewState$StateError;", "Data", "Lno/wmc/ui/base/ViewState;", "data", "errorMessage", "", "errorCode", "", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Integer;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorMessage", "()Ljava/lang/String;", "wmc-3.1.40-b11_devDebug"})
    public static final class StateError<Data extends java.lang.Object> extends no.wmc.ui.base.ViewState<Data> {
        @org.jetbrains.annotations.Nullable
        private final Data data = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String errorMessage = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer errorCode = null;
        
        public StateError() {
            super();
        }
        
        public StateError(@org.jetbrains.annotations.Nullable
        Data data, @org.jetbrains.annotations.Nullable
        java.lang.String errorMessage, @org.jetbrains.annotations.Nullable
        java.lang.Integer errorCode) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final Data getData() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getErrorCode() {
            return null;
        }
    }
}