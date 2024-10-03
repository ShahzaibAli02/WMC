package no.wmc.ui.medical;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/ui/medical/AddMedicalInfoViewAction;", "Lno/wmc/ui/base/ViewAction;", "()V", "AddMedicalItemAction", "SearchMedicalItemAction", "Lno/wmc/ui/medical/AddMedicalInfoViewAction$AddMedicalItemAction;", "Lno/wmc/ui/medical/AddMedicalInfoViewAction$SearchMedicalItemAction;", "wmc-3.1.40-b11_prodRelease"})
public abstract class AddMedicalInfoViewAction extends no.wmc.ui.base.ViewAction {
    
    private AddMedicalInfoViewAction() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\u0002\u0010\u0006R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/medical/AddMedicalInfoViewAction$SearchMedicalItemAction;", "Lno/wmc/ui/medical/AddMedicalInfoViewAction;", "viewState", "Lno/wmc/ui/base/ViewState;", "", "Lno/wmc/domain/model/ProfileItem$Item;", "(Lno/wmc/ui/base/ViewState;)V", "getViewState", "()Lno/wmc/ui/base/ViewState;", "wmc-3.1.40-b11_prodRelease"})
    public static final class SearchMedicalItemAction extends no.wmc.ui.medical.AddMedicalInfoViewAction {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.ProfileItem.Item>> viewState = null;
        
        public SearchMedicalItemAction(@org.jetbrains.annotations.NotNull
        no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.ProfileItem.Item>> viewState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.ProfileItem.Item>> getViewState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lno/wmc/ui/medical/AddMedicalInfoViewAction$AddMedicalItemAction;", "Lno/wmc/ui/medical/AddMedicalInfoViewAction;", "viewState", "Lno/wmc/ui/base/ViewState;", "", "(Lno/wmc/ui/base/ViewState;)V", "getViewState", "()Lno/wmc/ui/base/ViewState;", "wmc-3.1.40-b11_prodRelease"})
    public static final class AddMedicalItemAction extends no.wmc.ui.medical.AddMedicalInfoViewAction {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.ui.base.ViewState<kotlin.Unit> viewState = null;
        
        public AddMedicalItemAction(@org.jetbrains.annotations.NotNull
        no.wmc.ui.base.ViewState<kotlin.Unit> viewState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.ui.base.ViewState<kotlin.Unit> getViewState() {
            return null;
        }
    }
}