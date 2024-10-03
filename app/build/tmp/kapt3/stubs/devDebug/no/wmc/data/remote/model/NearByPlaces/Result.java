package no.wmc.data.remote.model.NearByPlaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\"\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010%\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b\'\u0010\bR \u0010(\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\bR&\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010,8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u00107\u001a\u0004\b3\u00104\"\u0004\b5\u00106R \u00108\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\b\u00a8\u0006;"}, d2 = {"Lno/wmc/data/remote/model/NearByPlaces/Result;", "", "()V", "businessStatus", "", "getBusinessStatus", "()Ljava/lang/String;", "setBusinessStatus", "(Ljava/lang/String;)V", "geometry", "Lno/wmc/data/remote/model/NearByPlaces/Geometry;", "getGeometry", "()Lno/wmc/data/remote/model/NearByPlaces/Geometry;", "setGeometry", "(Lno/wmc/data/remote/model/NearByPlaces/Geometry;)V", "icon", "getIcon", "setIcon", "name", "getName", "setName", "openingHours", "Lno/wmc/data/remote/model/NearByPlaces/OpeningHours;", "getOpeningHours", "()Lno/wmc/data/remote/model/NearByPlaces/OpeningHours;", "setOpeningHours", "(Lno/wmc/data/remote/model/NearByPlaces/OpeningHours;)V", "placeId", "getPlaceId", "setPlaceId", "rating", "", "getRating", "()Ljava/lang/Float;", "setRating", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "reference", "getReference", "setReference", "scope", "getScope", "setScope", "types", "", "getTypes", "()Ljava/util/List;", "setTypes", "(Ljava/util/List;)V", "userRatingsTotal", "", "getUserRatingsTotal", "()Ljava/lang/Integer;", "setUserRatingsTotal", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "vicinity", "getVicinity", "setVicinity", "wmc-3.1.40-b11_devDebug"})
public final class Result {
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "business_status")
    private java.lang.String businessStatus;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "icon")
    private java.lang.String icon;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "name")
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "place_id")
    private java.lang.String placeId;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "rating")
    private java.lang.Float rating;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "reference")
    private java.lang.String reference;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "scope")
    private java.lang.String scope;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "types")
    private java.util.List<java.lang.String> types;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "opening_hours")
    private no.wmc.data.remote.model.NearByPlaces.OpeningHours openingHours;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "geometry")
    private no.wmc.data.remote.model.NearByPlaces.Geometry geometry;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "user_ratings_total")
    private java.lang.Integer userRatingsTotal;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "vicinity")
    private java.lang.String vicinity;
    
    public Result() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBusinessStatus() {
        return null;
    }
    
    public final void setBusinessStatus(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIcon() {
        return null;
    }
    
    public final void setIcon(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPlaceId() {
        return null;
    }
    
    public final void setPlaceId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Float getRating() {
        return null;
    }
    
    public final void setRating(@org.jetbrains.annotations.Nullable
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReference() {
        return null;
    }
    
    public final void setReference(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getScope() {
        return null;
    }
    
    public final void setScope(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getTypes() {
        return null;
    }
    
    public final void setTypes(@org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.data.remote.model.NearByPlaces.OpeningHours getOpeningHours() {
        return null;
    }
    
    public final void setOpeningHours(@org.jetbrains.annotations.Nullable
    no.wmc.data.remote.model.NearByPlaces.OpeningHours p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final no.wmc.data.remote.model.NearByPlaces.Geometry getGeometry() {
        return null;
    }
    
    public final void setGeometry(@org.jetbrains.annotations.Nullable
    no.wmc.data.remote.model.NearByPlaces.Geometry p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getUserRatingsTotal() {
        return null;
    }
    
    public final void setUserRatingsTotal(@org.jetbrains.annotations.Nullable
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVicinity() {
        return null;
    }
    
    public final void setVicinity(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}