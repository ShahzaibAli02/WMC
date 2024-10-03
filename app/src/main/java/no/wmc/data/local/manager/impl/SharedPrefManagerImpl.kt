package no.wmc.data.local.manager.impl

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.os.Build
import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyProperties
import android.security.keystore.KeyProperties.PURPOSE_DECRYPT
import android.security.keystore.KeyProperties.PURPOSE_ENCRYPT
import androidx.annotation.RequiresApi
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV
import androidx.security.crypto.EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
import androidx.security.crypto.MasterKey
import androidx.security.crypto.MasterKey.DEFAULT_AES_GCM_MASTER_KEY_SIZE
import androidx.security.crypto.MasterKey.DEFAULT_MASTER_KEY_ALIAS
import no.wmc.data.local.manager.SharedPrefManager

class SharedPrefManagerImpl(private val context: Context) : SharedPrefManager {

    companion object {
        const val SHARED_PREF_NAME = "WMC_SHARED_PREFS"
        const val ENCRYPTED_SHARED_PREF_NAME = "WMC_SHARED_PREFS_ENC"
    }


    private val key by lazy {
        MasterKey.Builder(context)
            .setKeyGenParameterSpec(getSpec())
            .build()
        /**
         * For SDK <= M
         * MasterKey.Builder(context).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build()
         * */
    }
    private val encryptedPreferences by lazy {
        EncryptedSharedPreferences.create(
            context,
            ENCRYPTED_SHARED_PREF_NAME,
            key,
            AES256_SIV,
            AES256_GCM
        )
    }
    private val sharedPreferences by lazy {
        context.getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE)
    }
    private val encryptedEditor by lazy { encryptedPreferences.edit() }
    private val editor by lazy { sharedPreferences.edit() }

    @RequiresApi(Build.VERSION_CODES.M)
    private fun getSpec(): KeyGenParameterSpec {
        return KeyGenParameterSpec.Builder(
            DEFAULT_MASTER_KEY_ALIAS,
            PURPOSE_ENCRYPT or PURPOSE_DECRYPT
        )
            .setBlockModes(KeyProperties.BLOCK_MODE_GCM)
            .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
            .setKeySize(DEFAULT_AES_GCM_MASTER_KEY_SIZE)
            .build()
    }

    override  fun putBoolean(key: String, value: Boolean) {
        editor.putBoolean(key,value).apply()
    }

    override  fun getBoolean(key: String, defaultValue: Boolean): Boolean {
      return sharedPreferences.getBoolean(key,defaultValue)
    }

    override  fun getString(key: String, defaultValue: String?): String? {
        return sharedPreferences.getString(key, defaultValue) ?: defaultValue
    }

    override suspend fun putString(key: String, value: String?) {
        if (value == null) {
            editor.remove(key).commit()
        } else {
            editor.putString(key, value).commit()
        }
    }

    override suspend fun getLong(key: String, defaultValue: Long): Long {
        return sharedPreferences.getLong(key, defaultValue)
    }

    override suspend fun putLong(key: String, value: Long?) {
        if (value == null) {
            editor.remove(key).commit()
        } else {
            editor.putLong(key, value).commit()
        }
    }

    override suspend fun remove(key: String) {
        editor.remove(key).commit()
    }

    override  fun getEncryptedString(key: String, defaultValue: String?): String? {
        return encryptedPreferences.getString(key, defaultValue) ?: defaultValue
    }

    override suspend fun putEncryptedString(key: String, value: String?) {
        if (value == null) {
            encryptedEditor.remove(key).commit()
        } else {
            encryptedEditor.putString(key, value).commit()
        }
    }

    override fun getEncryptedStringSync(key: String, defaultValue: String?): String? {
        return encryptedPreferences.getString(key, defaultValue) ?: defaultValue
    }

    override fun getStringSync(key: String, defaultValue: String?): String? {
        return sharedPreferences.getString(key, defaultValue) ?: defaultValue
    }

    override fun putEncryptedStringSync(key: String, value: String?) {
        if (value == null) {
            encryptedEditor.remove(key).commit()
        } else {
            encryptedEditor.putString(key, value).commit()
        }
    }
}
