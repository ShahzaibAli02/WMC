package no.wmc.ui.main.maps;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020,H\u0007J&\u0010-\u001a\u0004\u0018\u00010\u00172\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u001a\u00104\u001a\u00020,2\u0006\u00105\u001a\u00020\u00172\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0010\u00106\u001a\u00020,2\u0006\u00105\u001a\u00020\u0017H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\'\u001a\u0004\b$\u0010%\u00a8\u00067"}, d2 = {"Lno/wmc/ui/main/maps/MapsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "bitmapHospital", "Landroid/graphics/Bitmap;", "bitmapPharma", "callback", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "getGoogleMap", "()Lcom/google/android/gms/maps/GoogleMap;", "setGoogleMap", "(Lcom/google/android/gms/maps/GoogleMap;)V", "mLocation", "Landroid/location/Location;", "mapFragment", "Lcom/google/android/gms/maps/SupportMapFragment;", "getMapFragment", "()Lcom/google/android/gms/maps/SupportMapFragment;", "setMapFragment", "(Lcom/google/android/gms/maps/SupportMapFragment;)V", "mapView", "Landroid/view/View;", "getMapView", "()Landroid/view/View;", "setMapView", "(Landroid/view/View;)V", "myLocation", "Lcom/google/android/material/card/MaterialCardView;", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "viewModel", "Lno/wmc/ui/main/maps/MapsViewModel;", "getViewModel", "()Lno/wmc/ui/main/maps/MapsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getMarkerBitmapFromView", "isHospital", "", "getUserLocation", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setFaded", "wmc-3.1.40-b11_devDebug"})
public final class MapsFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    public com.google.android.gms.maps.GoogleMap googleMap;
    private android.graphics.Bitmap bitmapPharma;
    private android.graphics.Bitmap bitmapHospital;
    private com.google.android.material.card.MaterialCardView myLocation;
    private android.location.Location mLocation;
    private final com.google.android.gms.maps.OnMapReadyCallback callback = null;
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> requestPermissionLauncher = null;
    @org.jetbrains.annotations.Nullable
    private android.view.View mapView;
    public com.google.android.gms.maps.SupportMapFragment mapFragment;
    
    public MapsFragment() {
        super();
    }
    
    private final no.wmc.ui.main.maps.MapsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.maps.GoogleMap getGoogleMap() {
        return null;
    }
    
    public final void setGoogleMap(@org.jetbrains.annotations.NotNull
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.view.View getMapView() {
        return null;
    }
    
    public final void setMapView(@org.jetbrains.annotations.Nullable
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void getUserLocation() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.maps.SupportMapFragment getMapFragment() {
        return null;
    }
    
    public final void setMapFragment(@org.jetbrains.annotations.NotNull
    com.google.android.gms.maps.SupportMapFragment p0) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setFaded(android.view.View view) {
    }
    
    private final android.graphics.Bitmap getMarkerBitmapFromView(boolean isHospital) {
        return null;
    }
}