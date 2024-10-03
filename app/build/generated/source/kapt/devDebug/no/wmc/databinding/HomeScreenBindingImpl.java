package no.wmc.databinding;
import no.wmc.R;
import no.wmc.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HomeScreenBindingImpl extends HomeScreenBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(16);
        sIncludes.setIncludes(1, 
            new String[] {"profile_expandable_card", "wmc_banner"},
            new int[] {3, 4},
            new int[] {no.wmc.R.layout.profile_expandable_card,
                no.wmc.R.layout.wmc_banner});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.loading, 2);
        sViewsWithIds.put(R.id.title, 5);
        sViewsWithIds.put(R.id.menuButton, 6);
        sViewsWithIds.put(R.id.incompleteProfileByline, 7);
        sViewsWithIds.put(R.id.incompleteProfileDescription, 8);
        sViewsWithIds.put(R.id.allergies, 9);
        sViewsWithIds.put(R.id.medicine, 10);
        sViewsWithIds.put(R.id.diagnoses, 11);
        sViewsWithIds.put(R.id.vaccines, 12);
        sViewsWithIds.put(R.id.documents, 13);
        sViewsWithIds.put(R.id.noSubscriptionPanel, 14);
        sViewsWithIds.put(R.id.subscribeNowButton, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomeScreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private HomeScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (no.wmc.ui.custom.ExpandableCard) bindings[9]
            , (no.wmc.ui.custom.ExpandableCard) bindings[11]
            , (no.wmc.ui.custom.ExpandableCard) bindings[13]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.view.View) bindings[2]
            , (android.widget.LinearLayout) bindings[1]
            , (no.wmc.ui.custom.ExpandableCard) bindings[10]
            , (android.widget.Button) bindings[6]
            , (android.widget.LinearLayout) bindings[14]
            , (no.wmc.databinding.ProfileExpandableCardBinding) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[15]
            , (android.widget.TextView) bindings[5]
            , (no.wmc.ui.custom.ExpandableCard) bindings[12]
            , (no.wmc.databinding.WmcBannerBinding) bindings[4]
            );
        this.mainLayout.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setContainedBinding(this.profileExpandableCard);
        setContainedBinding(this.wmcBanner);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        profileExpandableCard.invalidateAll();
        wmcBanner.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (profileExpandableCard.hasPendingBindings()) {
            return true;
        }
        if (wmcBanner.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        profileExpandableCard.setLifecycleOwner(lifecycleOwner);
        wmcBanner.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeWmcBanner((no.wmc.databinding.WmcBannerBinding) object, fieldId);
            case 1 :
                return onChangeProfileExpandableCard((no.wmc.databinding.ProfileExpandableCardBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeWmcBanner(no.wmc.databinding.WmcBannerBinding WmcBanner, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeProfileExpandableCard(no.wmc.databinding.ProfileExpandableCardBinding ProfileExpandableCard, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        // batch finished
        executeBindingsOn(profileExpandableCard);
        executeBindingsOn(wmcBanner);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): wmcBanner
        flag 1 (0x2L): profileExpandableCard
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}