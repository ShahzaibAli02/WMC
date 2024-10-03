package no.wmc.ui.main.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u00f0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u0090\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0090\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u00106\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u000108H\u0002J\u0018\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000200H\u0002J\b\u0010=\u001a\u00020\u0006H\u0002J\u0016\u0010>\u001a\u00020\u00062\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@H\u0002J\u0016\u0010B\u001a\u00020\u00062\f\u0010?\u001a\b\u0012\u0004\u0012\u00020C0@H\u0002J\u0016\u0010D\u001a\u00020\u00062\f\u0010?\u001a\b\u0012\u0004\u0012\u00020E0@H\u0002J\b\u0010F\u001a\u00020\u0006H\u0002J\u0016\u0010G\u001a\u00020\u00062\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@H\u0002J\u001c\u0010H\u001a\u00020\u00062\u0012\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0I0@H\u0002J\u0016\u0010K\u001a\u00020\u00062\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@H\u0002J\u0016\u0010L\u001a\u00020\u00062\f\u0010?\u001a\b\u0012\u0004\u0012\u00020M0@H\u0002J\u0016\u0010N\u001a\u00020\u00062\f\u0010?\u001a\b\u0012\u0004\u0012\u00020A0@H\u0002J\b\u0010O\u001a\u00020\u0006H\u0002J\u0016\u0010P\u001a\u00020\u00062\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060@H\u0002J\u0016\u0010Q\u001a\u00020\u00062\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060@H\u0002J\u0016\u0010R\u001a\u00020\u00062\f\u0010?\u001a\b\u0012\u0004\u0012\u00020S0@H\u0002J\u0016\u0010T\u001a\u00020\u00062\f\u0010?\u001a\b\u0012\u0004\u0012\u00020U0@H\u0002J\u0010\u0010V\u001a\u00020\u00062\u0006\u0010W\u001a\u00020XH\u0014J\b\u0010Y\u001a\u00020\u0006H\u0002J\b\u0010Z\u001a\u00020\u0006H\u0002J\u0012\u0010[\u001a\u00020C2\b\u0010\\\u001a\u0004\u0018\u00010MH\u0002J\u001c\u0010]\u001a\u00020\u00062\b\u0010^\u001a\u0004\u0018\u00010_2\b\u0010<\u001a\u0004\u0018\u000100H\u0002J\u0018\u0010`\u001a\u00020\u00062\u0006\u0010a\u001a\u00020S2\u0006\u0010b\u001a\u00020cH\u0002J\u001a\u0010d\u001a\u00020\u00062\u0006\u0010e\u001a\u00020f2\b\u0010g\u001a\u0004\u0018\u00010hH\u0016J\b\u0010i\u001a\u00020\u0006H\u0002J\u0010\u0010j\u001a\u00020\u00062\u0006\u0010k\u001a\u00020lH\u0002J\u0018\u0010m\u001a\u00020\u00062\u0006\u0010a\u001a\u00020S2\u0006\u0010n\u001a\u00020oH\u0002J\b\u0010p\u001a\u00020\u0006H\u0002J\b\u0010q\u001a\u00020\u0006H\u0002J\b\u0010r\u001a\u00020\u0006H\u0002J\b\u0010s\u001a\u00020\u0006H\u0002J\b\u0010t\u001a\u00020\u0006H\u0002J\b\u0010u\u001a\u00020\u0006H\u0002J\b\u0010v\u001a\u00020\u0006H\u0002J\b\u0010w\u001a\u00020\u0006H\u0002J\b\u0010x\u001a\u00020\u0006H\u0002J\u0010\u0010y\u001a\u00020\u00062\u0006\u0010z\u001a\u00020CH\u0002J>\u0010{\u001a\u00020\u00062\u0006\u0010a\u001a\u00020S2\u0006\u0010|\u001a\u00020}2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u007f\u001a\u00020\r2\u000e\u0010\u0080\u0001\u001a\t\u0012\u0004\u0012\u00020\u00060\u0081\u0001H\u0002J\t\u0010\u0082\u0001\u001a\u00020\u0006H\u0002J\t\u0010\u0083\u0001\u001a\u00020\u0006H\u0002J\t\u0010\u0084\u0001\u001a\u00020\u0006H\u0002J\t\u0010\u0085\u0001\u001a\u00020\u0006H\u0002J\t\u0010\u0086\u0001\u001a\u00020\u0006H\u0002J\u001c\u0010\u0087\u0001\u001a\u00020\u00062\b\u0010\u0088\u0001\u001a\u00030\u0089\u00012\u0007\u0010\u008a\u0001\u001a\u00020CH\u0002J)\u0010\u008b\u0001\u001a\u00020\u00062\r\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00100I2\u0006\u0010|\u001a\u00020}2\u0007\u0010\u008d\u0001\u001a\u00020\rH\u0002J)\u0010\u008e\u0001\u001a\u00020\u00062\b\u0010n\u001a\u0004\u0018\u00010A2\f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u007f\u001a\u00020\rH\u0002J\t\u0010\u008f\u0001\u001a\u00020\u0006H\u0002R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001b\u0010\u0012R\u000e\u0010\u001d\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010$\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010%\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010&\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u0014\u001a\u0004\b(\u0010\u0012R\u001d\u0010*\u001a\u0004\u0018\u00010+8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\u0014\u001a\u0004\b,\u0010-R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b3\u0010\u0014\u001a\u0004\b2\u0010\u0012R\u000e\u00104\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u00105\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0007\u00a8\u0006\u0091\u0001"}, d2 = {"Lno/wmc/ui/main/home/HomeFragment;", "Lno/wmc/ui/base/BaseViewStateFragment;", "Lno/wmc/databinding/HomeScreenBinding;", "Lno/wmc/ui/main/home/HomeViewModel;", "()V", "addAllergyResultObserver", "", "Lkotlin/Unit;", "addDiagnosesResultObserver", "addDocumentResultObserver", "addMedicineResultObserver", "addVaccinesResultObserver", "allergiesAdapter", "Lno/wmc/ui/main/home/list/ProfileItemListAdapter;", "allergyItems", "", "Lno/wmc/domain/model/MedicalItem;", "getAllergyItems", "()Ljava/util/List;", "allergyItems$delegate", "Lkotlin/Lazy;", "currentBackStackEntry", "Landroidx/navigation/NavBackStackEntry;", "getCurrentBackStackEntry", "()Landroidx/navigation/NavBackStackEntry;", "currentBackStackEntry$delegate", "diagnoseItems", "getDiagnoseItems", "diagnoseItems$delegate", "diagnosesAdapter", "documentAdapter", "Lno/wmc/ui/main/home/list/DocumentListAdapter;", "documentFilePicker", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "editCardActionResultObserver", "editDocumentResultObserver", "medicineAdapter", "medicineItems", "getMedicineItems", "medicineItems$delegate", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle$delegate", "selectedDocument", "Lno/wmc/domain/model/Document;", "vaccineItems", "getVaccineItems", "vaccineItems$delegate", "vaccinesAdapter", "wmcBannerDialogResultObserver", "checkReOrderCardAvailability", "cardOrderDate", "Lkotlinx/datetime/Instant;", "downloadDocument", "context", "Landroid/content/Context;", "document", "handleAddMedicalItemResult", "handleAllergiesAction", "viewState", "Lno/wmc/ui/base/ViewState;", "Lno/wmc/domain/model/ProfileItem;", "handleAllergiesSwitchAction", "", "handleDownloadDocumentAction", "Ljava/io/File;", "handleEditCardDialogResult", "handleGetDiagnosesViewAction", "handleGetDocumentAction", "", "Lno/wmc/domain/model/DocumentList$DocumentGroup;", "handleGetMedicineViewAction", "handleGetProfileAction", "Lno/wmc/domain/model/Profile;", "handleGetVaccinesViewAction", "handleOnTranslateClicked", "handleOrderCardAction", "handleRemoveDocumentAction", "handleRemoveMedicalItemAction", "Lno/wmc/domain/enums/ProfileItemEnum;", "handleShareAction", "Lno/wmc/domain/model/ShareMedicalInfo;", "handleViewAction", "viewAction", "Lno/wmc/ui/base/ViewAction;", "handleWmcBannerDialogResult", "initViews", "isProfileComplete", "profile", "navigateToDocumentMetadata", "fileUri", "Landroid/net/Uri;", "onTranslateClicked", "profileItemEnum", "title", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "orderCard", "removeDocument", "documentId", "", "removeMedicalItem", "profileItem", "Lno/wmc/domain/model/ProfileItem$Item;", "requestAllergies", "requestDiagnoses", "requestDocuments", "requestMedicine", "requestProfile", "requestVaccines", "setCompletedWMCBanner", "setRegisteredWMCBanner", "setUnregisteredWMCBanner", "setWMCBannerOnClickActions", "isEnable", "setupCardAction", "expandableCard", "Lno/wmc/ui/custom/ExpandableCard;", "medicalItemList", "medicalItemAdapter", "onShareClicked", "Lkotlin/Function0;", "shareAllergies", "shareDiagnoses", "shareMedicine", "shareVaccines", "showDynamicGreeting", "showShareCardLoading", "shareType", "Lno/wmc/domain/model/ShareType;", "isLoading", "toggleRemoveItemAction", "medicalItems", "profileItemAdapter", "transformToMedicalItem", "turnNoAllergies", "Companion", "wmc-3.1.40-b11_prodRelease"})
public final class HomeFragment extends no.wmc.ui.base.BaseViewStateFragment<no.wmc.databinding.HomeScreenBinding, no.wmc.ui.main.home.HomeViewModel> {
    private final no.wmc.ui.main.home.list.ProfileItemListAdapter allergiesAdapter = null;
    private final no.wmc.ui.main.home.list.ProfileItemListAdapter medicineAdapter = null;
    private final no.wmc.ui.main.home.list.ProfileItemListAdapter diagnosesAdapter = null;
    private final no.wmc.ui.main.home.list.ProfileItemListAdapter vaccinesAdapter = null;
    private final kotlin.Lazy allergyItems$delegate = null;
    private final kotlin.Lazy medicineItems$delegate = null;
    private final kotlin.Lazy diagnoseItems$delegate = null;
    private final kotlin.Lazy vaccineItems$delegate = null;
    private no.wmc.domain.model.Document selectedDocument;
    private final no.wmc.ui.main.home.list.DocumentListAdapter documentAdapter = null;
    private final kotlin.Lazy currentBackStackEntry$delegate = null;
    private final kotlin.Lazy savedStateHandle$delegate = null;
    private kotlin.Unit addAllergyResultObserver;
    private kotlin.Unit addMedicineResultObserver;
    private kotlin.Unit addDiagnosesResultObserver;
    private kotlin.Unit addVaccinesResultObserver;
    private kotlin.Unit addDocumentResultObserver;
    private kotlin.Unit editDocumentResultObserver;
    private kotlin.Unit editCardActionResultObserver;
    private kotlin.Unit wmcBannerDialogResultObserver;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> documentFilePicker = null;
    @org.jetbrains.annotations.NotNull
    public static final no.wmc.ui.main.home.HomeFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ADD_NEW_ALLERGY_RESULT = "ADD_NEW_ALLERGY_RESULT";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ADD_NEW_MEDICINE_RESULT = "ADD_NEW_MEDICINE_RESULT";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ADD_NEW_DIAGNOSES_RESULT = "ADD_NEW_DIAGNOSES_RESULT";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ADD_NEW_VACCINE_RESULT = "ADD_NEW_VACCINE_RESULT";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ADD_NEW_DOCUMENT_RESULT = "ADD_NEW_DOCUMENT_RESULT";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EDIT_CARD_ACTION_RESULT = "EDIT_CARD_ACTION_RESULT";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EDIT_DOCUMENT_ACTION_RESULT = "EDIT_DOCUMENT_ACTION_RESULT";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String WMC_BANNER_ACTION_RESULT = "WMC_BANNER_ACTION_RESULT";
    
    public HomeFragment() {
        super(0, null);
    }
    
    private final java.util.List<no.wmc.domain.model.MedicalItem> getAllergyItems() {
        return null;
    }
    
    private final java.util.List<no.wmc.domain.model.MedicalItem> getMedicineItems() {
        return null;
    }
    
    private final java.util.List<no.wmc.domain.model.MedicalItem> getDiagnoseItems() {
        return null;
    }
    
    private final java.util.List<no.wmc.domain.model.MedicalItem> getVaccineItems() {
        return null;
    }
    
    private final androidx.navigation.NavBackStackEntry getCurrentBackStackEntry() {
        return null;
    }
    
    private final androidx.lifecycle.SavedStateHandle getSavedStateHandle() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
    
    @java.lang.Override
    protected void handleViewAction(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewAction viewAction) {
    }
    
    private final void handleGetProfileAction(no.wmc.ui.base.ViewState<no.wmc.domain.model.Profile> viewState) {
    }
    
    private final void handleAllergiesSwitchAction(no.wmc.ui.base.ViewState<java.lang.Boolean> viewState) {
    }
    
    private final void handleAllergiesAction(no.wmc.ui.base.ViewState<no.wmc.domain.model.ProfileItem> viewState) {
    }
    
    private final void handleGetMedicineViewAction(no.wmc.ui.base.ViewState<no.wmc.domain.model.ProfileItem> viewState) {
    }
    
    private final void handleGetDiagnosesViewAction(no.wmc.ui.base.ViewState<no.wmc.domain.model.ProfileItem> viewState) {
    }
    
    private final void handleGetVaccinesViewAction(no.wmc.ui.base.ViewState<no.wmc.domain.model.ProfileItem> viewState) {
    }
    
    private final void handleGetDocumentAction(no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.DocumentList.DocumentGroup>> viewState) {
    }
    
    private final void handleRemoveMedicalItemAction(no.wmc.ui.base.ViewState<no.wmc.domain.enums.ProfileItemEnum> viewState) {
    }
    
    private final void handleDownloadDocumentAction(no.wmc.ui.base.ViewState<java.io.File> viewState) {
    }
    
    private final void handleRemoveDocumentAction(no.wmc.ui.base.ViewState<kotlin.Unit> viewState) {
    }
    
    private final void handleShareAction(no.wmc.ui.base.ViewState<no.wmc.domain.model.ShareMedicalInfo> viewState) {
    }
    
    private final void showShareCardLoading(no.wmc.domain.model.ShareType shareType, boolean isLoading) {
    }
    
    private final void handleOrderCardAction(no.wmc.ui.base.ViewState<kotlin.Unit> viewState) {
    }
    
    private final void requestProfile() {
    }
    
    private final void turnNoAllergies() {
    }
    
    private final void requestAllergies() {
    }
    
    private final void requestMedicine() {
    }
    
    private final void requestDiagnoses() {
    }
    
    private final void requestVaccines() {
    }
    
    private final void requestDocuments() {
    }
    
    private final void shareAllergies() {
    }
    
    private final void shareMedicine() {
    }
    
    private final void shareDiagnoses() {
    }
    
    private final void shareVaccines() {
    }
    
    private final void removeMedicalItem(no.wmc.domain.enums.ProfileItemEnum profileItemEnum, no.wmc.domain.model.ProfileItem.Item profileItem) {
    }
    
    private final void downloadDocument(android.content.Context context, no.wmc.domain.model.Document document) {
    }
    
    private final void removeDocument(int documentId) {
    }
    
    private final void orderCard() {
    }
    
    private final void setUnregisteredWMCBanner() {
    }
    
    private final void setRegisteredWMCBanner() {
    }
    
    private final void setCompletedWMCBanner() {
    }
    
    private final void setWMCBannerOnClickActions(boolean isEnable) {
    }
    
    private final void checkReOrderCardAvailability(kotlinx.datetime.Instant cardOrderDate) {
    }
    
    private final boolean isProfileComplete(no.wmc.domain.model.Profile profile) {
        return false;
    }
    
    private final void transformToMedicalItem(no.wmc.domain.model.ProfileItem profileItem, java.util.List<no.wmc.domain.model.MedicalItem> medicalItemList, no.wmc.ui.main.home.list.ProfileItemListAdapter medicalItemAdapter) {
    }
    
    private final void setupCardAction(no.wmc.domain.enums.ProfileItemEnum profileItemEnum, no.wmc.ui.custom.ExpandableCard expandableCard, java.util.List<no.wmc.domain.model.MedicalItem> medicalItemList, no.wmc.ui.main.home.list.ProfileItemListAdapter medicalItemAdapter, kotlin.jvm.functions.Function0<kotlin.Unit> onShareClicked) {
    }
    
    private final void handleAddMedicalItemResult() {
    }
    
    private final void handleEditCardDialogResult() {
    }
    
    private final void handleWmcBannerDialogResult() {
    }
    
    private final void toggleRemoveItemAction(java.util.List<no.wmc.domain.model.MedicalItem> medicalItems, no.wmc.ui.custom.ExpandableCard expandableCard, no.wmc.ui.main.home.list.ProfileItemListAdapter profileItemAdapter) {
    }
    
    private final void navigateToDocumentMetadata(android.net.Uri fileUri, no.wmc.domain.model.Document document) {
    }
    
    private final void showDynamicGreeting() {
    }
    
    private final void handleOnTranslateClicked() {
    }
    
    private final void onTranslateClicked(no.wmc.domain.enums.ProfileItemEnum profileItemEnum, java.lang.String title) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lno/wmc/ui/main/home/HomeFragment$Companion;", "", "()V", "ADD_NEW_ALLERGY_RESULT", "", "ADD_NEW_DIAGNOSES_RESULT", "ADD_NEW_DOCUMENT_RESULT", "ADD_NEW_MEDICINE_RESULT", "ADD_NEW_VACCINE_RESULT", "EDIT_CARD_ACTION_RESULT", "EDIT_DOCUMENT_ACTION_RESULT", "WMC_BANNER_ACTION_RESULT", "wmc-3.1.40-b11_prodRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}