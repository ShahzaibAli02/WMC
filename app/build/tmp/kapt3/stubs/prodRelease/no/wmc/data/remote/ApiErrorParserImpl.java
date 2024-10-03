package no.wmc.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016\u00a8\u0006\f"}, d2 = {"Lno/wmc/data/remote/ApiErrorParserImpl;", "Lno/wmc/data/remote/ApiErrorParser;", "()V", "getApiErrorResponse", "Lno/wmc/data/remote/ApiException;", "statusCode", "", "url", "", "method", "body", "Lokhttp3/ResponseBody;", "wmc-3.1.40-b11_prodRelease"})
public final class ApiErrorParserImpl implements no.wmc.data.remote.ApiErrorParser {
    
    public ApiErrorParserImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public no.wmc.data.remote.ApiException getApiErrorResponse(int statusCode, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.lang.String method, @org.jetbrains.annotations.Nullable
    okhttp3.ResponseBody body) {
        return null;
    }
}