package no.wmc.ui.login

import android.content.Intent
import androidx.lifecycle.viewModelScope
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.launch
import no.wmc.data.local.manager.LocalDataManager
import no.wmc.data.remote.model.FirebaseAuthResult.*
import no.wmc.data.remote.model.FirebaseCreateAccountResult.AccountCreatedSuccessfully
import no.wmc.domain.DataState
import no.wmc.domain.model.Credential
import no.wmc.domain.model.usecase.*
import no.wmc.firebase.helper.FireStoreHelper
import no.wmc.ui.base.BaseViewModel
import no.wmc.ui.base.ViewEvent
import no.wmc.ui.base.ViewState
import no.wmc.ui.base.ViewState.Loading
import no.wmc.ui.login.LoginViewAction.*
import no.wmc.ui.login.LoginViewEvent.AuthWithEmailAndPasswordViewEvent
import no.wmc.ui.login.LoginViewEvent.AuthWithGoogleViewEvent
import no.wmc.utils.AppDispatchers
import no.wmc.utils.Const
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

class LoginViewModel(
    private val authWithFirebaseUseCase: AuthWithFirebaseUseCase,
    private val authWithEmailAndPasswordUseCase: AuthWithEmailAndPasswordUseCase,
    private val registerWithEmailAndPasswordUseCase: RegisterWithEmailAndPasswordUseCase,
    private val getProfileUseCase: GetProfileUseCase,
    private val getProfileFromFireStoreUseCase: GetProfileFromFireStoreUseCase,
    private val localDataManager: LocalDataManager,
    override val viewState: LoginViewState = LoginViewState(),
    appDispatchers: AppDispatchers,
) : BaseViewModel<LoginViewState>(
    appDispatchers
)
{
    override suspend fun handleViewEvent(event: ViewEvent)
    {
        when (event)
        {
            is AuthWithGoogleViewEvent -> handleAuthWithGoogleViewEvent(event.intent)
            is AuthWithEmailAndPasswordViewEvent -> handleAuthWithEmailAndPasswordViewEvent(event.email, event.password, event.isRemember)
            else -> throwEventNotSupported(event)
        }
    }


    private suspend fun handleAuthWithGoogleViewEvent(intent: Intent)
    {
        postAction(AuthWithGoogleViewAction(Loading()))

        val authResult = authWithFirebaseUseCase(intent)

        val googleSignInAccount = suspendCoroutine<GoogleSignInAccount> { cont ->
            GoogleSignIn.getSignedInAccountFromIntent(intent).addOnSuccessListener {
                    cont.resume(it)
                }.addOnFailureListener {
                    cont.resumeWithException(it)
                }
        }

        if (authResult is DataState.Success)
        {
            FirebaseAuth.getInstance().uid?.let {uid->
                postAction(GetProfileAction(getViewState(state = getProfileFromFireStoreUseCase(uid
                ), successCallback = { viewState.profile = it }, errorCallback = { viewState.googleAccount = googleSignInAccount })))

            }?:runCatching {
                postAction(GetProfileAction(ViewState.StateError(errorMessage = Const.NO_USER_FOUND)))
            }


        } else
        {
            postAction(
                AuthWithGoogleViewAction(
                    getViewState(
                        state = authResult
                    )
                )
            )
        }
    }

    fun getGoogleAccount(): GoogleSignInAccount?
    {
        return viewState.googleAccount
    }

    private suspend fun handleAuthWithEmailAndPasswordViewEvent(
        email: String,
        password: String,
        isRemember: Boolean,
    )
    {
        postAction(AuthWithEmailAndPasswordAction(Loading()))

        val mainAuthResult = authWithEmailAndPasswordUseCase(email, password, isRemember)
        when
        {
            mainAuthResult is DataState.Success && mainAuthResult.data is SignInSuccessResult ->
            {
                val id = FirebaseAuth.getInstance().uid!!
                val profile = getProfileFromFireStoreUseCase(id)
                if (isRemember && profile is DataState.Success)
                {

                    localDataManager.saveCredentials(Credential(id, profile.data?.email!!, password))
                }
                postAction(
                    GetProfileAction(
                        getViewState(
                            state = profile,
                            successCallback = { viewState.profile = it },
                        )
                    )/*GetProfileAction(
                        getViewState(
                            state = getProfileUseCase(),
                            successCallback = { viewState.profile = it }
                        )
                    )*/
                )
            }

            mainAuthResult is DataState.Error ->
            {
                when (mainAuthResult.data)
                {
                    is WrongPasswordError ->
                    { // User exists but password is incorrect.
                        postAction(
                            AuthWithEmailAndPasswordAction(
                                getViewState(
                                    state = mainAuthResult
                                )
                            )
                        )
                    }

                    is UserNotFoundError ->
                    {

                        postAction(
                            AuthWithEmailAndPasswordAction(
                                ViewState.StateError(errorMessage = "Account not found!")
                            )
                        )
                        // User doesn't exist in Firebase. Create new one.
//                        val registerResult = registerWithEmailAndPasswordUseCase(email, password)
//                        if (registerResult is DataState.Success && registerResult.data is AccountCreatedSuccessfully)
//                        {
//                            val afterRegLoginResult = authWithEmailAndPasswordUseCase(email, password, isRemember)
//
//                            if (afterRegLoginResult is DataState.Success && afterRegLoginResult.data is SignInSuccessResult)
//                            { // Registration and login success
//                                postAction(GetProfileAction(getViewState(state = getProfileUseCase(""), successCallback = { viewState.profile = it })))
//                            } else
//                            { // Login with just registered account failed
//                                postAction(
//                                    AuthWithEmailAndPasswordAction(
//                                        getViewState(state = afterRegLoginResult)
//                                    )
//                                )
//                            }
//                        } else
//                        { // Register new account failed
//                            postAction(
//                                AuthWithEmailAndPasswordAction(
//                                    getViewState(state = registerResult)
//                                )
//                            )
//                        }
                    }

                    else ->
                    { // Other errors
                        postAction(
                            AuthWithEmailAndPasswordAction(getViewState(state = mainAuthResult))
                        )
                    }
                }
            }

            else -> postAction( // Successful state with unexpected result
                AuthWithEmailAndPasswordAction(getViewState(state = mainAuthResult))
            )
        }
    }

    fun isLoggedIn(isLoggedIn: Boolean)
    {
        viewModelScope.launch {
            localDataManager.isLoggedIn(isLoggedIn)
        }
    }
}
