package no.wmc.ui.subscription.newflow;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0002J\u0016\u0010#\u001a\u00020\u001f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J\u0010\u0010\'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)H\u0014J\b\u0010*\u001a\u00020\u001fH\u0002J\u0010\u0010+\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010,\u001a\u00020\u001fH\u0002J\u0010\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/H\u0002J\u001a\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0012\u00105\u001a\u00020\u001f2\b\b\u0002\u00106\u001a\u00020&H\u0002J\b\u00107\u001a\u00020\u001fH\u0002J\u0010\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u00020\u001fH\u0002J\u0010\u0010<\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006="}, d2 = {"Lno/wmc/ui/subscription/newflow/NewSubscriptionFragment;", "Lno/wmc/ui/base/BaseViewStateFragment;", "Lno/wmc/databinding/FragmentNewSubscriptionBinding;", "Lno/wmc/ui/subscription/newflow/NewSubscriptionViewModel;", "()V", "adapter", "Lno/wmc/ui/subscription/newflow/list/SubscriptionListAdapter;", "getAdapter", "()Lno/wmc/ui/subscription/newflow/list/SubscriptionListAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "args", "Lno/wmc/ui/subscription/newflow/NewSubscriptionFragmentArgs;", "getArgs", "()Lno/wmc/ui/subscription/newflow/NewSubscriptionFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "localDataManager", "Lno/wmc/data/local/manager/LocalDataManager;", "productDetails", "Lcom/android/billingclient/api/ProductDetails;", "purchasesUpdatedListener", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "redeemCodeManager", "Lno/wmc/data/manager/RedeemCodeManager;", "getRedeemCodeManager", "()Lno/wmc/data/manager/RedeemCodeManager;", "redeemCodeManager$delegate", "getProducts", "", "handlePurchase", "purchase", "Lcom/android/billingclient/api/Purchase;", "handleSubscriptionAddedInFireStore", "viewState", "Lno/wmc/ui/base/ViewState;", "", "handleViewAction", "viewAction", "Lno/wmc/ui/base/ViewAction;", "initPlayBilling", "initPurchase", "initView", "onSubscriptionItemClicked", "subscription", "Lno/wmc/domain/model/NewSubscription;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "prepareSubscriptionList", "price", "redeemCode", "showSuccesDialog", "data", "Lno/wmc/data/remote/model/Promo;", "startPurchase", "updateUserInformation", "wmc-3.1.40-b11_prodRelease"})
public final class NewSubscriptionFragment extends no.wmc.ui.base.BaseViewStateFragment<no.wmc.databinding.FragmentNewSubscriptionBinding, no.wmc.ui.subscription.newflow.NewSubscriptionViewModel> {
    private com.android.billingclient.api.BillingClient billingClient;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy redeemCodeManager$delegate = null;
    private final no.wmc.data.local.manager.LocalDataManager localDataManager = null;
    private final kotlin.Lazy adapter$delegate = null;
    private com.android.billingclient.api.ProductDetails productDetails;
    private final com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener = null;
    
    public NewSubscriptionFragment() {
        super(0, null);
    }
    
    private final no.wmc.ui.subscription.newflow.NewSubscriptionFragmentArgs getArgs() {
        return null;
    }
    
    private final no.wmc.data.manager.RedeemCodeManager getRedeemCodeManager() {
        return null;
    }
    
    private final no.wmc.ui.subscription.newflow.list.SubscriptionListAdapter getAdapter() {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initPlayBilling() {
    }
    
    private final void getProducts() {
    }
    
    private final void initView() {
    }
    
    private final void redeemCode() {
    }
    
    private final void showSuccesDialog(no.wmc.data.remote.model.Promo data) {
    }
    
    private final void startPurchase() {
    }
    
    private final void prepareSubscriptionList(java.lang.String price) {
    }
    
    private final void onSubscriptionItemClicked(no.wmc.domain.model.NewSubscription subscription) {
    }
    
    private final void initPurchase(com.android.billingclient.api.ProductDetails productDetails) {
    }
    
    private final void handlePurchase(com.android.billingclient.api.Purchase purchase) {
    }
    
    private final void updateUserInformation(com.android.billingclient.api.Purchase purchase) {
    }
    
    @java.lang.Override
    protected void handleViewAction(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewAction viewAction) {
    }
    
    private final void handleSubscriptionAddedInFireStore(no.wmc.ui.base.ViewState<java.lang.String> viewState) {
    }
}