package no.wmc.ui.main.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00e4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J&\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00152\f\u0010H\u001a\b\u0012\u0004\u0012\u00020D0IH\u0002J\u0010\u0010J\u001a\u00020D2\u0006\u0010K\u001a\u00020\u0006H\u0002J6\u0010L\u001a\u00020D2\u0006\u0010M\u001a\u00020N2\u0006\u0010E\u001a\u00020F2\u0016\u0010O\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`P2\u0006\u0010Q\u001a\u00020RJ\u0011\u0010S\u001a\u00020DH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020DH\u0002J\b\u0010V\u001a\u00020DH\u0002J\b\u0010W\u001a\u0004\u0018\u00010\u0006J\b\u0010X\u001a\u00020DH\u0002J\b\u0010Y\u001a\u00020DH\u0002J\u001c\u0010Z\u001a\u00020D2\u0012\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020^0]0\\H\u0002J\u0010\u0010_\u001a\u00020D2\u0006\u0010`\u001a\u00020aH\u0014J\b\u0010b\u001a\u00020DH\u0002J\u001c\u0010c\u001a\u00020D2\b\u0010d\u001a\u0004\u0018\u00010e2\b\u0010f\u001a\u0004\u0018\u00010gH\u0002J.\u0010h\u001a\u00020D2\u001c\u0010i\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0k\u0012\u0006\u0012\u0004\u0018\u00010l0jH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010mJ\u001a\u0010n\u001a\u00020D2\u0006\u0010o\u001a\u00020p2\b\u0010q\u001a\u0004\u0018\u00010rH\u0016J\u0006\u00103\u001a\u00020DJ\b\u0010s\u001a\u00020DH\u0002J\u0018\u0010t\u001a\u00020D2\u0006\u0010K\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u0015H\u0002J\u0010\u0010u\u001a\u00020D2\u0006\u0010v\u001a\u00020pH\u0002J\u0010\u0010u\u001a\u00020D2\u0006\u0010w\u001a\u00020\bH\u0002J\u0018\u0010x\u001a\u00020D2\u0006\u0010y\u001a\u00020\u00062\u0006\u0010z\u001a\u00020\u0006H\u0002J\b\u0010{\u001a\u00020DH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0010\u0012\f\u0012\n \'*\u0004\u0018\u00010&0&0%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\u001b\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020.X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00103\u001a\u0010\u0012\f\u0012\n \'*\u0004\u0018\u00010\u00060\u00060%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u00104\u001a\u0002058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u0010\u001b\u001a\u0004\b6\u00107R\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010=\u001a\u00020>X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006|"}, d2 = {"Lno/wmc/ui/main/home/HomeNewFragment;", "Lno/wmc/ui/base/BaseViewStateFragment;", "Lno/wmc/databinding/HomeNewScreenBinding;", "Lno/wmc/ui/main/home/HomeViewModel;", "()V", "TAG", "", "addNewCategoryBottomSheet", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getAddNewCategoryBottomSheet", "()Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "setAddNewCategoryBottomSheet", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "allergiesAdapter", "Lno/wmc/ui/main/home/list/AllergiesUserListAdapter;", "getAllergiesAdapter", "()Lno/wmc/ui/main/home/list/AllergiesUserListAdapter;", "setAllergiesAdapter", "(Lno/wmc/ui/main/home/list/AllergiesUserListAdapter;)V", "bottomMedicineList", "Ljava/util/ArrayList;", "Lno/wmc/firebase/model/AllCategoryModel;", "currentBackStackEntry", "Landroidx/navigation/NavBackStackEntry;", "getCurrentBackStackEntry", "()Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntry$delegate", "Lkotlin/Lazy;", "diagnosesAdapter", "Lno/wmc/ui/main/home/list/DiagnosesUserListAdapter;", "getDiagnosesAdapter", "()Lno/wmc/ui/main/home/list/DiagnosesUserListAdapter;", "setDiagnosesAdapter", "(Lno/wmc/ui/main/home/list/DiagnosesUserListAdapter;)V", "documentAdapter", "Lno/wmc/ui/main/home/list/DocumentListAdapter;", "documentFilePicker", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "localDataManager", "Lno/wmc/data/local/manager/LocalDataManager;", "getLocalDataManager", "()Lno/wmc/data/local/manager/LocalDataManager;", "localDataManager$delegate", "medicineAdapter", "Lno/wmc/ui/main/home/list/MedicineUserListAdapter;", "getMedicineAdapter", "()Lno/wmc/ui/main/home/list/MedicineUserListAdapter;", "setMedicineAdapter", "(Lno/wmc/ui/main/home/list/MedicineUserListAdapter;)V", "pickImage", "sharedPrefManage", "Lno/wmc/data/local/manager/SharedPrefManager;", "getSharedPrefManage", "()Lno/wmc/data/local/manager/SharedPrefManager;", "sharedPrefManage$delegate", "userAllergiesList", "userDiagnosesList", "userMedicineList", "userVaccinesList", "vaccinesAdapter", "Lno/wmc/ui/main/home/list/VaccinesUserListAdapter;", "getVaccinesAdapter", "()Lno/wmc/ui/main/home/list/VaccinesUserListAdapter;", "setVaccinesAdapter", "(Lno/wmc/ui/main/home/list/VaccinesUserListAdapter;)V", "addMedicine", "", "collectionRef", "Lcom/google/firebase/firestore/CollectionReference;", "data", "onSuccess", "Lkotlin/Function0;", "addNewBottomSheet", "whichCategory", "attachSwiper", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "list", "Lkotlin/collections/ArrayList;", "textView", "Landroid/widget/TextView;", "getUser", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserAllergies", "getUserDiagnoses", "getUserId", "getUserMedicine", "getUserVaccines", "handleGetDocumentAction", "viewState", "Lno/wmc/ui/base/ViewState;", "", "Lno/wmc/domain/model/DocumentList$DocumentGroup;", "handleViewAction", "viewAction", "Lno/wmc/ui/base/ViewAction;", "initView", "navigateToDocumentMetadata", "fileUri", "Landroid/net/Uri;", "document", "Lno/wmc/domain/model/Document;", "onCoroutine", "function", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)V", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "requestDocuments", "saveMedicine", "setupFullHeight", "bottomSheet", "bottomSheetDialog", "shareUserDate", "title", "what", "swipeToRemove", "wmc-3.1.40-b11_devDebug"})
public final class HomeNewFragment extends no.wmc.ui.base.BaseViewStateFragment<no.wmc.databinding.HomeNewScreenBinding, no.wmc.ui.main.home.HomeViewModel> {
    private final java.lang.String TAG = "HomeNewFragment";
    private final kotlin.Lazy sharedPrefManage$delegate = null;
    public no.wmc.ui.main.home.list.DiagnosesUserListAdapter diagnosesAdapter;
    public no.wmc.ui.main.home.list.MedicineUserListAdapter medicineAdapter;
    public no.wmc.ui.main.home.list.AllergiesUserListAdapter allergiesAdapter;
    public no.wmc.ui.main.home.list.VaccinesUserListAdapter vaccinesAdapter;
    private java.util.ArrayList<no.wmc.firebase.model.AllCategoryModel> userDiagnosesList;
    private java.util.ArrayList<no.wmc.firebase.model.AllCategoryModel> userMedicineList;
    private java.util.ArrayList<no.wmc.firebase.model.AllCategoryModel> userAllergiesList;
    private java.util.ArrayList<no.wmc.firebase.model.AllCategoryModel> userVaccinesList;
    private java.util.ArrayList<no.wmc.firebase.model.AllCategoryModel> bottomMedicineList;
    public com.google.android.material.bottomsheet.BottomSheetDialog addNewCategoryBottomSheet;
    private final kotlin.Lazy localDataManager$delegate = null;
    private final kotlin.Lazy currentBackStackEntry$delegate = null;
    private final no.wmc.ui.main.home.list.DocumentListAdapter documentAdapter = null;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> pickImage = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> documentFilePicker = null;
    
    public HomeNewFragment() {
        super(0, null);
    }
    
    private final no.wmc.data.local.manager.SharedPrefManager getSharedPrefManage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final no.wmc.ui.main.home.list.DiagnosesUserListAdapter getDiagnosesAdapter() {
        return null;
    }
    
    public final void setDiagnosesAdapter(@org.jetbrains.annotations.NotNull
    no.wmc.ui.main.home.list.DiagnosesUserListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final no.wmc.ui.main.home.list.MedicineUserListAdapter getMedicineAdapter() {
        return null;
    }
    
    public final void setMedicineAdapter(@org.jetbrains.annotations.NotNull
    no.wmc.ui.main.home.list.MedicineUserListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final no.wmc.ui.main.home.list.AllergiesUserListAdapter getAllergiesAdapter() {
        return null;
    }
    
    public final void setAllergiesAdapter(@org.jetbrains.annotations.NotNull
    no.wmc.ui.main.home.list.AllergiesUserListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final no.wmc.ui.main.home.list.VaccinesUserListAdapter getVaccinesAdapter() {
        return null;
    }
    
    public final void setVaccinesAdapter(@org.jetbrains.annotations.NotNull
    no.wmc.ui.main.home.list.VaccinesUserListAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.material.bottomsheet.BottomSheetDialog getAddNewCategoryBottomSheet() {
        return null;
    }
    
    public final void setAddNewCategoryBottomSheet(@org.jetbrains.annotations.NotNull
    com.google.android.material.bottomsheet.BottomSheetDialog p0) {
    }
    
    private final no.wmc.data.local.manager.LocalDataManager getLocalDataManager() {
        return null;
    }
    
    private final androidx.navigation.NavBackStackEntry getCurrentBackStackEntry() {
        return null;
    }
    
    private final void requestDocuments() {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void pickImage() {
    }
    
    @java.lang.Override
    protected void handleViewAction(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewAction viewAction) {
    }
    
    private final void handleGetDocumentAction(no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.DocumentList.DocumentGroup>> viewState) {
    }
    
    private final void onCoroutine(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getUser(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void initView() {
    }
    
    private final void getUserDiagnoses() {
    }
    
    private final void getUserMedicine() {
    }
    
    private final void getUserAllergies() {
    }
    
    private final void navigateToDocumentMetadata(android.net.Uri fileUri, no.wmc.domain.model.Document document) {
    }
    
    private final void getUserVaccines() {
    }
    
    public final void attachSwiper(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.CollectionReference collectionRef, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<no.wmc.firebase.model.AllCategoryModel> list, @org.jetbrains.annotations.NotNull
    android.widget.TextView textView) {
    }
    
    private final void swipeToRemove() {
    }
    
    private final void addNewBottomSheet(java.lang.String whichCategory) {
    }
    
    private final void setupFullHeight(com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog) {
    }
    
    private final void setupFullHeight(android.view.View bottomSheet) {
    }
    
    private final void saveMedicine(java.lang.String whichCategory, no.wmc.firebase.model.AllCategoryModel data) {
    }
    
    private final void shareUserDate(java.lang.String title, java.lang.String what) {
    }
    
    private final void addMedicine(com.google.firebase.firestore.CollectionReference collectionRef, no.wmc.firebase.model.AllCategoryModel data, kotlin.jvm.functions.Function0<kotlin.Unit> onSuccess) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUserId() {
        return null;
    }
}