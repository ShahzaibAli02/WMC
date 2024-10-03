package no.wmc.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010$\u001a\u00020%H\u0002J\u0016\u0010&\u001a\u00020%2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002J\u0016\u0010*\u001a\u00020%2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020%0(H\u0002J\u0016\u0010+\u001a\u00020%2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020,0(H\u0002J\u0010\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020/H\u0014J\b\u00100\u001a\u00020%H\u0002J\u001a\u00101\u001a\u00020%2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u00020%H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\n\u001a\u0004\b!\u0010\"\u00a8\u00067"}, d2 = {"Lno/wmc/ui/login/LoginFragment;", "Lno/wmc/ui/base/BaseViewStateFragment;", "Lno/wmc/databinding/LoginScreenNewBinding;", "Lno/wmc/ui/login/LoginViewModel;", "()V", "bioMetricAuth", "Lno/wmc/utils/BioMetricAuth;", "getBioMetricAuth", "()Lno/wmc/utils/BioMetricAuth;", "bioMetricAuth$delegate", "Lkotlin/Lazy;", "credential", "Lno/wmc/domain/model/Credential;", "getCredential", "()Lno/wmc/domain/model/Credential;", "setCredential", "(Lno/wmc/domain/model/Credential;)V", "googleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "getGoogleSignInClient", "()Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "googleSignInClient$delegate", "googleSignInResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "gso", "Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;", "getGso", "()Lcom/google/android/gms/auth/api/signin/GoogleSignInOptions;", "gso$delegate", "localDataManager", "Lno/wmc/data/local/manager/LocalDataManager;", "getLocalDataManager", "()Lno/wmc/data/local/manager/LocalDataManager;", "localDataManager$delegate", "checkFieldsNotEmpty", "", "handleAuthWithEmailAndPasswordAction", "viewState", "Lno/wmc/ui/base/ViewState;", "Lno/wmc/data/remote/model/FirebaseAuthResult;", "handleAuthWithGoogleViewAction", "handleGetProfileAction", "Lno/wmc/domain/model/Profile;", "handleViewAction", "viewAction", "Lno/wmc/ui/base/ViewAction;", "initViews", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "requestCredentials", "wmc-3.1.40-b11_prodRelease"})
public final class LoginFragment extends no.wmc.ui.base.BaseViewStateFragment<no.wmc.databinding.LoginScreenNewBinding, no.wmc.ui.login.LoginViewModel> {
    private final kotlin.Lazy localDataManager$delegate = null;
    private final kotlin.Lazy gso$delegate = null;
    private final kotlin.Lazy googleSignInClient$delegate = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> googleSignInResult = null;
    private final kotlin.Lazy bioMetricAuth$delegate = null;
    @org.jetbrains.annotations.Nullable
    private no.wmc.domain.model.Credential credential;
    
    public LoginFragment() {
        super(0, null);
    }
    
    private final no.wmc.data.local.manager.LocalDataManager getLocalDataManager() {
        return null;
    }
    
    private final com.google.android.gms.auth.api.signin.GoogleSignInOptions getGso() {
        return null;
    }
    
    private final com.google.android.gms.auth.api.signin.GoogleSignInClient getGoogleSignInClient() {
        return null;
    }
    
    private final no.wmc.utils.BioMetricAuth getBioMetricAuth() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.domain.model.Credential getCredential() {
        return null;
    }
    
    public final void setCredential(@org.jetbrains.annotations.Nullable
    no.wmc.domain.model.Credential p0) {
    }
    
    private final void requestCredentials() {
    }
    
    private final void initViews() {
    }
    
    private final void checkFieldsNotEmpty() {
    }
    
    @java.lang.Override
    protected void handleViewAction(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewAction viewAction) {
    }
    
    private final void handleAuthWithGoogleViewAction(no.wmc.ui.base.ViewState<kotlin.Unit> viewState) {
    }
    
    private final void handleAuthWithEmailAndPasswordAction(no.wmc.ui.base.ViewState<no.wmc.data.remote.model.FirebaseAuthResult> viewState) {
    }
    
    private final void handleGetProfileAction(no.wmc.ui.base.ViewState<no.wmc.domain.model.Profile> viewState) {
    }
}