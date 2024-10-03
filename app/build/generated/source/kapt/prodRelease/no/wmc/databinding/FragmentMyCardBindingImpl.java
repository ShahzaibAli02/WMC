package no.wmc.databinding;
import no.wmc.R;
import no.wmc.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMyCardBindingImpl extends FragmentMyCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(11);
        sIncludes.setIncludes(1, 
            new String[] {"lyt_new_card"},
            new int[] {2},
            new int[] {no.wmc.R.layout.lyt_new_card});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.lytShare, 3);
        sViewsWithIds.put(R.id.lytInvite, 4);
        sViewsWithIds.put(R.id.lytDocument, 5);
        sViewsWithIds.put(R.id.lyt_order_card, 6);
        sViewsWithIds.put(R.id.imgOrderFree, 7);
        sViewsWithIds.put(R.id.lyt_card_info, 8);
        sViewsWithIds.put(R.id.txtMedicalInfo, 9);
        sViewsWithIds.put(R.id.imgReorder, 10);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.FrameLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMyCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentMyCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[4]
            , (no.wmc.databinding.LytNewCardBinding) bindings[2]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.TextView) bindings[9]
            );
        setContainedBinding(this.lytNewCard);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.FrameLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        lytNewCard.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (lytNewCard.hasPendingBindings()) {
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
        lytNewCard.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLytNewCard((no.wmc.databinding.LytNewCardBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLytNewCard(no.wmc.databinding.LytNewCardBinding LytNewCard, int fieldId) {
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
        executeBindingsOn(lytNewCard);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): lytNewCard
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}