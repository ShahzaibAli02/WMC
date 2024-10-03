package no.wmc.utils

import com.google.firebase.firestore.DocumentSnapshot
import com.google.gson.Gson
import kotlinx.serialization.json.Json


fun <T:Any> DocumentSnapshot.toCustomObject(klass: Class<T>):T?{
    return  Gson().fromJson(this.data?.toMap()?.toJson(), klass)
}

// Extension function to convert Map to JSON
fun Map<*, *>?.toJson(): String {
    return Gson().toJson(this)
}