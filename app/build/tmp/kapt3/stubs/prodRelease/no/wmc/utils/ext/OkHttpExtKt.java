package no.wmc.utils.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000>\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005\u00a2\u0006\u0002\u0010\u0006\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u0003\u001a\n\u0010\t\u001a\u00020\n*\u00020\u0003\u001a9\u0010\u000b\u001a\u00020\f*\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0002\b\u00102\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00120\u000e\u001a\n\u0010\u0013\u001a\u00020\f*\u00020\f\u00a8\u0006\u0014"}, d2 = {"annotation", "T", "", "Lokhttp3/Request;", "annotationClass", "Ljava/lang/Class;", "(Lokhttp3/Request;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;", "getAccessTokenFromHeader", "", "isAuthRequired", "", "setAuth", "Lokhttp3/OkHttpClient$Builder;", "setAuthHeader", "Lkotlin/Function1;", "Lokhttp3/Request$Builder;", "Lkotlin/ExtensionFunctionType;", "refreshToken", "", "setEmptyResponseHandler", "wmc-3.1.40-b11_prodRelease"})
public final class OkHttpExtKt {
    
    public static final boolean isAuthRequired(@org.jetbrains.annotations.NotNull
    okhttp3.Request $this$isAuthRequired) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final <T extends java.lang.annotation.Annotation>T annotation(@org.jetbrains.annotations.NotNull
    okhttp3.Request $this$annotation, @org.jetbrains.annotations.NotNull
    java.lang.Class<T> annotationClass) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String getAccessTokenFromHeader(@org.jetbrains.annotations.NotNull
    okhttp3.Request $this$getAccessTokenFromHeader) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.OkHttpClient.Builder setEmptyResponseHandler(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient.Builder $this$setEmptyResponseHandler) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.OkHttpClient.Builder setAuth(@org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient.Builder $this$setAuth, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super okhttp3.Request.Builder, ? extends okhttp3.Request.Builder> setAuthHeader, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> refreshToken) {
        return null;
    }
}