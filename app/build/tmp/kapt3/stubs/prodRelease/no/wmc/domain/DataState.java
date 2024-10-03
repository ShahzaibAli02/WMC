package no.wmc.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lno/wmc/domain/DataState;", "Data", "", "()V", "Error", "Success", "Lno/wmc/domain/DataState$Error;", "Lno/wmc/domain/DataState$Success;", "wmc-3.1.40-b11_prodRelease"})
public abstract class DataState<Data extends java.lang.Object> {
    
    private DataState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lno/wmc/domain/DataState$Success;", "Data", "Lno/wmc/domain/DataState;", "data", "message", "", "(Ljava/lang/Object;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "wmc-3.1.40-b11_prodRelease"})
    public static final class Success<Data extends java.lang.Object> extends no.wmc.domain.DataState<Data> {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\bR\u0015\u0010\u0007\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lno/wmc/domain/DataState$Error;", "Data", "Lno/wmc/domain/DataState;", "statusCode", "", "errorMessage", "", "data", "(ILjava/lang/String;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getErrorMessage", "()Ljava/lang/String;", "getStatusCode", "()I", "wmc-3.1.40-b11_prodRelease"})
    public static final class Error<Data extends java.lang.Object> extends no.wmc.domain.DataState<Data> {
        private final int statusCode = 0;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String errorMessage = null;
        @org.jetbrains.annotations.Nullable
        private final Data data = null;
        
        public Error() {
            super();
        }
        
        public Error(int statusCode, @org.jetbrains.annotations.Nullable
        java.lang.String errorMessage, @org.jetbrains.annotations.Nullable
        Data data) {
            super();
        }
        
        public final int getStatusCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getErrorMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final Data getData() {
            return null;
        }
    }
}