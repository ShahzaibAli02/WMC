package no.wmc.data.local.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0007J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\u0016"}, d2 = {"Lno/wmc/data/local/db/Converters;", "", "()V", "fromEmergencyContactEntity", "", "list", "", "Lno/wmc/data/local/db/entity/ProfileEntity$EmergencyContactEntity;", "fromInstant", "date", "Lkotlinx/datetime/Instant;", "fromInsuranceEntity", "entity", "Lno/wmc/data/local/db/entity/ProfileEntity$InsuranceEntity;", "fromPostalAddressEntity", "Lno/wmc/data/local/db/entity/ProfileEntity$PostalAddressEntity;", "toEmergencyContactEntity", "string", "toInstant", "dateString", "toInsuranceEntity", "toPostalAddressEntity", "wmc-3.1.40-b11_prodRelease"})
public final class Converters {
    @org.jetbrains.annotations.NotNull
    public static final no.wmc.data.local.db.Converters INSTANCE = null;
    
    private Converters() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.util.List<no.wmc.data.local.db.entity.ProfileEntity.EmergencyContactEntity> toEmergencyContactEntity(@org.jetbrains.annotations.Nullable
    java.lang.String string) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String fromEmergencyContactEntity(@org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.data.local.db.entity.ProfileEntity.EmergencyContactEntity> list) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final no.wmc.data.local.db.entity.ProfileEntity.PostalAddressEntity toPostalAddressEntity(@org.jetbrains.annotations.Nullable
    java.lang.String string) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String fromPostalAddressEntity(@org.jetbrains.annotations.Nullable
    no.wmc.data.local.db.entity.ProfileEntity.PostalAddressEntity entity) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final no.wmc.data.local.db.entity.ProfileEntity.InsuranceEntity toInsuranceEntity(@org.jetbrains.annotations.Nullable
    java.lang.String string) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String fromInsuranceEntity(@org.jetbrains.annotations.Nullable
    no.wmc.data.local.db.entity.ProfileEntity.InsuranceEntity entity) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final kotlinx.datetime.Instant toInstant(@org.jetbrains.annotations.Nullable
    java.lang.String dateString) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.TypeConverter
    public final java.lang.String fromInstant(@org.jetbrains.annotations.Nullable
    kotlinx.datetime.Instant date) {
        return null;
    }
}