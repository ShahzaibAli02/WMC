package no.wmc.ui.medical;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001aJ\u0006\u0010\u001b\u001a\u00020\nJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001aJ\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001f"}, d2 = {"Lno/wmc/ui/medical/AddMedicalInfoViewState;", "", "()V", "currentKeyword", "", "getCurrentKeyword", "()Ljava/lang/String;", "setCurrentKeyword", "(Ljava/lang/String;)V", "isLoading", "", "()Z", "setLoading", "(Z)V", "medicalItems", "", "Lno/wmc/domain/model/ProfileItem$Item;", "page", "", "getPage", "()I", "setPage", "(I)V", "addProfileItems", "", "items", "", "canQuery", "getMedicalItems", "updateKeyword", "keyword", "wmc-3.1.40-b11_prodRelease"})
public final class AddMedicalInfoViewState {
    private int page = 1;
    private boolean isLoading = false;
    @org.jetbrains.annotations.NotNull
    private java.lang.String currentKeyword = "";
    private final java.util.List<no.wmc.domain.model.ProfileItem.Item> medicalItems = null;
    
    public AddMedicalInfoViewState() {
        super();
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final void setPage(int p0) {
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    public final void setLoading(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCurrentKeyword() {
        return null;
    }
    
    public final void setCurrentKeyword(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final void addProfileItems(@org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.ProfileItem.Item> items) {
    }
    
    public final boolean updateKeyword(@org.jetbrains.annotations.NotNull
    java.lang.String keyword) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<no.wmc.domain.model.ProfileItem.Item> getMedicalItems() {
        return null;
    }
    
    public final boolean canQuery() {
        return false;
    }
}