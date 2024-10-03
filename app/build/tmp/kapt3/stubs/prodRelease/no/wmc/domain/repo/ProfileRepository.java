package no.wmc.domain.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lno/wmc/domain/repo/ProfileRepository;", "", "getProfile", "Lno/wmc/domain/DataState;", "Lno/wmc/data/remote/model/ProfileDtoModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProfileFromFireStore", "Lno/wmc/domain/model/Profile;", "uId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "orderCard", "", "updateProfile", "Lno/wmc/domain/model/ProfileUpdate;", "(Ljava/lang/String;Lno/wmc/domain/model/ProfileUpdate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_prodRelease"})
public abstract interface ProfileRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getProfile(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<no.wmc.data.remote.model.ProfileDtoModel>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getProfileFromFireStore(@org.jetbrains.annotations.NotNull
    java.lang.String uId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<no.wmc.domain.model.Profile>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateProfile(@org.jetbrains.annotations.NotNull
    java.lang.String uId, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.ProfileUpdate updateProfile, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<kotlin.Unit>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object orderCard(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<kotlin.Unit>> continuation);
}