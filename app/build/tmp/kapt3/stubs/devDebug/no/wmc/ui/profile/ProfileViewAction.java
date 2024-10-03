package no.wmc.ui.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/ui/profile/ProfileViewAction;", "Lno/wmc/ui/base/ViewAction;", "()V", "GetProfileViewAction", "UpdateProfileViewAction", "Lno/wmc/ui/profile/ProfileViewAction$GetProfileViewAction;", "Lno/wmc/ui/profile/ProfileViewAction$UpdateProfileViewAction;", "wmc-3.1.40-b11_devDebug"})
public abstract class ProfileViewAction extends no.wmc.ui.base.ViewAction {
    
    private ProfileViewAction() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lno/wmc/ui/profile/ProfileViewAction$GetProfileViewAction;", "Lno/wmc/ui/profile/ProfileViewAction;", "viewState", "Lno/wmc/ui/base/ViewState;", "Lno/wmc/domain/model/Profile;", "(Lno/wmc/ui/base/ViewState;)V", "getViewState", "()Lno/wmc/ui/base/ViewState;", "wmc-3.1.40-b11_devDebug"})
    public static final class GetProfileViewAction extends no.wmc.ui.profile.ProfileViewAction {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.ui.base.ViewState<no.wmc.domain.model.Profile> viewState = null;
        
        public GetProfileViewAction(@org.jetbrains.annotations.NotNull
        no.wmc.ui.base.ViewState<no.wmc.domain.model.Profile> viewState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.ui.base.ViewState<no.wmc.domain.model.Profile> getViewState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lno/wmc/ui/profile/ProfileViewAction$UpdateProfileViewAction;", "Lno/wmc/ui/profile/ProfileViewAction;", "viewState", "Lno/wmc/ui/base/ViewState;", "", "(Lno/wmc/ui/base/ViewState;)V", "getViewState", "()Lno/wmc/ui/base/ViewState;", "wmc-3.1.40-b11_devDebug"})
    public static final class UpdateProfileViewAction extends no.wmc.ui.profile.ProfileViewAction {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.ui.base.ViewState<kotlin.Unit> viewState = null;
        
        public UpdateProfileViewAction(@org.jetbrains.annotations.NotNull
        no.wmc.ui.base.ViewState<kotlin.Unit> viewState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.ui.base.ViewState<kotlin.Unit> getViewState() {
            return null;
        }
    }
}