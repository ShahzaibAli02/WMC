package no.wmc.data.remote.providers

import android.net.Uri
import android.webkit.MimeTypeMap
import androidx.core.net.toUri
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import com.google.gson.Gson
import kotlinx.coroutines.tasks.await
import no.wmc.data.remote.model.Promo
import no.wmc.data.remote.model.firestore.SubscriptionFsModel
import no.wmc.data.remote.model.isActivePromo
import no.wmc.domain.DataState
import no.wmc.domain.model.Document
import no.wmc.domain.model.DocumentList
import no.wmc.domain.model.Profile
import no.wmc.firebase.helper.FireStoreHelper
import no.wmc.utils.Const.NO_USER_FOUND
import no.wmc.utils.toCustomObject
import no.wmc.utils.toJson
import timber.log.Timber
import java.io.File
import java.util.Calendar
import java.util.concurrent.TimeUnit
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

/**
 * Firebase FireStore provider.
 */
class FireStoreProvider(private val fireStore: FirebaseFirestore)
{

    //Get user in fire store.
    suspend fun getUser(uId: String): Profile
    {

        kotlin.runCatching {
            val result = fireStore.collection(Collection.user).document(uId).get().await()
            return result.toCustomObject(Profile::class.java)!!
        }

        throw Exception(NO_USER_FOUND)
    }


    suspend fun isCodeRedeemed(uid: String, code: String): Boolean
    {
        runCatching {
            val await = FireStoreHelper.db!!.collection(Collection.user).document(uid).get().await()
            val promo = await.get(Collection.promo, Promo::class.java)
            return promo?.code.equals(code.trim(), true)
        }
        return false
    }

    suspend fun hasActivePromo(uid: String): DataState<Boolean>
    {
        runCatching {

            val await = FireStoreHelper.db!!.collection(Collection.user).document(uid)
                .get().await()
            val promo = await.get(Collection.promo, Promo::class.java)
            promo?.let {
                if (!it.isActivePromo())
                {
                    return DataState.Error(errorMessage = "Promo Expired")
                }
                return DataState.Success(true)
            }
        }

        return DataState.Error(errorMessage = "Promo not found")
    }

    suspend fun redeemCode(uid: String, code: String): DataState<Promo>
    {
        val await = FireStoreHelper.db!!.collection(Collection.promotional)
            .whereEqualTo("code", code.uppercase()).get().await()
        await.documents.firstOrNull()?.let {
            val promo = it.toCustomObject(Promo::class.java)
            promo?.let {
                if (isCodeRedeemed(uid, code))
                {
                    return DataState.Error(errorMessage = "Code Already Redeemed!")
                }
                FieldValue.serverTimestamp()
                it.subTime = Calendar.getInstance().timeInMillis
                it.expireTime = it.subTime + TimeUnit.DAYS.toMillis(it.validity.toLong())
                if (updateProfile(uid, mapOf(Pair(Collection.promo, it))))
                {
                    updateRedeemCodeCount(code)
                    return DataState.Success(it)
                } else
                {
                    return DataState.Error(errorMessage = "Unknown Error Occurred")
                }

            }

        }
        return DataState.Error(errorMessage = "Invalid Promo Code")
    }

    suspend fun updateRedeemCodeCount(code: String)
    {
        val db = FireStoreHelper.db!!.collection("BusinessTracking").document("codeCount")
        runCatching {
            db.update(mapOf(code to FieldValue.increment(1))).await()
        }
    }


    suspend fun getDocuments(email: String): List<DocumentList.DocumentGroup>
    {
        val hashMap: HashMap<String, MutableList<Document>> = hashMapOf()
        val mutableList: MutableList<DocumentList.DocumentGroup> = arrayListOf()
        val await = FireStoreHelper.db!!.collection(Collection.documents)
            .whereEqualTo("email", email).get().await()
        await.documents.forEach {
            val doc = it.toCustomObject(Document::class.java)
            doc?.let {
                if (hashMap.containsKey(it.category))
                {
                    hashMap[it.category]?.add(it)
                } else
                {
                    hashMap.put(it.category, mutableListOf(it))
                }
            }
        }
        hashMap.forEach {
            mutableList.add(DocumentList.DocumentGroup(it.key, it.value))
        }
        return mutableList
    }

