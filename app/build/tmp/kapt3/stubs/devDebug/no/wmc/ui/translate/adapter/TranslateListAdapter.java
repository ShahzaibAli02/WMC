package no.wmc.ui.translate.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lno/wmc/ui/translate/adapter/TranslateListAdapter;", "Lno/wmc/ui/base/BaseListAdapter;", "Lno/wmc/domain/model/TranslateItem;", "Lno/wmc/ui/translate/adapter/TranslateListAdapter$TranslateItemViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TranslateItemDiffUtils", "TranslateItemViewHolder", "wmc-3.1.40-b11_devDebug"})
public final class TranslateListAdapter extends no.wmc.ui.base.BaseListAdapter<no.wmc.domain.model.TranslateItem, no.wmc.ui.translate.adapter.TranslateListAdapter.TranslateItemViewHolder> {
    
    public TranslateListAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public no.wmc.ui.translate.adapter.TranslateListAdapter.TranslateItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    no.wmc.ui.translate.adapter.TranslateListAdapter.TranslateItemViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/translate/adapter/TranslateListAdapter$TranslateItemDiffUtils;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lno/wmc/domain/model/TranslateItem;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "wmc-3.1.40-b11_devDebug"})
    public static final class TranslateItemDiffUtils extends androidx.recyclerview.widget.DiffUtil.ItemCallback<no.wmc.domain.model.TranslateItem> {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.translate.adapter.TranslateListAdapter.TranslateItemDiffUtils INSTANCE = null;
        
        private TranslateItemDiffUtils() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.TranslateItem oldItem, @org.jetbrains.annotations.NotNull
        no.wmc.domain.model.TranslateItem newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.TranslateItem oldItem, @org.jetbrains.annotations.NotNull
        no.wmc.domain.model.TranslateItem newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/translate/adapter/TranslateListAdapter$TranslateItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lno/wmc/databinding/ItemTranslateBinding;", "(Lno/wmc/ui/translate/adapter/TranslateListAdapter;Lno/wmc/databinding/ItemTranslateBinding;)V", "bind", "", "translateItem", "Lno/wmc/domain/model/TranslateItem;", "wmc-3.1.40-b11_devDebug"})
    public final class TranslateItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final no.wmc.databinding.ItemTranslateBinding binding = null;
        
        public TranslateItemViewHolder(@org.jetbrains.annotations.NotNull
        no.wmc.databinding.ItemTranslateBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.TranslateItem translateItem) {
        }
    }
}