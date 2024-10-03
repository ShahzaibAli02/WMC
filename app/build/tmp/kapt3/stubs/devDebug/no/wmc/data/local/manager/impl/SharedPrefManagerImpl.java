package no.wmc.data.local.manager.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 42\u00020\u0001:\u00014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016J\u001c\u0010 \u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0014\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u001c\u0010!\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0014\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J!\u0010\"\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020#H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\b\u0010%\u001a\u00020&H\u0003J\u001c\u0010\'\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0014\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u001c\u0010(\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0014\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u0018\u0010)\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u001dH\u0016J#\u0010,\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u001a\u0010.\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010\u001eH\u0016J#\u0010/\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010#H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J#\u00101\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\u001e2\b\u0010+\u001a\u0004\u0018\u00010\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u0019\u00102\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR#\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0019\u001a\n \u0007*\u0004\u0018\u00010\u00100\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001a\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00065"}, d2 = {"Lno/wmc/data/local/manager/impl/SharedPrefManagerImpl;", "Lno/wmc/data/local/manager/SharedPrefManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "editor", "Landroid/content/SharedPreferences$Editor;", "kotlin.jvm.PlatformType", "getEditor", "()Landroid/content/SharedPreferences$Editor;", "editor$delegate", "Lkotlin/Lazy;", "encryptedEditor", "getEncryptedEditor", "encryptedEditor$delegate", "encryptedPreferences", "Landroid/content/SharedPreferences;", "getEncryptedPreferences", "()Landroid/content/SharedPreferences;", "encryptedPreferences$delegate", "key", "Landroidx/security/crypto/MasterKey;", "getKey", "()Landroidx/security/crypto/MasterKey;", "key$delegate", "sharedPreferences", "getSharedPreferences", "sharedPreferences$delegate", "getBoolean", "", "", "defaultValue", "getEncryptedString", "getEncryptedStringSync", "getLong", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSpec", "Landroid/security/keystore/KeyGenParameterSpec;", "getString", "getStringSync", "putBoolean", "", "value", "putEncryptedString", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putEncryptedStringSync", "putLong", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putString", "remove", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "wmc-3.1.40-b11_devDebug"})
public final class SharedPrefManagerImpl implements no.wmc.data.local.manager.SharedPrefManager {
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    public static final no.wmc.data.local.manager.impl.SharedPrefManagerImpl.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String SHARED_PREF_NAME = "WMC_SHARED_PREFS";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ENCRYPTED_SHARED_PREF_NAME = "WMC_SHARED_PREFS_ENC";
    private final kotlin.Lazy key$delegate = null;
    private final kotlin.Lazy encryptedPreferences$delegate = null;
    private final kotlin.Lazy sharedPreferences$delegate = null;
    private final kotlin.Lazy encryptedEditor$delegate = null;
    private final kotlin.Lazy editor$delegate = null;
    
    public SharedPrefManagerImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    private final androidx.security.crypto.MasterKey getKey() {
        return null;
    }
    
    private final android.content.SharedPreferences getEncryptedPreferences() {
        return null;
    }
    
    private final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    private final android.content.SharedPreferences.Editor getEncryptedEditor() {
        return null;
    }
    
    private final android.content.SharedPreferences.Editor getEditor() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    private final android.security.keystore.KeyGenParameterSpec getSpec() {
        return null;
    }
    
    @java.lang.Override
    public void putBoolean(@org.jetbrains.annotations.NotNull
    java.lang.String key, boolean value) {
    }
    
    @java.lang.Override
    public boolean getBoolean(@org.jetbrains.annotations.NotNull
    java.lang.String key, boolean defaultValue) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getString(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String defaultValue) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object putString(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String value, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getLong(@org.jetbrains.annotations.NotNull
    java.lang.String key, long defaultValue, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object putLong(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.Long value, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object remove(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getEncryptedString(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String defaultValue) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object putEncryptedString(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String value, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getEncryptedStringSync(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String defaultValue) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getStringSync(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String defaultValue) {
        return null;
    }
    
    @java.lang.Override
    public void putEncryptedStringSync(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/local/manager/impl/SharedPrefManagerImpl$Companion;", "", "()V", "ENCRYPTED_SHARED_PREF_NAME", "", "SHARED_PREF_NAME", "wmc-3.1.40-b11_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}