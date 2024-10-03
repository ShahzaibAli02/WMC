package no.wmc.data.remote.model.NearByPlaces

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Result
{
    @SerializedName("business_status")
    @Expose
    var businessStatus: String? = null

    @SerializedName("icon")
    @Expose
    var icon: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("place_id")
    @Expose
    var placeId: String? = null

    @SerializedName("rating")
    @Expose
    var rating: Float? = null

    @SerializedName("reference")
    @Expose
    var reference: String? = null

    @SerializedName("scope")
    @Expose
    var scope: String? = null

    @SerializedName("types")
    @Expose
    var types: List<String>? = null

    @SerializedName("opening_hours")
    @Expose
    var openingHours: OpeningHours? = null

    @SerializedName("geometry")
    @Expose
    var geometry: Geometry? = null

    @SerializedName("user_ratings_total")
    @Expose
    var userRatingsTotal: Int? = null

    @SerializedName("vicinity")
    @Expose
    var vicinity: String? = null
}