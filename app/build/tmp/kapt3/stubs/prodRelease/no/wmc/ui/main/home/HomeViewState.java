package no.wmc.ui.main.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'\u00a8\u0006("}, d2 = {"Lno/wmc/ui/main/home/HomeViewState;", "", "()V", "allergies", "Lno/wmc/domain/model/ProfileItem;", "getAllergies", "()Lno/wmc/domain/model/ProfileItem;", "setAllergies", "(Lno/wmc/domain/model/ProfileItem;)V", "diagnonses", "getDiagnonses", "setDiagnonses", "documents", "", "Lno/wmc/domain/model/DocumentList$DocumentGroup;", "getDocuments", "()Ljava/util/List;", "setDocuments", "(Ljava/util/List;)V", "downloadedDocument", "Ljava/io/File;", "getDownloadedDocument", "()Ljava/io/File;", "setDownloadedDocument", "(Ljava/io/File;)V", "medicines", "getMedicines", "setMedicines", "noAllergiesSwitch", "", "getNoAllergiesSwitch", "()Z", "setNoAllergiesSwitch", "(Z)V", "profile", "Lno/wmc/domain/model/Profile;", "getProfile", "()Lno/wmc/domain/model/Profile;", "setProfile", "(Lno/wmc/domain/model/Profile;)V", "wmc-3.1.40-b11_prodRelease"})
public final class HomeViewState {
    @org.jetbrains.annotations.Nullable
    private no.wmc.domain.model.Profile profile;
    private boolean noAllergiesSwitch = false;
    @org.jetbrains.annotations.Nullable
    private no.wmc.domain.model.ProfileItem allergies;
    @org.jetbrains.annotations.Nullable
    private no.wmc.domain.model.ProfileItem medicines;
    @org.jetbrains.annotations.Nullable
    private no.wmc.domain.model.ProfileItem diagnonses;
    @org.jetbrains.annotations.Nullable
    private java.util.List<no.wmc.domain.model.DocumentList.DocumentGroup> documents;
    @org.jetbrains.annotations.Nullable
    private java.io.File downloadedDocument;
    
    public HomeViewState() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.domain.model.Profile getProfile() {
        return null;
    }
    
    public final void setProfile(@org.jetbrains.annotations.Nullable
    no.wmc.domain.model.Profile p0) {
    }
    
    public final boolean getNoAllergiesSwitch() {
        return false;
    }
    
    public final void setNoAllergiesSwitch(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.domain.model.ProfileItem getAllergies() {
        return null;
    }
    
    public final void setAllergies(@org.jetbrains.annotations.Nullable
    no.wmc.domain.model.ProfileItem p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.domain.model.ProfileItem getMedicines() {
        return null;
    }
    
    public final void setMedicines(@org.jetbrains.annotations.Nullable
    no.wmc.domain.model.ProfileItem p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.domain.model.ProfileItem getDiagnonses() {
        return null;
    }
    
    public final void setDiagnonses(@org.jetbrains.annotations.Nullable
    no.wmc.domain.model.ProfileItem p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.domain.model.DocumentList.DocumentGroup> getDocuments() {
        return null;
    }
    
    public final void setDocuments(@org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.DocumentList.DocumentGroup> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.io.File getDownloadedDocument() {
        return null;
    }
    
    public final void setDownloadedDocument(@org.jetbrains.annotations.Nullable
    java.io.File p0) {
    }
}