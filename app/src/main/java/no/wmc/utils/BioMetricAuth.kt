package no.wmc.utils

import android.content.Context
import android.content.ContextWrapper
import androidx.biometric.BiometricPrompt
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import java.util.concurrent.Executor

class BioMetricAuth(val context:Context) : ContextWrapper(context) {


    private lateinit var biometricPrompt: BiometricPrompt
    private lateinit var promptInfo: BiometricPrompt.PromptInfo
    var onSuccess:(()->Unit)? = null
    fun isAvailable():Boolean
    {
        val biometricManager = androidx.biometric.BiometricManager.from(context)
        val canAuthenticate = biometricManager.canAuthenticate(androidx.biometric.BiometricManager.Authenticators.BIOMETRIC_WEAK)
        return canAuthenticate==  androidx.biometric.BiometricManager.BIOMETRIC_SUCCESS
    }


    fun hideBiometricPrompt() {
        if (::biometricPrompt.isInitialized) {
            biometricPrompt.cancelAuthentication()
        }
    }
    fun showAuthDialog(fragment: Fragment)
    {
        val executor: Executor = ContextCompat.getMainExecutor(this)
        biometricPrompt = BiometricPrompt(fragment, executor, authenticationCallback)
        promptInfo = BiometricPrompt.PromptInfo.Builder()
            .setTitle("Biometric Login")
            .setDescription("Place your finger on the fingerprint sensor")
            .setNegativeButtonText("Cancel")
            .setConfirmationRequired(false)
            .build()

        val biometricLoginCallback = object : BiometricPrompt.AuthenticationCallback() {
            override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
                // Biometric authentication succeeded, proceed with login
            }

            override fun onAuthenticationFailed() {
                // Biometric authentication failed
            }

            override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
                // Biometric authentication error occurred
            }
        }

        biometricPrompt.authenticate(promptInfo)

    }


    private val authenticationCallback = object : BiometricPrompt.AuthenticationCallback() {
        override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
            onSuccess?.invoke()
        }

        override fun onAuthenticationFailed() {
            // Biometric authentication failed
          //  showToast("Biometric authentication failed")
        }

        override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
            // Biometric authentication error occurred
            //showToast("Authentication error: $errString")
        }
    }

}