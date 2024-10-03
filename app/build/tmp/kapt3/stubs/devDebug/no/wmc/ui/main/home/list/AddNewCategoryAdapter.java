package no.wmc.ui.main.home.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\'(B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0016J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016\u00a2\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0012H\u0016J\u0018\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0012H\u0016J\u0014\u0010%\u001a\u00020\u001e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lno/wmc/ui/main/home/list/AddNewCategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lno/wmc/ui/main/home/list/AddNewCategoryAdapter$ViewHolder;", "Landroid/widget/SectionIndexer;", "context", "Landroid/content/Context;", "list", "", "Lno/wmc/firebase/model/AllCategoryModel;", "listener", "Lno/wmc/ui/main/home/list/AddNewCategoryAdapter$AddNewCategoryListener;", "(Landroid/content/Context;Ljava/util/List;Lno/wmc/ui/main/home/list/AddNewCategoryAdapter$AddNewCategoryListener;)V", "getContext", "()Landroid/content/Context;", "getListener", "()Lno/wmc/ui/main/home/list/AddNewCategoryAdapter$AddNewCategoryListener;", "mSectionPositions", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getItemCount", "getPositionForSection", "sectionIndex", "getSectionForPosition", "position", "getSections", "", "", "()[Ljava/lang/String;", "notifyChanged", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "updateNew", "AddNewCategoryListener", "ViewHolder", "wmc-3.1.40-b11_devDebug"})
public final class AddNewCategoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<no.wmc.ui.main.home.list.AddNewCategoryAdapter.ViewHolder> implements android.widget.SectionIndexer {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private java.util.List<no.wmc.firebase.model.AllCategoryModel> list;
    @org.jetbrains.annotations.NotNull
    private final no.wmc.ui.main.home.list.AddNewCategoryAdapter.AddNewCategoryListener listener = null;
    private java.util.ArrayList<java.lang.Integer> mSectionPositions;
    
    public AddNewCategoryAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.util.List<no.wmc.firebase.model.AllCategoryModel> list, @org.jetbrains.annotations.NotNull
    no.wmc.ui.main.home.list.AddNewCategoryAdapter.AddNewCategoryListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final no.wmc.ui.main.home.list.AddNewCategoryAdapter.AddNewCategoryListener getListener() {
        return null;
    }
    
    @java.lang.Override
    public int getSectionForPosition(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String[] getSections() {
        return null;
    }
    
    @java.lang.Override
    public int getPositionForSection(int sectionIndex) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public no.wmc.ui.main.home.list.AddNewCategoryAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    no.wmc.ui.main.home.list.AddNewCategoryAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void notifyChanged() {
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull
    java.util.List<no.wmc.firebase.model.AllCategoryModel> updateNew) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/ui/main/home/list/AddNewCategoryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lno/wmc/databinding/ItemViewAddNewCategoryBinding;", "(Lno/wmc/databinding/ItemViewAddNewCategoryBinding;)V", "getBinding", "()Lno/wmc/databinding/ItemViewAddNewCategoryBinding;", "wmc-3.1.40-b11_devDebug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.databinding.ItemViewAddNewCategoryBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        no.wmc.databinding.ItemViewAddNewCategoryBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.databinding.ItemViewAddNewCategoryBinding getBinding() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/ui/main/home/list/AddNewCategoryAdapter$AddNewCategoryListener;", "", "itemClick", "", "data", "Lno/wmc/firebase/model/AllCategoryModel;", "wmc-3.1.40-b11_devDebug"})
    public static abstract interface AddNewCategoryListener {
        
        public abstract void itemClick(@org.jetbrains.annotations.NotNull
        no.wmc.firebase.model.AllCategoryModel data);
    }
}