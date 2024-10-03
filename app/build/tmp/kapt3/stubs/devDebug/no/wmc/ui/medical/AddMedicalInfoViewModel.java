package no.wmc.ui.medical;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ!\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J!\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001cH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0002X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lno/wmc/ui/medical/AddMedicalInfoViewModel;", "Lno/wmc/ui/base/BaseViewModel;", "Lno/wmc/ui/medical/AddMedicalInfoViewState;", "getMedicalItemUseCase", "Lno/wmc/domain/model/usecase/GetMedicalItemUseCase;", "addMedicalItemUseCase", "Lno/wmc/domain/model/usecase/AddMedicalItemUseCase;", "viewState", "appDispatchers", "Lno/wmc/utils/AppDispatchers;", "(Lno/wmc/domain/model/usecase/GetMedicalItemUseCase;Lno/wmc/domain/model/usecase/AddMedicalItemUseCase;Lno/wmc/ui/medical/AddMedicalInfoViewState;Lno/wmc/utils/AppDispatchers;)V", "getViewState", "()Lno/wmc/ui/medical/AddMedicalInfoViewState;", "handleAddMedicalItemEvent", "", "profileItemEnum", "Lno/wmc/domain/enums/ProfileItemEnum;", "profileItem", "Lno/wmc/domain/model/ProfileItem$Item;", "(Lno/wmc/domain/enums/ProfileItemEnum;Lno/wmc/domain/model/ProfileItem$Item;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleKeywordChange", "keyword", "", "(Lno/wmc/domain/enums/ProfileItemEnum;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleLoadMoreMedicalItemEvent", "(Lno/wmc/domain/enums/ProfileItemEnum;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleViewEvent", "event", "Lno/wmc/ui/base/ViewEvent;", "(Lno/wmc/ui/base/ViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_devDebug"})
public final class AddMedicalInfoViewModel extends no.wmc.ui.base.BaseViewModel<no.wmc.ui.medical.AddMedicalInfoViewState> {
    private final no.wmc.domain.model.usecase.GetMedicalItemUseCase getMedicalItemUseCase = null;
    private final no.wmc.domain.model.usecase.AddMedicalItemUseCase addMedicalItemUseCase = null;
    @org.jetbrains.annotations.NotNull
    private final no.wmc.ui.medical.AddMedicalInfoViewState viewState = null;
    
    public AddMedicalInfoViewModel(@org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.GetMedicalItemUseCase getMedicalItemUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.AddMedicalItemUseCase addMedicalItemUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.ui.medical.AddMedicalInfoViewState viewState, @org.jetbrains.annotations.NotNull
    no.wmc.utils.AppDispatchers appDispatchers) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected no.wmc.ui.medical.AddMedicalInfoViewState getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected java.lang.Object handleViewEvent(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewEvent event, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleKeywordChange(no.wmc.domain.enums.ProfileItemEnum profileItemEnum, java.lang.String keyword, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleLoadMoreMedicalItemEvent(no.wmc.domain.enums.ProfileItemEnum profileItemEnum, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleAddMedicalItemEvent(no.wmc.domain.enums.ProfileItemEnum profileItemEnum, no.wmc.domain.model.ProfileItem.Item profileItem, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}