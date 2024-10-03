package no.wmc.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bG\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0005pqrstB\u00d1\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010%\u001a\u00020\u0003\u00a2\u0006\u0002\u0010&J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u00c6\u0003J\u0011\u0010S\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014H\u00c6\u0003J\u0011\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010V\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u000bH\u00c6\u0003J\t\u0010Y\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u001fH\u00c6\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010$H\u00c6\u0003J\t\u0010_\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010;J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00da\u0002\u0010g\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00142\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00142\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010%\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010hJ\u0013\u0010i\u001a\u00020\u000b2\b\u0010j\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010k\u001a\u00020lH\u00d6\u0001J\u0014\u0010m\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030nJ\t\u0010o\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010(R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010(R\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010/R\u0011\u0010\u001b\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u00105R\u0011\u0010\u001c\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u00105R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0011\u0010\u001d\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010(R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010(R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010/R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0011\u0010%\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010(R\u0011\u0010!\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010(R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010(R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010(\"\u0004\bJ\u0010K\u00a8\u0006u"}, d2 = {"Lno/wmc/domain/model/Profile;", "", "firstName", "", "lastName", "avatar", "memberSince", "birthDate", "gender", "Lno/wmc/domain/model/Profile$Gender;", "organDonation", "", "ssn", "ssn_country_code", "nationality", "phone", "homePhone", "email", "password", "postalAddress", "", "Lno/wmc/domain/model/Profile$PostalAddress;", "insurances", "Lno/wmc/domain/model/Profile$Insurance;", "emergencyContact", "Lno/wmc/domain/model/Profile$EmergencyContact;", "otherInfo", "isActiveSubscription", "isForcedRefreshToken", "onBoardingRequired", "cardOrderStatus", "Lno/wmc/domain/model/Profile$CardOrderStatus;", "cardOrderDate", "relationShip", "uid", "promo", "Lno/wmc/data/remote/model/Promo;", "registerationPlatform", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lno/wmc/domain/model/Profile$Gender;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZZLno/wmc/domain/model/Profile$CardOrderStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lno/wmc/data/remote/model/Promo;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getBirthDate", "getCardOrderDate", "getCardOrderStatus", "()Lno/wmc/domain/model/Profile$CardOrderStatus;", "getEmail", "getEmergencyContact", "()Ljava/util/List;", "getFirstName", "getGender", "()Lno/wmc/domain/model/Profile$Gender;", "getHomePhone", "getInsurances", "()Z", "getLastName", "getMemberSince", "getNationality", "getOnBoardingRequired", "getOrganDonation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOtherInfo", "getPassword", "getPhone", "getPostalAddress", "getPromo", "()Lno/wmc/data/remote/model/Promo;", "setPromo", "(Lno/wmc/data/remote/model/Promo;)V", "getRegisterationPlatform", "getRelationShip", "getSsn", "getSsn_country_code", "getUid", "setUid", "(Ljava/lang/String;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lno/wmc/domain/model/Profile$Gender;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZZLno/wmc/domain/model/Profile$CardOrderStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lno/wmc/data/remote/model/Promo;Ljava/lang/String;)Lno/wmc/domain/model/Profile;", "equals", "other", "hashCode", "", "mapOfOrderCard", "", "toString", "CardOrderStatus", "EmergencyContact", "Gender", "Insurance", "PostalAddress", "wmc-3.1.40-b11_prodRelease"})
public final class Profile {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String firstName = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String lastName = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String avatar = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String memberSince = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String birthDate = null;
    @org.jetbrains.annotations.Nullable
    private final no.wmc.domain.model.Profile.Gender gender = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean organDonation = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String ssn = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String ssn_country_code = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String nationality = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String phone = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String homePhone = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String password = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<no.wmc.domain.model.Profile.PostalAddress> postalAddress = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<no.wmc.domain.model.Profile.Insurance> insurances = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<no.wmc.domain.model.Profile.EmergencyContact> emergencyContact = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String otherInfo = null;
    private final boolean isActiveSubscription = false;
    private final boolean isForcedRefreshToken = false;
    private final boolean onBoardingRequired = false;
    @org.jetbrains.annotations.Nullable
    private final no.wmc.domain.model.Profile.CardOrderStatus cardOrderStatus = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String cardOrderDate = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String relationShip = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.String uid;
    @org.jetbrains.annotations.Nullable
    private no.wmc.data.remote.model.Promo promo;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String registerationPlatform = null;
    
    @org.jetbrains.annotations.NotNull
    public final no.wmc.domain.model.Profile copy(@org.jetbrains.annotations.Nullable
    java.lang.String firstName, @org.jetbrains.annotations.Nullable
    java.lang.String lastName, @org.jetbrains.annotations.Nullable
    java.lang.String avatar, @org.jetbrains.annotations.Nullable
    java.lang.String memberSince, @org.jetbrains.annotations.Nullable
    java.lang.String birthDate, @org.jetbrains.annotations.Nullable
    no.wmc.domain.model.Profile.Gender gender, @org.jetbrains.annotations.Nullable
    java.lang.Boolean organDonation, @org.jetbrains.annotations.Nullable
    java.lang.String ssn, @org.jetbrains.annotations.Nullable
    java.lang.String ssn_country_code, @org.jetbrains.annotations.Nullable
    java.lang.String nationality, @org.jetbrains.annotations.Nullable
    java.lang.String phone, @org.jetbrains.annotations.Nullable
    java.lang.String homePhone, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String password, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.Profile.PostalAddress> postalAddress, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.Profile.Insurance> insurances, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.Profile.EmergencyContact> emergencyContact, @org.jetbrains.annotations.Nullable
    java.lang.String otherInfo, boolean isActiveSubscription, boolean isForcedRefreshToken, boolean onBoardingRequired, @org.jetbrains.annotations.Nullable
    no.wmc.domain.model.Profile.CardOrderStatus cardOrderStatus, @org.jetbrains.annotations.Nullable
    java.lang.String cardOrderDate, @org.jetbrains.annotations.NotNull
    java.lang.String relationShip, @org.jetbrains.annotations.Nullable
    java.lang.String uid, @org.jetbrains.annotations.Nullable
    no.wmc.data.remote.model.Promo promo, @org.jetbrains.annotations.NotNull
    java.lang.String registerationPlatform) {
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
    
    public Profile() {
        super();
    }
    
    public Profile(@org.jetbrains.annotations.Nullable
    java.lang.String firstName, @org.jetbrains.annotations.Nullable
    java.lang.String lastName, @org.jetbrains.annotations.Nullable
    java.lang.String avatar, @org.jetbrains.annotations.Nullable
    java.lang.String memberSince, @org.jetbrains.annotations.Nullable
    java.lang.String birthDate, @org.jetbrains.annotations.Nullable
    no.wmc.domain.model.Profile.Gender gender, @org.jetbrains.annotations.Nullable
    java.lang.Boolean organDonation, @org.jetbrains.annotations.Nullable
    java.lang.String ssn, @org.jetbrains.annotations.Nullable
    java.lang.String ssn_country_code, @org.jetbrains.annotations.Nullable
    java.lang.String nationality, @org.jetbrains.annotations.Nullable
    java.lang.String phone, @org.jetbrains.annotations.Nullable
    java.lang.String homePhone, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String password, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.Profile.PostalAddress> postalAddress, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.Profile.Insurance> insurances, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.Profile.EmergencyContact> emergencyContact, @org.jetbrains.annotations.Nullable
    java.lang.String otherInfo, boolean isActiveSubscription, boolean isForcedRefreshToken, boolean onBoardingRequired, @org.jetbrains.annotations.Nullable
    no.wmc.domain.model.Profile.CardOrderStatus cardOrderStatus, @org.jetbrains.annotations.Nullable
    java.lang.String cardOrderDate, @org.jetbrains.annotations.NotNull
    java.lang.String relationShip, @org.jetbrains.annotations.Nullable
    java.lang.String uid, @org.jetbrains.annotations.Nullable
    no.wmc.data.remote.model.Promo promo, @org.jetbrains.annotations.NotNull
    java.lang.String registerationPlatform) {
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
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLastName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMemberSince() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBirthDate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.domain.model.Profile.Gender component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.domain.model.Profile.Gender getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getOrganDonation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSsn() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSsn_country_code() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNationality() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getHomePhone() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.domain.model.Profile.PostalAddress> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.domain.model.Profile.PostalAddress> getPostalAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.domain.model.Profile.Insurance> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.domain.model.Profile.Insurance> getInsurances() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.domain.model.Profile.EmergencyContact> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.domain.model.Profile.EmergencyContact> getEmergencyContact() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOtherInfo() {
        return null;
    }
    
    public final boolean component19() {
        return false;
    }
    
    public final boolean isActiveSubscription() {
        return false;
    }
    
    public final boolean component20() {
        return false;
    }
    
    public final boolean isForcedRefreshToken() {
        return false;
    }
    
    public final boolean component21() {
        return false;
    }
    
    public final boolean getOnBoardingRequired() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.domain.model.Profile.CardOrderStatus component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.domain.model.Profile.CardOrderStatus getCardOrderStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCardOrderDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRelationShip() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUid() {
        return null;
    }
    
    public final void setUid(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.data.remote.model.Promo component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.data.remote.model.Promo getPromo() {
        return null;
    }
    
    public final void setPromo(@org.jetbrains.annotations.Nullable
    no.wmc.data.remote.model.Promo p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRegisterationPlatform() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, java.lang.String> mapOfOrderCard() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0018"}, d2 = {"Lno/wmc/domain/model/Profile$PostalAddress;", "", "info", "", "city", "postalCode", "country", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getCountry", "getInfo", "getPostalCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "wmc-3.1.40-b11_prodRelease"})
    public static final class PostalAddress {
        @org.jetbrains.annotations.Nullable
        private final java.lang.String info = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String city = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String postalCode = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String country = null;
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.domain.model.Profile.PostalAddress copy(@org.jetbrains.annotations.Nullable
        java.lang.String info, @org.jetbrains.annotations.Nullable
        java.lang.String city, @org.jetbrains.annotations.Nullable
        java.lang.String postalCode, @org.jetbrains.annotations.Nullable
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
        
        public PostalAddress(@org.jetbrains.annotations.Nullable
        java.lang.String info, @org.jetbrains.annotations.Nullable
        java.lang.String city, @org.jetbrains.annotations.Nullable
        java.lang.String postalCode, @org.jetbrains.annotations.Nullable
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
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCity() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getPostalCode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCountry() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0003+,-BA\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fB5\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J9\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\t\u0010#\u001a\u00020\u0005H\u00d6\u0001J!\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u00c7\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006."}, d2 = {"Lno/wmc/domain/model/Profile$Insurance;", "", "seen1", "", "company", "", "type", "Lno/wmc/domain/model/Profile$Insurance$InsuranceType;", "phone", "policy", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lno/wmc/domain/model/Profile$Insurance$InsuranceType;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lno/wmc/domain/model/Profile$Insurance$InsuranceType;Ljava/lang/String;Ljava/lang/String;)V", "getCompany", "()Ljava/lang/String;", "setCompany", "(Ljava/lang/String;)V", "getPhone", "setPhone", "getPolicy", "setPolicy", "getType", "()Lno/wmc/domain/model/Profile$Insurance$InsuranceType;", "setType", "(Lno/wmc/domain/model/Profile$Insurance$InsuranceType;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "InsuranceType", "wmc-3.1.40-b11_prodRelease"})
    @kotlinx.serialization.Serializable
    public static final class Insurance {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.domain.model.Profile.Insurance.Companion Companion = null;
        @org.jetbrains.annotations.Nullable
        private java.lang.String company;
        @org.jetbrains.annotations.Nullable
        private no.wmc.domain.model.Profile.Insurance.InsuranceType type;
        @org.jetbrains.annotations.Nullable
        private java.lang.String phone;
        @org.jetbrains.annotations.Nullable
        private java.lang.String policy;
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.domain.model.Profile.Insurance copy(@org.jetbrains.annotations.Nullable
        java.lang.String company, @org.jetbrains.annotations.Nullable
        no.wmc.domain.model.Profile.Insurance.InsuranceType type, @org.jetbrains.annotations.Nullable
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
        no.wmc.domain.model.Profile.Insurance self, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public Insurance() {
            super();
        }
        
        public Insurance(@org.jetbrains.annotations.Nullable
        java.lang.String company, @org.jetbrains.annotations.Nullable
        no.wmc.domain.model.Profile.Insurance.InsuranceType type, @org.jetbrains.annotations.Nullable
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
        
        public final void setCompany(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final no.wmc.domain.model.Profile.Insurance.InsuranceType component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final no.wmc.domain.model.Profile.Insurance.InsuranceType getType() {
            return null;
        }
        
        public final void setType(@org.jetbrains.annotations.Nullable
        no.wmc.domain.model.Profile.Insurance.InsuranceType p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getPhone() {
            return null;
        }
        
        public final void setPhone(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getPolicy() {
            return null;
        }
        
        public final void setPolicy(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lno/wmc/domain/model/Profile$Insurance$InsuranceType;", "", "displayName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "Travel", "Health", "wmc-3.1.40-b11_prodRelease"})
        public static enum InsuranceType {
            /*public static final*/ Travel /* = new Travel(null) */,
            /*public static final*/ Health /* = new Health(null) */;
            @org.jetbrains.annotations.Nullable
            private final java.lang.String displayName = null;
            
            InsuranceType(java.lang.String displayName) {
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getDisplayName() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/domain/model/Profile$Insurance$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lno/wmc/domain/model/Profile$Insurance;", "wmc-3.1.40-b11_prodRelease"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull
            public final kotlinx.serialization.KSerializer<no.wmc.domain.model.Profile.Insurance> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"no/wmc/domain/model/Profile.Insurance.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lno/wmc/domain/model/Profile$Insurance;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "wmc-3.1.40-b11_prodRelease"})
        @java.lang.Deprecated
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<no.wmc.domain.model.Profile.Insurance> {
            @org.jetbrains.annotations.NotNull
            public static final no.wmc.domain.model.Profile.Insurance.$serializer INSTANCE = null;
            
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
            public no.wmc.domain.model.Profile.Insurance deserialize(@org.jetbrains.annotations.NotNull
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
            no.wmc.domain.model.Profile.Insurance value) {
            }
            
            @org.jetbrains.annotations.NotNull
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lno/wmc/domain/model/Profile$EmergencyContact;", "", "name", "", "phone", "relationship", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPhone", "setPhone", "getRelationship", "setRelationship", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "wmc-3.1.40-b11_prodRelease"})
    public static final class EmergencyContact {
        @org.jetbrains.annotations.Nullable
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable
        private java.lang.String phone;
        @org.jetbrains.annotations.Nullable
        private java.lang.String relationship;
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.domain.model.Profile.EmergencyContact copy(@org.jetbrains.annotations.Nullable
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
        
        public EmergencyContact() {
            super();
        }
        
        public EmergencyContact(@org.jetbrains.annotations.Nullable
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
        
        public final void setName(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getPhone() {
            return null;
        }
        
        public final void setPhone(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getRelationship() {
            return null;
        }
        
        public final void setRelationship(@org.jetbrains.annotations.Nullable
        java.lang.String p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lno/wmc/domain/model/Profile$Gender;", "", "(Ljava/lang/String;I)V", "Male", "Female", "wmc-3.1.40-b11_prodRelease"})
    public static enum Gender {
        /*public static final*/ Male /* = new Male() */,
        /*public static final*/ Female /* = new Female() */;
        
        Gender() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/domain/model/Profile$CardOrderStatus;", "", "(Ljava/lang/String;I)V", "Unregistered", "Registered", "Failed", "Completed", "wmc-3.1.40-b11_prodRelease"})
    public static enum CardOrderStatus {
        /*public static final*/ Unregistered /* = new Unregistered() */,
        /*public static final*/ Registered /* = new Registered() */,
        /*public static final*/ Failed /* = new Failed() */,
        /*public static final*/ Completed /* = new Completed() */;
        
        CardOrderStatus() {
        }
    }
}