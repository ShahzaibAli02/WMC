package no.wmc.ui.main.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\f\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u00a8\u0006\u001b"}, d2 = {"Lno/wmc/ui/main/home/HomeViewEvent;", "Lno/wmc/ui/base/ViewEvent;", "()V", "DownloadDocumentViewEvent", "GetAllergiesViewEvent", "GetDiagnosesViewEvent", "GetDocumentsViewEvent", "GetMedicineViewEvent", "GetProfileViewEvent", "GetVaccinesViewEvent", "OrderCardViewEvent", "RemoveDocumentViewEvent", "RemoveMedicalItemViewEvent", "SetNoAllergiesEvent", "ShareViewEvent", "Lno/wmc/ui/main/home/HomeViewEvent$DownloadDocumentViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent$GetAllergiesViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent$GetDiagnosesViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent$GetDocumentsViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent$GetMedicineViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent$GetProfileViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent$GetVaccinesViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent$OrderCardViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent$RemoveDocumentViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent$RemoveMedicalItemViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent$SetNoAllergiesEvent;", "Lno/wmc/ui/main/home/HomeViewEvent$ShareViewEvent;", "wmc-3.1.40-b11_prodRelease"})
public abstract class HomeViewEvent extends no.wmc.ui.base.ViewEvent {
    
    private HomeViewEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lno/wmc/ui/main/home/HomeViewEvent$GetProfileViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent;", "()V", "wmc-3.1.40-b11_prodRelease"})
    public static final class GetProfileViewEvent extends no.wmc.ui.main.home.HomeViewEvent {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.main.home.HomeViewEvent.GetProfileViewEvent INSTANCE = null;
        
        private GetProfileViewEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lno/wmc/ui/main/home/HomeViewEvent$SetNoAllergiesEvent;", "Lno/wmc/ui/main/home/HomeViewEvent;", "()V", "wmc-3.1.40-b11_prodRelease"})
    public static final class SetNoAllergiesEvent extends no.wmc.ui.main.home.HomeViewEvent {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.main.home.HomeViewEvent.SetNoAllergiesEvent INSTANCE = null;
        
        private SetNoAllergiesEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lno/wmc/ui/main/home/HomeViewEvent$GetAllergiesViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent;", "()V", "wmc-3.1.40-b11_prodRelease"})
    public static final class GetAllergiesViewEvent extends no.wmc.ui.main.home.HomeViewEvent {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.main.home.HomeViewEvent.GetAllergiesViewEvent INSTANCE = null;
        
        private GetAllergiesViewEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lno/wmc/ui/main/home/HomeViewEvent$GetMedicineViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent;", "()V", "wmc-3.1.40-b11_prodRelease"})
    public static final class GetMedicineViewEvent extends no.wmc.ui.main.home.HomeViewEvent {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.main.home.HomeViewEvent.GetMedicineViewEvent INSTANCE = null;
        
        private GetMedicineViewEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lno/wmc/ui/main/home/HomeViewEvent$GetDiagnosesViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent;", "()V", "wmc-3.1.40-b11_prodRelease"})
    public static final class GetDiagnosesViewEvent extends no.wmc.ui.main.home.HomeViewEvent {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.main.home.HomeViewEvent.GetDiagnosesViewEvent INSTANCE = null;
        
        private GetDiagnosesViewEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lno/wmc/ui/main/home/HomeViewEvent$GetVaccinesViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent;", "()V", "wmc-3.1.40-b11_prodRelease"})
    public static final class GetVaccinesViewEvent extends no.wmc.ui.main.home.HomeViewEvent {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.main.home.HomeViewEvent.GetVaccinesViewEvent INSTANCE = null;
        
        private GetVaccinesViewEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lno/wmc/ui/main/home/HomeViewEvent$GetDocumentsViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent;", "()V", "wmc-3.1.40-b11_prodRelease"})
    public static final class GetDocumentsViewEvent extends no.wmc.ui.main.home.HomeViewEvent {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.main.home.HomeViewEvent.GetDocumentsViewEvent INSTANCE = null;
        
        private GetDocumentsViewEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lno/wmc/ui/main/home/HomeViewEvent$ShareViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent;", "context", "Landroid/content/Context;", "shareType", "Lno/wmc/domain/model/ShareType;", "(Landroid/content/Context;Lno/wmc/domain/model/ShareType;)V", "getContext", "()Landroid/content/Context;", "getShareType", "()Lno/wmc/domain/model/ShareType;", "wmc-3.1.40-b11_prodRelease"})
    public static final class ShareViewEvent extends no.wmc.ui.main.home.HomeViewEvent {
        @org.jetbrains.annotations.NotNull
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull
        private final no.wmc.domain.model.ShareType shareType = null;
        
        public ShareViewEvent(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        no.wmc.domain.model.ShareType shareType) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.domain.model.ShareType getShareType() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lno/wmc/ui/main/home/HomeViewEvent$RemoveMedicalItemViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent;", "profileItemEnum", "Lno/wmc/domain/enums/ProfileItemEnum;", "profileItem", "Lno/wmc/domain/model/ProfileItem$Item;", "(Lno/wmc/domain/enums/ProfileItemEnum;Lno/wmc/domain/model/ProfileItem$Item;)V", "getProfileItem", "()Lno/wmc/domain/model/ProfileItem$Item;", "getProfileItemEnum", "()Lno/wmc/domain/enums/ProfileItemEnum;", "wmc-3.1.40-b11_prodRelease"})
    public static final class RemoveMedicalItemViewEvent extends no.wmc.ui.main.home.HomeViewEvent {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.domain.enums.ProfileItemEnum profileItemEnum = null;
        @org.jetbrains.annotations.NotNull
        private final no.wmc.domain.model.ProfileItem.Item profileItem = null;
        
        public RemoveMedicalItemViewEvent(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lno/wmc/ui/main/home/HomeViewEvent$DownloadDocumentViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent;", "context", "Landroid/content/Context;", "document", "Lno/wmc/domain/model/Document;", "(Landroid/content/Context;Lno/wmc/domain/model/Document;)V", "getContext", "()Landroid/content/Context;", "getDocument", "()Lno/wmc/domain/model/Document;", "wmc-3.1.40-b11_prodRelease"})
    public static final class DownloadDocumentViewEvent extends no.wmc.ui.main.home.HomeViewEvent {
        @org.jetbrains.annotations.NotNull
        private final android.content.Context context = null;
        @org.jetbrains.annotations.NotNull
        private final no.wmc.domain.model.Document document = null;
        
        public DownloadDocumentViewEvent(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        no.wmc.domain.model.Document document) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Context getContext() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.domain.model.Document getDocument() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/ui/main/home/HomeViewEvent$RemoveDocumentViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent;", "documentId", "", "(I)V", "getDocumentId", "()I", "wmc-3.1.40-b11_prodRelease"})
    public static final class RemoveDocumentViewEvent extends no.wmc.ui.main.home.HomeViewEvent {
        private final int documentId = 0;
        
        public RemoveDocumentViewEvent(int documentId) {
            super();
        }
        
        public final int getDocumentId() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lno/wmc/ui/main/home/HomeViewEvent$OrderCardViewEvent;", "Lno/wmc/ui/main/home/HomeViewEvent;", "()V", "wmc-3.1.40-b11_prodRelease"})
    public static final class OrderCardViewEvent extends no.wmc.ui.main.home.HomeViewEvent {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.main.home.HomeViewEvent.OrderCardViewEvent INSTANCE = null;
        
        private OrderCardViewEvent() {
            super();
        }
    }
}