package no.wmc.data.manager

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import no.wmc.data.local.manager.LocalDataManager
import no.wmc.data.remote.providers.FirebaseAuthProvider

class LogoutHelper(
    private val firebaseAuthProvider: FirebaseAuthProvider,
    private val localDataManager: LocalDataManager
) {

    suspend fun logout() {
        withContext(Dispatchers.IO) {
            firebaseAuthProvider.logout()
//            localDataManager.deleteProfile()
            localDataManager.saveAccessToken(null)
        }
    }
}
