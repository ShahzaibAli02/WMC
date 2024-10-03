package no.wmc.ui.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/ui/profile/ProfileViewEvent;", "Lno/wmc/ui/base/ViewEvent;", "()V", "GetProfileViewEvent", "UpdateProfileViewEvent", "Lno/wmc/ui/profile/ProfileViewEvent$GetProfileViewEvent;", "Lno/wmc/ui/profile/ProfileViewEvent$UpdateProfileViewEvent;", "wmc-3.1.40-b11_devDebug"})
public abstract class ProfileViewEvent extends no.wmc.ui.base.ViewEvent {
    
    private ProfileViewEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lno/wmc/ui/profile/ProfileViewEvent$GetProfileViewEvent;", "Lno/wmc/ui/profile/ProfileViewEvent;", "()V", "wmc-3.1.40-b11_devDebug"})
    public static final class GetProfileViewEvent extends no.wmc.ui.profile.ProfileViewEvent {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.profile.ProfileViewEvent.GetProfileViewEvent INSTANCE = null;
        
        private GetProfileViewEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/ui/profile/ProfileViewEvent$UpdateProfileViewEvent;", "Lno/wmc/ui/profile/ProfileViewEvent;", "profileUpdate", "Lno/wmc/domain/model/ProfileUpdate;", "(Lno/wmc/domain/model/ProfileUpdate;)V", "getProfileUpdate", "()Lno/wmc/domain/model/ProfileUpdate;", "wmc-3.1.40-b11_devDebug"})
    public static final class UpdateProfileViewEvent extends no.wmc.ui.profile.ProfileViewEvent {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.domain.model.ProfileUpdate profileUpdate = null;
        
        public UpdateProfileViewEvent(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.ProfileUpdate profileUpdate) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.domain.model.ProfileUpdate getProfileUpdate() {
            return null;
        }
    }
}