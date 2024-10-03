package no.wmc.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\'J\b\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0012\u001a\u00020\u0013H&J\u0016\u0010\u0014\u001a\u00020\n2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0016R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lno/wmc/ui/base/BaseHomeCardListAdapter;", "T", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lno/wmc/ui/base/BaseListAdapter;", "diffUtil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "cardUpdateTrigger", "Lkotlin/Function0;", "", "getCardUpdateTrigger", "()Lkotlin/jvm/functions/Function0;", "setCardUpdateTrigger", "(Lkotlin/jvm/functions/Function0;)V", "getEmptyStateString", "", "getProfileItemCount", "getStringTitleList", "", "updateList", "list", "", "wmc-3.1.40-b11_devDebug"})
public abstract class BaseHomeCardListAdapter<T extends java.lang.Object, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends no.wmc.ui.base.BaseListAdapter<T, VH> {
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function0<kotlin.Unit> cardUpdateTrigger;
    
    public BaseHomeCardListAdapter(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diffUtil) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getCardUpdateTrigger() {
        return null;
    }
    
    public final void setCardUpdateTrigger(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String getStringTitleList();
    
    @androidx.annotation.StringRes
    public abstract int getEmptyStateString();
    
    public abstract int getProfileItemCount();
    
    public final void updateList(@org.jetbrains.annotations.Nullable
    java.util.List<? extends T> list) {
    }
}