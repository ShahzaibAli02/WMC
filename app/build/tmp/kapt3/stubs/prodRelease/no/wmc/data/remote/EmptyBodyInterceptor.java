package no.wmc.data.remote;

import java.lang.System;

/**
 * Intercept 204 and 205 code responses and change them to 200.
 *
 * This required because HTTP 204/205 response codes bypass Retrofit
 * converter and unconditionally sends null to adapter
 *
 * https://github.com/square/retrofit/issues/2867
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/data/remote/EmptyBodyInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "wmc-3.1.40-b11_prodRelease"})
public final class EmptyBodyInterceptor implements okhttp3.Interceptor {
    @org.jetbrains.annotations.NotNull
    public static final no.wmc.data.remote.EmptyBodyInterceptor INSTANCE = null;
    
    private EmptyBodyInterceptor() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull
    okhttp3.Interceptor.Chain chain) {
        return null;
    }
}