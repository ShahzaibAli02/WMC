package no.wmc.ui.subscription.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001/B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J\u0016\u0010\u0019\u001a\u00020\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0002J\u0016\u0010\u001c\u001a\u00020\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u001bH\u0002J\u0016\u0010\u001d\u001a\u00020\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!H\u0014J\b\u0010\"\u001a\u00020\u0006H\u0002J\b\u0010#\u001a\u00020\u0006H\u0002J\u001a\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0011H\u0002J\b\u0010-\u001a\u00020\u0006H\u0002J\u0010\u0010.\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u00060"}, d2 = {"Lno/wmc/ui/subscription/details/SubscriptionDetailFragment;", "Lno/wmc/ui/base/BaseViewStateFragment;", "Lno/wmc/databinding/SubscriptionDetailScreenBinding;", "Lno/wmc/ui/subscription/details/SubscriptionDetailViewModel;", "()V", "addSubscriptionMemberResultObserver", "", "Lkotlin/Unit;", "args", "Lno/wmc/ui/subscription/details/SubscriptionDetailFragmentArgs;", "getArgs", "()Lno/wmc/ui/subscription/details/SubscriptionDetailFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "cancelSubscription", "deleteSubscriptionUser", "customerId", "", "detailStringBuilder", "Landroid/text/SpannableStringBuilder;", "titleString", "", "detailString", "getSubscriptionDetail", "id", "handleCancelSubscriptionAction", "viewState", "Lno/wmc/ui/base/ViewState;", "handleDeleteSubscriptionUserAction", "handleGetSubscriptionDetailAction", "Lno/wmc/domain/model/Subscription;", "handleViewAction", "viewAction", "Lno/wmc/ui/base/ViewAction;", "initViews", "observeAddSubscriptionMemberResult", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setTextSpanColor", "Landroid/text/SpannableString;", "text", "color", "showConfirmCancelSubscriptionDialog", "showConfirmDeleteDialog", "Companion", "wmc-3.1.40-b11_prodRelease"})
public final class SubscriptionDetailFragment extends no.wmc.ui.base.BaseViewStateFragment<no.wmc.databinding.SubscriptionDetailScreenBinding, no.wmc.ui.subscription.details.SubscriptionDetailViewModel> {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private kotlin.Unit addSubscriptionMemberResultObserver;
    @org.jetbrains.annotations.NotNull
    public static final no.wmc.ui.subscription.details.SubscriptionDetailFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String ADD_SUBSCRIPTION_MEMBER_RESULT = "ADD_SUBSCRIPTION_MEMBER_RESULT";
    
    public SubscriptionDetailFragment() {
        super(0, null);
    }
    
    private final no.wmc.ui.subscription.details.SubscriptionDetailFragmentArgs getArgs() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViews() {
    }
    
    private final void getSubscriptionDetail(int id) {
    }
    
    private final void deleteSubscriptionUser(int customerId) {
    }
    
    private final void cancelSubscription() {
    }
    
    @java.lang.Override
    protected void handleViewAction(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewAction viewAction) {
    }
    
    private final void handleGetSubscriptionDetailAction(no.wmc.ui.base.ViewState<no.wmc.domain.model.Subscription> viewState) {
    }
    
    private final android.text.SpannableStringBuilder detailStringBuilder(java.lang.String titleString, java.lang.String detailString) {
        return null;
    }
    
    private final android.text.SpannableString setTextSpanColor(java.lang.String text, int color) {
        return null;
    }
    
    private final void showConfirmDeleteDialog(int customerId) {
    }
    
    private final void handleDeleteSubscriptionUserAction(no.wmc.ui.base.ViewState<kotlin.Unit> viewState) {
    }
    
    private final void handleCancelSubscriptionAction(no.wmc.ui.base.ViewState<kotlin.Unit> viewState) {
    }
    
    private final void showConfirmCancelSubscriptionDialog() {
    }
    
    private final void observeAddSubscriptionMemberResult() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lno/wmc/ui/subscription/details/SubscriptionDetailFragment$Companion;", "", "()V", "ADD_SUBSCRIPTION_MEMBER_RESULT", "", "wmc-3.1.40-b11_prodRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}