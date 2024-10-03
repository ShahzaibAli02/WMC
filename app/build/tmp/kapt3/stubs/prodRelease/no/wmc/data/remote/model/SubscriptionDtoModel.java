package no.wmc.data.remote.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 :2\u00020\u0001:\u00039:;B\u009d\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u0015Bq\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0016J!\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u00c7\u0001R\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR$\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\"R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010%R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0018\u001a\u0004\b\'\u0010%R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010%R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010%R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010%R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u0018\u001a\u0004\b/\u0010%R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u0018\u001a\u0004\b1\u0010\u001a\u00a8\u0006<"}, d2 = {"Lno/wmc/data/remote/model/SubscriptionDtoModel;", "", "seen1", "", "id", "name", "", "teamName", "subscriptionOwner", "totalMembers", "currentMembers", "expireOn", "Lkotlinx/datetime/Instant;", "number", "paymentMethod", "paymentMethodTitle", "members", "", "Lno/wmc/data/remote/model/SubscriptionDtoModel$SubscriptionMemberDtoModel;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlinx/datetime/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlinx/datetime/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCurrentMembers$annotations", "()V", "getCurrentMembers", "()I", "getExpireOn$annotations", "getExpireOn", "()Lkotlinx/datetime/Instant;", "getId$annotations", "getId", "getMembers$annotations", "getMembers", "()Ljava/util/List;", "getName$annotations", "getName", "()Ljava/lang/String;", "getNumber$annotations", "getNumber", "getPaymentMethod$annotations", "getPaymentMethod", "getPaymentMethodTitle$annotations", "getPaymentMethodTitle", "getSubscriptionOwner$annotations", "getSubscriptionOwner", "getTeamName$annotations", "getTeamName", "getTotalMembers$annotations", "getTotalMembers", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "SubscriptionMemberDtoModel", "wmc-3.1.40-b11_prodRelease"})
@kotlinx.serialization.Serializable
public final class SubscriptionDtoModel {
    @org.jetbrains.annotations.NotNull
    public static final no.wmc.data.remote.model.SubscriptionDtoModel.Companion Companion = null;
    private final int id = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String teamName = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String subscriptionOwner = null;
    private final int totalMembers = 0;
    private final int currentMembers = 0;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.datetime.Instant expireOn = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String number = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String paymentMethod = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String paymentMethodTitle = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<no.wmc.data.remote.model.SubscriptionDtoModel.SubscriptionMemberDtoModel> members = null;
    
