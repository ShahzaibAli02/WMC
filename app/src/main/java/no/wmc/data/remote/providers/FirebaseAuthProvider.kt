package no.wmc.data.remote.providers

import android.content.Intent
import android.util.Log
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthException
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthInvalidUserException
import com.google.firebase.auth.FirebaseAuthUserCollisionException
import com.google.firebase.auth.FirebaseAuthWeakPasswordException
import com.google.firebase.auth.GoogleAuthProvider
import no.wmc.data.remote.model.FirebaseAuthResult
import no.wmc.data.remote.model.FirebaseAuthResult.UnknownAuthError
import no.wmc.data.remote.model.FirebaseAuthResult.UserNotFoundError
import no.wmc.data.remote.model.FirebaseAuthResult.WrongPasswordError
import no.wmc.data.remote.model.FirebaseCreateAccountResult
import no.wmc.data.remote.model.FirebaseCreateAccountResult.AccountCreatedSuccessfully
import no.wmc.data.remote.model.FirebaseCreateAccountResult.AccountExist
import no.wmc.data.remote.model.FirebaseCreateAccountResult.UnknownCreateAccountError
import no.wmc.data.remote.model.FirebaseCreateAccountResult.WeakPassword
import timber.log.Timber
import java.util.Locale
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

/**
 * Firebase auth provider.
 * Implemented as a wrapper for Firebase Auth library to support Kotlin Coroutines and Flows
 *
 * For correct work, requires enable Android Device Verification API in Google Cloud Console and
 * add SHA-256 of developer key to Firebase project.
 */
class FirebaseAuthProvider(
    private val firebaseAuth: FirebaseAuth
) {

    init {
        firebaseAuth.setLanguageCode(Locale.getDefault().language)
    }

    suspend fun signInWithGoogleIntent(intent: Intent) {
        val googleSignInAccount = suspendCoroutine<GoogleSignInAccount> { cont ->
            GoogleSignIn.getSignedInAccountFromIntent(intent)
                .addOnSuccessListener {
                    cont.resume(it)
                }
                .addOnFailureListener {
                    cont.resumeWithException(it)
                }
        }

        signInWithCredentials(getCredentials(googleSignInAccount.idToken!!))
    }

    private suspend fun signInWithCredentials(credential: AuthCredential) {
        return suspendCoroutine { cont ->
            firebaseAuth.signInWithCredential(credential)
                .addOnSuccessListener {
                    cont.resume(Unit)
                }
                .addOnFailureListener {
                    cont.resumeWithException(it)
                }
        }
    }

    suspend fun resetPassword(email: String) {
        return suspendCoroutine { cont ->
            firebaseAuth.sendPasswordResetEmail(email)
                .addOnSuccessListener {
                    cont.resume(Unit)
                }
                .addOnFailureListener {
                    cont.resumeWithException(it)
                }
        }
    }

    suspend fun signInWithEmail(email: String, password: String): FirebaseAuthResult {
        return runCatching {
            suspendCoroutine<FirebaseAuthResult> { cont ->

                firebaseAuth.signInWithEmailAndPassword(email, password)
                    .addOnSuccessListener {
                        cont.resume(FirebaseAuthResult.SignInSuccessResult)
                    }
                    .addOnFailureListener {
                        cont.resumeWithException(it)
                    }
            }
        }.recover {
            when (it) {
                // Wrong password
                is FirebaseAuthInvalidCredentialsException ->
                    WrongPasswordError(message = it.localizedMessage.orEmpty())
                // User is not found
                is FirebaseAuthInvalidUserException ->
                    UserNotFoundError(message = it.localizedMessage.orEmpty())
                else -> UnknownAuthError(message = it.localizedMessage.orEmpty())
            }
        }.getOrDefault(UnknownAuthError("Unknown exception"))
    }

    suspend fun createEmailAccount(
        email: String,
        password: String
    ): FirebaseCreateAccountResult {
        return runCatching {
            suspendCoroutine<FirebaseCreateAccountResult> { cont ->
                firebaseAuth.createUserWithEmailAndPassword(email, password)
                    .addOnSuccessListener {
                        cont.resume(AccountCreatedSuccessfully)
                    }
                    .addOnFailureListener {
                        cont.resumeWithException(it)
                    }
            }
        }.recover {
            when (it) {
                is FirebaseAuthWeakPasswordException ->
                    WeakPassword(message = it.localizedMessage.orEmpty())
                is FirebaseAuthInvalidCredentialsException,
                is FirebaseAuthUserCollisionException ->
                    AccountExist(message = it.localizedMessage.orEmpty())
                else -> UnknownCreateAccountError(message = it.localizedMessage.orEmpty())
            }
        }.getOrDefault(UnknownCreateAccountError("Unknown exception"))
    }

    suspend fun getToken(forceUpdate: Boolean = false): String {
        return suspendCoroutine { cont ->
            firebaseAuth.currentUser?.getIdToken(forceUpdate)
                ?.addOnSuccessListener { result ->
                    cont.resume(result.token!!)
                }
                ?.addOnFailureListener {
                    cont.resumeWithException(it)
                }
                ?: cont.resumeWithException(
                    FirebaseAuthException("0", "Token is not ready")
                )
        }
    }

    private fun getCredentials(idToken: String): AuthCredential {
        return GoogleAuthProvider.getCredential(idToken, null)
    }

    fun logout() {
        firebaseAuth.signOut()
    }
}
