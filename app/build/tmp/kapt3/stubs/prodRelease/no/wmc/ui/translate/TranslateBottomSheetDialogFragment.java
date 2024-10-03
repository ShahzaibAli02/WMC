package no.wmc.ui.translate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u0016H\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\u0016\u0010!\u001a\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\u001c\u0010%\u001a\u00020\u001c2\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180&0#H\u0002J\u001c\u0010\'\u001a\u00020\u001c2\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0&0#H\u0002J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+H\u0014J\b\u0010,\u001a\u00020\u001cH\u0002J\u001a\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0019\u0010\u000f\u00a8\u00062"}, d2 = {"Lno/wmc/ui/translate/TranslateBottomSheetDialogFragment;", "Lno/wmc/ui/base/BaseViewStateBottomSheetDialogFragment;", "Lno/wmc/databinding/DialogTranslateBinding;", "Lno/wmc/ui/translate/TranslateViewModel;", "()V", "adapter", "Lno/wmc/ui/translate/adapter/TranslateListAdapter;", "getAdapter", "()Lno/wmc/ui/translate/adapter/TranslateListAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "currentProfileItems", "", "Lno/wmc/domain/model/ProfileItem$Item;", "getCurrentProfileItems", "()Ljava/util/List;", "currentProfileItems$delegate", "list", "", "Lno/wmc/firebase/model/AllCategoryModel;", "[Lno/wmc/firebase/model/AllCategoryModel;", "title", "", "translations", "Lno/wmc/domain/model/Translation;", "getTranslations", "translations$delegate", "getCurrentLanguageProfileItems", "", "getSelectedTranslationIso", "getTranslatedProfileItems", "languageIso", "getTranslationLanguage", "handleGetCurrentLanguageProfileItemsAction", "viewState", "Lno/wmc/ui/base/ViewState;", "Lno/wmc/domain/model/ProfileItem;", "handleGetTranslateLanguagesAction", "", "handleGetTranslatedProfileItemsAction", "Lno/wmc/domain/model/TranslateItem;", "handleViewAction", "viewAction", "Lno/wmc/ui/base/ViewAction;", "initView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "wmc-3.1.40-b11_prodRelease"})
public final class TranslateBottomSheetDialogFragment extends no.wmc.ui.base.BaseViewStateBottomSheetDialogFragment<no.wmc.databinding.DialogTranslateBinding, no.wmc.ui.translate.TranslateViewModel> {
    private final kotlin.Lazy translations$delegate = null;
    private final kotlin.Lazy currentProfileItems$delegate = null;
    private final kotlin.Lazy adapter$delegate = null;
    private java.lang.String title = "";
    private no.wmc.firebase.model.AllCategoryModel[] list = {};
    
    public TranslateBottomSheetDialogFragment() {
        super(0, null);
    }
    
    private final java.util.List<no.wmc.domain.model.Translation> getTranslations() {
        return null;
    }
    
    private final java.util.List<no.wmc.domain.model.ProfileItem.Item> getCurrentProfileItems() {
        return null;
    }
    
    private final no.wmc.ui.translate.adapter.TranslateListAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void getTranslationLanguage() {
    }
    
    private final void getCurrentLanguageProfileItems() {
    }
    
    private final void getTranslatedProfileItems(java.lang.String languageIso) {
    }
    
    @java.lang.Override
    protected void handleViewAction(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewAction viewAction) {
    }
    
    private final void handleGetTranslateLanguagesAction(no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.Translation>> viewState) {
    }
    
    private final void handleGetCurrentLanguageProfileItemsAction(no.wmc.ui.base.ViewState<no.wmc.domain.model.ProfileItem> viewState) {
    }
    
    private final void handleGetTranslatedProfileItemsAction(no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.TranslateItem>> viewState) {
    }
    
    private final java.lang.String getSelectedTranslationIso() {
        return null;
    }
}