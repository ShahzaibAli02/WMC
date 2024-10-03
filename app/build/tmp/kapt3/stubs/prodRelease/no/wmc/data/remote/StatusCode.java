package no.wmc.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lno/wmc/data/remote/StatusCode;", "", "()V", "BAD_REQUEST", "", "CACHE_NOT_FOUND", "EMPTY_RESPONSE", "INTERNAL_ERROR", "NO_INTERNET_ERROR", "RESET_CONTENT", "RESOURCE_NOT_FOUND", "SERVER_ERROR", "SUCCESS", "TIMEOUT_ERROR", "UNAUTHORIZED_ACCESS", "wmc-3.1.40-b11_prodRelease"})
public final class StatusCode {
    @org.jetbrains.annotations.NotNull
    public static final no.wmc.data.remote.StatusCode INSTANCE = null;
    public static final int NO_INTERNET_ERROR = 104;
    public static final int INTERNAL_ERROR = 105;
    public static final int TIMEOUT_ERROR = 106;
    public static final int SUCCESS = 200;
    public static final int EMPTY_RESPONSE = 204;
    public static final int RESET_CONTENT = 205;
    public static final int BAD_REQUEST = 400;
    public static final int UNAUTHORIZED_ACCESS = 401;
    public static final int RESOURCE_NOT_FOUND = 404;
    public static final int SERVER_ERROR = 500;
    public static final int CACHE_NOT_FOUND = 504;
    
    private StatusCode() {
        super();
    }
}