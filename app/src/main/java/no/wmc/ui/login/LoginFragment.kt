package no.wmc.ui.login

import android.app.Activity
import android.graphics.Paint
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import no.wmc.BuildConfig
import no.wmc.R
import no.wmc.data.local.manager.LocalDataManager
import no.wmc.data.remote.model.FirebaseAuthResult
import no.wmc.data.remote.model.FirebaseAuthResult.WrongPasswordError
import no.wmc.data.remote.model.isActivePromo
import no.wmc.databinding.LoginScreenBinding
import no.wmc.databinding.LoginScreenNewBinding
import no.wmc.domain.model.Credential
import no.wmc.domain.model.Profile
import no.wmc.ui.base.BaseViewStateFragment
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState
import no.wmc.ui.login.LoginViewAction.*
import no.wmc.ui.login.LoginViewEvent.AuthWithEmailAndPasswordViewEvent
import no.wmc.ui.login.LoginViewEvent.AuthWithGoogleViewEvent
import no.wmc.utils.BioMetricAuth
import no.wmc.utils.Const.NO_USER_FOUND
import no.wmc.utils.ext.hideKeyboard
import no.wmc.utils.ext.safeNavigate
import no.wmc.utils.ext.text
import org.koin.android.ext.android.inject
import timber.log.Timber

