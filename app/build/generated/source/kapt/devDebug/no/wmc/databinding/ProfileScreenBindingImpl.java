package no.wmc.databinding;
import no.wmc.R;
import no.wmc.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ProfileScreenBindingImpl extends ProfileScreenBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.loading, 7);
        sViewsWithIds.put(R.id.toolbar, 8);
        sViewsWithIds.put(R.id.termsScrollView, 9);
        sViewsWithIds.put(R.id.title, 10);
        sViewsWithIds.put(R.id.byline, 11);
        sViewsWithIds.put(R.id.inputEmail, 12);
        sViewsWithIds.put(R.id.firstName, 13);
        sViewsWithIds.put(R.id.lastName, 14);
        sViewsWithIds.put(R.id.birthDate, 15);
        sViewsWithIds.put(R.id.gender, 16);
        sViewsWithIds.put(R.id.genderSpinner, 17);
        sViewsWithIds.put(R.id.mtCard, 18);
        sViewsWithIds.put(R.id.cprFlag, 19);
        sViewsWithIds.put(R.id.cprNumber, 20);
        sViewsWithIds.put(R.id.nationality, 21);
        sViewsWithIds.put(R.id.relationship, 22);
        sViewsWithIds.put(R.id.phone, 23);
        sViewsWithIds.put(R.id.phone2, 24);
        sViewsWithIds.put(R.id.donorQuestion, 25);
        sViewsWithIds.put(R.id.donorSelector, 26);
        sViewsWithIds.put(R.id.donorSpinner, 27);
        sViewsWithIds.put(R.id.donorNote, 28);
        sViewsWithIds.put(R.id.postalAddressTitle, 29);
        sViewsWithIds.put(R.id.postalByline, 30);
        sViewsWithIds.put(R.id.postalCode, 31);
        sViewsWithIds.put(R.id.city, 32);
        sViewsWithIds.put(R.id.country, 33);
        sViewsWithIds.put(R.id.street, 34);
        sViewsWithIds.put(R.id.insuranceTitle, 35);
        sViewsWithIds.put(R.id.insuranceByline, 36);
        sViewsWithIds.put(R.id.nestedScrollView, 37);
        sViewsWithIds.put(R.id.recyclerInsurance, 38);
        sViewsWithIds.put(R.id.emergencyContactsTitle, 39);
        sViewsWithIds.put(R.id.emergencyContactsByline, 40);
        sViewsWithIds.put(R.id.nestedScrollView2, 41);
        sViewsWithIds.put(R.id.recyclerEmergency, 42);
        sViewsWithIds.put(R.id.otherTitle, 43);
        sViewsWithIds.put(R.id.otherInfoField, 44);
        sViewsWithIds.put(R.id.saveButton, 45);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView1;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView3;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    @NonNull
    private final android.widget.AutoCompleteTextView mboundView5;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ProfileScreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 46, sIncludes, sViewsWithIds));
    }
    private ProfileScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.textfield.TextInputLayout) bindings[15]
            , (android.widget.TextView) bindings[11]
            , (com.google.android.material.textfield.TextInputLayout) bindings[32]
            , (com.google.android.material.textfield.TextInputLayout) bindings[33]
            , (com.google.android.material.textfield.TextInputLayout) bindings[19]
            , (com.google.android.material.textfield.TextInputLayout) bindings[20]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[25]
            , (com.google.android.material.textfield.TextInputLayout) bindings[26]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[27]
            , (android.widget.TextView) bindings[40]
            , (android.widget.TextView) bindings[39]
            , (com.google.android.material.textfield.TextInputLayout) bindings[13]
            , (com.google.android.material.textfield.TextInputLayout) bindings[16]
            , (androidx.appcompat.widget.AppCompatSpinner) bindings[17]
            , (com.google.android.material.textfield.TextInputLayout) bindings[12]
            , (android.widget.TextView) bindings[36]
            , (android.widget.TextView) bindings[35]
            , (com.google.android.material.textfield.TextInputLayout) bindings[14]
            , (android.view.View) bindings[7]
            , (android.widget.FrameLayout) bindings[18]
            , (com.google.android.material.textfield.TextInputLayout) bindings[21]
            , (androidx.core.widget.NestedScrollView) bindings[37]
            , (androidx.core.widget.NestedScrollView) bindings[41]
            , (com.google.android.material.textfield.TextInputLayout) bindings[44]
            , (android.widget.TextView) bindings[43]
            , (com.google.android.material.textfield.TextInputLayout) bindings[23]
            , (com.google.android.material.textfield.TextInputLayout) bindings[24]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[30]
            , (com.google.android.material.textfield.TextInputLayout) bindings[31]
            , (androidx.recyclerview.widget.RecyclerView) bindings[42]
            , (androidx.recyclerview.widget.RecyclerView) bindings[38]
            , (com.google.android.material.textfield.TextInputLayout) bindings[22]
            , (com.google.android.material.button.MaterialButton) bindings[45]
            , (com.google.android.material.textfield.TextInputLayout) bindings[34]
            , (android.widget.ScrollView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (androidx.appcompat.widget.Toolbar) bindings[8]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputEditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.textfield.TextInputEditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.AutoCompleteTextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (com.google.android.material.textfield.TextInputEditText) bindings[6];
        this.mboundView6.setTag(null);
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
        if (BR.profile == variableId) {
            setProfile((no.wmc.domain.model.Profile) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProfile(@Nullable no.wmc.domain.model.Profile Profile) {
        this.mProfile = Profile;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.profile);
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
        java.lang.String profileNationality = null;
        no.wmc.domain.model.Profile profile = mProfile;
        java.lang.String profileLastName = null;
        java.lang.String profileOtherInfo = null;
        java.lang.String profileEmail = null;
        java.lang.String profileRelationShip = null;
        java.lang.String profileFirstName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (profile != null) {
                    // read profile.nationality
                    profileNationality = profile.getNationality();
                    // read profile.lastName
                    profileLastName = profile.getLastName();
                    // read profile.otherInfo
                    profileOtherInfo = profile.getOtherInfo();
                    // read profile.email
                    profileEmail = profile.getEmail();
                    // read profile.relationShip
                    profileRelationShip = profile.getRelationShip();
                    // read profile.firstName
                    profileFirstName = profile.getFirstName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, profileEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, profileFirstName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, profileLastName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, profileNationality);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, profileRelationShip);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, profileOtherInfo);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): profile
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}