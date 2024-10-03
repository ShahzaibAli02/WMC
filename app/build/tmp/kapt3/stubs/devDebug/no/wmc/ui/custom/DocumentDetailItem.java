package no.wmc.ui.custom;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J6\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u000e0\u0012R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lno/wmc/ui/custom/DocumentDetailItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lno/wmc/databinding/ItemDocumentDetailBinding;", "getBinding", "()Lno/wmc/databinding/ItemDocumentDetailBinding;", "binding$delegate", "Lkotlin/Lazy;", "init", "", "document", "Lno/wmc/domain/model/Document;", "onItemClicked", "Lkotlin/Function1;", "onMoreClicked", "wmc-3.1.40-b11_devDebug"})
public final class DocumentDetailItem extends androidx.constraintlayout.widget.ConstraintLayout {
    private final kotlin.Lazy binding$delegate = null;
    
    public DocumentDetailItem(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.Nullable
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    private final no.wmc.databinding.ItemDocumentDetailBinding getBinding() {
        return null;
    }
    
    public final void init(@org.jetbrains.annotations.NotNull
    no.wmc.domain.model.Document document, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super no.wmc.domain.model.Document, kotlin.Unit> onItemClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super no.wmc.domain.model.Document, kotlin.Unit> onMoreClicked) {
    }
}