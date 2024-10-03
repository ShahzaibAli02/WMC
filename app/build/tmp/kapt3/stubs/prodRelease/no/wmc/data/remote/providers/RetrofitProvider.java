package no.wmc.data.remote.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0012H\u0002J\u0014\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014*\u00020\u0014H\u0002J\u0014\u0010\u0016\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lno/wmc/data/remote/providers/RetrofitProvider;", "", "authRepo", "Lno/wmc/domain/repo/AuthRepository;", "apiUrl", "", "errorParser", "Lno/wmc/data/remote/ApiErrorParser;", "(Lno/wmc/domain/repo/AuthRepository;Ljava/lang/String;Lno/wmc/data/remote/ApiErrorParser;)V", "provide", "Lretrofit2/Retrofit;", "refreshToken", "", "unacceptedToken", "setAuthHeader", "Lokhttp3/Request$Builder;", "builder", "requestInterceptor", "Lokhttp3/OkHttpClient$Builder;", "setConverters", "Lretrofit2/Retrofit$Builder;", "kotlin.jvm.PlatformType", "setLogger", "logLevel", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "wmc-3.1.40-b11_prodRelease"})
public final class RetrofitProvider {
    private final no.wmc.domain.repo.AuthRepository authRepo = null;
    private final java.lang.String apiUrl = null;
    private final no.wmc.data.remote.ApiErrorParser errorParser = null;
    
    public RetrofitProvider(@org.jetbrains.annotations.NotNull
    no.wmc.domain.repo.AuthRepository authRepo, @org.jetbrains.annotations.NotNull
    java.lang.String apiUrl, @org.jetbrains.annotations.NotNull
    no.wmc.data.remote.ApiErrorParser errorParser) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit provide() {
        return null;
    }
    
    private final retrofit2.Retrofit.Builder setConverters(retrofit2.Retrofit.Builder $this$setConverters) {
        return null;
    }
    
    private final okhttp3.OkHttpClient.Builder setLogger(okhttp3.OkHttpClient.Builder $this$setLogger, okhttp3.logging.HttpLoggingInterceptor.Level logLevel) {
        return null;
    }
    
    private final okhttp3.Request.Builder setAuthHeader(okhttp3.Request.Builder builder) {
        return null;
    }
    
    private final void refreshToken(java.lang.String unacceptedToken) {
    }
    
    private final okhttp3.OkHttpClient.Builder requestInterceptor(okhttp3.OkHttpClient.Builder $this$requestInterceptor) {
        return null;
    }
}