package no.wmc.databinding;
import no.wmc.R;
import no.wmc.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDocumentMetadataBindingImpl extends FragmentDocumentMetadataBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 3);
        sViewsWithIds.put(R.id.fileNameCard, 4);
        sViewsWithIds.put(R.id.fileIcon, 5);
        sViewsWithIds.put(R.id.fileName, 6);
        sViewsWithIds.put(R.id.title, 7);
        sViewsWithIds.put(R.id.documentTypeFrame, 8);
        sViewsWithIds.put(R.id.gender, 9);
        sViewsWithIds.put(R.id.documentSpinner, 10);
        sViewsWithIds.put(R.id.description, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ProgressBar mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDocumentMetadataBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentDocumentMetadataBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[10]
            , (android.widget.FrameLayout) bindings[8]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (androidx.cardview.widget.CardView) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (androidx.appcompat.widget.Toolbar) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.ProgressBar) bindings[2];
        this.mboundView2.setTag(null);
        this.uploadFileButton.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.isLoading == variableId) {
            setIsLoading((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setIsLoading(@Nullable java.lang.Boolean IsLoading) {
        this.mIsLoading = IsLoading;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxIsLoading = false;
        int isLoadingViewGONEViewVISIBLE = 0;
        int isLoadingViewVISIBLEViewGONE = 0;
        java.lang.Boolean isLoading = mIsLoading;

        if ((dirtyFlags & 0x3L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isLoading)
                androidxDatabindingViewDataBindingSafeUnboxIsLoading = androidx.databinding.ViewDataBinding.safeUnbox(isLoading);
            if((dirtyFlags & 0x3L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsLoading) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.GONE : View.VISIBLE
                isLoadingViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxIsLoading) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.VISIBLE : View.GONE
                isLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsLoading) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(isLoadingViewVISIBLEViewGONE);
            this.uploadFileButton.setVisibility(isLoadingViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): isLoading
        flag 1 (0x2L): null
        flag 2 (0x3L): androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.GONE : View.VISIBLE
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.GONE : View.VISIBLE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}