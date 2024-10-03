package no.wmc.data.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013JA\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0006\u0010#\u001a\u00020\u001bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J7\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lno/wmc/data/repo/DocumentRepositoryImpl;", "Lno/wmc/data/repo/BaseRepository;", "Lno/wmc/domain/repo/DocumentRepository;", "documentApiService", "Lno/wmc/data/remote/service/DocumentApiService;", "contentResolver", "Landroid/content/ContentResolver;", "localDataManager", "Lno/wmc/data/local/manager/LocalDataManager;", "networkStateManager", "Lno/wmc/data/manager/NetworkStateManager;", "(Lno/wmc/data/remote/service/DocumentApiService;Landroid/content/ContentResolver;Lno/wmc/data/local/manager/LocalDataManager;Lno/wmc/data/manager/NetworkStateManager;)V", "downloadDocument", "Lno/wmc/domain/DataState;", "Ljava/io/File;", "context", "Landroid/content/Context;", "document", "Lno/wmc/domain/model/Document;", "(Landroid/content/Context;Lno/wmc/domain/model/Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editDocument", "", "fileId", "", "title", "description", "typeId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocumentType", "Lno/wmc/data/remote/model/DocumentTypeDtoModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocuments", "Lno/wmc/data/remote/model/DocumentListDtoModel;", "removeDocument", "documentId", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadDocument", "(Ljava/lang/String;Ljava/lang/String;ILjava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_devDebug"})
public final class DocumentRepositoryImpl extends no.wmc.data.repo.BaseRepository implements no.wmc.domain.repo.DocumentRepository {
    private final no.wmc.data.remote.service.DocumentApiService documentApiService = null;
    private final android.content.ContentResolver contentResolver = null;
    
    public DocumentRepositoryImpl(@org.jetbrains.annotations.NotNull
    no.wmc.data.remote.service.DocumentApiService documentApiService, @org.jetbrains.annotations.NotNull
    android.content.ContentResolver contentResolver, @org.jetbrains.annotations.NotNull
    no.wmc.data.local.manager.LocalDataManager localDataManager, @org.jetbrains.annotations.NotNull
    no.wmc.data.manager.NetworkStateManager networkStateManager) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getDocuments(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<no.wmc.data.remote.model.DocumentListDtoModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getDocumentType(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<no.wmc.data.remote.model.DocumentTypeDtoModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object uploadDocument(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String description, int typeId, @org.jetbrains.annotations.NotNull
    java.io.File document, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<kotlin.Unit>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object editDocument(@org.jetbrains.annotations.NotNull
    java.lang.String fileId, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String description, int typeId, @org.jetbrains.annotations.Nullable
    java.io.File document, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<kotlin.Unit>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object downloadDocument(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.Document document, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<java.io.File>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object removeDocument(int documentId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<kotlin.Unit>> continuation) {
        return null;
    }
}