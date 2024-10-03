package no.wmc.databinding;
import no.wmc.R;
import no.wmc.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LoginScreenNewBindingImpl extends LoginScreenNewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.loading, 1);
        sViewsWithIds.put(R.id.title, 2);
        sViewsWithIds.put(R.id.subtitle, 3);
        sViewsWithIds.put(R.id.email, 4);
        sViewsWithIds.put(R.id.userEmailField, 5);
        sViewsWithIds.put(R.id.password, 6);
        sViewsWithIds.put(R.id.userPasswordField, 7);
        sViewsWithIds.put(R.id.resetPasswordButton, 8);
        sViewsWithIds.put(R.id.rememberMeCheckBox, 9);
        sViewsWithIds.put(R.id.loginButton, 10);
        sViewsWithIds.put(R.id.imageFaceRecogniton, 11);
        sViewsWithIds.put(R.id.imageBioMetric, 12);
        sViewsWithIds.put(R.id.sepratorBioMetric, 13);
        sViewsWithIds.put(R.id.googleButton, 14);
        sViewsWithIds.put(R.id.signUp, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LoginScreenNewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private LoginScreenNewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[11]
            , (android.view.View) bindings[1]
            , (com.google.android.material.button.MaterialButton) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (android.widget.CheckBox) bindings[9]
            , (com.google.android.material.button.MaterialButton) bindings[8]
            , (android.view.View) bindings[13]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
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