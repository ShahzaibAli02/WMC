package no.wmc.databinding;
import no.wmc.R;
import no.wmc.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RegisterScreenBindingImpl extends RegisterScreenBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.loading, 1);
        sViewsWithIds.put(R.id.toolbar, 2);
        sViewsWithIds.put(R.id.startGuideline, 3);
        sViewsWithIds.put(R.id.endGuideline, 4);
        sViewsWithIds.put(R.id.title, 5);
        sViewsWithIds.put(R.id.registerByline, 6);
        sViewsWithIds.put(R.id.googleButton, 7);
        sViewsWithIds.put(R.id.screenDivider, 8);
        sViewsWithIds.put(R.id.email, 9);
        sViewsWithIds.put(R.id.password, 10);
        sViewsWithIds.put(R.id.passwordMinHint, 11);
        sViewsWithIds.put(R.id.createAccountButton, 12);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RegisterScreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private RegisterScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[12]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            , (androidx.constraintlayout.widget.Guideline) bindings[4]
            , (com.google.android.material.button.MaterialButton) bindings[7]
            , (android.view.View) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[6]
            , (android.view.View) bindings[8]
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (androidx.appcompat.widget.Toolbar) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}