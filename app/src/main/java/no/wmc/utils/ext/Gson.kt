package no.wmc.utils.ext

import android.util.Base64
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec


inline fun <reified T> T.toMap(): Map<String, Any?> {
    val gson = Gson()
    val type: Type = object : TypeToken<T>() {}.type
    val json = gson.toJson(this, type)
    return gson.fromJson(json, Map::class.java) as Map<String, Any?>
}

fun String.encrypt(): String {
    return Base64.encodeToString(this.toByteArray(), Base64.DEFAULT);
}

//fun String.decrypt(encryptedText: String, secretKey: String, iv: String): String {
//    val cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING")
//    val keySpec = SecretKeySpec(secretKey.toByteArray(), "AES")
//    val ivSpec = IvParameterSpec(iv.toByteArray())
//
//    cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec)
//    val decryptedBytes = cipher.doFinal(Base64.decode(encryptedText, Base64.DEFAULT))
//
//    return String(decryptedBytes)
//}