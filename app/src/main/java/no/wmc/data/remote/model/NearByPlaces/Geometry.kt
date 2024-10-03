package no.wmc.data.remote.model.NearByPlaces

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Geometry
{
    @get:SerializedName("viewport")
    @SerializedName("location")
    @Expose
    var location: Location? = null
}