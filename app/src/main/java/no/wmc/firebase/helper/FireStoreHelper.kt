package no.wmc.firebase.helper

import android.annotation.SuppressLint
import android.util.Log
import android.webkit.MimeTypeMap
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.tasks.await
import no.wmc.data.remote.model.ProfileDtoModel

import no.wmc.data.remote.providers.FireStoreProvider
import no.wmc.domain.model.Document
import no.wmc.domain.model.Profile
import no.wmc.firebase.interfaces.FireStoreGetAllAllergiesInterface
import no.wmc.firebase.interfaces.FireStoreGetAllDiagnosesInterface
import no.wmc.firebase.interfaces.FireStoreGetAllMedicineInterface
import no.wmc.firebase.interfaces.FireStoreGetAllVaccinesInterface
import no.wmc.firebase.interfaces.FireStoreGetUserAllergiesInterface
import no.wmc.firebase.interfaces.FireStoreGetUserDiagnosesInterface
import no.wmc.firebase.interfaces.FireStoreGetUserInterface
import no.wmc.firebase.interfaces.FireStoreGetUserMedicineInterface
import no.wmc.firebase.interfaces.FireStoreGetUserVaccinesInterface
import no.wmc.ui.main.EmergencyProfile
import no.wmc.utils.toCustomObject
import timber.log.Timber
import java.io.File

class FireStoreHelper
{
    companion object
    {
        @SuppressLint("StaticFieldLeak")
        var db: FirebaseFirestore? = null
            get()
            {
                if (field == null) db = Firebase.firestore
                return field
            }
        const val TAG = "FireStoreHelper"
        const val allergies: String = "allergies"
        const val diagnoses: String = "diagnoses"
        const val medicine: String = "medicine"
        const val vaccines: String = "vaccines"
    }

    init
    {
        db = Firebase.firestore
    }


    suspend fun updateUserId(email: String, id: String)
    {
        db?.collection(FireStoreProvider.Collection.user)?.let { ref ->
            val data = ref.whereEqualTo("email", email).get().await().firstOrNull()
            ref.document(data?.id ?: return).update(mapOf(Pair("id", id)))
        }
    }

    suspend fun getUserFromId(id: String): EmergencyProfile?
    {

        kotlin.runCatching {
            val ref = db?.collection(FireStoreProvider.Collection.user)!!
            val result = ref.document(id).get().await()
            if (result.exists())
            {
                return result.toCustomObject(EmergencyProfile::class.java)
            }
            val result2 = ref.whereEqualTo("id", id).get().await()
            if (result2.isEmpty.not())
            {
                return result2.first().toCustomObject(EmergencyProfile::class.java)
            }
            return null
        }.onFailure {
            Timber.e("ERROR getUserFromId: " + it.message)
        }

        return null
    }

    fun removeUser(uid: String, onDone: (Boolean)->Unit)
    {
        db?.collection(FireStoreProvider.Collection.user)?.document(uid)?.delete()
            ?.addOnSuccessListener {
                onDone(true)
            }?.addOnFailureListener {
                onDone(false)
            }
    }

        fun getUser(uid: String?, listener: FireStoreGetUserInterface)
    {


        if (uid == null)
        {
            listener.onError("Email cannot be empty")
            return
        }
        db?.collection(FireStoreProvider.Collection.user)?.document(uid)?.get()
            ?.addOnSuccessListener {
                listener.onSuccess(it)
            }?.addOnFailureListener {
            listener.onError(it.message.toString())
        }
    }

    fun getUserDiagnoses(uid: String, getAllDiagnoses: FireStoreGetUserDiagnosesInterface)
    {

        db?.collection(diagnoses)?.whereArrayContains("userIds", uid)
            ?.addSnapshotListener { value, error ->
                if (error == null)
                {
                    getAllDiagnoses.onSuccess(value!!)
                } else
                {
                    getAllDiagnoses.onError(error.message.toString())
                }
            }

    }

    fun getUserMedicine(uid: String, getUserMedicine: FireStoreGetUserMedicineInterface)
    {

        db?.collection(medicine)?.whereArrayContains("userIds", uid)
            ?.addSnapshotListener { value, error ->
                if (error == null)
                {
                    getUserMedicine.onSuccess(value!!)
                } else
                {
                    getUserMedicine.onError(error.message.toString())
                }
            }

    }

    fun getUserAllergies(uid: String, listener: FireStoreGetUserAllergiesInterface)
    {

        db?.collection(allergies)?.whereArrayContains("userIds", uid)
            ?.addSnapshotListener { value, error ->
                if (error == null)
                {
                    listener.onSuccess(value!!)
                } else
                {
                    listener.onError(error.message.toString())
                }
            }

    }

    fun getUserVaccines(uid: String, listener: FireStoreGetUserVaccinesInterface)
    {

        db?.collection(vaccines)?.whereArrayContains("userIds", uid)
            ?.addSnapshotListener { value, error ->
                if (error == null)
                {
                    listener.onSuccess(value!!)
                } else
                {
                    listener.onError(error.message.toString())
                }
            }

    }


    fun getMedicines(type: String, listener: FireStoreGetAllDiagnosesInterface)
    {
        db?.collection(type)?.get()
            ?.addOnSuccessListener { result -> //        db?.collection(diagnoses)?.get()?.addOnSuccessListener { result ->

                listener.onSuccess(result)

            }?.addOnFailureListener { err ->
                Log.e(TAG, "Firebase Error! get all diagnoses, ${err.message ?: ""}")
                listener.onError(err.message.toString())
            }
    }

    fun getAllDiagnoses(listener: FireStoreGetAllDiagnosesInterface)
    {
        db?.collection(diagnoses)?.get()
            ?.addOnSuccessListener { result -> //        db?.collection(diagnoses)?.get()?.addOnSuccessListener { result ->

                listener.onSuccess(result)

            }?.addOnFailureListener { err ->
                Log.e(TAG, "Firebase Error! get all diagnoses, ${err.message ?: ""}")
                listener.onError(err.message.toString())
            }
    }

    fun getAllMedicine(listener: FireStoreGetAllMedicineInterface)
    {
        db?.collection(medicine)?.get()?.addOnSuccessListener { result ->

            listener.onSuccess(result)

        }?.addOnFailureListener { err ->
            Log.e(TAG, "Firebase Error! get all medicine, ${err.message ?: ""}")
            listener.onError(err.message.toString())
        }
    }

    fun getAllAllergies(listener: FireStoreGetAllAllergiesInterface)
    {
        db?.collection(allergies)?.get()?.addOnSuccessListener { result ->

            listener.onSuccess(result)

        }?.addOnFailureListener { err ->
            Log.e(TAG, "Firebase Error! get all allergies, ${err.message ?: ""}")
            listener.onError(err.message.toString())
        }
    }

    fun getAllVaccines(listener: FireStoreGetAllVaccinesInterface)
    {
        db?.collection(vaccines)?.get()?.addOnSuccessListener { result ->

            listener.onSuccess(result)

        }?.addOnFailureListener { err ->
            Log.e(TAG, "Firebase Error! get all vaccines, ${err.message ?: ""}")
            listener.onError(err.message.toString())
        }
    }


    fun diagnosesColl() = db!!.collection(diagnoses)

    fun medicineColl() = db!!.collection(medicine)

    fun allergiesColl() = db!!.collection(allergies)

    fun vaccinesColl() = db!!.collection(vaccines)

}