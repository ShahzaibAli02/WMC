package no.wmc.databinding;
import no.wmc.R;
import no.wmc.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentEmergencyBindingImpl extends FragmentEmergencyBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(10);
        sIncludes.setIncludes(1, 
            new String[] {"lyt_medicines"},
            new int[] {3},
            new int[] {no.wmc.R.layout.lyt_medicines});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.extraEmergencyInfo, 2);
        sViewsWithIds.put(R.id.etUserId, 4);
        sViewsWithIds.put(R.id.btnSearch, 5);
        sViewsWithIds.put(R.id.txtShowingResultsFor, 6);
        sViewsWithIds.put(R.id.userInfo, 7);
        sViewsWithIds.put(R.id.imageUser, 8);
        sViewsWithIds.put(R.id.memberName, 9);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentEmergencyBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentEmergencyBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (android.view.View) bindings[2]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[8]
            , (android.widget.LinearLayout) bindings[1]
            , (no.wmc.databinding.LytMedicinesBinding) bindings[3]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.LinearLayout) bindings[7]
            );
        this.mainLyt.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setContainedBinding(this.medicines);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        medicines.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (medicines.hasPendingBindings()) {
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
        medicines.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMedicines((no.wmc.databinding.LytMedicinesBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMedicines(no.wmc.databinding.LytMedicinesBinding Medicines, int fieldId) {
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
        executeBindingsOn(medicines);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): medicines
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}