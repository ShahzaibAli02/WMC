package no.wmc.ui.subscription.newflow;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lno/wmc/ui/subscription/newflow/NewSubscriptionViewEvent;", "Lno/wmc/ui/base/ViewEvent;", "()V", "AddSubscriptionInFireStore", "Lno/wmc/ui/subscription/newflow/NewSubscriptionViewEvent$AddSubscriptionInFireStore;", "wmc-3.1.40-b11_devDebug"})
public abstract class NewSubscriptionViewEvent extends no.wmc.ui.base.ViewEvent {
    
    private NewSubscriptionViewEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/ui/subscription/newflow/NewSubscriptionViewEvent$AddSubscriptionInFireStore;", "Lno/wmc/ui/subscription/newflow/NewSubscriptionViewEvent;", "subscription", "Lno/wmc/data/remote/model/firestore/SubscriptionFsModel;", "(Lno/wmc/data/remote/model/firestore/SubscriptionFsModel;)V", "getSubscription", "()Lno/wmc/data/remote/model/firestore/SubscriptionFsModel;", "wmc-3.1.40-b11_devDebug"})
    public static final class AddSubscriptionInFireStore extends no.wmc.ui.subscription.newflow.NewSubscriptionViewEvent {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.data.remote.model.firestore.SubscriptionFsModel subscription = null;
        
        public AddSubscriptionInFireStore(@org.jetbrains.annotations.NotNull
        no.wmc.data.remote.model.firestore.SubscriptionFsModel subscription) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.data.remote.model.firestore.SubscriptionFsModel getSubscription() {
            return null;
        }
    }
}