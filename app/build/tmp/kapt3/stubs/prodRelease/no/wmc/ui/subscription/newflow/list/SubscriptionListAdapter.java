package no.wmc.ui.subscription.newflow.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u001d\u001eB!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\u0015\u001a\u00020\b2\n\u0010\u0016\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lno/wmc/ui/subscription/newflow/list/SubscriptionListAdapter;", "Lno/wmc/ui/base/BaseListAdapter;", "Lno/wmc/domain/model/NewSubscription;", "Lno/wmc/ui/subscription/newflow/list/SubscriptionListAdapter$SubscriptionListItemViewHolder;", "context", "Landroid/content/Context;", "onItemClicked", "Lkotlin/Function1;", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "getContext", "()Landroid/content/Context;", "onClickRedeem", "Lkotlin/Function0;", "getOnClickRedeem", "()Lkotlin/jvm/functions/Function0;", "setOnClickRedeem", "(Lkotlin/jvm/functions/Function0;)V", "onClickSub", "getOnClickSub", "setOnClickSub", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SubscriptionListItemDiffUtils", "SubscriptionListItemViewHolder", "wmc-3.1.40-b11_prodRelease"})
public final class SubscriptionListAdapter extends no.wmc.ui.base.BaseListAdapter<no.wmc.domain.model.NewSubscription, no.wmc.ui.subscription.newflow.list.SubscriptionListAdapter.SubscriptionListItemViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private final kotlin.jvm.functions.Function1<no.wmc.domain.model.NewSubscription, kotlin.Unit> onItemClicked = null;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickSub;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function0<kotlin.Unit> onClickRedeem;
    
    public SubscriptionListAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super no.wmc.domain.model.NewSubscription, kotlin.Unit> onItemClicked) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClickSub() {
        return null;
    }
    
    public final void setOnClickSub(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClickRedeem() {
        return null;
    }
    
    public final void setOnClickRedeem(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public no.wmc.ui.subscription.newflow.list.SubscriptionListAdapter.SubscriptionListItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    no.wmc.ui.subscription.newflow.list.SubscriptionListAdapter.SubscriptionListItemViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/subscription/newflow/list/SubscriptionListAdapter$SubscriptionListItemDiffUtils;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lno/wmc/domain/model/NewSubscription;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "wmc-3.1.40-b11_prodRelease"})
    public static final class SubscriptionListItemDiffUtils extends androidx.recyclerview.widget.DiffUtil.ItemCallback<no.wmc.domain.model.NewSubscription> {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.subscription.newflow.list.SubscriptionListAdapter.SubscriptionListItemDiffUtils INSTANCE = null;
        
        private SubscriptionListItemDiffUtils() {
            super();
        }
        
        @java.lang.Override
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.NewSubscription oldItem, @org.jetbrains.annotations.NotNull
        no.wmc.domain.model.NewSubscription newItem) {
            return false;
        }
        
        @java.lang.Override
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.NewSubscription oldItem, @org.jetbrains.annotations.NotNull
        no.wmc.domain.model.NewSubscription newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/subscription/newflow/list/SubscriptionListAdapter$SubscriptionListItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lno/wmc/databinding/ItemNewSubscriptionBinding;", "(Lno/wmc/ui/subscription/newflow/list/SubscriptionListAdapter;Lno/wmc/databinding/ItemNewSubscriptionBinding;)V", "bind", "", "subscription", "Lno/wmc/domain/model/NewSubscription;", "wmc-3.1.40-b11_prodRelease"})
    public final class SubscriptionListItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final no.wmc.databinding.ItemNewSubscriptionBinding binding = null;
        
        public SubscriptionListItemViewHolder(@org.jetbrains.annotations.NotNull
        no.wmc.databinding.ItemNewSubscriptionBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.NewSubscription subscription) {
        }
    }
}