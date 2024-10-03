package no.wmc.ui.medical;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/medical/AddMedicalInfoViewEvent;", "Lno/wmc/ui/base/ViewEvent;", "()V", "AddMedicalItemEvent", "LoadMoreMedicalItemEvent", "SearchMedicalItemEvent", "Lno/wmc/ui/medical/AddMedicalInfoViewEvent$AddMedicalItemEvent;", "Lno/wmc/ui/medical/AddMedicalInfoViewEvent$LoadMoreMedicalItemEvent;", "Lno/wmc/ui/medical/AddMedicalInfoViewEvent$SearchMedicalItemEvent;", "wmc-3.1.40-b11_prodRelease"})
public abstract class AddMedicalInfoViewEvent extends no.wmc.ui.base.ViewEvent {
    
    private AddMedicalInfoViewEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lno/wmc/ui/medical/AddMedicalInfoViewEvent$SearchMedicalItemEvent;", "Lno/wmc/ui/medical/AddMedicalInfoViewEvent;", "profileItemEnum", "Lno/wmc/domain/enums/ProfileItemEnum;", "keyword", "", "(Lno/wmc/domain/enums/ProfileItemEnum;Ljava/lang/String;)V", "getKeyword", "()Ljava/lang/String;", "getProfileItemEnum", "()Lno/wmc/domain/enums/ProfileItemEnum;", "wmc-3.1.40-b11_prodRelease"})
    public static final class SearchMedicalItemEvent extends no.wmc.ui.medical.AddMedicalInfoViewEvent {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.domain.enums.ProfileItemEnum profileItemEnum = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String keyword = null;
        
        public SearchMedicalItemEvent(@org.jetbrains.annotations.NotNull
        no.wmc.domain.enums.ProfileItemEnum profileItemEnum, @org.jetbrains.annotations.NotNull
        java.lang.String keyword) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.domain.enums.ProfileItemEnum getProfileItemEnum() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getKeyword() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/ui/medical/AddMedicalInfoViewEvent$LoadMoreMedicalItemEvent;", "Lno/wmc/ui/medical/AddMedicalInfoViewEvent;", "profileItemEnum", "Lno/wmc/domain/enums/ProfileItemEnum;", "(Lno/wmc/domain/enums/ProfileItemEnum;)V", "getProfileItemEnum", "()Lno/wmc/domain/enums/ProfileItemEnum;", "wmc-3.1.40-b11_prodRelease"})
    public static final class LoadMoreMedicalItemEvent extends no.wmc.ui.medical.AddMedicalInfoViewEvent {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.domain.enums.ProfileItemEnum profileItemEnum = null;
        
        public LoadMoreMedicalItemEvent(@org.jetbrains.annotations.NotNull
        no.wmc.domain.enums.ProfileItemEnum profileItemEnum) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.domain.enums.ProfileItemEnum getProfileItemEnum() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lno/wmc/ui/medical/AddMedicalInfoViewEvent$AddMedicalItemEvent;", "Lno/wmc/ui/medical/AddMedicalInfoViewEvent;", "profileItemEnum", "Lno/wmc/domain/enums/ProfileItemEnum;", "profileItem", "Lno/wmc/domain/model/ProfileItem$Item;", "(Lno/wmc/domain/enums/ProfileItemEnum;Lno/wmc/domain/model/ProfileItem$Item;)V", "getProfileItem", "()Lno/wmc/domain/model/ProfileItem$Item;", "getProfileItemEnum", "()Lno/wmc/domain/enums/ProfileItemEnum;", "wmc-3.1.40-b11_prodRelease"})
    public static final class AddMedicalItemEvent extends no.wmc.ui.medical.AddMedicalInfoViewEvent {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.domain.enums.ProfileItemEnum profileItemEnum = null;
        @org.jetbrains.annotations.NotNull
        private final no.wmc.domain.model.ProfileItem.Item profileItem = null;
        
        public AddMedicalItemEvent(@org.jetbrains.annotations.NotNull
        no.wmc.domain.enums.ProfileItemEnum profileItemEnum, @org.jetbrains.annotations.NotNull
        no.wmc.domain.model.ProfileItem.Item profileItem) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.domain.enums.ProfileItemEnum getProfileItemEnum() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.domain.model.ProfileItem.Item getProfileItem() {
            return null;
        }
    }
}