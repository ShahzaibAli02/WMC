package no.wmc.ui.registration;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\'H\u0002J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020+H\u0002J\n\u0010-\u001a\u0004\u0018\u00010\'H\u0002J\u0006\u0010.\u001a\u00020+J\u0016\u0010/\u001a\u00020+2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\'01H\u0002J\u0016\u00102\u001a\u00020+2\f\u00100\u001a\b\u0012\u0004\u0012\u00020+01H\u0002J\u0016\u00103\u001a\u00020+2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001b01H\u0002J\u0010\u00104\u001a\u00020+2\u0006\u00105\u001a\u000206H\u0014J\b\u00107\u001a\u00020+H\u0002J\u0010\u00108\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u00010\'J\u001a\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010?\u001a\u00020+H\u0003J\b\u0010@\u001a\u00020+H\u0002J\b\u0010A\u001a\u00020+H\u0002J\b\u0010B\u001a\u00020+H\u0002J\b\u0010C\u001a\u00020+H\u0002J\b\u0010D\u001a\u00020+H\u0002J\u0010\u0010E\u001a\u00020+2\u0006\u0010)\u001a\u00020\'H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2 = {"Lno/wmc/ui/registration/RegisterFragment;", "Lno/wmc/ui/base/BaseViewStateFragment;", "Lno/wmc/databinding/FragmentRegisterBinding;", "Lno/wmc/ui/registration/RegisterViewModel;", "()V", "activeView", "", "args", "Lno/wmc/ui/registration/RegisterFragmentArgs;", "getArgs", "()Lno/wmc/ui/registration/RegisterFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "emailTypeDelayTimer", "Landroid/os/CountDownTimer;", "emergencyContactsAdapter", "Lno/wmc/ui/common_adapters/EmergencyContactAdapter;", "getEmergencyContactsAdapter", "()Lno/wmc/ui/common_adapters/EmergencyContactAdapter;", "emergencyContactsAdapter$delegate", "Lkotlin/Lazy;", "insuranceAdapter", "Lno/wmc/ui/common_adapters/InsuranceAdapter;", "getInsuranceAdapter", "()Lno/wmc/ui/common_adapters/InsuranceAdapter;", "insuranceAdapter$delegate", "isFromGoogleSignIn", "", "profile", "Lno/wmc/domain/model/Profile;", "getProfile", "()Lno/wmc/domain/model/Profile;", "setProfile", "(Lno/wmc/domain/model/Profile;)V", "ssnPicker", "Lme/ibrahimsn/lib/PhoneNumberKit;", "tlfNrPicker", "tlfNrPicker2", "userFireStoreCollectionId", "", "calculatePasswordStrength", "password", "checkFieldsNotEmpty", "", "formValidation", "getMemberSince", "groupPersonalInfo", "handleAddUserFireStoreAction", "viewState", "Lno/wmc/ui/base/ViewState;", "handleCreateUserInFireBaseAuthAction", "handleIsValidEmail", "handleViewAction", "viewAction", "Lno/wmc/ui/base/ViewAction;", "initView", "isValidSSN", "str", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "pickDate", "prepareData", "setUpCountryPicker", "switchView", "updateCard", "updatePasswordInFirebaseAuth", "updatePasswordStrength", "wmc-3.1.40-b11_prodRelease"})
public final class RegisterFragment extends no.wmc.ui.base.BaseViewStateFragment<no.wmc.databinding.FragmentRegisterBinding, no.wmc.ui.registration.RegisterViewModel> {
    private int activeView = 0;
    private me.ibrahimsn.lib.PhoneNumberKit tlfNrPicker;
    private me.ibrahimsn.lib.PhoneNumberKit tlfNrPicker2;
    private me.ibrahimsn.lib.PhoneNumberKit ssnPicker;
    private java.lang.String userFireStoreCollectionId;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private boolean isFromGoogleSignIn = false;
    private final kotlin.Lazy insuranceAdapter$delegate = null;
    private final kotlin.Lazy emergencyContactsAdapter$delegate = null;
    private android.os.CountDownTimer emailTypeDelayTimer;
    @org.jetbrains.annotations.Nullable
    private no.wmc.domain.model.Profile profile;
    
    public RegisterFragment() {
        super(0, null);
    }
    
    private final no.wmc.ui.registration.RegisterFragmentArgs getArgs() {
        return null;
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
    
    private final void initView() {
    }
    
    private final void updateCard() {
    }
    
    private final void setUpCountryPicker() {
    }
    
    private final void switchView() {
    }
    
    private final void checkFieldsNotEmpty() {
    }
    
    private final void formValidation() {
    }
    
    private final void updatePasswordStrength(java.lang.String password) {
    }
    
    private final int calculatePasswordStrength(java.lang.String password) {
        return 0;
    }
    
    public final boolean isValidSSN(@org.jetbrains.annotations.Nullable
    java.lang.String str) {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    private final void pickDate() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.domain.model.Profile getProfile() {
        return null;
    }
    
    public final void setProfile(@org.jetbrains.annotations.Nullable
    no.wmc.domain.model.Profile p0) {
    }
    
    private final void prepareData() {
    }
    
    private final java.lang.String getMemberSince() {
        return null;
    }
    
    @java.lang.Override
    protected void handleViewAction(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewAction viewAction) {
    }
    
    private final void handleAddUserFireStoreAction(no.wmc.ui.base.ViewState<java.lang.String> viewState) {
    }
    
    private final void updatePasswordInFirebaseAuth() {
    }
    
    private final void handleCreateUserInFireBaseAuthAction(no.wmc.ui.base.ViewState<kotlin.Unit> viewState) {
    }
    
    private final void handleIsValidEmail(no.wmc.ui.base.ViewState<java.lang.Boolean> viewState) {
    }
    
    public final void groupPersonalInfo() {
    }
}