package no.wmc.domain.model.usecase.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005JA\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lno/wmc/domain/model/usecase/impl/EditDocumentUseCaseImpl;", "Lno/wmc/domain/model/usecase/impl/BaseUseCase;", "Lno/wmc/domain/model/usecase/EditDocumentUseCase;", "documentRepository", "Lno/wmc/domain/repo/DocumentRepository;", "(Lno/wmc/domain/repo/DocumentRepository;)V", "invoke", "Lno/wmc/domain/DataState;", "", "fileId", "", "title", "description", "typeId", "", "document", "Ljava/io/File;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_prodRelease"})
public final class EditDocumentUseCaseImpl extends no.wmc.domain.model.usecase.impl.BaseUseCase implements no.wmc.domain.model.usecase.EditDocumentUseCase {
    private final no.wmc.domain.repo.DocumentRepository documentRepository = null;
    
    public EditDocumentUseCaseImpl(@org.jetbrains.annotations.NotNull
    no.wmc.domain.repo.DocumentRepository documentRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    java.lang.String fileId, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String description, int typeId, @org.jetbrains.annotations.Nullable
    java.io.File document, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<kotlin.Unit>> continuation) {
        return null;
    }
}