package no.wmc.databinding;
import no.wmc.R;
import no.wmc.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SubscriptionDetailScreenBindingImpl extends SubscriptionDetailScreenBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 6);
        sViewsWithIds.put(R.id.title, 7);
        sViewsWithIds.put(R.id.subscriptionManagerTitle, 8);
        sViewsWithIds.put(R.id.membershipOccupancyTitle, 9);
        sViewsWithIds.put(R.id.expiredTitle, 10);
        sViewsWithIds.put(R.id.membershipHint, 11);
        sViewsWithIds.put(R.id.membersLayout, 12);
        sViewsWithIds.put(R.id.addMemberButton, 13);
        sViewsWithIds.put(R.id.paidWithTitle, 14);
        sViewsWithIds.put(R.id.paymentCard, 15);
        sViewsWithIds.put(R.id.cancelSubscriptionButton, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.appcompat.widget.LinearLayoutCompat mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.ProgressBar mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SubscriptionDetailScreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private SubscriptionDetailScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[13]
            , (com.google.android.material.button.MaterialButton) bindings[16]
            , (android.widget.TextView) bindings[10]
            , (androidx.appcompat.widget.LinearLayoutCompat) bindings[12]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[14]
            , (com.google.android.material.card.MaterialCardView) bindings[15]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[7]
            , (androidx.appcompat.widget.Toolbar) bindings[6]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.appcompat.widget.LinearLayoutCompat) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView5 = (android.widget.ProgressBar) bindings[5];
        this.mboundView5.setTag(null);
        this.paymentMethodNumber.setTag(null);
        this.paymentMethodTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.model == variableId) {
            setModel((no.wmc.domain.model.Subscription) variable);
        }
        else if (BR.isLoading == variableId) {
            setIsLoading((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable no.wmc.domain.model.Subscription Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
        super.requestRebind();
    }
    public void setIsLoading(@Nullable java.lang.Boolean IsLoading) {
        this.mIsLoading = IsLoading;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.isLoading);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        no.wmc.domain.model.Subscription model = mModel;
        int isLoadingViewGONEViewVISIBLE = 0;
        java.lang.String modelName = null;
        java.lang.String modelPaymentMethodTitle = null;
        java.lang.String modelNumber = null;
        int isLoadingViewVISIBLEViewGONE = 0;
        java.lang.Boolean isLoading = mIsLoading;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsLoading = false;

        if ((dirtyFlags & 0x5L) != 0) {



                if (model != null) {
                    // read model.name
                    modelName = model.getName();
                    // read model.paymentMethodTitle
                    modelPaymentMethodTitle = model.getPaymentMethodTitle();
                    // read model.number
                    modelNumber = model.getNumber();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isLoading)
                androidxDatabindingViewDataBindingSafeUnboxIsLoading = androidx.databinding.ViewDataBinding.safeUnbox(isLoading);
            if((dirtyFlags & 0x6L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsLoading) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.GONE : View.VISIBLE
                isLoadingViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxIsLoading) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.VISIBLE : View.GONE
                isLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxIsLoading) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(isLoadingViewGONEViewVISIBLE);
            this.mboundView5.setVisibility(isLoadingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, modelName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paymentMethodNumber, modelNumber);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.paymentMethodTitle, modelPaymentMethodTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): isLoading
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.GONE : View.VISIBLE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(isLoading) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}