package no.wmc.ui.common_adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\r\u001a\u00020\u0000J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0006\u0010\u0012\u001a\u00020\bJ\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0014\u0010\u001a\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001f"}, d2 = {"Lno/wmc/ui/common_adapters/EmergencyContactAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "_items", "", "Lno/wmc/domain/model/Profile$EmergencyContact;", "callButtonEnabled", "", "items", "", "getItems", "()Ljava/util/List;", "enableCallButton", "getItemCount", "", "getItemViewType", "position", "isValid", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "insuranceList", "AddViewHolder", "Companion", "EmergencyContactViewHolder", "wmc-3.1.40-b11_prodRelease"})
public final class EmergencyContactAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final java.util.List<no.wmc.domain.model.Profile.EmergencyContact> _items = null;
    @org.jetbrains.annotations.NotNull
    public static final no.wmc.ui.common_adapters.EmergencyContactAdapter.Companion Companion = null;
    public static final int VIEW_TYPE_EMERGENCY_CONTACT = 0;
    public static final int VIEW_TYPE_ADD = 1;
    private boolean callButtonEnabled = false;
    
    public EmergencyContactAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<no.wmc.domain.model.Profile.EmergencyContact> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    public final boolean isValid() {
        return false;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull
    java.util.List<no.wmc.domain.model.Profile.EmergencyContact> insuranceList) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final no.wmc.ui.common_adapters.EmergencyContactAdapter enableCallButton() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lno/wmc/ui/common_adapters/EmergencyContactAdapter$EmergencyContactViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lno/wmc/databinding/ItemEmergencyContactBinding;", "(Lno/wmc/ui/common_adapters/EmergencyContactAdapter;Lno/wmc/databinding/ItemEmergencyContactBinding;)V", "ccpCountry", "Lcom/hbb20/CountryCodePicker;", "getCcpCountry", "()Lcom/hbb20/CountryCodePicker;", "setCcpCountry", "(Lcom/hbb20/CountryCodePicker;)V", "emergencyContactPicker", "Lme/ibrahimsn/lib/PhoneNumberKit;", "bind", "", "emergencyContact", "Lno/wmc/domain/model/Profile$EmergencyContact;", "position", "", "wmc-3.1.40-b11_prodRelease"})
    public final class EmergencyContactViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final no.wmc.databinding.ItemEmergencyContactBinding binding = null;
        @org.jetbrains.annotations.NotNull
        private com.hbb20.CountryCodePicker ccpCountry;
        private me.ibrahimsn.lib.PhoneNumberKit emergencyContactPicker;
        
        public EmergencyContactViewHolder(@org.jetbrains.annotations.NotNull
        no.wmc.databinding.ItemEmergencyContactBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.hbb20.CountryCodePicker getCcpCountry() {
            return null;
        }
        
        public final void setCcpCountry(@org.jetbrains.annotations.NotNull
        com.hbb20.CountryCodePicker p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        no.wmc.domain.model.Profile.EmergencyContact emergencyContact, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/ui/common_adapters/EmergencyContactAdapter$AddViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lno/wmc/databinding/ItemAddBinding;", "(Lno/wmc/ui/common_adapters/EmergencyContactAdapter;Lno/wmc/databinding/ItemAddBinding;)V", "bind", "", "wmc-3.1.40-b11_prodRelease"})
    public final class AddViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final no.wmc.databinding.ItemAddBinding binding = null;
        
        public AddViewHolder(@org.jetbrains.annotations.NotNull
        no.wmc.databinding.ItemAddBinding binding) {
            super(null);
        }
        
        public final void bind() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/ui/common_adapters/EmergencyContactAdapter$Companion;", "", "()V", "VIEW_TYPE_ADD", "", "VIEW_TYPE_EMERGENCY_CONTACT", "wmc-3.1.40-b11_prodRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}