package no.wmc.data.repo

import android.content.Context
import android.content.Intent
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import no.wmc.data.local.manager.LocalDataManager
import no.wmc.data.manager.LogoutHelper
import no.wmc.data.manager.NetworkStateManager
import no.wmc.data.remote.model.FirebaseAuthResult
import no.wmc.data.remote.model.FirebaseAuthResult.SignInSuccessResult
import no.wmc.data.remote.model.FirebaseCreateAccountResult

import no.wmc.data.remote.model.firestore.SubscriptionFsModel
import no.wmc.data.remote.providers.FireStoreProvider
import no.wmc.data.remote.providers.FirebaseAuthProvider
import no.wmc.domain.DataState
import no.wmc.domain.model.Credential
import no.wmc.domain.model.Profile
import no.wmc.domain.repo.AuthRepository
import no.wmc.firebase.helper.FireStoreHelper
import no.wmc.ui.MainActivity
import timber.log.Timber

class AuthRepositoryImpl(
    private val context: Context,
    private val firebaseAuthProvider: FirebaseAuthProvider,
    private val fireStoreProvider: FireStoreProvider,
    private val logoutHelper: LogoutHelper,
    networkStateManager: NetworkStateManager,
    localDataManager: LocalDataManager,
) : BaseRepository(networkStateManager, localDataManager), AuthRepository
{

    override fun refreshToken(accessToken: String?, forceUpdate: Boolean)
    {
        val savedToken = getCurrentToken()

        if (savedToken != accessToken)
        { // Token already updated by other request
            return
        }

        return runBlocking(Dispatchers.IO) {
            try
            {
                val updatedToken = firebaseAuthProvider.getToken(forceUpdate)
                localDataManager.saveAccessTokenSync(updatedToken)
            } catch (e: Exception)
            {
                Timber.e(e)
                logoutHelper.logout()
                val intent = Intent(context, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
                context.startActivity(intent)
            }
        }
    }

    override fun getCurrentToken(): String? = localDataManager.getAccessTokenSync()

    override suspend fun signInWithEmail(
        email: String,
        password: String,
        isRemember: Boolean,
    ): FirebaseAuthResult
    {
        val authResult = firebaseAuthProvider.signInWithEmail(email, password)

        if (authResult is SignInSuccessResult)
        {
            localDataManager.saveAccessTokenSync(firebaseAuthProvider.getToken())
            if (isRemember)
            { // localDataManager.saveCredentials(Credential("mail@frederikfrifeldt.com", password))
                val id=FirebaseAuth.getInstance().uid!!
                FireStoreHelper().updateUserId(email,id)
                localDataManager.saveCredentials(Credential(id, email, password))
            }
        }

        return authResult
    }

    override suspend fun signInWithGoogle(intent: Intent)
    {
        firebaseAuthProvider.signInWithGoogleIntent(intent)
        localDataManager.saveAccessToken(firebaseAuthProvider.getToken())
    }

    override suspend fun registerWithEmail(
        email: String,
        password: String,
    ): FirebaseCreateAccountResult
    {
        return firebaseAuthProvider.createEmailAccount(email, password)
    }

    override suspend fun resetPassword(email: String)
    {
        firebaseAuthProvider.resetPassword(email)
    }

    override suspend fun registerUser(uid:String,profileDto: Profile): DataState<String>
    {
        return execute {
            fireStoreProvider.addUser(uid,profileDto)
        }
    }

    override suspend fun validateEmailInFireStore(email: String): DataState<Boolean>
    {
        return execute {
            fireStoreProvider.isEmailExist(email)
        }
    }

    override suspend fun addSubscriptionInFireStore(subscription: SubscriptionFsModel): DataState<String>
    {
        return execute {
            fireStoreProvider.updateProfile(subscription.email!!, mapOf(Pair("isActiveSubscription",true)))
            val result = fireStoreProvider.addSubscription(subscription)
            result
        }
    }
}
