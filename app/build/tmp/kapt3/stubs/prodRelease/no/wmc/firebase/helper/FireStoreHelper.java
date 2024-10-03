package no.wmc.firebase.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u000bJ\u0018\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0017J\u0016\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u0019J\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020!J\u0006\u0010\"\u001a\u00020\u0004J\"\u0010#\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00122\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00070%J!\u0010\'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0006\u0010*\u001a\u00020\u0004\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lno/wmc/firebase/helper/FireStoreHelper;", "", "()V", "allergiesColl", "Lcom/google/firebase/firestore/CollectionReference;", "diagnosesColl", "getAllAllergies", "", "listener", "Lno/wmc/firebase/interfaces/FireStoreGetAllAllergiesInterface;", "getAllDiagnoses", "Lno/wmc/firebase/interfaces/FireStoreGetAllDiagnosesInterface;", "getAllMedicine", "Lno/wmc/firebase/interfaces/FireStoreGetAllMedicineInterface;", "getAllVaccines", "Lno/wmc/firebase/interfaces/FireStoreGetAllVaccinesInterface;", "getMedicines", "type", "", "getUser", "uid", "Lno/wmc/firebase/interfaces/FireStoreGetUserInterface;", "getUserAllergies", "Lno/wmc/firebase/interfaces/FireStoreGetUserAllergiesInterface;", "getUserDiagnoses", "Lno/wmc/firebase/interfaces/FireStoreGetUserDiagnosesInterface;", "getUserFromId", "Lno/wmc/ui/main/EmergencyProfile;", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserMedicine", "Lno/wmc/firebase/interfaces/FireStoreGetUserMedicineInterface;", "getUserVaccines", "Lno/wmc/firebase/interfaces/FireStoreGetUserVaccinesInterface;", "medicineColl", "removeUser", "onDone", "Lkotlin/Function1;", "", "updateUserId", "email", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "vaccinesColl", "Companion", "wmc-3.1.40-b11_prodRelease"})
public final class FireStoreHelper {
    @org.jetbrains.annotations.NotNull
    public static final no.wmc.firebase.helper.FireStoreHelper.Companion Companion = null;
    @org.jetbrains.annotations.Nullable
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    private static com.google.firebase.firestore.FirebaseFirestore db;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TAG = "FireStoreHelper";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String allergies = "allergies";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String diagnoses = "diagnoses";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String medicine = "medicine";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String vaccines = "vaccines";
    
    public FireStoreHelper() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object updateUserId(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getUserFromId(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.ui.main.EmergencyProfile> continuation) {
        return null;
    }
    
    public final void removeUser(@org.jetbrains.annotations.NotNull
    java.lang.String uid, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onDone) {
    }
    
    public final void getUser(@org.jetbrains.annotations.Nullable
    java.lang.String uid, @org.jetbrains.annotations.NotNull
    no.wmc.firebase.interfaces.FireStoreGetUserInterface listener) {
    }
    
    public final void getUserDiagnoses(@org.jetbrains.annotations.NotNull
    java.lang.String uid, @org.jetbrains.annotations.NotNull
    no.wmc.firebase.interfaces.FireStoreGetUserDiagnosesInterface getAllDiagnoses) {
    }
    
    public final void getUserMedicine(@org.jetbrains.annotations.NotNull
    java.lang.String uid, @org.jetbrains.annotations.NotNull
    no.wmc.firebase.interfaces.FireStoreGetUserMedicineInterface getUserMedicine) {
    }
    
    public final void getUserAllergies(@org.jetbrains.annotations.NotNull
    java.lang.String uid, @org.jetbrains.annotations.NotNull
    no.wmc.firebase.interfaces.FireStoreGetUserAllergiesInterface listener) {
    }
    
    public final void getUserVaccines(@org.jetbrains.annotations.NotNull
    java.lang.String uid, @org.jetbrains.annotations.NotNull
    no.wmc.firebase.interfaces.FireStoreGetUserVaccinesInterface listener) {
    }
    
    public final void getMedicines(@org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    no.wmc.firebase.interfaces.FireStoreGetAllDiagnosesInterface listener) {
    }
    
    public final void getAllDiagnoses(@org.jetbrains.annotations.NotNull
    no.wmc.firebase.interfaces.FireStoreGetAllDiagnosesInterface listener) {
    }
    
    public final void getAllMedicine(@org.jetbrains.annotations.NotNull
    no.wmc.firebase.interfaces.FireStoreGetAllMedicineInterface listener) {
    }
    
    public final void getAllAllergies(@org.jetbrains.annotations.NotNull
    no.wmc.firebase.interfaces.FireStoreGetAllAllergiesInterface listener) {
    }
    
    public final void getAllVaccines(@org.jetbrains.annotations.NotNull
    no.wmc.firebase.interfaces.FireStoreGetAllVaccinesInterface listener) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.firestore.CollectionReference diagnosesColl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.firestore.CollectionReference medicineColl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.firestore.CollectionReference allergiesColl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.firestore.CollectionReference vaccinesColl() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0004\u0018\u00010\u00078F@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lno/wmc/firebase/helper/FireStoreHelper$Companion;", "", "()V", "TAG", "", "allergies", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "getDb", "()Lcom/google/firebase/firestore/FirebaseFirestore;", "setDb", "(Lcom/google/firebase/firestore/FirebaseFirestore;)V", "diagnoses", "medicine", "vaccines", "wmc-3.1.40-b11_prodRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void setDb(@org.jetbrains.annotations.Nullable
        com.google.firebase.firestore.FirebaseFirestore p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final com.google.firebase.firestore.FirebaseFirestore getDb() {
            return null;
        }
    }
}