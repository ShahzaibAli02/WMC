package no.wmc.ui.document;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/document/DocumentMetadataViewEvent;", "Lno/wmc/ui/base/ViewEvent;", "()V", "EditDocumentViewEvent", "GetDocumentTypeViewEvent", "UploadDocumentViewEvent", "Lno/wmc/ui/document/DocumentMetadataViewEvent$EditDocumentViewEvent;", "Lno/wmc/ui/document/DocumentMetadataViewEvent$GetDocumentTypeViewEvent;", "Lno/wmc/ui/document/DocumentMetadataViewEvent$UploadDocumentViewEvent;", "wmc-3.1.40-b11_prodRelease"})
public abstract class DocumentMetadataViewEvent extends no.wmc.ui.base.ViewEvent {
    
    private DocumentMetadataViewEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lno/wmc/ui/document/DocumentMetadataViewEvent$GetDocumentTypeViewEvent;", "Lno/wmc/ui/document/DocumentMetadataViewEvent;", "()V", "wmc-3.1.40-b11_prodRelease"})
    public static final class GetDocumentTypeViewEvent extends no.wmc.ui.document.DocumentMetadataViewEvent {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.document.DocumentMetadataViewEvent.GetDocumentTypeViewEvent INSTANCE = null;
        
        private GetDocumentTypeViewEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lno/wmc/ui/document/DocumentMetadataViewEvent$UploadDocumentViewEvent;", "Lno/wmc/ui/document/DocumentMetadataViewEvent;", "category", "", "title", "description", "typeId", "", "document", "Ljava/io/File;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/io/File;)V", "getCategory", "()Ljava/lang/String;", "getDescription", "getDocument", "()Ljava/io/File;", "getTitle", "getTypeId", "()I", "wmc-3.1.40-b11_prodRelease"})
    public static final class UploadDocumentViewEvent extends no.wmc.ui.document.DocumentMetadataViewEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String category = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String description = null;
        private final int typeId = 0;
        @org.jetbrains.annotations.NotNull
        private final java.io.File document = null;
        
        public UploadDocumentViewEvent(@org.jetbrains.annotations.NotNull
        java.lang.String category, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String description, int typeId, @org.jetbrains.annotations.NotNull
        java.io.File document) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getCategory() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDescription() {
            return null;
        }
        
        public final int getTypeId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.io.File getDocument() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0013"}, d2 = {"Lno/wmc/ui/document/DocumentMetadataViewEvent$EditDocumentViewEvent;", "Lno/wmc/ui/document/DocumentMetadataViewEvent;", "fileId", "", "title", "description", "typeId", "", "document", "Ljava/io/File;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/io/File;)V", "getDescription", "()Ljava/lang/String;", "getDocument", "()Ljava/io/File;", "getFileId", "getTitle", "getTypeId", "()I", "wmc-3.1.40-b11_prodRelease"})
    public static final class EditDocumentViewEvent extends no.wmc.ui.document.DocumentMetadataViewEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String fileId = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String title = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String description = null;
        private final int typeId = 0;
        @org.jetbrains.annotations.Nullable
        private final java.io.File document = null;
        
        public EditDocumentViewEvent(@org.jetbrains.annotations.NotNull
        java.lang.String fileId, @org.jetbrains.annotations.NotNull
        java.lang.String title, @org.jetbrains.annotations.NotNull
        java.lang.String description, int typeId, @org.jetbrains.annotations.Nullable
        java.io.File document) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getFileId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDescription() {
            return null;
        }
        
        public final int getTypeId() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.io.File getDocument() {
            return null;
        }
    }
}