    @kotlin.jvm.JvmStatic
    public static final void write$Self(@org.jetbrains.annotations.NotNull
    no.wmc.data.remote.model.SubscriptionDtoModel self, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public SubscriptionDtoModel(int id, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String teamName, @org.jetbrains.annotations.Nullable
    java.lang.String subscriptionOwner, int totalMembers, int currentMembers, @org.jetbrains.annotations.NotNull
    kotlinx.datetime.Instant expireOn, @org.jetbrains.annotations.Nullable
    java.lang.String number, @org.jetbrains.annotations.Nullable
    java.lang.String paymentMethod, @org.jetbrains.annotations.Nullable
    java.lang.String paymentMethodTitle, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.data.remote.model.SubscriptionDtoModel.SubscriptionMemberDtoModel> members) {
        super();
    }
    
    public final int getId() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "id")
    @java.lang.Deprecated
    public static void getId$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "name")
    @java.lang.Deprecated
    public static void getName$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTeamName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "teamName")
    @java.lang.Deprecated
    public static void getTeamName$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSubscriptionOwner() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "subscriptionOwner")
    @java.lang.Deprecated
    public static void getSubscriptionOwner$annotations() {
    }
    
    public final int getTotalMembers() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "totalMembers")
    @java.lang.Deprecated
    public static void getTotalMembers$annotations() {
    }
    
    public final int getCurrentMembers() {
        return 0;
    }
    
    @kotlinx.serialization.SerialName(value = "currentMembers")
    @java.lang.Deprecated
    public static void getCurrentMembers$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.datetime.Instant getExpireOn() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "expireOn")
    @java.lang.Deprecated
    public static void getExpireOn$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNumber() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "number")
    @java.lang.Deprecated
    public static void getNumber$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPaymentMethod() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "paymentMethod")
    @java.lang.Deprecated
    public static void getPaymentMethod$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPaymentMethodTitle() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "paymentMethodTitle")
    @java.lang.Deprecated
    public static void getPaymentMethodTitle$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.data.remote.model.SubscriptionDtoModel.SubscriptionMemberDtoModel> getMembers() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "members")
    @java.lang.Deprecated
    public static void getMembers$annotations() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB;\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000bJ!\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u00c7\u0001R\u001c\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lno/wmc/data/remote/model/SubscriptionDtoModel$SubscriptionMemberDtoModel;", "", "seen1", "", "id", "name", "", "email", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/String;Ljava/lang/String;)V", "getEmail$annotations", "()V", "getEmail", "()Ljava/lang/String;", "getId$annotations", "getId", "()I", "getName$annotations", "getName", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "wmc-3.1.40-b11_prodRelease"})
    @kotlinx.serialization.Serializable
    public static final class SubscriptionMemberDtoModel {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.remote.model.SubscriptionDtoModel.SubscriptionMemberDtoModel.Companion Companion = null;
        private final int id = 0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String email = null;
        
        @kotlin.jvm.JvmStatic
        public static final void write$Self(@org.jetbrains.annotations.NotNull
        no.wmc.data.remote.model.SubscriptionDtoModel.SubscriptionMemberDtoModel self, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public SubscriptionMemberDtoModel(int id, @org.jetbrains.annotations.NotNull
        java.lang.String name, @org.jetbrains.annotations.NotNull
        java.lang.String email) {
            super();
        }
        
        public final int getId() {
            return 0;
        }
        
        @kotlinx.serialization.SerialName(value = "id")
        @java.lang.Deprecated
        public static void getId$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "name")
        @java.lang.Deprecated
        public static void getName$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getEmail() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "email")
        @java.lang.Deprecated
        public static void getEmail$annotations() {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/remote/model/SubscriptionDtoModel$SubscriptionMemberDtoModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/remote/model/SubscriptionDtoModel$SubscriptionMemberDtoModel;", "wmc-3.1.40-b11_prodRelease"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlinx.serialization.KSerializer<no.wmc.data.remote.model.SubscriptionDtoModel.SubscriptionMemberDtoModel> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/remote/model/SubscriptionDtoModel.SubscriptionMemberDtoModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/remote/model/SubscriptionDtoModel$SubscriptionMemberDtoModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_prodRelease"})
        @java.lang.Deprecated
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.remote.model.SubscriptionDtoModel.SubscriptionMemberDtoModel> {
            @org.jetbrains.annotations.NotNull
            public static final no.wmc.data.remote.model.SubscriptionDtoModel.SubscriptionMemberDtoModel.$serializer INSTANCE = null;
            
            private $serializer() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public kotlinx.serialization.KSerializer<?>[] childSerializers() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public no.wmc.data.remote.model.SubscriptionDtoModel.SubscriptionMemberDtoModel deserialize(@org.jetbrains.annotations.NotNull
            kotlinx.serialization.encoding.Decoder decoder) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            @java.lang.Override
            public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return null;
            }
            
            @java.lang.Override
            public void serialize(@org.jetbrains.annotations.NotNull
            kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull
            no.wmc.data.remote.model.SubscriptionDtoModel.SubscriptionMemberDtoModel value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/remote/model/SubscriptionDtoModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/remote/model/SubscriptionDtoModel;", "wmc-3.1.40-b11_prodRelease"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlinx.serialization.KSerializer<no.wmc.data.remote.model.SubscriptionDtoModel> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/remote/model/SubscriptionDtoModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/remote/model/SubscriptionDtoModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_prodRelease"})
    @java.lang.Deprecated
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.remote.model.SubscriptionDtoModel> {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.remote.model.SubscriptionDtoModel.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public no.wmc.data.remote.model.SubscriptionDtoModel deserialize(@org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        @java.lang.Override
        public void serialize(@org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull
        no.wmc.data.remote.model.SubscriptionDtoModel value) {
        }
        
        @org.jetbrains.annotations.NotNull
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}