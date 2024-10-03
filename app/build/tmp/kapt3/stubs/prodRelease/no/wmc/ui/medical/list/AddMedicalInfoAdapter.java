package no.wmc.ui.medical.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0012\u0013B\'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\b\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\u00020\u00062\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lno/wmc/ui/medical/list/AddMedicalInfoAdapter;", "Lno/wmc/ui/base/BaseListAdapter;", "Lno/wmc/domain/model/ProfileItem$Item;", "Lno/wmc/ui/medical/list/AddMedicalInfoAdapter$AddMedicalInfoItemViewHolder;", "loadMore", "Lkotlin/Function0;", "", "onItemClicked", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "AddMedicalInfoItemDiffUtils", "AddMedicalInfoItemViewHolder", "wmc-3.1.40-b11_prodRelease"})
public final class AddMedicalInfoAdapter extends no.wmc.ui.base.BaseListAdapter<no.wmc.domain.model.ProfileItem.Item, no.wmc.ui.medical.list.AddMedicalInfoAdapter.AddMedicalInfoItemViewHolder> {
    private final kotlin.jvm.functions.Function0<kotlin.Unit> loadMore = null;
    private final kotlin.jvm.functions.Function1<no.wmc.domain.model.ProfileItem.Item, kotlin.Unit> onItemClicked = null;
    
    public AddMedicalInfoAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> loadMore, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super no.wmc.domain.model.ProfileItem.Item, kotlin.Unit> onItemClicked) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public no.wmc.ui.medical.list.AddMedicalInfoAdapter.AddMedicalInfoItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    no.wmc.ui.medical.list.AddMedicalInfoAdapter.AddMedicalInfoItemViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/medical/list/AddMedicalInfoAdapter$AddMedicalInfoItemDiffUtils;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lno/wmc/domain/model/ProfileItem$Item;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "wmc-3.1.40-b11_prodRelease"})
    public static final class AddMedicalInfoItemDiffUtils extends androidx.recyclerview.widget.DiffUtil.ItemCallback<no.wmc.domain.model.ProfileItem.Item> {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.medical.list.AddMedicalInfoAdapter.AddMedicalInfoItemDiffUtils INSTANCE = null;
        
        private AddMedicalInfoItemDiffUtils() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.ProfileItem.Item oldItem, @org.jetbrains.annotations.NotNull
        no.wmc.domain.model.ProfileItem.Item newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.ProfileItem.Item oldItem, @org.jetbrains.annotations.NotNull
        no.wmc.domain.model.ProfileItem.Item newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/medical/list/AddMedicalInfoAdapter$AddMedicalInfoItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lno/wmc/databinding/ItemAddMedicalInfoBinding;", "(Lno/wmc/ui/medical/list/AddMedicalInfoAdapter;Lno/wmc/databinding/ItemAddMedicalInfoBinding;)V", "bind", "", "item", "Lno/wmc/domain/model/ProfileItem$Item;", "wmc-3.1.40-b11_prodRelease"})
    public final class AddMedicalInfoItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final no.wmc.databinding.ItemAddMedicalInfoBinding binding = null;
        
        public AddMedicalInfoItemViewHolder(@org.jetbrains.annotations.NotNull
        no.wmc.databinding.ItemAddMedicalInfoBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.ProfileItem.Item item) {
        }
    }
}