class LoginFragment :
    BaseViewStateFragment<LoginScreenNewBinding, LoginViewModel>(R.layout.login_screen_new, LoginViewModel::class)
{

    private val localDataManager: LocalDataManager by inject()

    private val gso by lazy {
        GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id)).requestEmail().build()
    }

    private val googleSignInClient by lazy {
        GoogleSignIn.getClient(requireContext(), gso)
    }

    private val googleSignInResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        if (it.resultCode == Activity.RESULT_OK)
        {
            sendViewEvent(AuthWithGoogleViewEvent(it.data!!))
        }
    }
    private val bioMetricAuth: BioMetricAuth by lazy { BioMetricAuth(requireContext()) }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

        initViews()
        requestCredentials()
        googleSignInClient.signOut()

        if(BuildConfig.DEBUG)
        {
            binding.subtitle.text = BuildConfig.VERSION_NAME
        }
    }

    var credential: Credential? = null
    private fun requestCredentials()
    {
        lifecycleScope.launchWhenCreated {
            credential = localDataManager.getCredentials()
            val bioMetricAvailable = credential != null && bioMetricAuth.isAvailable()
            binding.imageBioMetric.visibility = if (bioMetricAvailable) View.VISIBLE else View.GONE
            binding.sepratorBioMetric.visibility = if (bioMetricAvailable) View.VISIBLE else View.GONE //            credential?.let {
            //                binding.userEmailField.setText(it.email)
            //                binding.userPasswordField.setText(it.password)
            //            }
        }
    }


    private fun initViews()
    { //        binding.toolbar.setNavigationIcon(R.drawable.ic_back)
        //        binding.toolbar.setNavigationOnClickListener { findNavController().popBackStack() }

        binding.googleButton.setOnClickListener {
            hideKeyboard()
            googleSignInResult.launch(googleSignInClient.signInIntent)
        }
        binding.loginButton.setOnClickListener {
            credential=null
            hideKeyboard()
            sendViewEvent(
                AuthWithEmailAndPasswordViewEvent(
                    binding.email.text(), binding.password.editText?.text.toString(), true
                )
            )
        }

        binding.email.editText?.addTextChangedListener { checkFieldsNotEmpty() }
        binding.password.editText?.addTextChangedListener { checkFieldsNotEmpty() }

        binding.resetPasswordButton.paintFlags = binding.resetPasswordButton.paintFlags or Paint.UNDERLINE_TEXT_FLAG
        binding.resetPasswordButton.setOnClickListener {
            hideKeyboard()
            findNavController().safeNavigate(LoginFragmentDirections.loginToResetPassword())
        }
        binding.signUp.setOnClickListener {
            findNavController().safeNavigate(
                LoginFragmentDirections.loginToRegister()/*LoginFragmentDirections.loginToSubscription("1jHJjnxz6SLjkwidkqoK")*/
            )
        }
        binding.imageBioMetric.setOnClickListener {
            if (credential != null)
            {
                bioMetricAuth.showAuthDialog(this)
                bioMetricAuth.onSuccess = {
                    sendViewEvent(
                        AuthWithEmailAndPasswordViewEvent(
                            credential!!.email, credential!!.password, true
                        )
                    )
                }

            }
        }
    }

    private fun checkFieldsNotEmpty()
    {
        binding.loginButton.isEnabled = binding.email.text().isNotBlank() && !binding.password.editText?.text.isNullOrBlank()
    }

    override fun handleViewAction(viewAction: ViewAction)
    {
        when (viewAction)
        {
            is AuthWithGoogleViewAction -> handleAuthWithGoogleViewAction(viewAction.viewState)
            is AuthWithEmailAndPasswordAction -> handleAuthWithEmailAndPasswordAction(viewAction.viewState)
            is GetProfileAction -> handleGetProfileAction(viewAction.viewState)
            else -> throwActionNotSupported(viewAction)
        }
    }

    private fun handleAuthWithGoogleViewAction(viewState: ViewState<Unit>)
    {
        when (viewState)
        {
            is ViewState.Loading ->
            {
                binding.loading.isVisible = true
            }

            is ViewState.Success ->
            {
                Timber.e("Wrong case, should be returned to view by profile response")
            }

            is ViewState.StateError ->
            {
                binding.loading.isVisible = false
                showErrorMessage(viewState.errorMessage)
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun handleAuthWithEmailAndPasswordAction(viewState: ViewState<FirebaseAuthResult>)
    {
        when (viewState)
        {
            is ViewState.Loading ->
            {
                binding.loading.isVisible = true
            }

            is ViewState.Success ->
            {
                Timber.e("Wrong case, should be returned to view by profile response")
            }

            is ViewState.StateError ->
            {
                binding.loading.isVisible = false
                if (viewState.data is WrongPasswordError)
                {
                    showErrorDialog(R.string.sign_in_password_incorrect)
                } else
                {
                    showErrorMessage(viewState.errorMessage)
                }
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun handleGetProfileAction(viewState: ViewState<Profile>)
    {
        when (viewState)
        {
            is ViewState.Loading ->
            {
                binding.loading.isVisible = true
            }

            is ViewState.Success ->
            {
                binding.loading.isVisible = false
                if (viewState.data != null)
                {
                    if (!viewState.data.phone.isNullOrEmpty())
                    {

                        if(viewState.data.isActiveSubscription.not() && viewState.data.promo.isActivePromo().not())
                        {
                            viewState.data.email?.let {
                                Toast.makeText(requireContext(), "Please buy subscription to continue", Toast.LENGTH_SHORT).show()
                                findNavController().safeNavigate(LoginFragmentDirections.loginToSubscription(it,""))
                            }
                            return
                        }
                        if (credential != null)
                        {
                            viewModel.isLoggedIn(true)
                            findNavController().safeNavigate(LoginFragmentDirections.actionLoginToDash())

                        } else
                        {
                            findNavController().safeNavigate(LoginFragmentDirections.actionLoginToOTPFragment(email = binding.email.text(), password = binding.password.text(), phoneNumber = viewState.data.phone.toString()))

                        }


                    } else
                    {
                        viewModel.isLoggedIn(true)
                        findNavController().safeNavigate(LoginFragmentDirections.loginToTerms())
                    }
                } else
                {
                    viewModel.isLoggedIn(true)
                    findNavController().safeNavigate(LoginFragmentDirections.loginToHome())
                }
            }

            is ViewState.StateError ->
            {
                binding.loading.isVisible = false //showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
                if (viewState.errorMessage == NO_USER_FOUND)
                {
                    viewModel.getGoogleAccount()?.let {
                        findNavController().safeNavigate(
                            LoginFragmentDirections.loginToRegister(
                                it.displayName ?: "", it.email ?: ""
                            )
                        )
                    }
                } else
                {
                    showErrorDialog(viewState.errorMessage?:"")
//                    showErrorMessage(viewState.errorMessage)
                }
            }
        }
    }
}
