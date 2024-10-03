package no.wmc.ui.main.home.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0017\u0018B7\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\t2\n\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u001c\u0010\u0013\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lno/wmc/ui/main/home/list/DocumentListAdapter;", "Lno/wmc/ui/base/BaseHomeCardListAdapter;", "Lno/wmc/domain/model/DocumentList$DocumentGroup;", "Lno/wmc/ui/main/home/list/DocumentListAdapter$DocumentItemViewHolder;", "emptyStateString", "", "onItemClicked", "Lkotlin/Function1;", "Lno/wmc/domain/model/Document;", "", "onMoreClicked", "(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getEmptyStateString", "getProfileItemCount", "getStringTitleList", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DocumentItemDiffUtils", "DocumentItemViewHolder", "wmc-3.1.40-b11_devDebug"})
public final class DocumentListAdapter extends no.wmc.ui.base.BaseHomeCardListAdapter<no.wmc.domain.model.DocumentList.DocumentGroup, no.wmc.ui.main.home.list.DocumentListAdapter.DocumentItemViewHolder> {
    private final int emptyStateString = 0;
    private final kotlin.jvm.functions.Function1<no.wmc.domain.model.Document, kotlin.Unit> onItemClicked = null;
    private final kotlin.jvm.functions.Function1<no.wmc.domain.model.Document, kotlin.Unit> onMoreClicked = null;
    
    public DocumentListAdapter(@androidx.annotation.StringRes
    int emptyStateString, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super no.wmc.domain.model.Document, kotlin.Unit> onItemClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super no.wmc.domain.model.Document, kotlin.Unit> onMoreClicked) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public no.wmc.ui.main.home.list.DocumentListAdapter.DocumentItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    no.wmc.ui.main.home.list.DocumentListAdapter.DocumentItemViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getStringTitleList() {
        return null;
    }
    
    @java.lang.Override
    public int getEmptyStateString() {
        return 0;
    }
    
    @java.lang.Override
    public int getProfileItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/main/home/list/DocumentListAdapter$DocumentItemDiffUtils;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lno/wmc/domain/model/DocumentList$DocumentGroup;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "wmc-3.1.40-b11_devDebug"})
    public static final class DocumentItemDiffUtils extends androidx.recyclerview.widget.DiffUtil.ItemCallback<no.wmc.domain.model.DocumentList.DocumentGroup> {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.main.home.list.DocumentListAdapter.DocumentItemDiffUtils INSTANCE = null;
        
        private DocumentItemDiffUtils() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.DocumentList.DocumentGroup oldItem, @org.jetbrains.annotations.NotNull
        no.wmc.domain.model.DocumentList.DocumentGroup newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.DocumentList.DocumentGroup oldItem, @org.jetbrains.annotations.NotNull
        no.wmc.domain.model.DocumentList.DocumentGroup newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/main/home/list/DocumentListAdapter$DocumentItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lno/wmc/databinding/ItemDocumentBinding;", "(Lno/wmc/ui/main/home/list/DocumentListAdapter;Lno/wmc/databinding/ItemDocumentBinding;)V", "bind", "", "documentGroup", "Lno/wmc/domain/model/DocumentList$DocumentGroup;", "wmc-3.1.40-b11_devDebug"})
    public final class DocumentItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final no.wmc.databinding.ItemDocumentBinding binding = null;
        
        public DocumentItemViewHolder(@org.jetbrains.annotations.NotNull
        no.wmc.databinding.ItemDocumentBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.DocumentList.DocumentGroup documentGroup) {
        }
    }
}