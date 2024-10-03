package no.wmc.domain.model.usecase.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lno/wmc/domain/model/usecase/impl/GetProfileFromFireStoreUseCaseImpl;", "Lno/wmc/domain/model/usecase/impl/BaseUseCase;", "Lno/wmc/domain/model/usecase/GetProfileFromFireStoreUseCase;", "profileRepo", "Lno/wmc/domain/repo/ProfileRepository;", "(Lno/wmc/domain/repo/ProfileRepository;)V", "invoke", "Lno/wmc/domain/DataState;", "Lno/wmc/domain/model/Profile;", "uId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_devDebug"})
public final class GetProfileFromFireStoreUseCaseImpl extends no.wmc.domain.model.usecase.impl.BaseUseCase implements no.wmc.domain.model.usecase.GetProfileFromFireStoreUseCase {
    private final no.wmc.domain.repo.ProfileRepository profileRepo = null;
    
    public GetProfileFromFireStoreUseCaseImpl(@org.jetbrains.annotations.NotNull
    no.wmc.domain.repo.ProfileRepository profileRepo) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    java.lang.String uId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<no.wmc.domain.model.Profile>> continuation) {
        return null;
    }
}