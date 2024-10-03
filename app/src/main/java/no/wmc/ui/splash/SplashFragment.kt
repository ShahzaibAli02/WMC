package no.wmc.ui.splash

import android.annotation.SuppressLint
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.MediaController
import androidx.activity.result.contract.ActivityResultContracts
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.Priority
import com.google.android.gms.tasks.CancellationTokenSource
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await
import no.wmc.R
import no.wmc.data.local.manager.LocalDataManager
import no.wmc.databinding.SplashScreenBinding
import no.wmc.ui.base.BaseFragment
import no.wmc.utils.ext.hideNavigationBar
import no.wmc.utils.ext.safeNavigate
import no.wmc.utils.ext.showNavigationBar
import org.koin.android.ext.android.inject
import java.io.IOException
import java.util.Locale

class SplashFragment : BaseFragment<SplashScreenBinding>(R.layout.splash_screen) {

    private val localDataManager: LocalDataManager by inject()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.wmcVideoLogo.setVideoURI(Uri.parse("android.resource://" + requireContext().packageName + "/" + R.raw.new_video))  // set the absolute path of the video file local file

        binding.wmcVideoLogo.setMediaController(null)

        // Start playing the video
        binding.wmcVideoLogo.start()
        binding.wmcVideoLogo.setOnCompletionListener {
            lifecycleScope.launch {

                localDataManager.getString("user_country_code","").let {

                    if(it.isNullOrBlank()) {
                        requestPermissionLauncher.launch(arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION, android.Manifest.permission.ACCESS_COARSE_LOCATION))
                        return@launch
                    }

                    showNextScreen()

                }


            }
        }
    }

    @SuppressLint("MissingPermission")
    private val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { isGranted: Map<String, Boolean> ->

        if (isGranted.containsValue(true))
        {
            loadUserLocation()
        }
        else
        {
            showNextScreen()
        }

    }

    @SuppressLint("MissingPermission")
    fun loadUserLocation()
    {
        lifecycleScope.launch {
            getUserLocation()?.let {
                getCountryCodeFromLocation(it)?.let {
                    localDataManager.putString("user_country_code",it)
                }
            }
            showNextScreen()
        }
    }
    fun getCountryCodeFromLocation(location: Location): String? {
        val geocoder = Geocoder(requireContext(), Locale.getDefault())

        try {
            val addresses: MutableList<Address>? = geocoder.getFromLocation(location.latitude, location.longitude, 1)

            if (addresses.isNullOrEmpty().not()) {
                return addresses?.getOrNull(0)?.countryCode
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }

        return null // Country code not found for the given location
    }

    @SuppressLint("MissingPermission")
    suspend fun getUserLocation(): Location? {
        val locationClient = LocationServices.getFusedLocationProviderClient(requireContext())
        var result = locationClient.lastLocation.await()
        if(result!=null)
            return result


        result = locationClient.getCurrentLocation(
            Priority.PRIORITY_HIGH_ACCURACY,
            CancellationTokenSource().token,
        ).await()
        return result
    }
    private fun showNextScreen() {
        lifecycleScope.launchWhenResumed {
            if (localDataManager.getIsLoggedIn()) {
                findNavController().safeNavigate(SplashFragmentDirections.splashToHome())
            } else {
                findNavController().safeNavigate(SplashFragmentDirections.splashToIntro())
            }
        }

    }

    override fun onResume() {
        super.onResume()
        requireActivity().window.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        requireActivity().hideNavigationBar()
    }

    override fun onPause() {
        super.onPause()
        requireActivity().window.clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        requireActivity().showNavigationBar()
    }
}
