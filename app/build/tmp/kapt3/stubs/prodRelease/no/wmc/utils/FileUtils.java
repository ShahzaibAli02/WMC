package no.wmc.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\nJ\u0018\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\nH\u0002J\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\nJ&\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0006J\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0010*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002J\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0010*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002\u00a8\u0006\u001c"}, d2 = {"Lno/wmc/utils/FileUtils;", "", "()V", "copy", "", "source", "Ljava/io/InputStream;", "target", "Ljava/io/OutputStream;", "fileFromContentUri", "Ljava/io/File;", "context", "Landroid/content/Context;", "contentUri", "Landroid/net/Uri;", "getFileExtension", "", "uri", "getMIMETypeFromFile", "file", "getUriForFile", "openFile", "writeToFile", "title", "extension", "inputStream", "getContentFileName", "getFileName", "wmc-3.1.40-b11_prodRelease"})
public final class FileUtils {
    @org.jetbrains.annotations.NotNull
    public static final no.wmc.utils.FileUtils INSTANCE = null;
    
    private FileUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.io.File fileFromContentUri(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.net.Uri contentUri) {
        return null;
    }
    
    private final java.lang.String getFileExtension(android.content.Context context, android.net.Uri uri) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    private final void copy(java.io.InputStream source, java.io.OutputStream target) throws java.io.IOException {
    }
    
    private final java.lang.String getFileName(android.content.Context $this$getFileName, android.net.Uri uri) {
        return null;
    }
    
    private final java.lang.String getContentFileName(android.content.Context $this$getContentFileName, android.net.Uri uri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.io.File writeToFile(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String extension, @org.jetbrains.annotations.NotNull
    java.io.InputStream inputStream) {
        return null;
    }
    
    private final android.net.Uri getUriForFile(android.content.Context context, java.io.File file) {
        return null;
    }
    
    public final void openFile(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.io.File file) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMIMETypeFromFile(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.io.File file) {
        return null;
    }
}