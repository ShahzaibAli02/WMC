package no.wmc.data.local.manager.impl

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import no.wmc.data.local.db.entity.AllergyEntity
import no.wmc.data.local.db.entity.ProfileEntity
import no.wmc.data.local.manager.DatabaseManager
import no.wmc.data.local.manager.LocalDataManager
import no.wmc.data.local.manager.SessionManager
import no.wmc.data.local.manager.SharedPrefManager
import no.wmc.domain.model.Credential

private const val ACCESS_TOKEN = "ACCESS_TOKEN"
private const val CREDENTIALS = "CREDENTIALS"
private const val IS_LOGGED_IN = "IS_LOGGED_IN"

class LocalDataManagerImpl(
    private val sessionManager: SessionManager,
    private val databaseManager: DatabaseManager,
    private val sharedPrefManager: SharedPrefManager
) : LocalDataManager {
    override  fun getString(key: String, defaultValue: String?): String? {
        return sharedPrefManager.getString(key, defaultValue)
    }

    override suspend fun putString(key: String, value: String?) {
        sharedPrefManager.putString(key, value)
    }

    override suspend fun getLong(key: String, defaultValue: Long): Long {
        return sharedPrefManager.getLong(key, defaultValue)
    }

    override suspend fun putLong(key: String, value: Long?) {
        sharedPrefManager.putLong(key, value)
    }

    override suspend fun remove(key: String) {
        sharedPrefManager.remove(key)
    }

    override  fun getEncryptedString(key: String, defaultValue: String?): String? {
        return sharedPrefManager.getEncryptedString(key, defaultValue)
    }

    override suspend fun putEncryptedString(key: String, value: String?) {
        sharedPrefManager.putEncryptedString(key, value)
    }

    override fun putEncryptedStringSync(key: String, value: String?) {
        sharedPrefManager.putEncryptedStringSync(key, value)
    }

    override fun getEncryptedStringSync(key: String, defaultValue: String?): String? {
        return sharedPrefManager.getEncryptedStringSync(key, defaultValue)
    }

    override fun getStringSync(key: String, defaultValue: String?): String? {
        return sharedPrefManager.getStringSync(key, defaultValue)
    }

//    override suspend fun getProfile(): ProfileEntity {
//        return databaseManager.getProfile()
//    }
//
//    override suspend fun saveProfile(profile: ProfileEntity) {
//        databaseManager.saveProfile(profile)
//    }
//
//    override suspend fun deleteProfile() {
//        databaseManager.deleteProfile()
//    }

    override suspend fun getAllergies(): List<AllergyEntity> {
        return databaseManager.getAllergies()
    }

    override suspend fun saveAllergies(allergies: List<AllergyEntity>) {
        databaseManager.saveAllergies(allergies)
    }

    override suspend fun isLoggedIn(isLoggedIn: Boolean) {
        sharedPrefManager.putBoolean(IS_LOGGED_IN, isLoggedIn)
    }

    override suspend fun getIsLoggedIn(): Boolean {
        return sharedPrefManager.getBoolean(IS_LOGGED_IN)
    }

    override suspend fun saveAccessToken(token: String?) {
        putEncryptedString(ACCESS_TOKEN, token)
    }

    override suspend fun getAccessToken(): String? {
        return getEncryptedString(ACCESS_TOKEN)
    }

    override fun getAccessTokenSync(): String? {
        return getEncryptedStringSync(ACCESS_TOKEN)
    }

    override fun saveAccessTokenSync(token: String?) {
        putEncryptedStringSync(ACCESS_TOKEN, token)
    }

    override suspend fun saveCredentials(credential: Credential?) {
        putEncryptedString(CREDENTIALS, Gson().toJson(credential))
    }

    override  fun getCredentials(): Credential? {
        val data = getEncryptedString(CREDENTIALS)
        return Gson().fromJson(data, object : TypeToken<Credential>() {}.type)
    }

    override  fun putBoolean(key: String, value: Boolean) {
        sharedPrefManager.putBoolean(key, value)
    }

    override  fun getBoolean(key: String, defaultValue: Boolean): Boolean {
        return sharedPrefManager.getBoolean(key, defaultValue)
    }
}