    suspend fun uploadDocument(
        category: String,
        email: String,
        title: String,
        description: String,
        typeId: Int,
        document: File,
    ): Boolean
    {


        val url = uploadFile(document)
        val document = Document(
            id = typeId, name = document.name, title = title, extension = getFileMimeType(document)!!, description = description, category = category, url = url, email = email
        )

        try
        {
            FireStoreHelper.db!!.collection(Collection.documents).document().set(document).await()
        } catch (e: Exception)
        {
            return false
        }

        return true
    }

    fun getFileMimeType(file: File): String?
    {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(file.extension)
    }

    suspend fun addUser(uid: String, user: Profile): String
    {
        return suspendCoroutine { cont ->
            fireStore.collection(Collection.user).document(uid).set(user).addOnSuccessListener {
                cont.resume(uid)
            }.addOnFailureListener {
                cont.resumeWithException(it)
            }
        }
    }

    //When user purchased subscription from play store.
    suspend fun addSubscription(subscription: SubscriptionFsModel): String
    {
        return suspendCoroutine { cont ->
            fireStore.collection(Collection.subscriptions).add(subscription).addOnSuccessListener {
                cont.resume(it.id)
            }.addOnFailureListener {
                cont.resumeWithException(it)
            }
        }
    }

    suspend fun getSubscription(uid: String): Boolean
    {
        try
        {
            return getUser(uid).isActiveSubscription
        } catch (e: Exception)
        {
            e.printStackTrace()
        }
        return false
    }


    suspend fun uploadFile(file: File): String
    {

        try
        {
            val fileName = "downloadUrl/${file.name}"
            val imageRef = Firebase.storage.reference.child(fileName)

            val uploadTask = imageRef.putFile(file.toUri())
            uploadTask.await()
            val downloadUrl = imageRef.downloadUrl.await()
            return downloadUrl.toString()
        } catch (e: Exception)
        {
            e.printStackTrace()
        }
        return ""
    }

    suspend fun updateUserImage(email: String, uri: Uri): Boolean
    {

        try
        {
            val fileName = "userProfile/${System.currentTimeMillis()}_${uri.lastPathSegment}"
            val imageRef = Firebase.storage.reference.child(fileName)

            val uploadTask = imageRef.putFile(uri)
            uploadTask.await()

            // Get the download URL
            val downloadUrl = imageRef.downloadUrl.await()

            return updateProfile(email, mapOf("avatar" to downloadUrl.toString()))
        } catch (e: Exception)
        {
            e.printStackTrace()
        }
        return false
    }

    suspend fun getUID(email: String): String
    {
        return suspendCoroutine { cont ->
            fireStore.collection(Collection.user).whereEqualTo("email", email).get()
                .addOnSuccessListener {
                    if (it.isEmpty.not())
                    {
                        val id = it.first().id
                        cont.resume(id)
                    } else
                    {
                        cont.resume("")
                    }
                }.addOnFailureListener {
                    cont.resume("")
                }
        }
    }

    suspend fun updateProfile(uId: String, map: Map<String, Any?>): Boolean
    {
        return suspendCoroutine { cont ->
            fireStore.collection(Collection.user).document(uId).update(map)
                .addOnSuccessListener {
                    cont.resume(true)
                }.addOnFailureListener {
                    cont.resume(false)
                }
        }
    }

    //Checking if same email already exist in collection.
    suspend fun isEmailExist(email: String): Boolean
    {

        val first = fireStore.collection(Collection.user).whereEqualTo("email", email.lowercase())
            .get().await()
        val second = fireStore.collection(Collection.user)
            .whereEqualTo("email", email.lowercase().capitalize()).get().await()
        val final = if (first.isEmpty) second else first
        return final.isEmpty.not()

    }

    object Collection
    {
        const val user: String = "user"
        const val promo: String = "promo"
        const val promotional: String = "promotional"

        const val documents: String = "documents"
        const val subscriptions: String = "subscriptions"
    }
}
