package no.wmc.ui.subscription.overview.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0011\u0012B-\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\u00062\n\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lno/wmc/ui/subscription/overview/list/SubscriptionOverviewAdapter;", "Lno/wmc/ui/base/BaseListAdapter;", "Lno/wmc/domain/model/Subscription;", "Lno/wmc/ui/subscription/overview/list/SubscriptionOverviewAdapter$SubscriptionOverviewItemViewHolder;", "onItemClicked", "Lkotlin/Function1;", "", "onRemoveMembershipClicked", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SubscriptionOverviewItemDiffUtils", "SubscriptionOverviewItemViewHolder", "wmc-3.1.40-b11_prodRelease"})
public final class SubscriptionOverviewAdapter extends no.wmc.ui.base.BaseListAdapter<no.wmc.domain.model.Subscription, no.wmc.ui.subscription.overview.list.SubscriptionOverviewAdapter.SubscriptionOverviewItemViewHolder> {
    private final kotlin.jvm.functions.Function1<no.wmc.domain.model.Subscription, kotlin.Unit> onItemClicked = null;
    private final kotlin.jvm.functions.Function1<no.wmc.domain.model.Subscription, kotlin.Unit> onRemoveMembershipClicked = null;
    
    public SubscriptionOverviewAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super no.wmc.domain.model.Subscription, kotlin.Unit> onItemClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super no.wmc.domain.model.Subscription, kotlin.Unit> onRemoveMembershipClicked) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public no.wmc.ui.subscription.overview.list.SubscriptionOverviewAdapter.SubscriptionOverviewItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    no.wmc.ui.subscription.overview.list.SubscriptionOverviewAdapter.SubscriptionOverviewItemViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/subscription/overview/list/SubscriptionOverviewAdapter$SubscriptionOverviewItemDiffUtils;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lno/wmc/domain/model/Subscription;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "wmc-3.1.40-b11_prodRelease"})
    public static final class SubscriptionOverviewItemDiffUtils extends androidx.recyclerview.widget.DiffUtil.ItemCallback<no.wmc.domain.model.Subscription> {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.subscription.overview.list.SubscriptionOverviewAdapter.SubscriptionOverviewItemDiffUtils INSTANCE = null;
        
        private SubscriptionOverviewItemDiffUtils() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.Subscription oldItem, @org.jetbrains.annotations.NotNull
        no.wmc.domain.model.Subscription newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.Subscription oldItem, @org.jetbrains.annotations.NotNull
        no.wmc.domain.model.Subscription newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lno/wmc/ui/subscription/overview/list/SubscriptionOverviewAdapter$SubscriptionOverviewItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lno/wmc/databinding/ItemSubscriptionOverviewBinding;", "(Lno/wmc/ui/subscription/overview/list/SubscriptionOverviewAdapter;Lno/wmc/databinding/ItemSubscriptionOverviewBinding;)V", "bind", "", "subscription", "Lno/wmc/domain/model/Subscription;", "detailStringBuilder", "Landroid/text/SpannableStringBuilder;", "titleString", "", "detailString", "setTextSpanColor", "Landroid/text/SpannableString;", "text", "color", "", "wmc-3.1.40-b11_prodRelease"})
    public final class SubscriptionOverviewItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final no.wmc.databinding.ItemSubscriptionOverviewBinding binding = null;
        
        public SubscriptionOverviewItemViewHolder(@org.jetbrains.annotations.NotNull
        no.wmc.databinding.ItemSubscriptionOverviewBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.Subscription subscription) {
        }
        
        private final android.text.SpannableStringBuilder detailStringBuilder(java.lang.String titleString, java.lang.String detailString) {
            return null;
        }
        
        private final android.text.SpannableString setTextSpanColor(java.lang.String text, int color) {
            return null;
        }
    }
}