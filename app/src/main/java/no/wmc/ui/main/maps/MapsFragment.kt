package no.wmc.ui.main.maps

import android.annotation.SuppressLint
import android.content.Context.LAYOUT_INFLATER_SERVICE
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.GradientDrawable
import android.location.Location
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.card.MaterialCardView
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import no.wmc.R
import org.koin.android.ext.android.inject


class MapsFragment : Fragment()
{


    private val viewModel: MapsViewModel by inject()
    lateinit var googleMap: GoogleMap
    private var bitmapPharma: Bitmap? = null
    private var bitmapHospital: Bitmap? = null
    private lateinit var myLocation:MaterialCardView
    private var mLocation:Location?=null
    private val callback = OnMapReadyCallback { map ->
        this.googleMap = map
        mapView=mapFragment.view
        requestPermissionLauncher.launch(arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION, android.Manifest.permission.ACCESS_COARSE_LOCATION))
    }

    @SuppressLint("MissingPermission")
    private val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { isGranted: Map<String, Boolean> ->

        if (isGranted.containsValue(true))
        {
         //   this.googleMap.isMyLocationEnabled = true
            getUserLocation()
        }

    }
    var mapView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View?
    {
        return inflater.inflate(R.layout.fragment_maps, container, false)
    }


    @SuppressLint("MissingPermission")
    fun getUserLocation()
    {
        lifecycleScope.launch {
            viewModel.getLocation()?.let {
                mLocation=it
                googleMap.clear()
                googleMap.isMyLocationEnabled=true
                googleMap.uiSettings.isMyLocationButtonEnabled=false

               // googleMap.getPositionIndicator().setVisible(true)
             //   googleMap.addMarker(MarkerOptions().position(LatLng(it.latitude,it.longitude)).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)))
                viewModel.getNearByPlaces(it.toLatLng())
            }

        }
    }
    lateinit var mapFragment: SupportMapFragment
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)


        setFaded(view)
        mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment

        myLocation=view.findViewById(R.id.cardMyLocation);
        myLocation.setOnClickListener {
            mLocation?.let {
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(it.toLatLng(), 15.0f))
            }
        }
        mapFragment.getMapAsync(callback)
        lifecycleScope.launch {
            viewModel.places.collectLatest {
                bitmapPharma = getMarkerBitmapFromView(false)
                bitmapHospital = getMarkerBitmapFromView(true)
                it.forEach { result ->
                    result.geometry?.location?.let { loc ->

                        val sydney = LatLng(loc.lat!!, loc.lng!!)
                        googleMap.addMarker(
                            MarkerOptions().position(sydney).title(result.name)
                                .snippet(result.vicinity).icon(
                                    BitmapDescriptorFactory.fromBitmap(
                                        if (result.types?.firstOrNull { it.equals("hospital",true) }!= null)
                                            bitmapHospital!!
                                        else bitmapPharma!!

                                    )
                                )
                        )
                        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 13.0f))

                    }
                }
            }
        }
    }

    private fun setFaded(view:View)
    {
        val gradientDrawable = GradientDrawable(
            GradientDrawable.Orientation.TOP_BOTTOM, intArrayOf(-0x1, 0x00FFFFFF)
        )
       view.findViewById<View>(R.id.fadedView).background=gradientDrawable
    }


    private fun getMarkerBitmapFromView(isHospital: Boolean): Bitmap
    {
        val customMarkerView = (requireContext().getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater).inflate(R.layout.lyt_map_snippet, null)


        val avatar = customMarkerView.findViewById<ImageView>(R.id.imageMap);
        avatar.setImageResource(if (isHospital) R.drawable.map_ic_hospital else R.drawable.map_ic_pharma)
        customMarkerView.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED)
        customMarkerView.layout(
            0, 0, customMarkerView.measuredWidth, customMarkerView.measuredHeight
        )
        customMarkerView.buildDrawingCache()
        val returnedBitmap = Bitmap.createBitmap(
            customMarkerView.measuredWidth, customMarkerView.measuredHeight, Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(returnedBitmap)
        canvas.drawColor(Color.WHITE, PorterDuff.Mode.SRC_IN)
        val drawable = customMarkerView.background
        drawable?.draw(canvas)
        customMarkerView.draw(canvas)
        return returnedBitmap

    }

}

private fun Location.toLatLng(): LatLng
{
    return LatLng(this.latitude, this.longitude)
}
