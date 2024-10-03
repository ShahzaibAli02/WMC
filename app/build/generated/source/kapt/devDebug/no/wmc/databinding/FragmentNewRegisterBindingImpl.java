package no.wmc.databinding;
import no.wmc.R;
import no.wmc.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentNewRegisterBindingImpl extends FragmentNewRegisterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(24);
        sIncludes.setIncludes(1, 
            new String[] {"lyt_new_card"},
            new int[] {3},
            new int[] {no.wmc.R.layout.lyt_new_card});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.loading, 2);
        sViewsWithIds.put(R.id.toolbar, 4);
        sViewsWithIds.put(R.id.btnPersonalInfo, 5);
        sViewsWithIds.put(R.id.btnPostalAddress, 6);
        sViewsWithIds.put(R.id.btnInsurance, 7);
        sViewsWithIds.put(R.id.btnForEmergency, 8);
        sViewsWithIds.put(R.id.labelPersonalInfo, 9);
        sViewsWithIds.put(R.id.labelPersonalInfoSubTitle, 10);
        sViewsWithIds.put(R.id.firstName, 11);
        sViewsWithIds.put(R.id.lastName, 12);
        sViewsWithIds.put(R.id.dateOfBirth, 13);
        sViewsWithIds.put(R.id.gender, 14);
        sViewsWithIds.put(R.id.cprNumber, 15);
        sViewsWithIds.put(R.id.nationality, 16);
        sViewsWithIds.put(R.id.tlfNr, 17);
        sViewsWithIds.put(R.id.email, 18);
        sViewsWithIds.put(R.id.password, 19);
        sViewsWithIds.put(R.id.labelTitleOrganDonor, 20);
        sViewsWithIds.put(R.id.tlfNrOrganDonor, 21);
        sViewsWithIds.put(R.id.labelWarning, 22);
        sViewsWithIds.put(R.id.next, 23);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentNewRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private FragmentNewRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[15]
            , (com.google.android.material.textfield.TextInputLayout) bindings[13]
            , (com.google.android.material.textfield.TextInputLayout) bindings[18]
            , (com.google.android.material.textfield.TextInputLayout) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[14]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[22]
            , (com.google.android.material.textfield.TextInputLayout) bindings[12]
            , (android.view.View) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[16]
            , (no.wmc.databinding.LytNewCardBinding) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[23]
            , (com.google.android.material.textfield.TextInputLayout) bindings[19]
            , (com.google.android.material.textfield.TextInputLayout) bindings[17]
            , (com.google.android.material.textfield.TextInputLayout) bindings[21]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        setContainedBinding(this.newCardDesign);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        newCardDesign.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (newCardDesign.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        newCardDesign.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeNewCardDesign((no.wmc.databinding.LytNewCardBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeNewCardDesign(no.wmc.databinding.LytNewCardBinding NewCardDesign, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        executeBindingsOn(newCardDesign);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): newCardDesign
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}