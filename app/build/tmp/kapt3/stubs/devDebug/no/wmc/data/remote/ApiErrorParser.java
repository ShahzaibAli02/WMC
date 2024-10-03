package no.wmc.data.remote;

import java.lang.System;

/**
 * Provide a mechanism to customize error parsing based on Api Endpoint and Status Code based on ApiTags
 * In case an api endpoint provides with different response for different status code
 * @ApiResponseParser will use this parser to parse error responses
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH&\u00a8\u0006\u000b"}, d2 = {"Lno/wmc/data/remote/ApiErrorParser;", "", "getApiErrorResponse", "Lno/wmc/data/remote/ApiException;", "statusCode", "", "url", "", "method", "body", "Lokhttp3/ResponseBody;", "wmc-3.1.40-b11_devDebug"})
public abstract interface ApiErrorParser {
    
    @org.jetbrains.annotations.NotNull
    public abstract no.wmc.data.remote.ApiException getApiErrorResponse(int statusCode, @org.jetbrains.annotations.NotNull
    java.lang.String url, @org.jetbrains.annotations.NotNull
    java.lang.String method, @org.jetbrains.annotations.Nullable
    okhttp3.ResponseBody body);
    
    /**
     * Provide a mechanism to customize error parsing based on Api Endpoint and Status Code based on ApiTags
     * In case an api endpoint provides with different response for different status code
     * @ApiResponseParser will use this parser to parse error responses
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
    }
}