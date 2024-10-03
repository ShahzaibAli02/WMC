package no.wmc.ui.main.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001aJ!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u0011\u0010$\u001a\u00020\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0011\u0010&\u001a\u00020\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0011\u0010\'\u001a\u00020\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0011\u0010(\u001a\u00020\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0011\u0010)\u001a\u00020\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0011\u0010*\u001a\u00020\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0011\u0010+\u001a\u00020\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0019\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J!\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\u0011\u00106\u001a\u00020\u001eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J!\u00107\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u00108\u001a\u000209H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010:J\u0019\u0010;\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020=H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010>J\"\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020B2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020\u001e0DR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0002X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006F"}, d2 = {"Lno/wmc/ui/main/home/HomeViewModel;", "Lno/wmc/ui/base/BaseViewModel;", "Lno/wmc/ui/main/home/HomeViewState;", "getProfileUseCase", "Lno/wmc/domain/model/usecase/GetProfileUseCase;", "getProfileItemUseCase", "Lno/wmc/domain/model/usecase/GetProfileItemUseCase;", "getDocumentsUseCase", "Lno/wmc/domain/model/usecase/GetDocumentsUseCase;", "removeMedicalItemUseCase", "Lno/wmc/domain/model/usecase/RemoveMedicalItemUseCase;", "downloadDocumentUseCase", "Lno/wmc/domain/model/usecase/DownloadDocumentUseCase;", "removeDocumentUseCase", "Lno/wmc/domain/model/usecase/RemoveDocumentUseCase;", "shareUseCase", "Lno/wmc/domain/model/usecase/ShareUseCase;", "orderCardUseCase", "Lno/wmc/domain/model/usecase/OrderCardUseCase;", "fireStoreProvider", "Lno/wmc/data/remote/providers/FireStoreProvider;", "localDataManager", "Lno/wmc/data/local/manager/LocalDataManager;", "viewState", "appDispatchers", "Lno/wmc/utils/AppDispatchers;", "(Lno/wmc/domain/model/usecase/GetProfileUseCase;Lno/wmc/domain/model/usecase/GetProfileItemUseCase;Lno/wmc/domain/model/usecase/GetDocumentsUseCase;Lno/wmc/domain/model/usecase/RemoveMedicalItemUseCase;Lno/wmc/domain/model/usecase/DownloadDocumentUseCase;Lno/wmc/domain/model/usecase/RemoveDocumentUseCase;Lno/wmc/domain/model/usecase/ShareUseCase;Lno/wmc/domain/model/usecase/OrderCardUseCase;Lno/wmc/data/remote/providers/FireStoreProvider;Lno/wmc/data/local/manager/LocalDataManager;Lno/wmc/ui/main/home/HomeViewState;Lno/wmc/utils/AppDispatchers;)V", "getViewState", "()Lno/wmc/ui/main/home/HomeViewState;", "handleDownloadDocumentEvent", "", "context", "Landroid/content/Context;", "document", "Lno/wmc/domain/model/Document;", "(Landroid/content/Context;Lno/wmc/domain/model/Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGetAllergiesEvent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGetDiagnosesEvent", "handleGetDocumentsEvent", "handleGetMedicineEvent", "handleGetProfileEvent", "handleGetVaccinesEvent", "handleOrderCardEvent", "handleRemoveDocumentEvent", "documentId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleRemoveMedicalItemEvent", "profileItemEnum", "Lno/wmc/domain/enums/ProfileItemEnum;", "profileItem", "Lno/wmc/domain/model/ProfileItem$Item;", "(Lno/wmc/domain/enums/ProfileItemEnum;Lno/wmc/domain/model/ProfileItem$Item;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleSetNoAllergiesEvent", "handleShareViewEvent", "shareType", "Lno/wmc/domain/model/ShareType;", "(Landroid/content/Context;Lno/wmc/domain/model/ShareType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleViewEvent", "event", "Lno/wmc/ui/base/ViewEvent;", "(Lno/wmc/ui/base/ViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateImage", "Lkotlinx/coroutines/Job;", "uri", "Landroid/net/Uri;", "result", "Lkotlin/Function1;", "", "wmc-3.1.40-b11_prodRelease"})
public final class HomeViewModel extends no.wmc.ui.base.BaseViewModel<no.wmc.ui.main.home.HomeViewState> {
    private final no.wmc.domain.model.usecase.GetProfileUseCase getProfileUseCase = null;
    private final no.wmc.domain.model.usecase.GetProfileItemUseCase getProfileItemUseCase = null;
    private final no.wmc.domain.model.usecase.GetDocumentsUseCase getDocumentsUseCase = null;
    private final no.wmc.domain.model.usecase.RemoveMedicalItemUseCase removeMedicalItemUseCase = null;
    private final no.wmc.domain.model.usecase.DownloadDocumentUseCase downloadDocumentUseCase = null;
    private final no.wmc.domain.model.usecase.RemoveDocumentUseCase removeDocumentUseCase = null;
    private final no.wmc.domain.model.usecase.ShareUseCase shareUseCase = null;
    private final no.wmc.domain.model.usecase.OrderCardUseCase orderCardUseCase = null;
    private final no.wmc.data.remote.providers.FireStoreProvider fireStoreProvider = null;
    private final no.wmc.data.local.manager.LocalDataManager localDataManager = null;
    @org.jetbrains.annotations.NotNull
    private final no.wmc.ui.main.home.HomeViewState viewState = null;
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.GetProfileUseCase getProfileUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.GetProfileItemUseCase getProfileItemUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.GetDocumentsUseCase getDocumentsUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.RemoveMedicalItemUseCase removeMedicalItemUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.DownloadDocumentUseCase downloadDocumentUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.RemoveDocumentUseCase removeDocumentUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.ShareUseCase shareUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.OrderCardUseCase orderCardUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.data.remote.providers.FireStoreProvider fireStoreProvider, @org.jetbrains.annotations.NotNull
    no.wmc.data.local.manager.LocalDataManager localDataManager, @org.jetbrains.annotations.NotNull
    no.wmc.ui.main.home.HomeViewState viewState, @org.jetbrains.annotations.NotNull
    no.wmc.utils.AppDispatchers appDispatchers) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected no.wmc.ui.main.home.HomeViewState getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected java.lang.Object handleViewEvent(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewEvent event, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job updateImage(@org.jetbrains.annotations.NotNull
    android.net.Uri uri, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> result) {
        return null;
    }
    
    private final java.lang.Object handleGetProfileEvent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleSetNoAllergiesEvent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleGetAllergiesEvent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleGetMedicineEvent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleGetDiagnosesEvent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleGetVaccinesEvent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleGetDocumentsEvent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleRemoveMedicalItemEvent(no.wmc.domain.enums.ProfileItemEnum profileItemEnum, no.wmc.domain.model.ProfileItem.Item profileItem, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleDownloadDocumentEvent(android.content.Context context, no.wmc.domain.model.Document document, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleRemoveDocumentEvent(int documentId, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleShareViewEvent(android.content.Context context, no.wmc.domain.model.ShareType shareType, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleOrderCardEvent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}