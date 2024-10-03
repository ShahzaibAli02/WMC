package no.wmc.domain.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\'\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJA\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0019\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ7\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lno/wmc/domain/repo/DocumentRepository;", "", "downloadDocument", "Lno/wmc/domain/DataState;", "Ljava/io/File;", "context", "Landroid/content/Context;", "document", "Lno/wmc/domain/model/Document;", "(Landroid/content/Context;Lno/wmc/domain/model/Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editDocument", "", "fileId", "", "title", "description", "typeId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocumentType", "Lno/wmc/data/remote/model/DocumentTypeDtoModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocuments", "Lno/wmc/data/remote/model/DocumentListDtoModel;", "removeDocument", "documentId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadDocument", "(Ljava/lang/String;Ljava/lang/String;ILjava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_devDebug"})
public abstract interface DocumentRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getDocuments(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<no.wmc.data.remote.model.DocumentListDtoModel>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getDocumentType(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<no.wmc.data.remote.model.DocumentTypeDtoModel>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object uploadDocument(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String description, int typeId, @org.jetbrains.annotations.NotNull
    java.io.File document, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<kotlin.Unit>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object editDocument(@org.jetbrains.annotations.NotNull
    java.lang.String fileId, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String description, int typeId, @org.jetbrains.annotations.Nullable
    java.io.File document, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<kotlin.Unit>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object downloadDocument(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.Document document, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<java.io.File>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object removeDocument(int documentId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<kotlin.Unit>> continuation);
}