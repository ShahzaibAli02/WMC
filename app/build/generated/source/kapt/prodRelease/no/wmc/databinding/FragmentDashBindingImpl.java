package no.wmc.databinding;
import no.wmc.R;
import no.wmc.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDashBindingImpl extends FragmentDashBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(21);
        sIncludes.setIncludes(1, 
            new String[] {"new_bottom_bar"},
            new int[] {2},
            new int[] {no.wmc.R.layout.new_bottom_bar});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.navLayout, 3);
        sViewsWithIds.put(R.id.profile_image, 4);
        sViewsWithIds.put(R.id.txtName, 5);
        sViewsWithIds.put(R.id.txtMemberSince, 6);
        sViewsWithIds.put(R.id.txtPrivacyPolicy, 7);
        sViewsWithIds.put(R.id.txtTermsAndConditions, 8);
        sViewsWithIds.put(R.id.txtChanepassword, 9);
        sViewsWithIds.put(R.id.lytMemberShipBadge, 10);
        sViewsWithIds.put(R.id.lytSecurityAndPrivacy, 11);
        sViewsWithIds.put(R.id.lytEmergency, 12);
        sViewsWithIds.put(R.id.lytAboutus, 13);
        sViewsWithIds.put(R.id.lytContactUs, 14);
        sViewsWithIds.put(R.id.lytDelete, 15);
        sViewsWithIds.put(R.id.lytLogout, 16);
        sViewsWithIds.put(R.id.lytHeader, 17);
        sViewsWithIds.put(R.id.imageMenu, 18);
        sViewsWithIds.put(R.id.txtheaderTitle, 19);
        sViewsWithIds.put(R.id.navHostNew, 20);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDashBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private FragmentDashBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (no.wmc.databinding.NewBottomBarBinding) bindings[2]
            , (com.infideap.drawerbehavior.Advance3DDrawerLayout) bindings[0]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.FrameLayout) bindings[17]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[11]
            , (androidx.fragment.app.FragmentContainerView) bindings[20]
            , (com.google.android.material.navigation.NavigationView) bindings[3]
            , (android.widget.FrameLayout) bindings[1]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[19]
            );
        setContainedBinding(this.bottomBar);
        this.drawerLayout.setTag(null);
        this.parent.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        bottomBar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (bottomBar.hasPendingBindings()) {
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
        bottomBar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeBottomBar((no.wmc.databinding.NewBottomBarBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeBottomBar(no.wmc.databinding.NewBottomBarBinding BottomBar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        executeBindingsOn(bottomBar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): bottomBar
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}