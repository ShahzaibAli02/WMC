package no.wmc.data.remote.model.NearByPlaces

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class OpeningHours
{
    @SerializedName("open_now")
    @Expose
    var openNow: Boolean? = null
}