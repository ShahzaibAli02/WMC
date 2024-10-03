package no.wmc.di

import android.content.ContentResolver
import android.content.Context
import androidx.room.Room
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import no.wmc.data.local.db.WmcDatabase
import no.wmc.data.local.manager.DatabaseManager
import no.wmc.data.local.manager.LocalDataManager
import no.wmc.data.local.manager.SessionManager
import no.wmc.data.local.manager.SharedPrefManager
import no.wmc.data.local.manager.impl.DatabaseManagerImpl
import no.wmc.data.local.manager.impl.LocalDataManagerImpl
import no.wmc.data.local.manager.impl.SessionManagerImpl
import no.wmc.data.local.manager.impl.SharedPrefManagerImpl
import no.wmc.data.remote.providers.FireStoreProvider
import no.wmc.data.remote.providers.FirebaseAuthProvider
import org.koin.core.annotation.KoinReflectAPI
import org.koin.dsl.bind
import org.koin.dsl.module
import org.koin.dsl.single

@KoinReflectAPI
val dataModule = module {
    single<ContentResolver> { get<Context>().contentResolver }
    single {
        Room.databaseBuilder(get(), WmcDatabase::class.java, "WmcDatabase")
            .fallbackToDestructiveMigration()
            .build()
    }
    single<DatabaseManagerImpl>() bind DatabaseManager::class
    single<SessionManagerImpl>() bind SessionManager::class
    single<SharedPrefManagerImpl>() bind SharedPrefManager::class
    single<LocalDataManagerImpl>() bind LocalDataManager::class

    single { Firebase.firestore }
    single<FireStoreProvider>()
}
