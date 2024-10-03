package no.wmc.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0019\u0010&\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J)\u0010(\u001a\u00020)2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u001bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u0019\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u001f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00112\u0006\u0010#\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00061"}, d2 = {"Lno/wmc/data/repo/AuthRepositoryImpl;", "Lno/wmc/data/repo/BaseRepository;", "Lno/wmc/domain/repo/AuthRepository;", "context", "Landroid/content/Context;", "firebaseAuthProvider", "Lno/wmc/data/remote/providers/FirebaseAuthProvider;", "fireStoreProvider", "Lno/wmc/data/remote/providers/FireStoreProvider;", "logoutHelper", "Lno/wmc/data/manager/LogoutHelper;", "networkStateManager", "Lno/wmc/data/manager/NetworkStateManager;", "localDataManager", "Lno/wmc/data/local/manager/LocalDataManager;", "(Landroid/content/Context;Lno/wmc/data/remote/providers/FirebaseAuthProvider;Lno/wmc/data/remote/providers/FireStoreProvider;Lno/wmc/data/manager/LogoutHelper;Lno/wmc/data/manager/NetworkStateManager;Lno/wmc/data/local/manager/LocalDataManager;)V", "addSubscriptionInFireStore", "Lno/wmc/domain/DataState;", "", "subscription", "Lno/wmc/data/remote/model/firestore/SubscriptionFsModel;", "(Lno/wmc/data/remote/model/firestore/SubscriptionFsModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentToken", "refreshToken", "", "accessToken", "forceUpdate", "", "registerUser", "uid", "profileDto", "Lno/wmc/domain/model/Profile;", "(Ljava/lang/String;Lno/wmc/domain/model/Profile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWithEmail", "Lno/wmc/data/remote/model/FirebaseCreateAccountResult;", "email", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetPassword", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInWithEmail", "Lno/wmc/data/remote/model/FirebaseAuthResult;", "isRemember", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInWithGoogle", "intent", "Landroid/content/Intent;", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateEmailInFireStore", "wmc-3.1.40-b11_prodRelease"})
public final class AuthRepositoryImpl extends no.wmc.data.repo.BaseRepository implements no.wmc.domain.repo.AuthRepository {
    private final android.content.Context context = null;
    private final no.wmc.data.remote.providers.FirebaseAuthProvider firebaseAuthProvider = null;
    private final no.wmc.data.remote.providers.FireStoreProvider fireStoreProvider = null;
    private final no.wmc.data.manager.LogoutHelper logoutHelper = null;
    
    public AuthRepositoryImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    no.wmc.data.remote.providers.FirebaseAuthProvider firebaseAuthProvider, @org.jetbrains.annotations.NotNull
    no.wmc.data.remote.providers.FireStoreProvider fireStoreProvider, @org.jetbrains.annotations.NotNull
    no.wmc.data.manager.LogoutHelper logoutHelper, @org.jetbrains.annotations.NotNull
    no.wmc.data.manager.NetworkStateManager networkStateManager, @org.jetbrains.annotations.NotNull
    no.wmc.data.local.manager.LocalDataManager localDataManager) {
        super(null, null);
    }
    
    @java.lang.Override
    public void refreshToken(@org.jetbrains.annotations.Nullable
    java.lang.String accessToken, boolean forceUpdate) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.String getCurrentToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object signInWithEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, boolean isRemember, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.data.remote.model.FirebaseAuthResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object signInWithGoogle(@org.jetbrains.annotations.NotNull
    android.content.Intent intent, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object registerWithEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.data.remote.model.FirebaseCreateAccountResult> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object resetPassword(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object registerUser(@org.jetbrains.annotations.NotNull
    java.lang.String uid, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.Profile profileDto, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<java.lang.String>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object validateEmailInFireStore(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<java.lang.Boolean>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object addSubscriptionInFireStore(@org.jetbrains.annotations.NotNull
    no.wmc.data.remote.model.firestore.SubscriptionFsModel subscription, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<java.lang.String>> continuation) {
        return null;
    }
}