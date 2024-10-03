package no.wmc.ui.profile.lists;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0013\u0014B(\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u000b\u001a\u00020\t2\n\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eH\u0016R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0002\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lno/wmc/ui/profile/lists/LocalesAdapter;", "Lno/wmc/ui/base/BaseListAdapter;", "Ljava/util/Locale;", "Lno/wmc/ui/profile/lists/LocalesAdapter$LocaleViewHolder;", "onLocaleSelected", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "locale", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "LocaleDiffCallback", "LocaleViewHolder", "wmc-3.1.40-b11_devDebug"})
public final class LocalesAdapter extends no.wmc.ui.base.BaseListAdapter<java.util.Locale, no.wmc.ui.profile.lists.LocalesAdapter.LocaleViewHolder> {
    private final kotlin.jvm.functions.Function1<java.util.Locale, kotlin.Unit> onLocaleSelected = null;
    
    public LocalesAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.util.Locale, kotlin.Unit> onLocaleSelected) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public no.wmc.ui.profile.lists.LocalesAdapter.LocaleViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    no.wmc.ui.profile.lists.LocalesAdapter.LocaleViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c2\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/profile/lists/LocalesAdapter$LocaleDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Ljava/util/Locale;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "wmc-3.1.40-b11_devDebug"})
    static final class LocaleDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<java.util.Locale> {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.profile.lists.LocalesAdapter.LocaleDiffCallback INSTANCE = null;
        
        private LocaleDiffCallback() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        java.util.Locale oldItem, @org.jetbrains.annotations.NotNull
        java.util.Locale newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        java.util.Locale oldItem, @org.jetbrains.annotations.NotNull
        java.util.Locale newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/profile/lists/LocalesAdapter$LocaleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lno/wmc/databinding/CountryListItemBinding;", "(Lno/wmc/ui/profile/lists/LocalesAdapter;Lno/wmc/databinding/CountryListItemBinding;)V", "bind", "", "locale", "Ljava/util/Locale;", "wmc-3.1.40-b11_devDebug"})
    public final class LocaleViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final no.wmc.databinding.CountryListItemBinding binding = null;
        
        public LocaleViewHolder(@org.jetbrains.annotations.NotNull
        no.wmc.databinding.CountryListItemBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        java.util.Locale locale) {
        }
    }
}