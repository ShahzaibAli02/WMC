package no.wmc.data.local.manager

import no.wmc.domain.model.Credential

interface LocalDataManager : SharedPrefManager, DatabaseManager, SessionManager {
    suspend fun isLoggedIn(isLoggedIn : Boolean)
    suspend fun getIsLoggedIn() : Boolean
    suspend fun saveAccessToken(token: String?)
    suspend fun getAccessToken(): String?
    fun getAccessTokenSync(): String?
    fun saveAccessTokenSync(token: String?)
    suspend fun saveCredentials(credential: Credential?)
    fun getCredentials()  : Credential?
}
