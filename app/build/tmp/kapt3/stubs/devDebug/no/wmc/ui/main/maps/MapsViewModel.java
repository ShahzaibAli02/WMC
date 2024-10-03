package no.wmc.ui.main.maps;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lno/wmc/ui/main/maps/MapsViewModel;", "Landroidx/lifecycle/ViewModel;", "mapsRepository", "Lno/wmc/ui/main/maps/MapsRepository;", "(Lno/wmc/ui/main/maps/MapsRepository;)V", "_places", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lno/wmc/data/remote/model/NearByPlaces/Result;", "getMapsRepository", "()Lno/wmc/ui/main/maps/MapsRepository;", "places", "Lkotlinx/coroutines/flow/StateFlow;", "", "getPlaces", "()Lkotlinx/coroutines/flow/StateFlow;", "getLocation", "Landroid/location/Location;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNearByPlaces", "Lkotlinx/coroutines/Job;", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "wmc-3.1.40-b11_devDebug"})
public final class MapsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final no.wmc.ui.main.maps.MapsRepository mapsRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<no.wmc.data.remote.model.NearByPlaces.Result>> _places = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<no.wmc.data.remote.model.NearByPlaces.Result>> places = null;
    
    public MapsViewModel(@org.jetbrains.annotations.NotNull
    no.wmc.ui.main.maps.MapsRepository mapsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final no.wmc.ui.main.maps.MapsRepository getMapsRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<no.wmc.data.remote.model.NearByPlaces.Result>> getPlaces() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getLocation(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super android.location.Location> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job getNearByPlaces(@org.jetbrains.annotations.NotNull
    com.google.android.gms.maps.model.LatLng latLng) {
        return null;
    }
}