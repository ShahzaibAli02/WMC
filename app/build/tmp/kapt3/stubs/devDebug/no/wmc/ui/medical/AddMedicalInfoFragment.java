package no.wmc.ui.medical;

import java.lang.System;

@kotlinx.coroutines.FlowPreview
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u001cH\u0002J\u001c\u0010\u001d\u001a\u00020\u00152\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u001e0\u001cH\u0002J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020\u0015H\u0002J\b\u0010#\u001a\u00020\u0015H\u0002J\u001a\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lno/wmc/ui/medical/AddMedicalInfoFragment;", "Lno/wmc/ui/base/BaseViewStateFragment;", "Lno/wmc/databinding/FragmentAddMedicalInfoBinding;", "Lno/wmc/ui/medical/AddMedicalInfoViewModel;", "()V", "adapter", "Lno/wmc/ui/medical/list/AddMedicalInfoAdapter;", "getAdapter", "()Lno/wmc/ui/medical/list/AddMedicalInfoAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "args", "Lno/wmc/ui/medical/AddMedicalInfoFragmentArgs;", "getArgs", "()Lno/wmc/ui/medical/AddMedicalInfoFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "queryState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lno/wmc/ui/medical/AddMedicalInfoViewEvent$SearchMedicalItemEvent;", "createMedicalItem", "", "profileItemEnum", "Lno/wmc/domain/enums/ProfileItemEnum;", "profileItem", "Lno/wmc/domain/model/ProfileItem$Item;", "handleAddMedicalItemAction", "viewState", "Lno/wmc/ui/base/ViewState;", "handleGetMedicalItemAction", "", "handleViewAction", "viewAction", "Lno/wmc/ui/base/ViewAction;", "initViews", "loadMoreMedicalItem", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "wmc-3.1.40-b11_devDebug"})
public final class AddMedicalInfoFragment extends no.wmc.ui.base.BaseViewStateFragment<no.wmc.databinding.FragmentAddMedicalInfoBinding, no.wmc.ui.medical.AddMedicalInfoViewModel> {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy adapter$delegate = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<no.wmc.ui.medical.AddMedicalInfoViewEvent.SearchMedicalItemEvent> queryState = null;
    
    public AddMedicalInfoFragment() {
        super(0, null);
    }
    
    private final no.wmc.ui.medical.AddMedicalInfoFragmentArgs getArgs() {
        return null;
    }
    
    private final no.wmc.ui.medical.list.AddMedicalInfoAdapter getAdapter() {
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
    
    private final void handleGetMedicalItemAction(no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.ProfileItem.Item>> viewState) {
    }
    
    private final void handleAddMedicalItemAction(no.wmc.ui.base.ViewState<kotlin.Unit> viewState) {
    }
    
    private final void createMedicalItem(no.wmc.domain.enums.ProfileItemEnum profileItemEnum, no.wmc.domain.model.ProfileItem.Item profileItem) {
    }
    
    private final void loadMoreMedicalItem() {
    }
}