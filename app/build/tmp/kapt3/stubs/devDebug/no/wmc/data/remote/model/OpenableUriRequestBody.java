package no.wmc.data.remote.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lno/wmc/data/remote/model/OpenableUriRequestBody;", "Lokhttp3/RequestBody;", "contentResolver", "Landroid/content/ContentResolver;", "uri", "Landroid/net/Uri;", "(Landroid/content/ContentResolver;Landroid/net/Uri;)V", "type", "Lokhttp3/MediaType;", "contentType", "writeTo", "", "sink", "Lokio/BufferedSink;", "wmc-3.1.40-b11_devDebug"})
public final class OpenableUriRequestBody extends okhttp3.RequestBody {
    private final android.content.ContentResolver contentResolver = null;
    private final android.net.Uri uri = null;
    private final okhttp3.MediaType type = null;
    
    public OpenableUriRequestBody(@org.jetbrains.annotations.NotNull
    android.content.ContentResolver contentResolver, @org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public okhttp3.MediaType contentType() {
        return null;
    }
    
    @java.lang.Override
    public void writeTo(@org.jetbrains.annotations.NotNull
    okio.BufferedSink sink) {
    }
}