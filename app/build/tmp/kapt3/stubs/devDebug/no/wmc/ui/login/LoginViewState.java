package no.wmc.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lno/wmc/ui/login/LoginViewState;", "", "()V", "googleAccount", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "getGoogleAccount", "()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "setGoogleAccount", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V", "profile", "Lno/wmc/domain/model/Profile;", "getProfile", "()Lno/wmc/domain/model/Profile;", "setProfile", "(Lno/wmc/domain/model/Profile;)V", "wmc-3.1.40-b11_devDebug"})
public final class LoginViewState {
    @org.jetbrains.annotations.Nullable
    private no.wmc.domain.model.Profile profile;
    @org.jetbrains.annotations.Nullable
    private com.google.android.gms.auth.api.signin.GoogleSignInAccount googleAccount;
    
    public LoginViewState() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.domain.model.Profile getProfile() {
        return null;
    }
    
    public final void setProfile(@org.jetbrains.annotations.Nullable
    no.wmc.domain.model.Profile p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount getGoogleAccount() {
        return null;
    }
    
    public final void setGoogleAccount(@org.jetbrains.annotations.Nullable
    com.google.android.gms.auth.api.signin.GoogleSignInAccount p0) {
    }
}