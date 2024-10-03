package no.wmc.data.local.manager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H&J\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u001e\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J!\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u001e\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0003H&J#\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H&J#\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J#\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lno/wmc/data/local/manager/SharedPrefManager;", "", "getBoolean", "", "key", "", "defaultValue", "getEncryptedString", "getEncryptedStringSync", "getLong", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getString", "getStringSync", "putBoolean", "", "value", "putEncryptedString", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putEncryptedStringSync", "putLong", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putString", "remove", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_prodRelease"})
public abstract interface SharedPrefManager {
    
    public abstract void putBoolean(@org.jetbrains.annotations.NotNull
    java.lang.String key, boolean value);
    
    public abstract boolean getBoolean(@org.jetbrains.annotations.NotNull
    java.lang.String key, boolean defaultValue);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getString(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String defaultValue);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object putString(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String value, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getLong(@org.jetbrains.annotations.NotNull
    java.lang.String key, long defaultValue, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object putLong(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.Long value, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object remove(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getEncryptedString(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String defaultValue);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object putEncryptedString(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String value, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    public abstract void putEncryptedStringSync(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String value);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getEncryptedStringSync(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String defaultValue);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getStringSync(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String defaultValue);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
    }
}