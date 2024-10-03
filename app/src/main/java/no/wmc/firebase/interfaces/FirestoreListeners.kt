package no.wmc.firebase.interfaces

import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.QuerySnapshot

interface FireStoreGetUserDiagnosesInterface {
    fun onSuccess(diagnosesUserListData: QuerySnapshot)
    fun onError(error: String)

}

interface FireStoreGetUserMedicineInterface {
    fun onSuccess(medicineUserListData: QuerySnapshot)
    fun onError(error: String)

}

interface FireStoreGetUserAllergiesInterface {
    fun onSuccess(allergiesUserListData: QuerySnapshot)
    fun onError(error: String)

}

interface FireStoreGetUserVaccinesInterface {
    fun onSuccess(vaccinesUserListData: QuerySnapshot)
    fun onError(error: String)

}

interface FireStoreGetUserInterface {

    fun onSuccess(userData: DocumentSnapshot)
    fun onError(error: String)

}

interface FireStoreGetAllDiagnosesInterface {
    fun onSuccess(listData: QuerySnapshot)
    fun onError(error: String)
}

interface FireStoreGetAllMedicineInterface {
    fun onSuccess(listData: QuerySnapshot)
    fun onError(error: String)
}

interface FireStoreGetAllAllergiesInterface {
    fun onSuccess(listData: QuerySnapshot)
    fun onError(error: String)
}

interface FireStoreGetAllVaccinesInterface {
    fun onSuccess(listData: QuerySnapshot)
    fun onError(error: String)
}
