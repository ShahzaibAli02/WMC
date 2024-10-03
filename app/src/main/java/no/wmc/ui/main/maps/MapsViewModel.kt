package no.wmc.ui.main.maps

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.android.gms.maps.model.LatLng
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import no.wmc.data.remote.model.NearByPlaces.NearByPlaces

class MapsViewModel(val mapsRepository: MapsRepository) : ViewModel()
{


   private val _places = MutableStateFlow<MutableList<no.wmc.data.remote.model.NearByPlaces.Result>>(mutableListOf())
   val places: StateFlow<List<no.wmc.data.remote.model.NearByPlaces.Result>> = _places

   suspend fun getLocation() =mapsRepository.getUserLocation()
   fun getNearByPlaces(latLng: LatLng)= viewModelScope.launch {

      val nearByHospitals=async {
         mapsRepository.getNearByPlaces("hospital", latLng)
      }
      val nearByPharmacies=async {
         mapsRepository.getNearByPlaces("pharmacy", latLng)
      }

      _places.value = mutableListOf<no.wmc.data.remote.model.NearByPlaces.Result>().apply {
         nearByHospitals.await()?.results?.let { addAll(it) }
         nearByPharmacies.await()?.results?.let { addAll(it) }
      }


   }


}