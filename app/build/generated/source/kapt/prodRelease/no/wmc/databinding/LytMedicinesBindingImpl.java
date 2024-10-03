package no.wmc.databinding;
import no.wmc.R;
import no.wmc.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LytMedicinesBindingImpl extends LytMedicinesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.scrollView, 1);
        sViewsWithIds.put(R.id.mainLayout, 2);
        sViewsWithIds.put(R.id.expandableCardDiagnoses, 3);
        sViewsWithIds.put(R.id.titlePanelDiagnoses, 4);
        sViewsWithIds.put(R.id.iconDiagnoses, 5);
        sViewsWithIds.put(R.id.titleDiagnoses, 6);
        sViewsWithIds.put(R.id.descriptionDiagnoses, 7);
        sViewsWithIds.put(R.id.expandButtonDiagnoses, 8);
        sViewsWithIds.put(R.id.infoLayoutDiagnoses, 9);
        sViewsWithIds.put(R.id.rvDiagnosesList, 10);
        sViewsWithIds.put(R.id.diagnosesLoading, 11);
        sViewsWithIds.put(R.id.editActionDiagnosesLayout, 12);
        sViewsWithIds.put(R.id.cancelEditItemButtonDiagnoses, 13);
        sViewsWithIds.put(R.id.removeItemButtonDiagnoses, 14);
        sViewsWithIds.put(R.id.cardActionDiagnosesLayout, 15);
        sViewsWithIds.put(R.id.addButtonDiagnoses, 16);
        sViewsWithIds.put(R.id.translateButtonDiagnoses, 17);
        sViewsWithIds.put(R.id.shareButtonDiagnoses, 18);
        sViewsWithIds.put(R.id.expandableCardMedicine, 19);
        sViewsWithIds.put(R.id.titlePanelMedicine, 20);
        sViewsWithIds.put(R.id.iconMedicine, 21);
        sViewsWithIds.put(R.id.titleMedicine, 22);
        sViewsWithIds.put(R.id.descriptionMedicine, 23);
        sViewsWithIds.put(R.id.expandButtonMedicine, 24);
        sViewsWithIds.put(R.id.infoLayoutMedicine, 25);
        sViewsWithIds.put(R.id.rvMedicineList, 26);
        sViewsWithIds.put(R.id.medicineLoading, 27);
        sViewsWithIds.put(R.id.editActionMedicineLayout, 28);
        sViewsWithIds.put(R.id.cancelEditItemButtonMedicine, 29);
        sViewsWithIds.put(R.id.removeItemButtonMedicine, 30);
        sViewsWithIds.put(R.id.cardActionLayoutMedicine, 31);
        sViewsWithIds.put(R.id.addButtonMedicine, 32);
        sViewsWithIds.put(R.id.translateButtonMedicine, 33);
        sViewsWithIds.put(R.id.shareButtonMedicine, 34);
        sViewsWithIds.put(R.id.expandableCardAllergies, 35);
        sViewsWithIds.put(R.id.titlePanelAllergies, 36);
        sViewsWithIds.put(R.id.iconAllergies, 37);
        sViewsWithIds.put(R.id.titleAllergies, 38);
        sViewsWithIds.put(R.id.descriptionAllergies, 39);
        sViewsWithIds.put(R.id.expandButtonAllergies, 40);
        sViewsWithIds.put(R.id.infoLayoutAllergies, 41);
        sViewsWithIds.put(R.id.rvAllergiesList, 42);
        sViewsWithIds.put(R.id.allergiesLoading, 43);
        sViewsWithIds.put(R.id.editActionAllergiesLayout, 44);
        sViewsWithIds.put(R.id.cancelEditItemButtonAllergies, 45);
        sViewsWithIds.put(R.id.removeItemButtonAllergies, 46);
        sViewsWithIds.put(R.id.cardActionAllergiesLayout, 47);
        sViewsWithIds.put(R.id.addButtonAllergies, 48);
        sViewsWithIds.put(R.id.translateButtonAllergies, 49);
        sViewsWithIds.put(R.id.shareButtonAllergies, 50);
        sViewsWithIds.put(R.id.expandableCardVaccines, 51);
        sViewsWithIds.put(R.id.titlePanelVaccines, 52);
        sViewsWithIds.put(R.id.iconVaccines, 53);
        sViewsWithIds.put(R.id.titleVaccines, 54);
        sViewsWithIds.put(R.id.descriptionVaccines, 55);
        sViewsWithIds.put(R.id.expandButtonVaccines, 56);
        sViewsWithIds.put(R.id.infoLayoutVaccines, 57);
        sViewsWithIds.put(R.id.rvVaccinesList, 58);
        sViewsWithIds.put(R.id.vaccinesLoading, 59);
        sViewsWithIds.put(R.id.editActionVaccinesLayout, 60);
        sViewsWithIds.put(R.id.cancelEditItemButtonVaccines, 61);
        sViewsWithIds.put(R.id.removeItemButtonVaccines, 62);
        sViewsWithIds.put(R.id.cardActionLayoutVaccines, 63);
        sViewsWithIds.put(R.id.addButtonVaccines, 64);
        sViewsWithIds.put(R.id.translateButtonVaccines, 65);
        sViewsWithIds.put(R.id.shareButtonVaccines, 66);
        sViewsWithIds.put(R.id.expandableCardDocuments, 67);
        sViewsWithIds.put(R.id.titlePanelDocuments, 68);
        sViewsWithIds.put(R.id.iconDocuments, 69);
        sViewsWithIds.put(R.id.titleDocuments, 70);
        sViewsWithIds.put(R.id.descriptionDocuments, 71);
        sViewsWithIds.put(R.id.expandButtonDocuments, 72);
        sViewsWithIds.put(R.id.infoLayoutDocuments, 73);
        sViewsWithIds.put(R.id.rvDocumentsList, 74);
        sViewsWithIds.put(R.id.documentLoading, 75);
        sViewsWithIds.put(R.id.editActionLayoutDocuments, 76);
        sViewsWithIds.put(R.id.cancelEditItemButtonDocuments, 77);
        sViewsWithIds.put(R.id.removeItemButtonDocuments, 78);
        sViewsWithIds.put(R.id.cardActionLayoutDocuments, 79);
        sViewsWithIds.put(R.id.translateButtonDocuments, 80);
        sViewsWithIds.put(R.id.addButtonDocuments, 81);
        sViewsWithIds.put(R.id.editButtonDocuments, 82);
        sViewsWithIds.put(R.id.shareButtonDocuments, 83);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LytMedicinesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 84, sIncludes, sViewsWithIds));
    }
    private LytMedicinesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[48]
            , (android.widget.LinearLayout) bindings[16]
            , (com.google.android.material.button.MaterialButton) bindings[81]
            , (android.widget.LinearLayout) bindings[32]
            , (android.widget.LinearLayout) bindings[64]
            , (android.widget.ProgressBar) bindings[43]
            , (android.widget.TextView) bindings[45]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[77]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[61]
            , (android.widget.HorizontalScrollView) bindings[47]
            , (android.widget.HorizontalScrollView) bindings[15]
            , (android.widget.HorizontalScrollView) bindings[79]
            , (android.widget.HorizontalScrollView) bindings[31]
            , (android.widget.HorizontalScrollView) bindings[63]
            , (android.widget.TextView) bindings[39]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[71]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[55]
            , (android.widget.ProgressBar) bindings[11]
            , (android.widget.ProgressBar) bindings[75]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[44]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[76]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[28]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[60]
            , (com.google.android.material.button.MaterialButton) bindings[82]
            , (android.widget.ImageView) bindings[40]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[72]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[56]
            , (com.google.android.material.card.MaterialCardView) bindings[35]
            , (com.google.android.material.card.MaterialCardView) bindings[3]
            , (com.google.android.material.card.MaterialCardView) bindings[67]
            , (com.google.android.material.card.MaterialCardView) bindings[19]
            , (com.google.android.material.card.MaterialCardView) bindings[51]
            , (android.widget.ImageView) bindings[37]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[69]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[53]
            , (android.widget.LinearLayout) bindings[41]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[73]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[57]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.ProgressBar) bindings[27]
            , (android.widget.LinearLayout) bindings[0]
            , (android.widget.TextView) bindings[46]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[78]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[62]
            , (androidx.recyclerview.widget.RecyclerView) bindings[42]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[74]
            , (androidx.recyclerview.widget.RecyclerView) bindings[26]
            , (androidx.recyclerview.widget.RecyclerView) bindings[58]
            , (android.widget.ScrollView) bindings[1]
            , (android.widget.LinearLayout) bindings[50]
            , (android.widget.LinearLayout) bindings[18]
            , (com.google.android.material.button.MaterialButton) bindings[83]
            , (android.widget.LinearLayout) bindings[34]
            , (android.widget.LinearLayout) bindings[66]
            , (android.widget.TextView) bindings[38]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[70]
            , (android.widget.TextView) bindings[22]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[36]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[68]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[20]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[52]
            , (android.widget.TextView) bindings[54]
            , (android.widget.LinearLayout) bindings[49]
            , (android.widget.LinearLayout) bindings[17]
            , (com.google.android.material.button.MaterialButton) bindings[80]
            , (android.widget.LinearLayout) bindings[33]
            , (android.widget.LinearLayout) bindings[65]
            , (android.widget.ProgressBar) bindings[59]
            );
        this.parent.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}