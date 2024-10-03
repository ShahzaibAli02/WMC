package no.wmc.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lno/wmc/data/repo/TranslateRepositoryImpl;", "Lno/wmc/data/repo/BaseRepository;", "Lno/wmc/domain/repo/TranslateRepository;", "translationApiService", "Lno/wmc/data/remote/service/TranslationApiService;", "localDataManager", "Lno/wmc/data/local/manager/LocalDataManager;", "networkStateManager", "Lno/wmc/data/manager/NetworkStateManager;", "(Lno/wmc/data/remote/service/TranslationApiService;Lno/wmc/data/local/manager/LocalDataManager;Lno/wmc/data/manager/NetworkStateManager;)V", "getList", "", "Lno/wmc/data/remote/model/TranslationDtoModel;", "getTranslateLanguages", "Lno/wmc/domain/DataState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_prodRelease"})
public final class TranslateRepositoryImpl extends no.wmc.data.repo.BaseRepository implements no.wmc.domain.repo.TranslateRepository {
    private final no.wmc.data.remote.service.TranslationApiService translationApiService = null;
    
    public TranslateRepositoryImpl(@org.jetbrains.annotations.NotNull
    no.wmc.data.remote.service.TranslationApiService translationApiService, @org.jetbrains.annotations.NotNull
    no.wmc.data.local.manager.LocalDataManager localDataManager, @org.jetbrains.annotations.NotNull
    no.wmc.data.manager.NetworkStateManager networkStateManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getTranslateLanguages(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<java.util.List<no.wmc.data.remote.model.TranslationDtoModel>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<no.wmc.data.remote.model.TranslationDtoModel> getList() {
        return null;
    }
}