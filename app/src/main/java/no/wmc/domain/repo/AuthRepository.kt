package no.wmc.domain.repo

import android.content.Intent
import no.wmc.data.remote.model.FirebaseAuthResult
import no.wmc.data.remote.model.FirebaseCreateAccountResult

import no.wmc.data.remote.model.firestore.SubscriptionFsModel
import no.wmc.domain.DataState
import no.wmc.domain.model.Profile

interface AuthRepository {
    fun refreshToken(accessToken: String?, forceUpdate: Boolean = false)
    fun getCurrentToken(): String?
    suspend fun signInWithEmail(email: String, password: String, isRemember: Boolean): FirebaseAuthResult
    suspend fun signInWithGoogle(intent: Intent)
    suspend fun registerWithEmail(email: String, password: String): FirebaseCreateAccountResult
    suspend fun resetPassword(email: String)
    suspend fun registerUser(uid:String,profileDto: Profile): DataState<String>
    suspend fun validateEmailInFireStore(email: String): DataState<Boolean>
    suspend fun addSubscriptionInFireStore(subscription: SubscriptionFsModel): DataState<String>
}
