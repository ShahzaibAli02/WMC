package no.wmc.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\rJ\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lno/wmc/utils/BioMetricAuth;", "Landroid/content/ContextWrapper;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "authenticationCallback", "Landroidx/biometric/BiometricPrompt$AuthenticationCallback;", "biometricPrompt", "Landroidx/biometric/BiometricPrompt;", "getContext", "()Landroid/content/Context;", "onSuccess", "Lkotlin/Function0;", "", "getOnSuccess", "()Lkotlin/jvm/functions/Function0;", "setOnSuccess", "(Lkotlin/jvm/functions/Function0;)V", "promptInfo", "Landroidx/biometric/BiometricPrompt$PromptInfo;", "hideBiometricPrompt", "isAvailable", "", "showAuthDialog", "fragment", "Landroidx/fragment/app/Fragment;", "wmc-3.1.40-b11_prodRelease"})
public final class BioMetricAuth extends android.content.ContextWrapper {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    private androidx.biometric.BiometricPrompt biometricPrompt;
    private androidx.biometric.BiometricPrompt.PromptInfo promptInfo;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess;
    private final androidx.biometric.BiometricPrompt.AuthenticationCallback authenticationCallback = null;
    
    public BioMetricAuth(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnSuccess() {
        return null;
    }
    
    public final void setOnSuccess(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function0<kotlin.Unit> p0) {
    }
    
    public final boolean isAvailable() {
        return false;
    }
    
    public final void hideBiometricPrompt() {
    }
    
    public final void showAuthDialog(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment) {
    }
}