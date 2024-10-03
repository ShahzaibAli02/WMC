package no.wmc.ui.document;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ;\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0011\u0010\u001c\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ9\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u0002X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lno/wmc/ui/document/DocumentMetadataViewModel;", "Lno/wmc/ui/base/BaseViewModel;", "Lno/wmc/ui/document/DocumentMetadataViewState;", "getDocumentTypeUseCase", "Lno/wmc/domain/model/usecase/GetDocumentTypeUseCase;", "uploadDocumentUseCase", "Lno/wmc/domain/model/usecase/UploadDocumentUseCase;", "editDocumentUseCase", "Lno/wmc/domain/model/usecase/EditDocumentUseCase;", "localDataManager", "Lno/wmc/data/local/manager/LocalDataManager;", "viewState", "appDispatchers", "Lno/wmc/utils/AppDispatchers;", "(Lno/wmc/domain/model/usecase/GetDocumentTypeUseCase;Lno/wmc/domain/model/usecase/UploadDocumentUseCase;Lno/wmc/domain/model/usecase/EditDocumentUseCase;Lno/wmc/data/local/manager/LocalDataManager;Lno/wmc/ui/document/DocumentMetadataViewState;Lno/wmc/utils/AppDispatchers;)V", "getViewState", "()Lno/wmc/ui/document/DocumentMetadataViewState;", "handleEditDocumentEvent", "", "fileId", "", "title", "description", "typeId", "", "document", "Ljava/io/File;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGetDocumentTypeEvent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleUploadDocumentEvent", "category", "handleViewEvent", "event", "Lno/wmc/ui/base/ViewEvent;", "(Lno/wmc/ui/base/ViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_devDebug"})
public final class DocumentMetadataViewModel extends no.wmc.ui.base.BaseViewModel<no.wmc.ui.document.DocumentMetadataViewState> {
    private final no.wmc.domain.model.usecase.GetDocumentTypeUseCase getDocumentTypeUseCase = null;
    private final no.wmc.domain.model.usecase.UploadDocumentUseCase uploadDocumentUseCase = null;
    private final no.wmc.domain.model.usecase.EditDocumentUseCase editDocumentUseCase = null;
    private final no.wmc.data.local.manager.LocalDataManager localDataManager = null;
    @org.jetbrains.annotations.NotNull
    private final no.wmc.ui.document.DocumentMetadataViewState viewState = null;
    
    public DocumentMetadataViewModel(@org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.GetDocumentTypeUseCase getDocumentTypeUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.UploadDocumentUseCase uploadDocumentUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.EditDocumentUseCase editDocumentUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.data.local.manager.LocalDataManager localDataManager, @org.jetbrains.annotations.NotNull
    no.wmc.ui.document.DocumentMetadataViewState viewState, @org.jetbrains.annotations.NotNull
    no.wmc.utils.AppDispatchers appDispatchers) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected no.wmc.ui.document.DocumentMetadataViewState getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected java.lang.Object handleViewEvent(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewEvent event, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleGetDocumentTypeEvent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleUploadDocumentEvent(java.lang.String category, java.lang.String title, java.lang.String description, int typeId, java.io.File document, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleEditDocumentEvent(java.lang.String fileId, java.lang.String title, java.lang.String description, int typeId, java.io.File document, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}