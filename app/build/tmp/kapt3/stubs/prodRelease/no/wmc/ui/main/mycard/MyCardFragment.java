package no.wmc.ui.main.mycard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 U2\u00020\u0001:\u0002UVB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u0015J\u0010\u00104\u001a\u0002022\u0006\u0010!\u001a\u00020\"H\u0002J\b\u00105\u001a\u000202H\u0002J\u0011\u00106\u001a\u000202H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\u0010\u00108\u001a\u0002022\u0006\u0010!\u001a\u00020\"H\u0002J\u0006\u00109\u001a\u000202J\b\u0010:\u001a\u000202H\u0002J\b\u0010;\u001a\u000202H\u0002J\b\u0010<\u001a\u000202H\u0002J\b\u0010=\u001a\u000202H\u0002J$\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u001a\u0010F\u001a\u0002022\u0006\u0010G\u001a\u00020?2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u0006\u0010H\u001a\u000202J\u0006\u0010I\u001a\u000202J\b\u0010J\u001a\u000202H\u0002J\u0012\u0010K\u001a\u0002022\b\u0010L\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010M\u001a\u000202J\u0010\u0010N\u001a\u0002022\u0006\u0010O\u001a\u00020PH\u0002J\u0018\u0010Q\u001a\u0002022\u0006\u0010R\u001a\u00020\u00042\u0006\u0010S\u001a\u00020\u0004H\u0002J\b\u0010T\u001a\u000202H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u000e\u001a\u0004\b\'\u0010(R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u0010\u000e\u001a\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006W"}, d2 = {"Lno/wmc/ui/main/mycard/MyCardFragment;", "Landroidx/fragment/app/Fragment;", "()V", "CARD_REORDER_ID", "", "billingClient", "Lcom/android/billingclient/api/BillingClient;", "binding", "Lno/wmc/databinding/FragmentMyCardBinding;", "cardOrderApiService", "Lno/wmc/data/remote/service/CardOrderApiService;", "getCardOrderApiService", "()Lno/wmc/data/remote/service/CardOrderApiService;", "cardOrderApiService$delegate", "Lkotlin/Lazy;", "fireStoreProvider", "Lno/wmc/data/remote/providers/FireStoreProvider;", "getFireStoreProvider", "()Lno/wmc/data/remote/providers/FireStoreProvider;", "fireStoreProvider$delegate", "hasActiveSub", "", "localDataManager", "Lno/wmc/data/local/manager/LocalDataManager;", "getLocalDataManager", "()Lno/wmc/data/local/manager/LocalDataManager;", "localDataManager$delegate", "progressDialog", "Landroid/app/ProgressDialog;", "getProgressDialog", "()Landroid/app/ProgressDialog;", "setProgressDialog", "(Landroid/app/ProgressDialog;)V", "purchase", "Lcom/android/billingclient/api/Purchase;", "purchasesUpdatedListener", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "redeemCodeManager", "Lno/wmc/data/manager/RedeemCodeManager;", "getRedeemCodeManager", "()Lno/wmc/data/manager/RedeemCodeManager;", "redeemCodeManager$delegate", "reorderProduct", "Lcom/android/billingclient/api/ProductDetails;", "sharedPrefManage", "Lno/wmc/data/local/manager/SharedPrefManager;", "getSharedPrefManage", "()Lno/wmc/data/local/manager/SharedPrefManager;", "sharedPrefManage$delegate", "confirmCardInfoCorrect", "", "needPurchase", "consumePurchase", "getProducts", "getUserFromFirebase", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handlePurchase", "hideLoadingDialog", "initPlayBilling", "initPurchase", "loadActiveSub", "loadData", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "orderCard", "queryPreviousPurchases", "shareUserDate", "show", "jsonUser", "showLoadingDialog", "showMedicalInfo", "profile", "Lno/wmc/domain/model/Profile;", "showMessage", "message", "btn", "showOrderCardDialog", "Companion", "RetryInterceptor", "wmc-3.1.40-b11_prodRelease"})
public final class MyCardFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    public static final no.wmc.ui.main.mycard.MyCardFragment.Companion Companion = null;
    private static boolean isShown = false;
    private static boolean cardOrdered = false;
    private final kotlin.Lazy sharedPrefManage$delegate = null;
    private final kotlin.Lazy localDataManager$delegate = null;
    private final kotlin.Lazy fireStoreProvider$delegate = null;
    private final kotlin.Lazy redeemCodeManager$delegate = null;
    private no.wmc.databinding.FragmentMyCardBinding binding;
    private boolean hasActiveSub = false;
    private java.lang.String CARD_REORDER_ID = "wmc_card_reorder";
    private com.android.billingclient.api.BillingClient billingClient;
    private final kotlin.Lazy cardOrderApiService$delegate = null;
    private final com.android.billingclient.api.PurchasesUpdatedListener purchasesUpdatedListener = null;
    private com.android.billingclient.api.Purchase purchase;
    private com.android.billingclient.api.ProductDetails reorderProduct;
    @org.jetbrains.annotations.Nullable
    private android.app.ProgressDialog progressDialog;
    
    public MyCardFragment() {
        super();
    }
    
    private final no.wmc.data.local.manager.SharedPrefManager getSharedPrefManage() {
        return null;
    }
    
    private final no.wmc.data.local.manager.LocalDataManager getLocalDataManager() {
        return null;
    }
    
    private final no.wmc.data.remote.providers.FireStoreProvider getFireStoreProvider() {
        return null;
    }
    
    private final no.wmc.data.manager.RedeemCodeManager getRedeemCodeManager() {
        return null;
    }
    
    private final no.wmc.data.remote.service.CardOrderApiService getCardOrderApiService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void queryPreviousPurchases() {
    }
    
    private final void handlePurchase(com.android.billingclient.api.Purchase purchase) {
    }
    
    private final void consumePurchase(com.android.billingclient.api.Purchase purchase) {
    }
    
    private final void getProducts() {
    }
    
    private final void initPlayBilling() {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initPurchase() {
    }
    
    private final void loadActiveSub() {
    }
    
    private final void shareUserDate() {
    }
    
    public final void confirmCardInfoCorrect(boolean needPurchase) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getUserFromFirebase(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void loadData() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.app.ProgressDialog getProgressDialog() {
        return null;
    }
    
    public final void setProgressDialog(@org.jetbrains.annotations.Nullable
    android.app.ProgressDialog p0) {
    }
    
    public final void showLoadingDialog() {
    }
    
    public final void hideLoadingDialog() {
    }
    
    private final void show(java.lang.String jsonUser) {
    }
    
    private final void showMedicalInfo(no.wmc.domain.model.Profile profile) {
    }
    
    public final void orderCard() {
    }
    
    private final void showMessage(java.lang.String message, java.lang.String btn) {
    }
    
    private final void showOrderCardDialog() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/main/mycard/MyCardFragment$RetryInterceptor;", "Lokhttp3/Interceptor;", "maxRetries", "", "(I)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "wmc-3.1.40-b11_prodRelease"})
    public static final class RetryInterceptor implements okhttp3.Interceptor {
        private final int maxRetries = 0;
        
        public RetryInterceptor(int maxRetries) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull
        okhttp3.Interceptor.Chain chain) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lno/wmc/ui/main/mycard/MyCardFragment$Companion;", "", "()V", "cardOrdered", "", "getCardOrdered", "()Z", "setCardOrdered", "(Z)V", "isShown", "setShown", "wmc-3.1.40-b11_prodRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isShown() {
            return false;
        }
        
        public final void setShown(boolean p0) {
        }
        
        public final boolean getCardOrdered() {
            return false;
        }
        
        public final void setCardOrdered(boolean p0) {
        }
    }
}