package no.wmc.data.remote.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006JK\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J/\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u00052\b\b\u0001\u0010\u0015\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J%\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\u0014\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006JA\u0010\u001b\u001a\u00020\b2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lno/wmc/data/remote/service/DocumentApiService;", "", "downloadDocument", "Lokhttp3/ResponseBody;", "documentId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editDocument", "", "id", "", "title", "Lokhttp3/MultipartBody$Part;", "description", "categoryId", "document", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocumentType", "Lno/wmc/data/remote/model/DocumentTypeDtoModel;", "page", "pageSize", "lang", "(IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocuments", "Lno/wmc/data/remote/model/DocumentListDtoModel;", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeDocument", "uploadDocument", "(Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_devDebug"})
public abstract interface DocumentApiService {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "documents")
    public abstract java.lang.Object getDocuments(@retrofit2.http.Query(value = "Page")
    int page, @retrofit2.http.Query(value = "PageSize")
    int pageSize, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.data.remote.model.DocumentListDtoModel> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "documents/categories")
    public abstract java.lang.Object getDocumentType(@retrofit2.http.Query(value = "Page")
    int page, @retrofit2.http.Query(value = "PageSize")
    int pageSize, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "lang")
    java.lang.String lang, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.data.remote.model.DocumentTypeDtoModel> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.POST(value = "documents")
    @retrofit2.http.Multipart
    public abstract java.lang.Object uploadDocument(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Part
    okhttp3.MultipartBody.Part title, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Part
    okhttp3.MultipartBody.Part description, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Part
    okhttp3.MultipartBody.Part categoryId, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Part
    okhttp3.MultipartBody.Part document, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "documents/file/{document_id}")
    public abstract java.lang.Object downloadDocument(@retrofit2.http.Path(value = "document_id")
    int documentId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super okhttp3.ResponseBody> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.DELETE(value = "documents/{document_id}")
    public abstract java.lang.Object removeDocument(@retrofit2.http.Path(value = "document_id")
    int documentId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.PUT(value = "documents/{id}")
    @retrofit2.http.Multipart
    public abstract java.lang.Object editDocument(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Part
    okhttp3.MultipartBody.Part title, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Part
    okhttp3.MultipartBody.Part description, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Part
    okhttp3.MultipartBody.Part categoryId, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Part
    okhttp3.MultipartBody.Part document, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}