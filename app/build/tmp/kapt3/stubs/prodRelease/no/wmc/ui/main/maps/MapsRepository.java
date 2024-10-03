package no.wmc.ui.main.maps;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u0004\u0018\u00010\rH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lno/wmc/ui/main/maps/MapsRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getNearByPlaces", "Lno/wmc/data/remote/model/NearByPlaces/NearByPlaces;", "type", "", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserLocation", "Landroid/location/Location;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_prodRelease"})
public final class MapsRepository {
    private final android.content.Context context = null;
    
    public MapsRepository(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final java.lang.Object getUserLocation(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super android.location.Location> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getNearByPlaces(@org.jetbrains.annotations.NotNull
    java.lang.String type, @org.jetbrains.annotations.NotNull
    com.google.android.gms.maps.model.LatLng latLng, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.data.remote.model.NearByPlaces.NearByPlaces> continuation) {
        return null;
    }
}