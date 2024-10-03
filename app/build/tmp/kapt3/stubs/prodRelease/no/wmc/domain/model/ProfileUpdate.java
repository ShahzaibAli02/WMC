package no.wmc.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00b9\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0019J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u00c6\u0003J\u0011\u00104\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012H\u00c6\u0003J\u0011\u00105\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\'J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00e0\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00122\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u000b2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020DH\u00d6\u0001J\t\u0010E\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010\'R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001b\u00a8\u0006F"}, d2 = {"Lno/wmc/domain/model/ProfileUpdate;", "", "ssn_country_code", "", "firstName", "lastName", "avatar", "birthDate", "gender", "Lno/wmc/domain/model/Profile$Gender;", "organDonation", "", "relationShip", "ssn", "nationality", "phone", "homePhone", "postalAddress", "", "Lno/wmc/domain/model/Profile$PostalAddress;", "insurances", "Lno/wmc/domain/model/Profile$Insurance;", "emergencyContact", "Lno/wmc/domain/model/Profile$EmergencyContact;", "otherInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lno/wmc/domain/model/Profile$Gender;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "getBirthDate", "getEmergencyContact", "()Ljava/util/List;", "getFirstName", "getGender", "()Lno/wmc/domain/model/Profile$Gender;", "getHomePhone", "getInsurances", "getLastName", "getNationality", "getOrganDonation", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOtherInfo", "getPhone", "getPostalAddress", "getRelationShip", "getSsn", "getSsn_country_code", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lno/wmc/domain/model/Profile$Gender;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lno/wmc/domain/model/ProfileUpdate;", "equals", "other", "hashCode", "", "toString", "wmc-3.1.40-b11_prodRelease"})
public final class ProfileUpdate {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String ssn_country_code = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String firstName = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String lastName = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String avatar = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String birthDate = null;
    @org.jetbrains.annotations.Nullable
    private final no.wmc.domain.model.Profile.Gender gender = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean organDonation = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String relationShip = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String ssn = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String nationality = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String phone = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String homePhone = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<no.wmc.domain.model.Profile.PostalAddress> postalAddress = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<no.wmc.domain.model.Profile.Insurance> insurances = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<no.wmc.domain.model.Profile.EmergencyContact> emergencyContact = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String otherInfo = null;
    
    @org.jetbrains.annotations.NotNull
    public final no.wmc.domain.model.ProfileUpdate copy(@org.jetbrains.annotations.Nullable
    java.lang.String ssn_country_code, @org.jetbrains.annotations.Nullable
    java.lang.String firstName, @org.jetbrains.annotations.Nullable
    java.lang.String lastName, @org.jetbrains.annotations.Nullable
    java.lang.String avatar, @org.jetbrains.annotations.Nullable
    java.lang.String birthDate, @org.jetbrains.annotations.Nullable
    no.wmc.domain.model.Profile.Gender gender, @org.jetbrains.annotations.Nullable
    java.lang.Boolean organDonation, @org.jetbrains.annotations.Nullable
    java.lang.String relationShip, @org.jetbrains.annotations.Nullable
    java.lang.String ssn, @org.jetbrains.annotations.Nullable
    java.lang.String nationality, @org.jetbrains.annotations.Nullable
    java.lang.String phone, @org.jetbrains.annotations.Nullable
    java.lang.String homePhone, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.Profile.PostalAddress> postalAddress, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.Profile.Insurance> insurances, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.Profile.EmergencyContact> emergencyContact, @org.jetbrains.annotations.Nullable
    java.lang.String otherInfo) {
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
    
    public ProfileUpdate(@org.jetbrains.annotations.Nullable
    java.lang.String ssn_country_code, @org.jetbrains.annotations.Nullable
    java.lang.String firstName, @org.jetbrains.annotations.Nullable
    java.lang.String lastName, @org.jetbrains.annotations.Nullable
    java.lang.String avatar, @org.jetbrains.annotations.Nullable
    java.lang.String birthDate, @org.jetbrains.annotations.Nullable
    no.wmc.domain.model.Profile.Gender gender, @org.jetbrains.annotations.Nullable
    java.lang.Boolean organDonation, @org.jetbrains.annotations.Nullable
    java.lang.String relationShip, @org.jetbrains.annotations.Nullable
    java.lang.String ssn, @org.jetbrains.annotations.Nullable
    java.lang.String nationality, @org.jetbrains.annotations.Nullable
    java.lang.String phone, @org.jetbrains.annotations.Nullable
    java.lang.String homePhone, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.Profile.PostalAddress> postalAddress, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.Profile.Insurance> insurances, @org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.domain.model.Profile.EmergencyContact> emergencyContact, @org.jetbrains.annotations.Nullable
    java.lang.String otherInfo) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSsn_country_code() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFirstName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLastName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAvatar() {
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
    public final java.lang.String getRelationShip() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSsn() {
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
    public final java.util.List<no.wmc.domain.model.Profile.PostalAddress> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.domain.model.Profile.PostalAddress> getPostalAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.domain.model.Profile.Insurance> component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.domain.model.Profile.Insurance> getInsurances() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.domain.model.Profile.EmergencyContact> component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.domain.model.Profile.EmergencyContact> getEmergencyContact() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOtherInfo() {
        return null;
    }
}