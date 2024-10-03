package no.wmc.data.remote.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 J2\u00020\u0001:\u0002IJB\u00df\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013\u0012\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0013\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0002\u0010\u001cB\u00af\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u001dJ!\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HH\u00c7\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R$\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\'\u0010\u001f\u001a\u0004\b(\u0010!R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010+R$\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010&R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001f\u001a\u0004\b/\u0010!R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u001f\u001a\u0004\b1\u0010!R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u00105\u0012\u0004\b2\u0010\u001f\u001a\u0004\b3\u00104R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b6\u0010\u001f\u001a\u0004\b7\u0010!R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b8\u0010\u001f\u001a\u0004\b9\u0010!R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b:\u0010\u001f\u001a\u0004\b;\u0010!R$\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b<\u0010\u001f\u001a\u0004\b=\u0010&R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b>\u0010\u001f\u001a\u0004\b?\u0010!R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b@\u0010\u001f\u001a\u0004\bA\u0010!\u00a8\u0006K"}, d2 = {"Lno/wmc/data/remote/model/ProfileUpdateDtoModel;", "", "seen1", "", "firstName", "", "lastName", "avatarUrl", "birthDate", "gender", "Lno/wmc/data/remote/model/ProfileDtoModel$GenderDtoModel;", "organDonation", "", "ssn", "relationShip", "nationality", "phone", "phone2", "postalAddress", "", "Lno/wmc/data/remote/model/ProfileDtoModel$PostalAddressDtoModel;", "insurances", "Lno/wmc/domain/model/Profile$Insurance;", "emergencyContact", "Lno/wmc/data/remote/model/ProfileDtoModel$EmergencyContactDtoModel;", "otherInfo", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lno/wmc/data/remote/model/ProfileDtoModel$GenderDtoModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lno/wmc/data/remote/model/ProfileDtoModel$GenderDtoModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getAvatarUrl$annotations", "()V", "getAvatarUrl", "()Ljava/lang/String;", "getBirthDate$annotations", "getBirthDate", "getEmergencyContact$annotations", "getEmergencyContact", "()Ljava/util/List;", "getFirstName$annotations", "getFirstName", "getGender$annotations", "getGender", "()Lno/wmc/data/remote/model/ProfileDtoModel$GenderDtoModel;", "getInsurances$annotations", "getInsurances", "getLastName$annotations", "getLastName", "getNationality$annotations", "getNationality", "getOrganDonation$annotations", "getOrganDonation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOtherInfo$annotations", "getOtherInfo", "getPhone$annotations", "getPhone", "getPhone2$annotations", "getPhone2", "getPostalAddress$annotations", "getPostalAddress", "getRelationShip$annotations", "getRelationShip", "getSsn$annotations", "getSsn", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "wmc-3.1.40-b11_devDebug"})
@kotlinx.serialization.Serializable
public final class ProfileUpdateDtoModel {
    @org.jetbrains.annotations.NotNull
    public static final no.wmc.data.remote.model.ProfileUpdateDtoModel.Companion Companion = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String firstName = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String lastName = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String avatarUrl = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String birthDate = null;
    @org.jetbrains.annotations.Nullable
    private final no.wmc.data.remote.model.ProfileDtoModel.GenderDtoModel gender = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean organDonation = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String ssn = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String relationShip = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String nationality = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String phone = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String phone2 = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<no.wmc.data.remote.model.ProfileDtoModel.PostalAddressDtoModel> postalAddress = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<no.wmc.domain.model.Profile.Insurance> insurances = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<no.wmc.data.remote.model.ProfileDtoModel.EmergencyContactDtoModel> emergencyContact = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String otherInfo = null;
    
    @kotlin.jvm.JvmStatic
    public static final void write$Self(@org.jetbrains.annotations.NotNull
    no.wmc.data.remote.model.ProfileUpdateDtoModel self, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public ProfileUpdateDtoModel(@org.jetbrains.annotations.Nullable
    java.lang.String firstName, @org.jetbrains.annotations.Nullable
    java.lang.String lastName, @org.jetbrains.annotations.Nullable
    java.lang.String avatarUrl, @org.jetbrains.annotations.Nullable
    java.lang.String birthDate, @org.jetbrains.annotations.Nullable
    no.wmc.data.remote.model.ProfileDtoModel.GenderDtoModel gender, @org.jetbrains.annotations.Nullable
    java.lang.Boolean organDonation, @org.jetbrains.annotations.Nullable
    java.lang.String ssn, @org.jetbrains.annotations.Nullable
    java.lang.String relationShip, @org.jetbrains.annotations.Nullable
    java.lang.String nationality, @org.jetbrains.annotations.Nullable
    java.lang.String phone, @org.jetbrains.annotations.Nullable
    java.lang.String phone2, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.data.remote.model.ProfileDtoModel.PostalAddressDtoModel> postalAddress, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.Profile.Insurance> insurances, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.data.remote.model.ProfileDtoModel.EmergencyContactDtoModel> emergencyContact, @org.jetbrains.annotations.Nullable
    java.lang.String otherInfo) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFirstName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "firstName")
    @java.lang.Deprecated
    public static void getFirstName$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLastName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "lastName")
    @java.lang.Deprecated
    public static void getLastName$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAvatarUrl() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "avatar")
    @java.lang.Deprecated
    public static void getAvatarUrl$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBirthDate() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "birthDate")
    @java.lang.Deprecated
    public static void getBirthDate$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.data.remote.model.ProfileDtoModel.GenderDtoModel getGender() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "gender")
    @java.lang.Deprecated
    public static void getGender$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getOrganDonation() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "organDonation")
    @java.lang.Deprecated
    public static void getOrganDonation$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSsn() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "ssn")
    @java.lang.Deprecated
    public static void getSsn$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRelationShip() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "relationShip")
    @java.lang.Deprecated
    public static void getRelationShip$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNationality() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "nationality")
    @java.lang.Deprecated
    public static void getNationality$annotations() {
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
    public final java.lang.String getPhone2() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "phone2")
    @java.lang.Deprecated
    public static void getPhone2$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.data.remote.model.ProfileDtoModel.PostalAddressDtoModel> getPostalAddress() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "postalAddress")
    @java.lang.Deprecated
    public static void getPostalAddress$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.domain.model.Profile.Insurance> getInsurances() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "insurances")
    @java.lang.Deprecated
    public static void getInsurances$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.data.remote.model.ProfileDtoModel.EmergencyContactDtoModel> getEmergencyContact() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "emergencyContact")
    @java.lang.Deprecated
    public static void getEmergencyContact$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOtherInfo() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "otherInfo")
    @java.lang.Deprecated
    public static void getOtherInfo$annotations() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/remote/model/ProfileUpdateDtoModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/remote/model/ProfileUpdateDtoModel;", "wmc-3.1.40-b11_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlinx.serialization.KSerializer<no.wmc.data.remote.model.ProfileUpdateDtoModel> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/remote/model/ProfileUpdateDtoModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/remote/model/ProfileUpdateDtoModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_devDebug"})
    @java.lang.Deprecated
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.remote.model.ProfileUpdateDtoModel> {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.remote.model.ProfileUpdateDtoModel.$serializer INSTANCE = null;
        
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
        public no.wmc.data.remote.model.ProfileUpdateDtoModel deserialize(@org.jetbrains.annotations.NotNull
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
        no.wmc.data.remote.model.ProfileUpdateDtoModel value) {
        }
        
        @org.jetbrains.annotations.NotNull
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}