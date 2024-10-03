package no.wmc.databinding;
import no.wmc.R;
import no.wmc.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ProfileExpandableCardBindingImpl extends ProfileExpandableCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.profileTitle, 12);
        sViewsWithIds.put(R.id.description, 13);
        sViewsWithIds.put(R.id.profileExpandButton, 14);
        sViewsWithIds.put(R.id.personalInfo, 15);
        sViewsWithIds.put(R.id.topDivider, 16);
        sViewsWithIds.put(R.id.birthdateTitle, 17);
        sViewsWithIds.put(R.id.birthdate, 18);
        sViewsWithIds.put(R.id.genderTitle, 19);
        sViewsWithIds.put(R.id.gender, 20);
        sViewsWithIds.put(R.id.organDonorTitle, 21);
        sViewsWithIds.put(R.id.ssnTitle, 22);
        sViewsWithIds.put(R.id.nationalityTitle, 23);
        sViewsWithIds.put(R.id.phoneTitle, 24);
        sViewsWithIds.put(R.id.addressTitle, 25);
        sViewsWithIds.put(R.id.insuranceDivider, 26);
        sViewsWithIds.put(R.id.travelInsuranceTitle, 27);
        sViewsWithIds.put(R.id.policyNumberTitle, 28);
        sViewsWithIds.put(R.id.alarmPhoneTitle, 29);
        sViewsWithIds.put(R.id.emergencyContactsDivider, 30);
        sViewsWithIds.put(R.id.emergencyContactsTitle, 31);
        sViewsWithIds.put(R.id.otherInfoDivider, 32);
        sViewsWithIds.put(R.id.otherInfoTitle, 33);
        sViewsWithIds.put(R.id.editOptionGroup, 34);
        sViewsWithIds.put(R.id.editDivider, 35);
        sViewsWithIds.put(R.id.tapEditToComplete, 36);
        sViewsWithIds.put(R.id.editButton, 37);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ProfileExpandableCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 38, sIncludes, sViewsWithIds));
    }
    private ProfileExpandableCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[13]
            , (com.google.android.material.button.MaterialButton) bindings[37]
            , (android.view.View) bindings[35]
            , (androidx.constraintlayout.widget.Group) bindings[34]
            , (android.widget.TextView) bindings[10]
            , (android.view.View) bindings[30]
            , (android.widget.TextView) bindings[31]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[19]
            , (android.view.View) bindings[26]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[11]
            , (android.view.View) bindings[32]
            , (android.widget.TextView) bindings[33]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[15]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[24]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[28]
            , (android.widget.ImageView) bindings[1]
            , (com.google.android.material.card.MaterialCardView) bindings[0]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[36]
            , (android.view.View) bindings[16]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[27]
            );
        this.address.setTag(null);
        this.alarmPhone.setTag(null);
        this.emergencyContacts.setTag(null);
        this.nationality.setTag(null);
        this.organDonor.setTag(null);
        this.otherInfo.setTag(null);
        this.phone.setTag(null);
        this.policyNumber.setTag(null);
        this.profileAvatar.setTag(null);
        this.profileCard.setTag(null);
        this.ssn.setTag(null);
        this.travelInsurance.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.addressData == variableId) {
            setAddressData((java.lang.String) variable);
        }
        else if (BR.emergencyContactsData == variableId) {
            setEmergencyContactsData((java.lang.String) variable);
        }
        else if (BR.profileData == variableId) {
            setProfileData((no.wmc.domain.model.Profile) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAddressData(@Nullable java.lang.String AddressData) {
        this.mAddressData = AddressData;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.addressData);
        super.requestRebind();
    }
    public void setEmergencyContactsData(@Nullable java.lang.String EmergencyContactsData) {
        this.mEmergencyContactsData = EmergencyContactsData;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.emergencyContactsData);
        super.requestRebind();
    }
    public void setProfileData(@Nullable no.wmc.domain.model.Profile ProfileData) {
        this.mProfileData = ProfileData;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.profileData);
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
        java.util.List<no.wmc.domain.model.Profile.Insurance> profileDataInsurances = null;
        java.lang.String profileDataInsurances0Phone = null;
        java.lang.String addressData = mAddressData;
        boolean androidxDatabindingViewDataBindingSafeUnboxProfileDataOrganDonation = false;
        java.lang.String profileDataInsurances0Company = null;
        java.lang.String emergencyContactsData = mEmergencyContactsData;
        java.lang.String profileDataNationality = null;
        java.lang.String profileDataOrganDonationOrganDonorAndroidStringCommonYesOrganDonorAndroidStringCommonNo = null;
        no.wmc.domain.model.Profile.Insurance profileDataInsurances0 = null;
        java.lang.Boolean profileDataOrganDonation = null;
        java.lang.String profileDataAvatar = null;
        java.lang.String profileDataPhone = null;
        java.lang.String profileDataInsurances0Policy = null;
        java.lang.String profileDataOtherInfo = null;
        java.lang.String profileDataSsn = null;
        no.wmc.domain.model.Profile profileData = mProfileData;

        if ((dirtyFlags & 0x9L) != 0) {
        }
        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xcL) != 0) {



                if (profileData != null) {
                    // read profileData.insurances
                    profileDataInsurances = profileData.getInsurances();
                    // read profileData.nationality
                    profileDataNationality = profileData.getNationality();
                    // read profileData.organDonation
                    profileDataOrganDonation = profileData.getOrganDonation();
                    // read profileData.avatar
                    profileDataAvatar = profileData.getAvatar();
                    // read profileData.phone
                    profileDataPhone = profileData.getPhone();
                    // read profileData.otherInfo
                    profileDataOtherInfo = profileData.getOtherInfo();
                    // read profileData.ssn
                    profileDataSsn = profileData.getSsn();
                }


                if (profileDataInsurances != null) {
                    // read profileData.insurances[0]
                    profileDataInsurances0 = getFromList(profileDataInsurances, 0);
                }
                // read androidx.databinding.ViewDataBinding.safeUnbox(profileData.organDonation)
                androidxDatabindingViewDataBindingSafeUnboxProfileDataOrganDonation = androidx.databinding.ViewDataBinding.safeUnbox(profileDataOrganDonation);
            if((dirtyFlags & 0xcL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxProfileDataOrganDonation) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                if (profileDataInsurances0 != null) {
                    // read profileData.insurances[0].phone
                    profileDataInsurances0Phone = profileDataInsurances0.getPhone();
                    // read profileData.insurances[0].company
                    profileDataInsurances0Company = profileDataInsurances0.getCompany();
                    // read profileData.insurances[0].policy
                    profileDataInsurances0Policy = profileDataInsurances0.getPolicy();
                }
                // read androidx.databinding.ViewDataBinding.safeUnbox(profileData.organDonation) ? @android:string/common_yes : @android:string/common_no
                profileDataOrganDonationOrganDonorAndroidStringCommonYesOrganDonorAndroidStringCommonNo = ((androidxDatabindingViewDataBindingSafeUnboxProfileDataOrganDonation) ? (organDonor.getResources().getString(R.string.common_yes)) : (organDonor.getResources().getString(R.string.common_no)));
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.address, addressData);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.alarmPhone, profileDataInsurances0Phone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.nationality, profileDataNationality);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.organDonor, profileDataOrganDonationOrganDonorAndroidStringCommonYesOrganDonorAndroidStringCommonNo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.otherInfo, profileDataOtherInfo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.phone, profileDataPhone);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.policyNumber, profileDataInsurances0Policy);
            no.wmc.utils.ext.ImageViewExtKt.setAvatarImage(this.profileAvatar, profileDataAvatar);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ssn, profileDataSsn);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.travelInsurance, profileDataInsurances0Company);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.emergencyContacts, emergencyContactsData);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): addressData
        flag 1 (0x2L): emergencyContactsData
        flag 2 (0x3L): profileData
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(profileData.organDonation) ? @android:string/common_yes : @android:string/common_no
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(profileData.organDonation) ? @android:string/common_yes : @android:string/common_no
    flag mapping end*/
    //end
}