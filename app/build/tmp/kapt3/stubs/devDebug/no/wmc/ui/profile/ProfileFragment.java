package no.wmc.ui.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\u000f\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002\u00a2\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u001eH\u0002J\n\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002J\b\u0010&\u001a\u00020\'H\u0002J\u0010\u0010(\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010$H\u0002J\n\u0010*\u001a\u0004\u0018\u00010+H\u0002J\u0016\u0010,\u001a\u00020\u00182\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\u0016\u00100\u001a\u00020\u00182\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00180.H\u0002J\u0010\u00101\u001a\u00020\u00182\u0006\u00102\u001a\u000203H\u0014J\b\u00104\u001a\u00020\u0018H\u0002J\b\u00105\u001a\u00020\'H\u0002J\u0010\u00106\u001a\u00020\'2\b\u00107\u001a\u0004\u0018\u00010\"J\u001a\u00108\u001a\u00020\u00182\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0018\u0010=\u001a\u00020\'2\u0006\u0010>\u001a\u00020\u001a2\b\b\u0002\u0010?\u001a\u00020\"R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lno/wmc/ui/profile/ProfileFragment;", "Lno/wmc/ui/base/BaseViewStateFragment;", "Lno/wmc/databinding/ProfileScreenBinding;", "Lno/wmc/ui/profile/ProfileViewModel;", "()V", "emergencyContactsAdapter", "Lno/wmc/ui/common_adapters/EmergencyContactAdapter;", "getEmergencyContactsAdapter", "()Lno/wmc/ui/common_adapters/EmergencyContactAdapter;", "emergencyContactsAdapter$delegate", "Lkotlin/Lazy;", "insuranceAdapter", "Lno/wmc/ui/common_adapters/InsuranceAdapter;", "getInsuranceAdapter", "()Lno/wmc/ui/common_adapters/InsuranceAdapter;", "insuranceAdapter$delegate", "mPhonePicker", "Lme/ibrahimsn/lib/PhoneNumberKit;", "getMPhonePicker", "()Lme/ibrahimsn/lib/PhoneNumberKit;", "setMPhonePicker", "(Lme/ibrahimsn/lib/PhoneNumberKit;)V", "tlfNrPicker", "attachPhoneNumberPicker", "", "phone", "Lcom/google/android/material/textfield/TextInputLayout;", "attachPhoneNumberPicker1", "clearErrorAfterInput", "getBirthdayInstant", "", "()Ljava/lang/Long;", "getBirthdaySelected", "getBirthdayString", "", "getEmergencyContactsItems", "", "Lno/wmc/domain/model/Profile$EmergencyContact;", "getOrganDonation", "", "getPostalAddress", "Lno/wmc/domain/model/Profile$PostalAddress;", "getSelectedGender", "Lno/wmc/domain/model/Profile$Gender;", "handleGetProfileAction", "viewState", "Lno/wmc/ui/base/ViewState;", "Lno/wmc/domain/model/Profile;", "handleUpdateProfileAction", "handleViewAction", "viewAction", "Lno/wmc/ui/base/ViewAction;", "initViews", "isValid", "isValidSSN", "str", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "validate", "field", "errorMsg", "wmc-3.1.40-b11_devDebug"})
public final class ProfileFragment extends no.wmc.ui.base.BaseViewStateFragment<no.wmc.databinding.ProfileScreenBinding, no.wmc.ui.profile.ProfileViewModel> {
    private final kotlin.Lazy insuranceAdapter$delegate = null;
    private final kotlin.Lazy emergencyContactsAdapter$delegate = null;
    public me.ibrahimsn.lib.PhoneNumberKit mPhonePicker;
    private me.ibrahimsn.lib.PhoneNumberKit tlfNrPicker;
    
    public ProfileFragment() {
        super(0, null);
    }
    
    private final no.wmc.ui.common_adapters.InsuranceAdapter getInsuranceAdapter() {
        return null;
    }
    
    private final no.wmc.ui.common_adapters.EmergencyContactAdapter getEmergencyContactsAdapter() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
    
    private final java.util.List<no.wmc.domain.model.Profile.EmergencyContact> getEmergencyContactsItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final me.ibrahimsn.lib.PhoneNumberKit getMPhonePicker() {
        return null;
    }
    
    public final void setMPhonePicker(@org.jetbrains.annotations.NotNull
    me.ibrahimsn.lib.PhoneNumberKit p0) {
    }
    
    private final void attachPhoneNumberPicker1(com.google.android.material.textfield.TextInputLayout phone) {
    }
    
    private final void attachPhoneNumberPicker(com.google.android.material.textfield.TextInputLayout phone) {
    }
    
    private final boolean isValid() {
        return false;
    }
    
    public final boolean validate(@org.jetbrains.annotations.NotNull
    com.google.android.material.textfield.TextInputLayout field, @org.jetbrains.annotations.NotNull
    java.lang.String errorMsg) {
        return false;
    }
    
    @java.lang.Override
    protected void handleViewAction(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewAction viewAction) {
    }
    
    public final boolean isValidSSN(@org.jetbrains.annotations.Nullable
    java.lang.String str) {
        return false;
    }
    
    private final void handleGetProfileAction(no.wmc.ui.base.ViewState<no.wmc.domain.model.Profile> viewState) {
    }
    
    private final void handleUpdateProfileAction(no.wmc.ui.base.ViewState<kotlin.Unit> viewState) {
    }
    
    private final java.lang.Long getBirthdayInstant() {
        return null;
    }
    
    private final java.lang.String getBirthdayString() {
        return null;
    }
    
    private final no.wmc.domain.model.Profile.Gender getSelectedGender() {
        return null;
    }
    
    private final boolean getOrganDonation() {
        return false;
    }
    
    private final java.util.List<no.wmc.domain.model.Profile.PostalAddress> getPostalAddress() {
        return null;
    }
    
    private final long getBirthdaySelected() {
        return 0L;
    }
    
    private final void clearErrorAfterInput() {
    }
}