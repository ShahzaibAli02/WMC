package no.wmc.ui.otp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u001cH\u0002J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020\u001cH\u0002J\u0012\u0010\'\u001a\u00020\u001c2\b\b\u0002\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006,"}, d2 = {"Lno/wmc/ui/otp/OTPFragment;", "Lno/wmc/ui/base/BaseViewStateFragment;", "Lno/wmc/databinding/FragmentOtpNewBinding;", "Lno/wmc/ui/login/LoginViewModel;", "()V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "callbacks", "Lcom/google/firebase/auth/PhoneAuthProvider$OnVerificationStateChangedCallbacks;", "margs", "Lno/wmc/ui/otp/OTPFragmentArgs;", "getMargs", "()Lno/wmc/ui/otp/OTPFragmentArgs;", "margs$delegate", "Landroidx/navigation/NavArgsLazy;", "phone", "", "resendToken", "Lcom/google/firebase/auth/PhoneAuthProvider$ForceResendingToken;", "storedVerificationId", "timer", "Landroid/os/CountDownTimer;", "getTimer", "()Landroid/os/CountDownTimer;", "setTimer", "(Landroid/os/CountDownTimer;)V", "getCountryCode", "onDestroyView", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "resendVerificationCode", "signInWithPhoneAuthCredential", "credential", "Lcom/google/firebase/auth/PhoneAuthCredential;", "startPhoneNumberVerification", "startStopTimerAndDisableButton", "isShow", "", "verifyVerificationCodeManually", "code", "wmc-3.1.40-b11_prodRelease"})
public final class OTPFragment extends no.wmc.ui.base.BaseViewStateFragment<no.wmc.databinding.FragmentOtpNewBinding, no.wmc.ui.login.LoginViewModel> {
    private final androidx.navigation.NavArgsLazy margs$delegate = null;
    private com.google.firebase.auth.FirebaseAuth auth;
    private com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken resendToken;
    private com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks callbacks;
    private java.lang.String storedVerificationId = "";
    private java.lang.String phone = "";
    @org.jetbrains.annotations.NotNull
    private android.os.CountDownTimer timer;
    
    public OTPFragment() {
        super(0, null);
    }
    
    private final no.wmc.ui.otp.OTPFragmentArgs getMargs() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCountryCode(@org.jetbrains.annotations.NotNull
    java.lang.String phone) {
        return null;
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    private final void verifyVerificationCodeManually(java.lang.String code) {
    }
    
    private final void signInWithPhoneAuthCredential(com.google.firebase.auth.PhoneAuthCredential credential) {
    }
    
    private final void startStopTimerAndDisableButton(boolean isShow) {
    }
    
    private final void startPhoneNumberVerification() {
    }
    
    private final void resendVerificationCode() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.os.CountDownTimer getTimer() {
        return null;
    }
    
    public final void setTimer(@org.jetbrains.annotations.NotNull
    android.os.CountDownTimer p0) {
    }
}