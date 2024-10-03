package no.wmc.ui.subscription.invitation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lno/wmc/ui/subscription/invitation/SubscriptionInvitationViewEvent;", "Lno/wmc/ui/base/ViewEvent;", "()V", "InviteSubscriptionUserViewEvent", "Lno/wmc/ui/subscription/invitation/SubscriptionInvitationViewEvent$InviteSubscriptionUserViewEvent;", "wmc-3.1.40-b11_prodRelease"})
public abstract class SubscriptionInvitationViewEvent extends no.wmc.ui.base.ViewEvent {
    
    private SubscriptionInvitationViewEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lno/wmc/ui/subscription/invitation/SubscriptionInvitationViewEvent$InviteSubscriptionUserViewEvent;", "Lno/wmc/ui/subscription/invitation/SubscriptionInvitationViewEvent;", "subscriptionId", "", "email", "", "(ILjava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getSubscriptionId", "()I", "wmc-3.1.40-b11_prodRelease"})
    public static final class InviteSubscriptionUserViewEvent extends no.wmc.ui.subscription.invitation.SubscriptionInvitationViewEvent {
        private final int subscriptionId = 0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String email = null;
        
        public InviteSubscriptionUserViewEvent(int subscriptionId, @org.jetbrains.annotations.NotNull
        java.lang.String email) {
            super();
        }
        
        public final int getSubscriptionId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getEmail() {
            return null;
        }
    }
}