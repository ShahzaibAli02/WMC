package no.wmc.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0002\u0010\u0007J)\u0010\b\u001a\u0002H\t\"\b\b\u0002\u0010\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0004\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lno/wmc/ui/base/BaseListAdapter;", "T", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/ListAdapter;", "diffUtil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "getViewBinding", "DB", "Landroidx/databinding/ViewDataBinding;", "parent", "Landroid/view/ViewGroup;", "layout", "", "(Landroid/view/ViewGroup;I)Landroidx/databinding/ViewDataBinding;", "wmc-3.1.40-b11_devDebug"})
public abstract class BaseListAdapter<T extends java.lang.Object, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.ListAdapter<T, VH> {
    
    public BaseListAdapter(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diffUtil) {
        super(null);
    }
    
    /**
     * Additional method to avoid of writing boilerplate code during
     * ViewHolder view initialization.
     */
    @org.jetbrains.annotations.NotNull
    protected final <DB extends androidx.databinding.ViewDataBinding>DB getViewBinding(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, @androidx.annotation.LayoutRes
    int layout) {
        return null;
    }
}