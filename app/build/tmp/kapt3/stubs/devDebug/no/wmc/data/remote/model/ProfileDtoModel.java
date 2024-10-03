package no.wmc.data.remote.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bP\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 |2\u00020\u0001:\bz{|}~\u007f\u0080\u0001B\u009b\u0002\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0001\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\u0010\b\u0001\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0017\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u00a2\u0006\u0002\u0010$B\u00e5\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0017\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u000e\u0012\u0006\u0010\u001e\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010%J\u000b\u0010X\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u0011\u0010]\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u00c6\u0003J\u0011\u0010^\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0017H\u00c6\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010`\u001a\u00020\u000eH\u00c6\u0003J\t\u0010a\u001a\u00020\u000eH\u00c6\u0003J\t\u0010b\u001a\u00020\u000eH\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010 H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u0010\u0010j\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u000b\u0010k\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0090\u0002\u0010m\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u000e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010nJ\u0013\u0010o\u001a\u00020\u000e2\b\u0010p\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010q\u001a\u00020\u0003H\u00d6\u0001J\t\u0010r\u001a\u00020\u0005H\u00d6\u0001J!\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020\u00002\u0006\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020yH\u00c7\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\'\u001a\u0004\b(\u0010)R\u001e\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\'\u001a\u0004\b+\u0010,R\u001e\u0010!\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\'\u001a\u0004\b.\u0010,R\u001e\u0010\u001f\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\'\u001a\u0004\b0\u00101R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\'\u001a\u0004\b3\u0010)R$\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\'\u001a\u0004\b5\u00106R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\'\u001a\u0004\b8\u0010)R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b9\u0010\'\u001a\u0004\b:\u0010;R$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b<\u0010\'\u001a\u0004\b=\u00106R\u001c\u0010\u001c\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b>\u0010\'\u001a\u0004\b\u001c\u0010?R\u001c\u0010\u001d\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b@\u0010\'\u001a\u0004\b\u001d\u0010?R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bA\u0010\'\u001a\u0004\bB\u0010)R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bC\u0010\'\u001a\u0004\bD\u0010,R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bE\u0010\'\u001a\u0004\bF\u0010)R\u001c\u0010\u001e\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bG\u0010\'\u001a\u0004\bH\u0010?R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010L\u0012\u0004\bI\u0010\'\u001a\u0004\bJ\u0010KR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bM\u0010\'\u001a\u0004\bN\u0010)R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bO\u0010\'\u001a\u0004\bP\u0010)R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bQ\u0010\'\u001a\u0004\bR\u0010)R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bS\u0010\'\u001a\u0004\bT\u0010UR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\bV\u0010\'\u001a\u0004\bW\u0010)\u00a8\u0006\u0081\u0001"}, d2 = {"Lno/wmc/data/remote/model/ProfileDtoModel;", "", "seen1", "", "firstName", "", "lastName", "avatar", "memberSince", "Lkotlinx/datetime/Instant;", "birthDate", "gender", "Lno/wmc/data/remote/model/ProfileDtoModel$GenderDtoModel;", "organDonation", "", "ssn", "nationality", "phone", "email", "password", "postalAddress", "Lno/wmc/data/remote/model/ProfileDtoModel$PostalAddressDtoModel;", "insurances", "", "Lno/wmc/domain/model/Profile$Insurance;", "emergencyContact", "Lno/wmc/data/remote/model/ProfileDtoModel$EmergencyContactDtoModel;", "otherInfo", "isActiveSubscription", "isForcedRefreshToken", "onBoardingRequired", "cardOrderStatus", "Lno/wmc/data/remote/model/ProfileDtoModel$CardOrderStatusDtoModel;", "cardOrderDate", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/datetime/Instant;Lkotlinx/datetime/Instant;Lno/wmc/data/remote/model/ProfileDtoModel$GenderDtoModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lno/wmc/data/remote/model/ProfileDtoModel$PostalAddressDtoModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZZLno/wmc/data/remote/model/ProfileDtoModel$CardOrderStatusDtoModel;Lkotlinx/datetime/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/datetime/Instant;Lkotlinx/datetime/Instant;Lno/wmc/data/remote/model/ProfileDtoModel$GenderDtoModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lno/wmc/data/remote/model/ProfileDtoModel$PostalAddressDtoModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZZLno/wmc/data/remote/model/ProfileDtoModel$CardOrderStatusDtoModel;Lkotlinx/datetime/Instant;)V", "getAvatar$annotations", "()V", "getAvatar", "()Ljava/lang/String;", "getBirthDate$annotations", "getBirthDate", "()Lkotlinx/datetime/Instant;", "getCardOrderDate$annotations", "getCardOrderDate", "getCardOrderStatus$annotations", "getCardOrderStatus", "()Lno/wmc/data/remote/model/ProfileDtoModel$CardOrderStatusDtoModel;", "getEmail$annotations", "getEmail", "getEmergencyContact$annotations", "getEmergencyContact", "()Ljava/util/List;", "getFirstName$annotations", "getFirstName", "getGender$annotations", "getGender", "()Lno/wmc/data/remote/model/ProfileDtoModel$GenderDtoModel;", "getInsurances$annotations", "getInsurances", "isActiveSubscription$annotations", "()Z", "isForcedRefreshToken$annotations", "getLastName$annotations", "getLastName", "getMemberSince$annotations", "getMemberSince", "getNationality$annotations", "getNationality", "getOnBoardingRequired$annotations", "getOnBoardingRequired", "getOrganDonation$annotations", "getOrganDonation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOtherInfo$annotations", "getOtherInfo", "getPassword$annotations", "getPassword", "getPhone$annotations", "getPhone", "getPostalAddress$annotations", "getPostalAddress", "()Lno/wmc/data/remote/model/ProfileDtoModel$PostalAddressDtoModel;", "getSsn$annotations", "getSsn", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/datetime/Instant;Lkotlinx/datetime/Instant;Lno/wmc/data/remote/model/ProfileDtoModel$GenderDtoModel;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lno/wmc/data/remote/model/ProfileDtoModel$PostalAddressDtoModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZZLno/wmc/data/remote/model/ProfileDtoModel$CardOrderStatusDtoModel;Lkotlinx/datetime/Instant;)Lno/wmc/data/remote/model/ProfileDtoModel;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "CardOrderStatusDtoModel", "Companion", "EmergencyContactDtoModel", "GenderDtoModel", "InsuranceDtoModel", "PostalAddressDtoModel", "wmc-3.1.40-b11_devDebug"})
@kotlinx.serialization.Serializable
public final class ProfileDtoModel {
    @org.jetbrains.annotations.NotNull
    public static final no.wmc.data.remote.model.ProfileDtoModel.Companion Companion = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String firstName = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String lastName = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String avatar = null;
    @org.jetbrains.annotations.Nullable
    private final kotlinx.datetime.Instant memberSince = null;
    @org.jetbrains.annotations.Nullable
    private final kotlinx.datetime.Instant birthDate = null;
    @org.jetbrains.annotations.Nullable
    private final no.wmc.data.remote.model.ProfileDtoModel.GenderDtoModel gender = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean organDonation = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String ssn = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String nationality = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String phone = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String password = null;
    @org.jetbrains.annotations.Nullable
    private final no.wmc.data.remote.model.ProfileDtoModel.PostalAddressDtoModel postalAddress = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<no.wmc.domain.model.Profile.Insurance> insurances = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<no.wmc.data.remote.model.ProfileDtoModel.EmergencyContactDtoModel> emergencyContact = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String otherInfo = null;
    private final boolean isActiveSubscription = false;
    private final boolean isForcedRefreshToken = false;
    private final boolean onBoardingRequired = false;
    @org.jetbrains.annotations.Nullable
    private final no.wmc.data.remote.model.ProfileDtoModel.CardOrderStatusDtoModel cardOrderStatus = null;
    @org.jetbrains.annotations.Nullable
    private final kotlinx.datetime.Instant cardOrderDate = null;
    
    @org.jetbrains.annotations.NotNull
    public final no.wmc.data.remote.model.ProfileDtoModel copy(@org.jetbrains.annotations.Nullable
    java.lang.String firstName, @org.jetbrains.annotations.Nullable
    java.lang.String lastName, @org.jetbrains.annotations.Nullable
    java.lang.String avatar, @org.jetbrains.annotations.Nullable
    kotlinx.datetime.Instant memberSince, @org.jetbrains.annotations.Nullable
    kotlinx.datetime.Instant birthDate, @org.jetbrains.annotations.Nullable
    no.wmc.data.remote.model.ProfileDtoModel.GenderDtoModel gender, @org.jetbrains.annotations.Nullable
    java.lang.Boolean organDonation, @org.jetbrains.annotations.Nullable
    java.lang.String ssn, @org.jetbrains.annotations.Nullable
    java.lang.String nationality, @org.jetbrains.annotations.Nullable
    java.lang.String phone, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String password, @org.jetbrains.annotations.Nullable
    no.wmc.data.remote.model.ProfileDtoModel.PostalAddressDtoModel postalAddress, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.Profile.Insurance> insurances, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.data.remote.model.ProfileDtoModel.EmergencyContactDtoModel> emergencyContact, @org.jetbrains.annotations.Nullable
    java.lang.String otherInfo, boolean isActiveSubscription, boolean isForcedRefreshToken, boolean onBoardingRequired, @org.jetbrains.annotations.Nullable
    no.wmc.data.remote.model.ProfileDtoModel.CardOrderStatusDtoModel cardOrderStatus, @org.jetbrains.annotations.Nullable
    kotlinx.datetime.Instant cardOrderDate) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic
    public static final void write$Self(@org.jetbrains.annotations.NotNull
    no.wmc.data.remote.model.ProfileDtoModel self, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public ProfileDtoModel(@org.jetbrains.annotations.Nullable
    java.lang.String firstName, @org.jetbrains.annotations.Nullable
    java.lang.String lastName, @org.jetbrains.annotations.Nullable
    java.lang.String avatar, @org.jetbrains.annotations.Nullable
    kotlinx.datetime.Instant memberSince, @org.jetbrains.annotations.Nullable
    kotlinx.datetime.Instant birthDate, @org.jetbrains.annotations.Nullable
    no.wmc.data.remote.model.ProfileDtoModel.GenderDtoModel gender, @org.jetbrains.annotations.Nullable
    java.lang.Boolean organDonation, @org.jetbrains.annotations.Nullable
    java.lang.String ssn, @org.jetbrains.annotations.Nullable
    java.lang.String nationality, @org.jetbrains.annotations.Nullable
    java.lang.String phone, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String password, @org.jetbrains.annotations.Nullable
    no.wmc.data.remote.model.ProfileDtoModel.PostalAddressDtoModel postalAddress, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.Profile.Insurance> insurances, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.data.remote.model.ProfileDtoModel.EmergencyContactDtoModel> emergencyContact, @org.jetbrains.annotations.Nullable
    java.lang.String otherInfo, boolean isActiveSubscription, boolean isForcedRefreshToken, boolean onBoardingRequired, @org.jetbrains.annotations.Nullable
    no.wmc.data.remote.model.ProfileDtoModel.CardOrderStatusDtoModel cardOrderStatus, @org.jetbrains.annotations.Nullable
    kotlinx.datetime.Instant cardOrderDate) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
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
    public final java.lang.String component2() {
        return null;
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
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAvatar() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "avatar")
    @java.lang.Deprecated
    public static void getAvatar$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlinx.datetime.Instant component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlinx.datetime.Instant getMemberSince() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "memberSince")
    @java.lang.Deprecated
    public static void getMemberSince$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlinx.datetime.Instant component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlinx.datetime.Instant getBirthDate() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "birthDate")
    @java.lang.Deprecated
    public static void getBirthDate$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.data.remote.model.ProfileDtoModel.GenderDtoModel component6() {
        return null;
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
    public final java.lang.Boolean component7() {
        return null;
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
    public final java.lang.String component8() {
        return null;
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
    public final java.lang.String component9() {
        return null;
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
    public final java.lang.String component10() {
        return null;
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
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEmail() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "email")
    @java.lang.Deprecated
    public static void getEmail$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPassword() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "password")
    @java.lang.Deprecated
    public static void getPassword$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.data.remote.model.ProfileDtoModel.PostalAddressDtoModel component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.data.remote.model.ProfileDtoModel.PostalAddressDtoModel getPostalAddress() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "postalAddress")
    @java.lang.Deprecated
    public static void getPostalAddress$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.domain.model.Profile.Insurance> component14() {
        return null;
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
    public final java.util.List<no.wmc.data.remote.model.ProfileDtoModel.EmergencyContactDtoModel> component15() {
        return null;
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
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOtherInfo() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "otherInfo")
    @java.lang.Deprecated
    public static void getOtherInfo$annotations() {
    }
    
    public final boolean component17() {
        return false;
    }
    
    public final boolean isActiveSubscription() {
        return false;
    }
    
    @kotlinx.serialization.SerialName(value = "isActiveSubscription")
    @java.lang.Deprecated
    public static void isActiveSubscription$annotations() {
    }
    
    public final boolean component18() {
        return false;
    }
    
    public final boolean isForcedRefreshToken() {
        return false;
    }
    
    @kotlinx.serialization.SerialName(value = "isForcedRefreshToken")
    @java.lang.Deprecated
    public static void isForcedRefreshToken$annotations() {
    }
    
    public final boolean component19() {
        return false;
    }
    
    public final boolean getOnBoardingRequired() {
        return false;
    }
    
    @kotlinx.serialization.SerialName(value = "onBoardingRequired")
    @java.lang.Deprecated
    public static void getOnBoardingRequired$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.data.remote.model.ProfileDtoModel.CardOrderStatusDtoModel component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.data.remote.model.ProfileDtoModel.CardOrderStatusDtoModel getCardOrderStatus() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "cardOrderStatus")
    @java.lang.Deprecated
    public static void getCardOrderStatus$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlinx.datetime.Instant component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlinx.datetime.Instant getCardOrderDate() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "cardOrderDate")
    @java.lang.Deprecated
    public static void getCardOrderDate$annotations() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()BI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bB-\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J9\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010 \u001a\u00020\u0005H\u00d6\u0001J!\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u00c7\u0001R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006*"}, d2 = {"Lno/wmc/data/remote/model/ProfileDtoModel$PostalAddressDtoModel;", "", "seen1", "", "info", "", "city", "zipCode", "country", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity$annotations", "()V", "getCity", "()Ljava/lang/String;", "getCountry$annotations", "getCountry", "getInfo$annotations", "getInfo", "getZipCode$annotations", "getZipCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "wmc-3.1.40-b11_devDebug"})
    @kotlinx.serialization.Serializable
    public static final class PostalAddressDtoModel {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.remote.model.ProfileDtoModel.PostalAddressDtoModel.Companion Companion = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String info = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String city = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String zipCode = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String country = null;
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.data.remote.model.ProfileDtoModel.PostalAddressDtoModel copy(@org.jetbrains.annotations.Nullable
        java.lang.String info, @org.jetbrains.annotations.Nullable
        java.lang.String city, @org.jetbrains.annotations.Nullable
        java.lang.String zipCode, @org.jetbrains.annotations.Nullable
        java.lang.String country) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic
        public static final void write$Self(@org.jetbrains.annotations.NotNull
        no.wmc.data.remote.model.ProfileDtoModel.PostalAddressDtoModel self, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public PostalAddressDtoModel(@org.jetbrains.annotations.Nullable
        java.lang.String info, @org.jetbrains.annotations.Nullable
        java.lang.String city, @org.jetbrains.annotations.Nullable
        java.lang.String zipCode, @org.jetbrains.annotations.Nullable
        java.lang.String country) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
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
        public final java.lang.String component2() {
            return null;
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
        public final java.lang.String component3() {
            return null;
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
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCountry() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "country")
        @java.lang.Deprecated
        public static void getCountry$annotations() {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/remote/model/ProfileDtoModel$PostalAddressDtoModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/remote/model/ProfileDtoModel$PostalAddressDtoModel;", "wmc-3.1.40-b11_devDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlinx.serialization.KSerializer<no.wmc.data.remote.model.ProfileDtoModel.PostalAddressDtoModel> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/remote/model/ProfileDtoModel.PostalAddressDtoModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/remote/model/ProfileDtoModel$PostalAddressDtoModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_devDebug"})
        @java.lang.Deprecated
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.remote.model.ProfileDtoModel.PostalAddressDtoModel> {
            @org.jetbrains.annotations.NotNull
            public static final no.wmc.data.remote.model.ProfileDtoModel.PostalAddressDtoModel.$serializer INSTANCE = null;
            
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
            public no.wmc.data.remote.model.ProfileDtoModel.PostalAddressDtoModel deserialize(@org.jetbrains.annotations.NotNull
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
            no.wmc.data.remote.model.ProfileDtoModel.PostalAddressDtoModel value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0003*+,BI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fB-\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J9\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001J!\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u00c7\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006-"}, d2 = {"Lno/wmc/data/remote/model/ProfileDtoModel$InsuranceDtoModel;", "", "seen1", "", "company", "", "type", "Lno/wmc/data/remote/model/ProfileDtoModel$InsuranceDtoModel$InsuranceTypeDtoModel;", "phone", "policy", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lno/wmc/data/remote/model/ProfileDtoModel$InsuranceDtoModel$InsuranceTypeDtoModel;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lno/wmc/data/remote/model/ProfileDtoModel$InsuranceDtoModel$InsuranceTypeDtoModel;Ljava/lang/String;Ljava/lang/String;)V", "getCompany$annotations", "()V", "getCompany", "()Ljava/lang/String;", "getPhone$annotations", "getPhone", "getPolicy$annotations", "getPolicy", "getType$annotations", "getType", "()Lno/wmc/data/remote/model/ProfileDtoModel$InsuranceDtoModel$InsuranceTypeDtoModel;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "InsuranceTypeDtoModel", "wmc-3.1.40-b11_devDebug"})
    @kotlinx.serialization.Serializable
    public static final class InsuranceDtoModel {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel.Companion Companion = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String company = null;
        @org.jetbrains.annotations.Nullable
        private final no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel.InsuranceTypeDtoModel type = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String phone = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String policy = null;
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel copy(@org.jetbrains.annotations.Nullable
        java.lang.String company, @org.jetbrains.annotations.Nullable
        no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel.InsuranceTypeDtoModel type, @org.jetbrains.annotations.Nullable
        java.lang.String phone, @org.jetbrains.annotations.Nullable
        java.lang.String policy) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic
        public static final void write$Self(@org.jetbrains.annotations.NotNull
        no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel self, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public InsuranceDtoModel(@org.jetbrains.annotations.Nullable
        java.lang.String company, @org.jetbrains.annotations.Nullable
        no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel.InsuranceTypeDtoModel type, @org.jetbrains.annotations.Nullable
        java.lang.String phone, @org.jetbrains.annotations.Nullable
        java.lang.String policy) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
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
        public final no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel.InsuranceTypeDtoModel component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel.InsuranceTypeDtoModel getType() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "type")
        @java.lang.Deprecated
        public static void getType$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
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
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getPolicy() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "policy")
        @java.lang.Deprecated
        public static void getPolicy$annotations() {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/data/remote/model/ProfileDtoModel$InsuranceDtoModel$InsuranceTypeDtoModel;", "", "(Ljava/lang/String;I)V", "Travel", "Health", "$serializer", "Companion", "wmc-3.1.40-b11_devDebug"})
        @kotlinx.serialization.Serializable
        public static enum InsuranceTypeDtoModel {
            @kotlinx.serialization.SerialName(value = "Travel")
            /*public static final*/ Travel /* = new Travel() */,
            @kotlinx.serialization.SerialName(value = "Health")
            /*public static final*/ Health /* = new Health() */;
            @org.jetbrains.annotations.NotNull
            public static final no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel.InsuranceTypeDtoModel.Companion Companion = null;
            
            InsuranceTypeDtoModel() {
            }
            
            @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/remote/model/ProfileDtoModel$InsuranceDtoModel$InsuranceTypeDtoModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/remote/model/ProfileDtoModel$InsuranceDtoModel$InsuranceTypeDtoModel;", "wmc-3.1.40-b11_devDebug"})
            public static final class Companion {
                
                private Companion() {
                    super();
                }
                
                @org.jetbrains.annotations.NotNull
                public final kotlinx.serialization.KSerializer<no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel.InsuranceTypeDtoModel> serializer() {
                    return null;
                }
            }
            
            @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/remote/model/ProfileDtoModel.InsuranceDtoModel.InsuranceTypeDtoModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/remote/model/ProfileDtoModel$InsuranceDtoModel$InsuranceTypeDtoModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_devDebug"})
            @java.lang.Deprecated
            public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel.InsuranceTypeDtoModel> {
                @org.jetbrains.annotations.NotNull
                public static final no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel.InsuranceTypeDtoModel.$serializer INSTANCE = null;
                
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
                public no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel.InsuranceTypeDtoModel deserialize(@org.jetbrains.annotations.NotNull
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
                no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel.InsuranceTypeDtoModel value) {
                }
                
                @org.jetbrains.annotations.NotNull
                public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                    return null;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/remote/model/ProfileDtoModel$InsuranceDtoModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/remote/model/ProfileDtoModel$InsuranceDtoModel;", "wmc-3.1.40-b11_devDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlinx.serialization.KSerializer<no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/remote/model/ProfileDtoModel.InsuranceDtoModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/remote/model/ProfileDtoModel$InsuranceDtoModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_devDebug"})
        @java.lang.Deprecated
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel> {
            @org.jetbrains.annotations.NotNull
            public static final no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel.$serializer INSTANCE = null;
            
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
            public no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel deserialize(@org.jetbrains.annotations.NotNull
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
            no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B=\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nB#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J-\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u00c7\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\u00a8\u0006&"}, d2 = {"Lno/wmc/data/remote/model/ProfileDtoModel$EmergencyContactDtoModel;", "", "seen1", "", "name", "", "phone", "relationship", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName$annotations", "()V", "getName", "()Ljava/lang/String;", "getPhone$annotations", "getPhone", "getRelationship$annotations", "getRelationship", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "wmc-3.1.40-b11_devDebug"})
    @kotlinx.serialization.Serializable
    public static final class EmergencyContactDtoModel {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.remote.model.ProfileDtoModel.EmergencyContactDtoModel.Companion Companion = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String name = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String phone = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String relationship = null;
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.data.remote.model.ProfileDtoModel.EmergencyContactDtoModel copy(@org.jetbrains.annotations.Nullable
        java.lang.String name, @org.jetbrains.annotations.Nullable
        java.lang.String phone, @org.jetbrains.annotations.Nullable
        java.lang.String relationship) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic
        public static final void write$Self(@org.jetbrains.annotations.NotNull
        no.wmc.data.remote.model.ProfileDtoModel.EmergencyContactDtoModel self, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public EmergencyContactDtoModel(@org.jetbrains.annotations.Nullable
        java.lang.String name, @org.jetbrains.annotations.Nullable
        java.lang.String phone, @org.jetbrains.annotations.Nullable
        java.lang.String relationship) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
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
        public final java.lang.String component2() {
            return null;
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
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRelationship() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "relationship")
        @java.lang.Deprecated
        public static void getRelationship$annotations() {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/remote/model/ProfileDtoModel$EmergencyContactDtoModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/remote/model/ProfileDtoModel$EmergencyContactDtoModel;", "wmc-3.1.40-b11_devDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlinx.serialization.KSerializer<no.wmc.data.remote.model.ProfileDtoModel.EmergencyContactDtoModel> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/remote/model/ProfileDtoModel.EmergencyContactDtoModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/remote/model/ProfileDtoModel$EmergencyContactDtoModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_devDebug"})
        @java.lang.Deprecated
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.remote.model.ProfileDtoModel.EmergencyContactDtoModel> {
            @org.jetbrains.annotations.NotNull
            public static final no.wmc.data.remote.model.ProfileDtoModel.EmergencyContactDtoModel.$serializer INSTANCE = null;
            
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
            public no.wmc.data.remote.model.ProfileDtoModel.EmergencyContactDtoModel deserialize(@org.jetbrains.annotations.NotNull
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
            no.wmc.data.remote.model.ProfileDtoModel.EmergencyContactDtoModel value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/data/remote/model/ProfileDtoModel$GenderDtoModel;", "", "(Ljava/lang/String;I)V", "Male", "Female", "$serializer", "Companion", "wmc-3.1.40-b11_devDebug"})
    @kotlinx.serialization.Serializable
    public static enum GenderDtoModel {
        @kotlinx.serialization.SerialName(value = "Male")
        /*public static final*/ Male /* = new Male() */,
        @kotlinx.serialization.SerialName(value = "Female")
        /*public static final*/ Female /* = new Female() */;
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.remote.model.ProfileDtoModel.GenderDtoModel.Companion Companion = null;
        
        GenderDtoModel() {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/remote/model/ProfileDtoModel$GenderDtoModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/remote/model/ProfileDtoModel$GenderDtoModel;", "wmc-3.1.40-b11_devDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlinx.serialization.KSerializer<no.wmc.data.remote.model.ProfileDtoModel.GenderDtoModel> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/remote/model/ProfileDtoModel.GenderDtoModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/remote/model/ProfileDtoModel$GenderDtoModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_devDebug"})
        @java.lang.Deprecated
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.remote.model.ProfileDtoModel.GenderDtoModel> {
            @org.jetbrains.annotations.NotNull
            public static final no.wmc.data.remote.model.ProfileDtoModel.GenderDtoModel.$serializer INSTANCE = null;
            
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
            public no.wmc.data.remote.model.ProfileDtoModel.GenderDtoModel deserialize(@org.jetbrains.annotations.NotNull
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
            no.wmc.data.remote.model.ProfileDtoModel.GenderDtoModel value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\t"}, d2 = {"Lno/wmc/data/remote/model/ProfileDtoModel$CardOrderStatusDtoModel;", "", "(Ljava/lang/String;I)V", "Unregistered", "Registered", "Failed", "Completed", "$serializer", "Companion", "wmc-3.1.40-b11_devDebug"})
    @kotlinx.serialization.Serializable
    public static enum CardOrderStatusDtoModel {
        @kotlinx.serialization.SerialName(value = "Unregistered")
        /*public static final*/ Unregistered /* = new Unregistered() */,
        @kotlinx.serialization.SerialName(value = "Registered")
        /*public static final*/ Registered /* = new Registered() */,
        @kotlinx.serialization.SerialName(value = "Failed")
        /*public static final*/ Failed /* = new Failed() */,
        @kotlinx.serialization.SerialName(value = "Completed")
        /*public static final*/ Completed /* = new Completed() */;
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.remote.model.ProfileDtoModel.CardOrderStatusDtoModel.Companion Companion = null;
        
        CardOrderStatusDtoModel() {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/remote/model/ProfileDtoModel$CardOrderStatusDtoModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/remote/model/ProfileDtoModel$CardOrderStatusDtoModel;", "wmc-3.1.40-b11_devDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlinx.serialization.KSerializer<no.wmc.data.remote.model.ProfileDtoModel.CardOrderStatusDtoModel> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/remote/model/ProfileDtoModel.CardOrderStatusDtoModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/remote/model/ProfileDtoModel$CardOrderStatusDtoModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_devDebug"})
        @java.lang.Deprecated
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.remote.model.ProfileDtoModel.CardOrderStatusDtoModel> {
            @org.jetbrains.annotations.NotNull
            public static final no.wmc.data.remote.model.ProfileDtoModel.CardOrderStatusDtoModel.$serializer INSTANCE = null;
            
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
            public no.wmc.data.remote.model.ProfileDtoModel.CardOrderStatusDtoModel deserialize(@org.jetbrains.annotations.NotNull
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
            no.wmc.data.remote.model.ProfileDtoModel.CardOrderStatusDtoModel value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/remote/model/ProfileDtoModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/data/remote/model/ProfileDtoModel;", "wmc-3.1.40-b11_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kotlinx.serialization.KSerializer<no.wmc.data.remote.model.ProfileDtoModel> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/data/remote/model/ProfileDtoModel.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/data/remote/model/ProfileDtoModel;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_devDebug"})
    @java.lang.Deprecated
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.data.remote.model.ProfileDtoModel> {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.data.remote.model.ProfileDtoModel.$serializer INSTANCE = null;
        
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
        public no.wmc.data.remote.model.ProfileDtoModel deserialize(@org.jetbrains.annotations.NotNull
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
        no.wmc.data.remote.model.ProfileDtoModel value) {
        }
        
        @org.jetbrains.annotations.NotNull
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}