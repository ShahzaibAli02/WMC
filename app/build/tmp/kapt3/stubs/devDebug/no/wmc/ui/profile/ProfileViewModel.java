package no.wmc.ui.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0011\u0010\u000f\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0018H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0002X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lno/wmc/ui/profile/ProfileViewModel;", "Lno/wmc/ui/base/BaseViewModel;", "Lno/wmc/ui/profile/ProfileViewState;", "getProfileUseCase", "Lno/wmc/domain/model/usecase/GetProfileUseCase;", "updateProfileUseCase", "Lno/wmc/domain/model/usecase/UpdateProfileUseCase;", "viewState", "localDataManager", "Lno/wmc/data/local/manager/LocalDataManager;", "appDispatchers", "Lno/wmc/utils/AppDispatchers;", "(Lno/wmc/domain/model/usecase/GetProfileUseCase;Lno/wmc/domain/model/usecase/UpdateProfileUseCase;Lno/wmc/ui/profile/ProfileViewState;Lno/wmc/data/local/manager/LocalDataManager;Lno/wmc/utils/AppDispatchers;)V", "getViewState", "()Lno/wmc/ui/profile/ProfileViewState;", "handleGetProfileEvent", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleUpdateProfileEvent", "profileUpdate", "Lno/wmc/domain/model/ProfileUpdate;", "(Lno/wmc/domain/model/ProfileUpdate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleViewEvent", "event", "Lno/wmc/ui/base/ViewEvent;", "(Lno/wmc/ui/base/ViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_devDebug"})
public final class ProfileViewModel extends no.wmc.ui.base.BaseViewModel<no.wmc.ui.profile.ProfileViewState> {
    private final no.wmc.domain.model.usecase.GetProfileUseCase getProfileUseCase = null;
    private final no.wmc.domain.model.usecase.UpdateProfileUseCase updateProfileUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final no.wmc.ui.profile.ProfileViewState viewState = null;
    private final no.wmc.data.local.manager.LocalDataManager localDataManager = null;
    
    public ProfileViewModel(@org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.GetProfileUseCase getProfileUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.UpdateProfileUseCase updateProfileUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.ui.profile.ProfileViewState viewState, @org.jetbrains.annotations.NotNull
    no.wmc.data.local.manager.LocalDataManager localDataManager, @org.jetbrains.annotations.NotNull
    no.wmc.utils.AppDispatchers appDispatchers) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected no.wmc.ui.profile.ProfileViewState getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected java.lang.Object handleViewEvent(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewEvent event, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleGetProfileEvent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleUpdateProfileEvent(no.wmc.domain.model.ProfileUpdate profileUpdate, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}