package no.wmc.databinding;
import no.wmc.R;
import no.wmc.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentRegisterBindingImpl extends FragmentRegisterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(52);
        sIncludes.setIncludes(1, 
            new String[] {"lyt_new_card"},
            new int[] {3},
            new int[] {no.wmc.R.layout.lyt_new_card});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.loading, 2);
        sViewsWithIds.put(R.id.toolbar, 4);
        sViewsWithIds.put(R.id.startGuideline, 5);
        sViewsWithIds.put(R.id.endGuideline, 6);
        sViewsWithIds.put(R.id.btnPersonalInfo, 7);
        sViewsWithIds.put(R.id.btnPostalAddress, 8);
        sViewsWithIds.put(R.id.btnInsurance, 9);
        sViewsWithIds.put(R.id.btnForEmergency, 10);
        sViewsWithIds.put(R.id.labelPersonalInfo, 11);
        sViewsWithIds.put(R.id.labelPersonalInfoSubTitle, 12);
        sViewsWithIds.put(R.id.firstName, 13);
        sViewsWithIds.put(R.id.lastName, 14);
        sViewsWithIds.put(R.id.dateOfBirth, 15);
        sViewsWithIds.put(R.id.gender, 16);
        sViewsWithIds.put(R.id.mtCard, 17);
        sViewsWithIds.put(R.id.cprFlag, 18);
        sViewsWithIds.put(R.id.cprNumber, 19);
        sViewsWithIds.put(R.id.nationality, 20);
        sViewsWithIds.put(R.id.relationship, 21);
        sViewsWithIds.put(R.id.tlfNr, 22);
        sViewsWithIds.put(R.id.tlfNr2, 23);
        sViewsWithIds.put(R.id.email, 24);
        sViewsWithIds.put(R.id.password, 25);
        sViewsWithIds.put(R.id.lyt_pass_strength, 26);
        sViewsWithIds.put(R.id.passwordStrengthProgressBar, 27);
        sViewsWithIds.put(R.id.passwordStrengthTextView, 28);
        sViewsWithIds.put(R.id.labelTitleOrganDonor, 29);
        sViewsWithIds.put(R.id.tlfNrOrganDonor, 30);
        sViewsWithIds.put(R.id.labelWarning, 31);
        sViewsWithIds.put(R.id.groupPersonalInfo, 32);
        sViewsWithIds.put(R.id.labelPostalAddress, 33);
        sViewsWithIds.put(R.id.labelPostalAddressSubTitle, 34);
        sViewsWithIds.put(R.id.postalAddress, 35);
        sViewsWithIds.put(R.id.postalCode, 36);
        sViewsWithIds.put(R.id.city, 37);
        sViewsWithIds.put(R.id.country, 38);
        sViewsWithIds.put(R.id.groupPostalAddress, 39);
        sViewsWithIds.put(R.id.labelInsurance, 40);
        sViewsWithIds.put(R.id.labelInsuranceSubTitle, 41);
        sViewsWithIds.put(R.id.nestedScrollView, 42);
        sViewsWithIds.put(R.id.recyclerInsurance, 43);
        sViewsWithIds.put(R.id.groupInsurance, 44);
        sViewsWithIds.put(R.id.labelEmergency, 45);
        sViewsWithIds.put(R.id.labelEmergencySubTitle, 46);
        sViewsWithIds.put(R.id.nestedScrollView2, 47);
        sViewsWithIds.put(R.id.recyclerEmergency, 48);
        sViewsWithIds.put(R.id.groupEmergencyContact, 49);
        sViewsWithIds.put(R.id.barrier, 50);
        sViewsWithIds.put(R.id.next, 51);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 52, sIncludes, sViewsWithIds));
    }
    private FragmentRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Barrier) bindings[50]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[37]
            , (com.google.android.material.textfield.TextInputLayout) bindings[38]
            , (com.google.android.material.textfield.TextInputLayout) bindings[18]
            , (com.google.android.material.textfield.TextInputLayout) bindings[19]
            , (com.google.android.material.textfield.TextInputLayout) bindings[15]
            , (com.google.android.material.textfield.TextInputLayout) bindings[24]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[13]
            , (com.google.android.material.textfield.TextInputLayout) bindings[16]
            , (androidx.constraintlayout.widget.Group) bindings[49]
            , (androidx.constraintlayout.widget.Group) bindings[44]
            , (androidx.constraintlayout.widget.Group) bindings[32]
            , (androidx.constraintlayout.widget.Group) bindings[39]
            , (android.widget.TextView) bindings[45]
            , (android.widget.TextView) bindings[46]
            , (android.widget.TextView) bindings[40]
            , (android.widget.TextView) bindings[41]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[33]
            , (android.widget.TextView) bindings[34]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[31]
            , (com.google.android.material.textfield.TextInputLayout) bindings[14]
            , (android.view.View) bindings[2]
            , (android.widget.LinearLayout) bindings[26]
            , (android.widget.FrameLayout) bindings[17]
            , (com.google.android.material.textfield.TextInputLayout) bindings[20]
            , (androidx.core.widget.NestedScrollView) bindings[42]
            , (androidx.core.widget.NestedScrollView) bindings[47]
            , (no.wmc.databinding.LytNewCardBinding) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[51]
            , (com.google.android.material.textfield.TextInputLayout) bindings[25]
            , (android.widget.ProgressBar) bindings[27]
            , (android.widget.TextView) bindings[28]
            , (com.google.android.material.textfield.TextInputLayout) bindings[35]
            , (com.google.android.material.textfield.TextInputLayout) bindings[36]
            , (androidx.recyclerview.widget.RecyclerView) bindings[48]
            , (androidx.recyclerview.widget.RecyclerView) bindings[43]
            , (com.google.android.material.textfield.TextInputLayout) bindings[21]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[22]
            , (com.google.android.material.textfield.TextInputLayout) bindings[23]
            , (com.google.android.material.textfield.TextInputLayout) bindings[30]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
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