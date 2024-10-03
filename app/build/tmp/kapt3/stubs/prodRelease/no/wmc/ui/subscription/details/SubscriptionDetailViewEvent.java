package no.wmc.ui.subscription.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/subscription/details/SubscriptionDetailViewEvent;", "Lno/wmc/ui/base/ViewEvent;", "()V", "CancelSubscriptionViewEvent", "DeleteSubscriptionUserViewEvent", "GetSubscriptionDetailViewEvent", "Lno/wmc/ui/subscription/details/SubscriptionDetailViewEvent$CancelSubscriptionViewEvent;", "Lno/wmc/ui/subscription/details/SubscriptionDetailViewEvent$DeleteSubscriptionUserViewEvent;", "Lno/wmc/ui/subscription/details/SubscriptionDetailViewEvent$GetSubscriptionDetailViewEvent;", "wmc-3.1.40-b11_prodRelease"})
public abstract class SubscriptionDetailViewEvent extends no.wmc.ui.base.ViewEvent {
    
    private SubscriptionDetailViewEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/ui/subscription/details/SubscriptionDetailViewEvent$GetSubscriptionDetailViewEvent;", "Lno/wmc/ui/subscription/details/SubscriptionDetailViewEvent;", "id", "", "(I)V", "getId", "()I", "wmc-3.1.40-b11_prodRelease"})
    public static final class GetSubscriptionDetailViewEvent extends no.wmc.ui.subscription.details.SubscriptionDetailViewEvent {
        private final int id = 0;
        
        public GetSubscriptionDetailViewEvent(int id) {
            super();
        }
        
        public final int getId() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/subscription/details/SubscriptionDetailViewEvent$DeleteSubscriptionUserViewEvent;", "Lno/wmc/ui/subscription/details/SubscriptionDetailViewEvent;", "subscriptionId", "", "customerId", "(II)V", "getCustomerId", "()I", "getSubscriptionId", "wmc-3.1.40-b11_prodRelease"})
    public static final class DeleteSubscriptionUserViewEvent extends no.wmc.ui.subscription.details.SubscriptionDetailViewEvent {
        private final int subscriptionId = 0;
        private final int customerId = 0;
        
        public DeleteSubscriptionUserViewEvent(int subscriptionId, int customerId) {
            super();
        }
        
        public final int getSubscriptionId() {
            return 0;
        }
        
        public final int getCustomerId() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/ui/subscription/details/SubscriptionDetailViewEvent$CancelSubscriptionViewEvent;", "Lno/wmc/ui/subscription/details/SubscriptionDetailViewEvent;", "subscriptionId", "", "(I)V", "getSubscriptionId", "()I", "wmc-3.1.40-b11_prodRelease"})
    public static final class CancelSubscriptionViewEvent extends no.wmc.ui.subscription.details.SubscriptionDetailViewEvent {
        private final int subscriptionId = 0;
        
        public CancelSubscriptionViewEvent(int subscriptionId) {
            super();
        }
        
        public final int getSubscriptionId() {
            return 0;
        }
    }
}