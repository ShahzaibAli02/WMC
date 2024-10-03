package no.wmc.ui.main.home.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0015\u0016B#\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u001c\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lno/wmc/ui/main/home/list/ProfileItemListAdapter;", "Lno/wmc/ui/base/BaseHomeCardListAdapter;", "Lno/wmc/domain/model/MedicalItem;", "Lno/wmc/ui/main/home/list/ProfileItemListAdapter$ProfileItemViewHolder;", "emptyStateString", "", "onItemClicked", "Lkotlin/Function1;", "", "(ILkotlin/jvm/functions/Function1;)V", "getEmptyStateString", "getProfileItemCount", "getStringTitleList", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ProfileItemDiffUtils", "ProfileItemViewHolder", "wmc-3.1.40-b11_prodRelease"})
public final class ProfileItemListAdapter extends no.wmc.ui.base.BaseHomeCardListAdapter<no.wmc.domain.model.MedicalItem, no.wmc.ui.main.home.list.ProfileItemListAdapter.ProfileItemViewHolder> {
    private final int emptyStateString = 0;
    private final kotlin.jvm.functions.Function1<no.wmc.domain.model.MedicalItem, kotlin.Unit> onItemClicked = null;
    
    public ProfileItemListAdapter(@androidx.annotation.StringRes
    int emptyStateString, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super no.wmc.domain.model.MedicalItem, kotlin.Unit> onItemClicked) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public no.wmc.ui.main.home.list.ProfileItemListAdapter.ProfileItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    no.wmc.ui.main.home.list.ProfileItemListAdapter.ProfileItemViewHolder holder, int position) {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/main/home/list/ProfileItemListAdapter$ProfileItemDiffUtils;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lno/wmc/domain/model/MedicalItem;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "wmc-3.1.40-b11_prodRelease"})
    public static final class ProfileItemDiffUtils extends androidx.recyclerview.widget.DiffUtil.ItemCallback<no.wmc.domain.model.MedicalItem> {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.main.home.list.ProfileItemListAdapter.ProfileItemDiffUtils INSTANCE = null;
        
        private ProfileItemDiffUtils() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.MedicalItem oldItem, @org.jetbrains.annotations.NotNull
        no.wmc.domain.model.MedicalItem newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.MedicalItem oldItem, @org.jetbrains.annotations.NotNull
        no.wmc.domain.model.MedicalItem newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/main/home/list/ProfileItemListAdapter$ProfileItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lno/wmc/databinding/HomeListItemBinding;", "(Lno/wmc/ui/main/home/list/ProfileItemListAdapter;Lno/wmc/databinding/HomeListItemBinding;)V", "bind", "", "item", "Lno/wmc/domain/model/MedicalItem;", "wmc-3.1.40-b11_prodRelease"})
    public final class ProfileItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final no.wmc.databinding.HomeListItemBinding binding = null;
        
        public ProfileItemViewHolder(@org.jetbrains.annotations.NotNull
        no.wmc.databinding.HomeListItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.MedicalItem item) {
        }
    }
}