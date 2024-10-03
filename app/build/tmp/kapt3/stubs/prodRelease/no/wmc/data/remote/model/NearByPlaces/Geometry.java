package no.wmc.data.remote.model.NearByPlaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048G@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lno/wmc/data/remote/model/NearByPlaces/Geometry;", "", "()V", "location", "Lno/wmc/data/remote/model/NearByPlaces/Location;", "getLocation", "()Lno/wmc/data/remote/model/NearByPlaces/Location;", "setLocation", "(Lno/wmc/data/remote/model/NearByPlaces/Location;)V", "wmc-3.1.40-b11_prodRelease"})
public final class Geometry {
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "location")
    private no.wmc.data.remote.model.NearByPlaces.Location location;
    
    public Geometry() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "viewport")
    public final no.wmc.data.remote.model.NearByPlaces.Location getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.Nullable
    no.wmc.data.remote.model.NearByPlaces.Location p0) {
    }
}