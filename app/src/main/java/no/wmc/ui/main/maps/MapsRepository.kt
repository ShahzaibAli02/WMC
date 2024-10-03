package no.wmc.ui.main.maps


import android.annotation.SuppressLint
import android.content.Context
import android.location.Location
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.google.android.gms.location.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.tasks.CancellationTokenSource
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.tasks.await
import no.wmc.BuildConfig
import no.wmc.data.remote.model.NearByPlaces.NearByPlaces
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class MapsRepository(private val context: Context)
{


    @SuppressLint("MissingPermission")
    suspend fun getUserLocation(): Location? {
        val locationClient = LocationServices.getFusedLocationProviderClient(context)
        var result = locationClient.lastLocation.await()
        if(result!=null)
            return result


        result = locationClient.getCurrentLocation(
            Priority.PRIORITY_HIGH_ACCURACY,
            CancellationTokenSource().token,
        ).await()
        return result
    }

    suspend fun getNearByPlaces(type:String,latLng: LatLng) = suspendCoroutine<NearByPlaces?> { cont ->
            val queue = Volley.newRequestQueue(context)
            val url = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=${latLng.latitude},${latLng.longitude}&radius=5000&types=${type}&key=${BuildConfig.PLACES_API_KEY}"

            val stringRequest = StringRequest(
                Request.Method.GET, url, { response ->

                    kotlin.runCatching {
                        val type = object : TypeToken<NearByPlaces?>()
                        {}.type
                        val nearByPlaces: NearByPlaces = Gson().fromJson(response, type)
                        cont.resume(nearByPlaces)
                    }

                },
                {

                    cont.resume(null)
                })

            queue.add(stringRequest)
        }

}
