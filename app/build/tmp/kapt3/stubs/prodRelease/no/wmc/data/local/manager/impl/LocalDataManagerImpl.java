package no.wmc.data.local.manager.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0013\u0010\t\u001a\u0004\u0018\u00010\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\n\u0010\f\u001a\u0004\u0018\u00010\nH\u0016J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u001c\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0016J\u0011\u0010\u0018\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0016J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0018\u0010!\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0011H\u0016J#\u0010#\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u001a\u0010%\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\nH\u0016J#\u0010&\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J#\u0010(\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0019\u0010)\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u001b\u0010+\u001a\u00020\u001f2\b\u0010,\u001a\u0004\u0018\u00010\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0012\u0010-\u001a\u00020\u001f2\b\u0010,\u001a\u0004\u0018\u00010\nH\u0016J\u001f\u0010.\u001a\u00020\u001f2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00100J\u001b\u00101\u001a\u00020\u001f2\b\u00102\u001a\u0004\u0018\u00010\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00064"}, d2 = {"Lno/wmc/data/local/manager/impl/LocalDataManagerImpl;", "Lno/wmc/data/local/manager/LocalDataManager;", "sessionManager", "Lno/wmc/data/local/manager/SessionManager;", "databaseManager", "Lno/wmc/data/local/manager/DatabaseManager;", "sharedPrefManager", "Lno/wmc/data/local/manager/SharedPrefManager;", "(Lno/wmc/data/local/manager/SessionManager;Lno/wmc/data/local/manager/DatabaseManager;Lno/wmc/data/local/manager/SharedPrefManager;)V", "getAccessToken", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccessTokenSync", "getAllergies", "", "Lno/wmc/data/local/db/entity/AllergyEntity;", "getBoolean", "", "key", "defaultValue", "getCredentials", "Lno/wmc/domain/model/Credential;", "getEncryptedString", "getEncryptedStringSync", "getIsLoggedIn", "getLong", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getString", "getStringSync", "isLoggedIn", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putBoolean", "value", "putEncryptedString", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putEncryptedStringSync", "putLong", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putString", "remove", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAccessToken", "token", "saveAccessTokenSync", "saveAllergies", "allergies", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCredentials", "credential", "(Lno/wmc/domain/model/Credential;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_prodRelease"})
public final class LocalDataManagerImpl implements no.wmc.data.local.manager.LocalDataManager {
    private final no.wmc.data.local.manager.SessionManager sessionManager = null;
    private final no.wmc.data.local.manager.DatabaseManager databaseManager = null;
    private final no.wmc.data.local.manager.SharedPrefManager sharedPrefManager = null;
    
    public LocalDataManagerImpl(@org.jetbrains.annotations.NotNull
    no.wmc.data.local.manager.SessionManager sessionManager, @org.jetbrains.annotations.NotNull
    no.wmc.data.local.manager.DatabaseManager databaseManager, @org.jetbrains.annotations.NotNull
    no.wmc.data.local.manager.SharedPrefManager sharedPrefManager) {
        super();
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
    
    @java.lang.Override
    public void putEncryptedStringSync(@org.jetbrains.annotations.NotNull
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String value) {
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
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAllergies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<no.wmc.data.local.db.entity.AllergyEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object saveAllergies(@org.jetbrains.annotations.NotNull
    java.util.List<no.wmc.data.local.db.entity.AllergyEntity> allergies, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object isLoggedIn(boolean isLoggedIn, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getIsLoggedIn(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object saveAccessToken(@org.jetbrains.annotations.Nullable
    java.lang.String token, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAccessToken(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getAccessTokenSync() {
        return null;
    }
    
    @java.lang.Override
    public void saveAccessTokenSync(@org.jetbrains.annotations.Nullable
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object saveCredentials(@org.jetbrains.annotations.Nullable
    no.wmc.domain.model.Credential credential, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public no.wmc.domain.model.Credential getCredentials() {
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
}