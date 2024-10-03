package no.wmc.data.manager.impl

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import kotlinx.coroutines.launch
import no.wmc.applicationScope
import no.wmc.data.broadcaster.Broadcaster
import no.wmc.data.manager.NetworkStateManager
import no.wmc.utils.AppDispatchers

class NetworkStateManagerImpl(
    context: Context,
    private val appDispatchers: AppDispatchers,
    private val networkBroadcaster: Broadcaster<Boolean>
) : NetworkStateManager {

    private var connectivityManager: ConnectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    private var isOnline = false
    private val availableNetwork = mutableSetOf<String>()

    init {
        val request = NetworkRequest.Builder()
            .addTransportType(NetworkCapabilities.TRANSPORT_CELLULAR)
            .addTransportType(NetworkCapabilities.TRANSPORT_WIFI)
            .addTransportType(NetworkCapabilities.TRANSPORT_ETHERNET)
            .build()

        val callback = object : ConnectivityManager.NetworkCallback() {
            override fun onAvailable(network: Network) {
                availableNetwork.add(network.toString())
                if (!isOnline) {
                    isOnline = true
                    broadcastOnlineState()
                }
            }

            override fun onLost(network: Network) {
                availableNetwork.remove(network.toString())
                if (isOnline && availableNetwork.isEmpty()) {
                    isOnline = false
                    broadcastOnlineState()
                }
            }
        }
        /**
         * This wont cause memory leak as
         * The app continues to receive callbacks until either the app exits
         * or it calls unregisterNetworkCallback().
         * */
        connectivityManager.registerNetworkCallback(request, callback)
    }

    override fun isOnline() = isOnline

    private fun broadcastOnlineState() {
        applicationScope.launch(appDispatchers.getIODispatcher()) {
            networkBroadcaster.broadcast(isOnline)
        }
    }
}
