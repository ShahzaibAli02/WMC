package no.wmc.data.broadcaster.impl

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import no.wmc.applicationScope
import no.wmc.data.broadcaster.Broadcaster
import no.wmc.utils.AppDispatchers

class NetworkStateBroadcaster(appDispatchers: AppDispatchers) : Broadcaster<Boolean> {

    private val networkStateObservable = MutableSharedFlow<Boolean>(1)

    init {
        applicationScope.launch(appDispatchers.getIODispatcher()) {
            delay(1000L)
            if (networkStateObservable.replayCache.isEmpty()) { // Indicates no Internet connection
                broadcast(false)
            }
        }
    }

    override suspend fun broadcast(value: Boolean) {
        networkStateObservable.emit(value)
    }

    override fun observable(): SharedFlow<Boolean> {
        return networkStateObservable
    }
}
