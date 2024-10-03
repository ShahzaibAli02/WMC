package no.wmc.di

import no.wmc.data.broadcaster.Broadcaster
import no.wmc.data.broadcaster.impl.NetworkStateBroadcaster
import no.wmc.data.manager.LogoutHelper
import no.wmc.data.manager.NetworkStateManager
import no.wmc.data.manager.impl.NetworkStateManagerImpl
import no.wmc.ui.base.ActivityProvider
import no.wmc.ui.base.LokaliseService
import no.wmc.utils.AppDispatchers
import no.wmc.utils.AppDispatchersImpl
import org.koin.core.annotation.KoinReflectAPI
import org.koin.dsl.bind
import org.koin.dsl.module
import org.koin.dsl.single

@KoinReflectAPI
val appModule = module {
    single(createdAtStart = true) { LokaliseService(get()) }
//    single(createdAtStart = true) { ActivityProvider(get()) }
    single<NetworkStateManagerImpl>(createOnStart = true) bind NetworkStateManager::class
    single<NetworkStateBroadcaster>() bind Broadcaster::class
    single<AppDispatchersImpl>() bind AppDispatchers::class
    single { LogoutHelper(get(), get()) }
}
