package no.wmc.data.local.db.entity;

import java.lang.System;

@androidx.room.Entity
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u00002\u00020\u0001:\u0003567B\u00cf\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u001dR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0016\u0010\u0018\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010*R\u0016\u0010\u0019\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010*R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0016\u0010\u001a\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010*R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001f\u00a8\u00068"}, d2 = {"Lno/wmc/data/local/db/entity/ProfileEntity;", "", "id", "", "firstName", "lastName", "avatar", "memberSince", "Lkotlinx/datetime/Instant;", "birthDate", "gender", "organDonation", "", "ssn", "nationality", "phone", "postalAddress", "Lno/wmc/data/local/db/entity/ProfileEntity$PostalAddressEntity;", "insurances", "", "Lno/wmc/domain/model/Profile$Insurance;", "emergencyContact", "Lno/wmc/data/local/db/entity/ProfileEntity$EmergencyContactEntity;", "otherInfo", "isActiveSubscription", "isForcedRefreshToken", "onBoardingRequired", "cardOrderStatus", "cardOrderDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/datetime/Instant;Lkotlinx/datetime/Instant;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lno/wmc/data/local/db/entity/ProfileEntity$PostalAddressEntity;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZZLjava/lang/String;Lkotlinx/datetime/Instant;)V", "getAvatar", "()Ljava/lang/String;", "getBirthDate", "()Lkotlinx/datetime/Instant;", "getCardOrderDate", "getCardOrderStatus", "getEmergencyContact", "()Ljava/util/List;", "getFirstName", "getGender", "getId", "getInsurances", "()Z", "getLastName", "getMemberSince", "getNationality", "getOnBoardingRequired", "getOrganDonation", "getOtherInfo", "getPhone", "getPostalAddress", "()Lno/wmc/data/local/db/entity/ProfileEntity$PostalAddressEntity;", "getSsn", "EmergencyContactEntity", "InsuranceEntity", "PostalAddressEntity", "wmc-3.1.40-b11_devDebug"})
public final class ProfileEntity {
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "id")
    @androidx.room.PrimaryKey
    private final java.lang.String id = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "firstName")
    private final java.lang.String firstName = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "lastName")
    private final java.lang.String lastName = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "avatar")
    private final java.lang.String avatar = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "memberSince")
    private final kotlinx.datetime.Instant memberSince = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "birthDate")
    private final kotlinx.datetime.Instant birthDate = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "gender")
    private final java.lang.String gender = null;
    @androidx.room.ColumnInfo(name = "organDonation")
    private final boolean organDonation = false;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "ssn")
    private final java.lang.String ssn = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "nationality")
    private final java.lang.String nationality = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "phone")
    private final java.lang.String phone = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "postalAddress")
    private final no.wmc.data.local.db.entity.ProfileEntity.PostalAddressEntity postalAddress = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "insurances")
    private final java.util.List<no.wmc.domain.model.Profile.Insurance> insurances = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "emergencyContact")
    private final java.util.List<no.wmc.data.local.db.entity.ProfileEntity.EmergencyContactEntity> emergencyContact = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "otherInfo")
    private final java.lang.String otherInfo = null;
    @androidx.room.ColumnInfo(name = "isActiveSubscription")
    private final boolean isActiveSubscription = false;
    @androidx.room.ColumnInfo(name = "isForcedRefreshToken")
    private final boolean isForcedRefreshToken = false;
    @androidx.room.ColumnInfo(name = "onBoardingRequired")
    private final boolean onBoardingRequired = false;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "cardOrderStatus")
    private final java.lang.String cardOrderStatus = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "cardOrderDate")
    private final kotlinx.datetime.Instant cardOrderDate = null;
    
    public ProfileEntity(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.Nullable
    java.lang.String firstName, @org.jetbrains.annotations.Nullable
    java.lang.String lastName, @org.jetbrains.annotations.Nullable
    java.lang.String avatar, @org.jetbrains.annotations.Nullable
    kotlinx.datetime.Instant memberSince, @org.jetbrains.annotations.Nullable
    kotlinx.datetime.Instant birthDate, @org.jetbrains.annotations.Nullable
    java.lang.String gender, boolean organDonation, @org.jetbrains.annotations.Nullable
    java.lang.String ssn, @org.jetbrains.annotations.Nullable
    java.lang.String nationality, @org.jetbrains.annotations.Nullable
    java.lang.String phone, @org.jetbrains.annotations.Nullable
    no.wmc.data.local.db.entity.ProfileEntity.PostalAddressEntity postalAddress, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.Profile.Insurance> insurances, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.data.local.db.entity.ProfileEntity.EmergencyContactEntity> emergencyContact, @org.jetbrains.annotations.Nullable
    java.lang.String otherInfo, boolean isActiveSubscription, boolean isForcedRefreshToken, boolean onBoardingRequired, @org.jetbrains.annotations.Nullable
    java.lang.String cardOrderStatus, @org.jetbrains.annotations.Nullable
    kotlinx.datetime.Instant cardOrderDate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFirstName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLastName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlinx.datetime.Instant getMemberSince() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlinx.datetime.Instant getBirthDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGender() {
        return null;
    }
    
    public final boolean getOrganDonation() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSsn() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNationality() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.data.local.db.entity.ProfileEntity.PostalAddressEntity getPostalAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.domain.model.Profile.Insurance> getInsurances() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.data.local.db.entity.ProfileEntity.EmergencyContactEntity> getEmergencyContact() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOtherInfo() {
        return null;
    }
    
    public final boolean isActiveSubscription() {
        return false;
    }
    
    public final boolean isForcedRefreshToken() {
        return false;
    }
    
    public final boolean getOnBoardingRequired() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCardOrderStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlinx.datetime.Instant getCardOrderDate() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fBI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bB-\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\fJ!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u00c7\u0001R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006 "}, d2 = {"Lno/wmc/data/local/db/entity/ProfileEntity$PostalAddressEntity;", "", "seen1", "", "info", "", "city", "zipCode", "country", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity$annotations", "()V", "getCity", "()Ljava/lang/String;", "getCountry$annotations", "getCountry", "getInfo$annotations", "getInfo", "getZipCode$annotations", "getZipCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "wmc-3.1.40-b11_devDebug"})
    @kotlinx.serialization.Serializable
    public static final class PostalAddressEntity {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.local.db.entity.ProfileEntity.PostalAddressEntity.Companion Companion = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String info = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String city = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String zipCode = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String country = null;
        
        @kotlin.jvm.JvmStatic
        public static final void write$Self(@org.jetbrains.annotations.NotNull
        no.wmc.data.local.db.entity.ProfileEntity.PostalAddressEntity self, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public PostalAddressEntity(@org.jetbrains.annotations.Nullable
        java.lang.String info, @org.jetbrains.annotations.Nullable
        java.lang.String city, @org.jetbrains.annotations.Nullable
        java.lang.String zipCode, @org.jetbrains.annotations.Nullable
        java.lang.String country) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getInfo() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "info")
        @java.lang.Deprecated
        public static void getInfo$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCity() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "city")
        @java.lang.Deprecated
        public static void getCity$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getZipCode() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "zipCode")
        @java.lang.Deprecated
        public static void getZipCode$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCountry() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "country")
        @java.lang.Deprecated
        public static void getCountry$annotations() {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/local/db/entity/ProfileEntity$PostalAddressEntity$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/local/db/entity/ProfileEntity$PostalAddressEntity;", "wmc-3.1.40-b11_devDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlinx.serialization.KSerializer<no.wmc.data.local.db.entity.ProfileEntity.PostalAddressEntity> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/local/db/entity/ProfileEntity.PostalAddressEntity.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/local/db/entity/ProfileEntity$PostalAddressEntity;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_devDebug"})
        @java.lang.Deprecated
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.local.db.entity.ProfileEntity.PostalAddressEntity> {
            @org.jetbrains.annotations.NotNull
            public static final no.wmc.data.local.db.entity.ProfileEntity.PostalAddressEntity.$serializer INSTANCE = null;
            
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
            public no.wmc.data.local.db.entity.ProfileEntity.PostalAddressEntity deserialize(@org.jetbrains.annotations.NotNull
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
            no.wmc.data.local.db.entity.ProfileEntity.PostalAddressEntity value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fBI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bB-\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\fJ!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u00c7\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006 "}, d2 = {"Lno/wmc/data/local/db/entity/ProfileEntity$InsuranceEntity;", "", "seen1", "", "company", "", "type", "phone", "policy", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCompany$annotations", "()V", "getCompany", "()Ljava/lang/String;", "getPhone$annotations", "getPhone", "getPolicy$annotations", "getPolicy", "getType$annotations", "getType", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "wmc-3.1.40-b11_devDebug"})
    @kotlinx.serialization.Serializable
    public static final class InsuranceEntity {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.local.db.entity.ProfileEntity.InsuranceEntity.Companion Companion = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String company = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String type = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String phone = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String policy = null;
        
        @kotlin.jvm.JvmStatic
        public static final void write$Self(@org.jetbrains.annotations.NotNull
        no.wmc.data.local.db.entity.ProfileEntity.InsuranceEntity self, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public InsuranceEntity(@org.jetbrains.annotations.Nullable
        java.lang.String company, @org.jetbrains.annotations.Nullable
        java.lang.String type, @org.jetbrains.annotations.Nullable
        java.lang.String phone, @org.jetbrains.annotations.Nullable
        java.lang.String policy) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCompany() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "company")
        @java.lang.Deprecated
        public static void getCompany$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getType() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "type")
        @java.lang.Deprecated
        public static void getType$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getPhone() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "phone")
        @java.lang.Deprecated
        public static void getPhone$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getPolicy() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "policy")
        @java.lang.Deprecated
        public static void getPolicy$annotations() {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/local/db/entity/ProfileEntity$InsuranceEntity$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/local/db/entity/ProfileEntity$InsuranceEntity;", "wmc-3.1.40-b11_devDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlinx.serialization.KSerializer<no.wmc.data.local.db.entity.ProfileEntity.InsuranceEntity> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/local/db/entity/ProfileEntity.InsuranceEntity.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/local/db/entity/ProfileEntity$InsuranceEntity;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_devDebug"})
        @java.lang.Deprecated
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.local.db.entity.ProfileEntity.InsuranceEntity> {
            @org.jetbrains.annotations.NotNull
            public static final no.wmc.data.local.db.entity.ProfileEntity.InsuranceEntity.$serializer INSTANCE = null;
            
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
            public no.wmc.data.local.db.entity.ProfileEntity.InsuranceEntity deserialize(@org.jetbrains.annotations.NotNull
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
            no.wmc.data.local.db.entity.ProfileEntity.InsuranceEntity value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB=\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nB#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000bJ!\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u00c7\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\u00a8\u0006\u001d"}, d2 = {"Lno/wmc/data/local/db/entity/ProfileEntity$EmergencyContactEntity;", "", "seen1", "", "name", "", "phone", "relationship", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getPhone$annotations", "getPhone", "getRelationship$annotations", "getRelationship", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "wmc-3.1.40-b11_devDebug"})
    @kotlinx.serialization.Serializable
    public static final class EmergencyContactEntity {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.local.db.entity.ProfileEntity.EmergencyContactEntity.Companion Companion = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String name = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String phone = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String relationship = null;
        
        @kotlin.jvm.JvmStatic
        public static final void write$Self(@org.jetbrains.annotations.NotNull
        no.wmc.data.local.db.entity.ProfileEntity.EmergencyContactEntity self, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public EmergencyContactEntity(@org.jetbrains.annotations.Nullable
        java.lang.String name, @org.jetbrains.annotations.Nullable
        java.lang.String phone, @org.jetbrains.annotations.Nullable
        java.lang.String relationship) {
            super();
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
        public final java.lang.String getPhone() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "phone")
        @java.lang.Deprecated
        public static void getPhone$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRelationship() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "relationship")
        @java.lang.Deprecated
        public static void getRelationship$annotations() {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/local/db/entity/ProfileEntity$EmergencyContactEntity$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/local/db/entity/ProfileEntity$EmergencyContactEntity;", "wmc-3.1.40-b11_devDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlinx.serialization.KSerializer<no.wmc.data.local.db.entity.ProfileEntity.EmergencyContactEntity> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/local/db/entity/ProfileEntity.EmergencyContactEntity.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/local/db/entity/ProfileEntity$EmergencyContactEntity;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_devDebug"})
        @java.lang.Deprecated
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.local.db.entity.ProfileEntity.EmergencyContactEntity> {
            @org.jetbrains.annotations.NotNull
            public static final no.wmc.data.local.db.entity.ProfileEntity.EmergencyContactEntity.$serializer INSTANCE = null;
            
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
            public no.wmc.data.local.db.entity.ProfileEntity.EmergencyContactEntity deserialize(@org.jetbrains.annotations.NotNull
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
            no.wmc.data.local.db.entity.ProfileEntity.EmergencyContactEntity value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
}