package no.wmc.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lno/wmc/data/repo/ProfileRepositoryImpl;", "Lno/wmc/data/repo/BaseRepository;", "Lno/wmc/domain/repo/ProfileRepository;", "profileApiService", "Lno/wmc/data/remote/service/ProfileApiService;", "fireStoreProvider", "Lno/wmc/data/remote/providers/FireStoreProvider;", "authRepository", "Lno/wmc/domain/repo/AuthRepository;", "localDataManager", "Lno/wmc/data/local/manager/LocalDataManager;", "networkStateManager", "Lno/wmc/data/manager/NetworkStateManager;", "(Lno/wmc/data/remote/service/ProfileApiService;Lno/wmc/data/remote/providers/FireStoreProvider;Lno/wmc/domain/repo/AuthRepository;Lno/wmc/data/local/manager/LocalDataManager;Lno/wmc/data/manager/NetworkStateManager;)V", "getProfile", "Lno/wmc/domain/DataState;", "Lno/wmc/data/remote/model/ProfileDtoModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProfileFromFireStore", "Lno/wmc/domain/model/Profile;", "uId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "orderCard", "", "updateProfile", "Lno/wmc/domain/model/ProfileUpdate;", "(Ljava/lang/String;Lno/wmc/domain/model/ProfileUpdate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_devDebug"})
public final class ProfileRepositoryImpl extends no.wmc.data.repo.BaseRepository implements no.wmc.domain.repo.ProfileRepository {
    private final no.wmc.data.remote.service.ProfileApiService profileApiService = null;
    private final no.wmc.data.remote.providers.FireStoreProvider fireStoreProvider = null;
    private final no.wmc.domain.repo.AuthRepository authRepository = null;
    
    public ProfileRepositoryImpl(@org.jetbrains.annotations.NotNull
    no.wmc.data.remote.service.ProfileApiService profileApiService, @org.jetbrains.annotations.NotNull
    no.wmc.data.remote.providers.FireStoreProvider fireStoreProvider, @org.jetbrains.annotations.NotNull
    no.wmc.domain.repo.AuthRepository authRepository, @org.jetbrains.annotations.NotNull
    no.wmc.data.local.manager.LocalDataManager localDataManager, @org.jetbrains.annotations.NotNull
    no.wmc.data.manager.NetworkStateManager networkStateManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getProfile(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<no.wmc.data.remote.model.ProfileDtoModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getProfileFromFireStore(@org.jetbrains.annotations.NotNull
    java.lang.String uId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<no.wmc.domain.model.Profile>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object updateProfile(@org.jetbrains.annotations.NotNull
    java.lang.String uId, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.ProfileUpdate updateProfile, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<kotlin.Unit>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object orderCard(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<kotlin.Unit>> continuation) {
        return null;
    }
}