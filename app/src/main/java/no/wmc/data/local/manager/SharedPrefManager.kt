package no.wmc.data.local.manager

interface SharedPrefManager {
     fun putBoolean(key: String, value: Boolean = false)
     fun getBoolean(key: String, defaultValue: Boolean = false) : Boolean
     fun getString(key: String, defaultValue: String? = null): String?
    suspend fun putString(key: String, value: String?)
    suspend fun getLong(key: String, defaultValue: Long): Long
    suspend fun putLong(key: String, value: Long?)
    suspend fun remove(key: String)
    fun getEncryptedString(key: String, defaultValue: String? = null): String?
    suspend fun putEncryptedString(key: String, value: String?)
    fun putEncryptedStringSync(key: String, value: String?)
    fun getEncryptedStringSync(key: String, defaultValue: String? = null): String?
    fun getStringSync(key: String, defaultValue: String? = null): String?
}
