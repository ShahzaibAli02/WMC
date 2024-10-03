package no.wmc.domain.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\u0004H&J\u001c\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\rH&J\'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J!\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J)\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0015\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lno/wmc/domain/repo/AuthRepository;", "", "addSubscriptionInFireStore", "Lno/wmc/domain/DataState;", "", "subscription", "Lno/wmc/data/remote/model/firestore/SubscriptionFsModel;", "(Lno/wmc/data/remote/model/firestore/SubscriptionFsModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentToken", "refreshToken", "", "accessToken", "forceUpdate", "", "registerUser", "uid", "profileDto", "Lno/wmc/domain/model/Profile;", "(Ljava/lang/String;Lno/wmc/domain/model/Profile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerWithEmail", "Lno/wmc/data/remote/model/FirebaseCreateAccountResult;", "email", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetPassword", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInWithEmail", "Lno/wmc/data/remote/model/FirebaseAuthResult;", "isRemember", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInWithGoogle", "intent", "Landroid/content/Intent;", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateEmailInFireStore", "wmc-3.1.40-b11_devDebug"})
public abstract interface AuthRepository {
    
    public abstract void refreshToken(@org.jetbrains.annotations.Nullable
    java.lang.String accessToken, boolean forceUpdate);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.String getCurrentToken();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object signInWithEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, boolean isRemember, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.data.remote.model.FirebaseAuthResult> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object signInWithGoogle(@org.jetbrains.annotations.NotNull
    android.content.Intent intent, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object registerWithEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.data.remote.model.FirebaseCreateAccountResult> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object resetPassword(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object registerUser(@org.jetbrains.annotations.NotNull
    java.lang.String uid, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.Profile profileDto, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<java.lang.String>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object validateEmailInFireStore(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<java.lang.Boolean>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addSubscriptionInFireStore(@org.jetbrains.annotations.NotNull
    no.wmc.data.remote.model.firestore.SubscriptionFsModel subscription, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<java.lang.String>> continuation);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
    }
}