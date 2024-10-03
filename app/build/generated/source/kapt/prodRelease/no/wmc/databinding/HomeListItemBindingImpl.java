package no.wmc.databinding;
import no.wmc.R;
import no.wmc.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HomeListItemBindingImpl extends HomeListItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HomeListItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private HomeListItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.checkbox.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setModel((no.wmc.domain.model.MedicalItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setModel(@Nullable no.wmc.domain.model.MedicalItem Model) {
        this.mModel = Model;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.model);
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
        no.wmc.domain.model.MedicalItem model = mModel;
        int modelIsEditModeViewVISIBLEViewGONE = 0;
        java.lang.String modelProfileItemCode = null;
        boolean modelIsEditMode = false;
        java.lang.String modelProfileItemDescription = null;
        no.wmc.domain.model.ProfileItem.Item modelProfileItem = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (model != null) {
                    // read model.isEditMode
                    modelIsEditMode = model.isEditMode();
                    // read model.profileItem
                    modelProfileItem = model.getProfileItem();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(modelIsEditMode) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read model.isEditMode ? View.VISIBLE : View.GONE
                modelIsEditModeViewVISIBLEViewGONE = ((modelIsEditMode) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                if (modelProfileItem != null) {
                    // read model.profileItem.code
                    modelProfileItemCode = modelProfileItem.getCode();
                    // read model.profileItem.description
                    modelProfileItemDescription = modelProfileItem.getDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.checkbox.setVisibility(modelIsEditModeViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, modelProfileItemCode);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, modelProfileItemDescription);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): model
        flag 1 (0x2L): null
        flag 2 (0x3L): model.isEditMode ? View.VISIBLE : View.GONE
        flag 3 (0x4L): model.isEditMode ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}