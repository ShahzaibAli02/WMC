package no.wmc.databinding;
import no.wmc.R;
import no.wmc.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ExpandableCardBindingImpl extends ExpandableCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.titlePanel, 5);
        sViewsWithIds.put(R.id.icon, 6);
        sViewsWithIds.put(R.id.title, 7);
        sViewsWithIds.put(R.id.description, 8);
        sViewsWithIds.put(R.id.expandButton, 9);
        sViewsWithIds.put(R.id.infoLayout, 10);
        sViewsWithIds.put(R.id.cancelEditItemButton, 11);
        sViewsWithIds.put(R.id.removeItemButton, 12);
        sViewsWithIds.put(R.id.translateButton, 13);
        sViewsWithIds.put(R.id.addButton, 14);
        sViewsWithIds.put(R.id.editButton, 15);
        sViewsWithIds.put(R.id.shareButton, 16);
    }
    // views
    @NonNull
    private final android.widget.ProgressBar mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ExpandableCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ExpandableCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[14]
            , (android.widget.TextView) bindings[11]
            , (android.widget.HorizontalScrollView) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[15]
            , (android.widget.ImageView) bindings[9]
            , (com.google.android.material.card.MaterialCardView) bindings[0]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.LinearLayout) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.TextView) bindings[12]
            , (com.google.android.material.button.MaterialButton) bindings[16]
            , (android.widget.TextView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (com.google.android.material.button.MaterialButton) bindings[13]
            );
        this.cardActionLayout.setTag(null);
        this.editActionLayout.setTag(null);
        this.expandableCard.setTag(null);
        this.list.setTag(null);
        this.mboundView2 = (android.widget.ProgressBar) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.isEditMode == variableId) {
            setIsEditMode((java.lang.Boolean) variable);
        }
        else if (BR.isLoading == variableId) {
            setIsLoading((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsEditMode(@Nullable java.lang.Boolean IsEditMode) {
        this.mIsEditMode = IsEditMode;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.isEditMode);
        super.requestRebind();
    }
    public void setIsLoading(@Nullable java.lang.Boolean IsLoading) {
        this.mIsLoading = IsLoading;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.isLoading);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.Boolean isEditMode = mIsEditMode;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsEditMode = false;
        int isLoadingViewVISIBLEViewGONE = 0;
        java.lang.Boolean isLoading = mIsLoading;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsLoading = false;
        int isEditModeViewVISIBLEViewGONE = 0;
        int isEditModeViewGONEViewVISIBLE = 0;
        int isLoadingViewINVISIBLEViewVISIBLE = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isEditMode)
                androidxDatabindingViewDataBindingSafeUnboxIsEditMode = androidx.databinding.ViewDataBinding.safeUnbox(isEditMode);
            if((dirtyFlags & 0x5L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsEditMode) {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isEditMode) ? View.VISIBLE : View.GONE
                isEditModeViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsEditMode) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(isEditMode) ? View.GONE : View.VISIBLE
                isEditModeViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxIsEditMode) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x6L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isLoading)
                androidxDatabindingViewDataBindingSafeUnboxIsLoading = androidx.databinding.ViewDataBinding.safeUnbox(isLoading);
            if((dirtyFlags & 0x6L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsLoading) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x200L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.VISIBLE : View.GONE
                isLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsLoading) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.INVISIBLE : View.VISIBLE
                isLoadingViewINVISIBLEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxIsLoading) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.cardActionLayout.setVisibility(isEditModeViewGONEViewVISIBLE);
            this.editActionLayout.setVisibility(isEditModeViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.list.setVisibility(isLoadingViewINVISIBLEViewVISIBLE);
            this.mboundView2.setVisibility(isLoadingViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isEditMode
        flag 1 (0x2L): isLoading
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(isEditMode) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(isEditMode) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(isEditMode) ? View.GONE : View.VISIBLE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(isEditMode) ? View.GONE : View.VISIBLE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.INVISIBLE : View.VISIBLE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.INVISIBLE : View.VISIBLE
    flag mapping end*/
    //end
}