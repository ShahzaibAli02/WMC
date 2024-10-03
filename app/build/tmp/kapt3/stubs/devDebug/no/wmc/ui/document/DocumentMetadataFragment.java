package no.wmc.ui.document;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J2\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010%\u001a\u00020\u001dH\u0002J\b\u0010&\u001a\u00020#H\u0002J\u0016\u0010\'\u001a\u00020\u001d2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0)H\u0002J\u0016\u0010*\u001a\u00020\u001d2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020+0)H\u0002J\u0016\u0010,\u001a\u00020\u001d2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001d0)H\u0002J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020/H\u0014J\b\u00100\u001a\u00020\u001dH\u0002J\b\u00101\u001a\u00020\u001dH\u0016J\u001a\u00102\u001a\u00020\u001d2\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0016J0\u00107\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0017H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lno/wmc/ui/document/DocumentMetadataFragment;", "Lno/wmc/ui/base/BaseViewStateFragment;", "Lno/wmc/databinding/FragmentDocumentMetadataBinding;", "Lno/wmc/ui/document/DocumentMetadataViewModel;", "()V", "args", "Lno/wmc/ui/document/DocumentMetadataFragmentArgs;", "getArgs", "()Lno/wmc/ui/document/DocumentMetadataFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "documentFilePicker", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "documentTypes", "", "Lno/wmc/domain/model/DocumentType$DocumentTypeItem;", "getDocumentTypes", "()Ljava/util/List;", "documentTypes$delegate", "Lkotlin/Lazy;", "file", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "file$delegate", "selectedDocument", "editDocument", "", "fileId", "", "title", "description", "typeId", "", "document", "getDocumentType", "getSelectedDocumentType", "handleEditDocumentViewAction", "viewState", "Lno/wmc/ui/base/ViewState;", "handleGetDocumentTypeAction", "Lno/wmc/domain/model/DocumentType;", "handleUploadDocumentAction", "handleViewAction", "viewAction", "Lno/wmc/ui/base/ViewAction;", "initViews", "onDestroy", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "uploadDocument", "category", "wmc-3.1.40-b11_devDebug"})
public final class DocumentMetadataFragment extends no.wmc.ui.base.BaseViewStateFragment<no.wmc.databinding.FragmentDocumentMetadataBinding, no.wmc.ui.document.DocumentMetadataViewModel> {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy file$delegate = null;
    private final kotlin.Lazy documentTypes$delegate = null;
    private java.io.File selectedDocument;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> documentFilePicker = null;
    
    public DocumentMetadataFragment() {
        super(0, null);
    }
    
    private final no.wmc.ui.document.DocumentMetadataFragmentArgs getArgs() {
        return null;
    }
    
    private final java.io.File getFile() {
        return null;
    }
    
    private final java.util.List<no.wmc.domain.model.DocumentType.DocumentTypeItem> getDocumentTypes() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
    
    @java.lang.Override
    protected void handleViewAction(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewAction viewAction) {
    }
    
    private final void handleGetDocumentTypeAction(no.wmc.ui.base.ViewState<no.wmc.domain.model.DocumentType> viewState) {
    }
    
    private final void handleUploadDocumentAction(no.wmc.ui.base.ViewState<kotlin.Unit> viewState) {
    }
    
    private final void handleEditDocumentViewAction(no.wmc.ui.base.ViewState<kotlin.Unit> viewState) {
    }
    
    private final void getDocumentType() {
    }
    
    private final void uploadDocument(java.lang.String category, java.lang.String title, java.lang.String description, int typeId, java.io.File document) {
    }
    
    private final void editDocument(java.lang.String fileId, java.lang.String title, java.lang.String description, int typeId, java.io.File document) {
    }
    
    private final int getSelectedDocumentType() {
        return 0;
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
}