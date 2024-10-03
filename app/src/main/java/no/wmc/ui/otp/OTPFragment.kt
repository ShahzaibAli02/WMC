package no.wmc.ui.otp

import `in`.aabhasjindal.otptextview.OTPListener
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.manager.Lifecycle
import com.google.firebase.FirebaseException
import com.google.firebase.FirebaseTooManyRequestsException
import com.google.firebase.auth.*
import me.ibrahimsn.lib.PhoneNumberKit
import no.wmc.R
import no.wmc.databinding.FragmentOTPBinding
import no.wmc.databinding.FragmentOtpNewBinding
import no.wmc.ui.base.BaseViewStateFragment
import no.wmc.ui.login.LoginFragmentDirections
import no.wmc.ui.login.LoginViewModel
import no.wmc.utils.ext.*
import java.util.*
import java.util.concurrent.TimeUnit


class OTPFragment : BaseViewStateFragment<FragmentOtpNewBinding, LoginViewModel>(
    R.layout.fragment_otp_new,
    LoginViewModel::class
) {
    private val margs: OTPFragmentArgs by navArgs()
    private lateinit var auth: FirebaseAuth
    private lateinit var resendToken: PhoneAuthProvider.ForceResendingToken
    private lateinit var callbacks: PhoneAuthProvider.OnVerificationStateChangedCallbacks
    private var storedVerificationId: String = ""
    private var phone:String=""
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        auth = FirebaseAuth.getInstance()
        //auth.firebaseAuthSettings.setAppVerificationDisabledForTesting(true)

        phone=margs.phoneNumber.replace("-","").replace(" ","")
        if(phone.startsWith("+").not())
        {
            phone=getCountryCode(phone)?:phone
        }
        binding.number = phone

        startStopTimerAndDisableButton()

        binding.imgBack.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.resendOTPButton.setOnClickListener {
            if(::resendToken.isInitialized){
                resendVerificationCode()
                startStopTimerAndDisableButton()
                timer.start()
                showSnackBar(getString(R.string.otp_sent))
            }
        }

        binding.otpView.otpListener = object : OTPListener {
            override fun onInteractionListener() {

            }

            override fun onOTPComplete(otp: String) {
                verifyVerificationCodeManually(otp)
                timer.cancel()
                startStopTimerAndDisableButton(false)
            }
        }

        binding.btnVerify.setOnClickListener{
            val otp=binding.otpView.otp
            if(otp!=null && otp.length==6)
            {
                verifyVerificationCodeManually(otp)
                timer.cancel()
                startStopTimerAndDisableButton(false)
            }
        }
        callbacks = object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            override fun onVerificationCompleted(credential: PhoneAuthCredential) {
                signInWithPhoneAuthCredential(credential)
            }
            override fun onVerificationFailed(e: FirebaseException) {
                Log.d("TAG", "onVerificationFailed: "+e.message)
                context?.let {
                    Toast.makeText(it, e.message, Toast.LENGTH_SHORT).show()
                }
            }
            override fun onCodeSent(
                verificationId: String,
                token: PhoneAuthProvider.ForceResendingToken
            ) {
                context?.let {
                    Toast.makeText(it, "Code Sent", Toast.LENGTH_SHORT).show()
                }
                storedVerificationId = verificationId
                resendToken = token
            }
        }

        startPhoneNumberVerification()
        timer.start()


    }
    fun getCountryCode(phone: String):String?
    {
        val mPhonePicker = PhoneNumberKit.Builder(context!!).setIconEnabled(true).build()
        return  mPhonePicker.formatPhoneNumber(phone,null)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        timer.cancel()
    }

    private fun verifyVerificationCodeManually(code: String) {
        try {
            val credential = storedVerificationId.let { PhoneAuthProvider.getCredential(it, code) }

            signInWithPhoneAuthCredential(credential)
        } catch (e: Exception) {
            showSnackBar(e.localizedMessage)
        }
    }

    private fun signInWithPhoneAuthCredential(credential: PhoneAuthCredential) {
        hideKeyboard()
        auth.signInWithCredential(credential)
            .addOnCompleteListener(requireActivity()) { task ->
                if (task.isSuccessful) {
                    viewModel.isLoggedIn(true)
                    findNavController().safeNavigate(
                        OTPFragmentDirections.actionOTPFragmentToTerms()
                    )
                }
                else {
                    if (task.exception is FirebaseAuthInvalidCredentialsException) {
                        showSnackBar(getString(R.string.invalid_otp))
                        startStopTimerAndDisableButton(true)
                    }
                }
            }
    }

    private fun startStopTimerAndDisableButton(isShow : Boolean = false) {
        binding.resendOTPButton.setShow(isShow)
    }

    private fun startPhoneNumberVerification() {

        Log.d("TAG", "startPhoneNumberVerification: "+phone)
        val options = PhoneAuthOptions.newBuilder(auth)
            .setPhoneNumber(phone)
            .setTimeout(60L, TimeUnit.SECONDS)
            .setActivity(requireActivity())
            .setCallbacks(callbacks)
            .build()
        PhoneAuthProvider.verifyPhoneNumber(options)
    }

    private fun resendVerificationCode() {
        val optionsBuilder = PhoneAuthOptions.newBuilder(auth)
            .setPhoneNumber(phone)
            .setTimeout(60L, TimeUnit.SECONDS)
            .setActivity(requireActivity())
            .setCallbacks(callbacks)
        optionsBuilder.setForceResendingToken(resendToken)
        PhoneAuthProvider.verifyPhoneNumber(optionsBuilder.build())
    }

    var timer: CountDownTimer = object : CountDownTimer(60000, 1000) {
        override fun onTick(millisUntilFinished: Long) {
            val secondsLeft = millisUntilFinished / 1000
            val timeLeftFormatted: String =
                String.format(Locale.getDefault(), "%02d", secondsLeft)
            binding.otpTimer.text = "Resend in 00:$timeLeftFormatted s"
        }

        override fun onFinish() {
            if(binding.otpView.otp.isNullOrEmpty()){
                startStopTimerAndDisableButton(true)
            }
        }
    }

}