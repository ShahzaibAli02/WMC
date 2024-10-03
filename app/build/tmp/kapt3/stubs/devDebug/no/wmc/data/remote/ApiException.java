package no.wmc.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lno/wmc/data/remote/ApiException;", "Ljava/io/IOException;", "error", "Lno/wmc/data/remote/ApiErrorBody;", "(Lno/wmc/data/remote/ApiErrorBody;)V", "getError", "()Lno/wmc/data/remote/ApiErrorBody;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "wmc-3.1.40-b11_devDebug"})
public final class ApiException extends java.io.IOException {
    @org.jetbrains.annotations.Nullable
    private final no.wmc.data.remote.ApiErrorBody error = null;
    
    @org.jetbrains.annotations.NotNull
    public final no.wmc.data.remote.ApiException copy(@org.jetbrains.annotations.Nullable
    no.wmc.data.remote.ApiErrorBody error) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public ApiException(@org.jetbrains.annotations.Nullable
    no.wmc.data.remote.ApiErrorBody error) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.data.remote.ApiErrorBody component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.data.remote.ApiErrorBody getError() {
        return null;
    }
}