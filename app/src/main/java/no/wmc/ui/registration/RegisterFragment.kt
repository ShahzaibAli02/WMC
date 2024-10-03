package no.wmc.ui.registration

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.DateValidatorPointBackward
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.collection.LLRBNode
import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDate
import kotlinx.datetime.atStartOfDayIn
import me.ibrahimsn.lib.PhoneNumberKit
import no.wmc.R
import no.wmc.databinding.FragmentRegisterBinding
import no.wmc.domain.model.Profile
import no.wmc.ui.base.BaseViewStateFragment
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState
import no.wmc.ui.common_adapters.EmergencyContactAdapter
import no.wmc.ui.common_adapters.InsuranceAdapter
import no.wmc.utils.Const
import no.wmc.utils.PasswordChecker
import no.wmc.utils.Utility
import no.wmc.utils.ext.*
import timber.log.Timber
import java.text.SimpleDateFormat
import java.util.*

class RegisterFragment :
    BaseViewStateFragment<FragmentRegisterBinding, RegisterViewModel>(R.layout.fragment_register, RegisterViewModel::class)
{

    private var activeView = 0
    private lateinit var tlfNrPicker: PhoneNumberKit
    private lateinit var tlfNrPicker2: PhoneNumberKit
    private lateinit var ssnPicker: PhoneNumberKit
    private lateinit var userFireStoreCollectionId: String
    private val args: RegisterFragmentArgs by navArgs()
    private var isFromGoogleSignIn = false
    private val insuranceAdapter: InsuranceAdapter by lazy {
        InsuranceAdapter()
    }
    private val emergencyContactsAdapter: EmergencyContactAdapter by lazy {
        EmergencyContactAdapter()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

        activeView = binding.groupPersonalInfo.id
        initView()
    }

    private var emailTypeDelayTimer: CountDownTimer? = null

    private fun initView()
    {
        binding.apply {
            checkFieldsNotEmpty()

            toolbar.title = getString(R.string.registration)
            toolbar.setNavigationIcon(R.drawable.ic_back)
            toolbar.setNavigationOnClickListener { findNavController().popBackStack() }
            setUpCountryPicker()

            recyclerInsurance.adapter = insuranceAdapter
            recyclerEmergency.adapter = emergencyContactsAdapter
            dateOfBirth.editText?.setOnClickListener {
                pickDate()
            }
            next.setOnClickListener {

                //                                if(true)
                //                                {
                //                                    findNavController().safeNavigate(RegisterFragmentDirections.registerToSubscription("test@email.com","1122"))
                //
                //                  x                 return@setOnClickListener
                //                                }

                updateCard()
                formValidation()
                if (it.tag.toString() == "false") return@setOnClickListener
                when
                {
                    groupPersonalInfo.isShown ->
                    {
                        activeView = groupPostalAddress.id
                        switchView()
                    }

                    groupPostalAddress.isShown ->
                    {
                        activeView = groupInsurance.id
                        switchView()
                    }

                    groupInsurance.isShown ->
                    {

                        activeView = groupEmergencyContact.id
                        switchView()
                    }

                    groupEmergencyContact.isShown ->
                    {
                        prepareData()
                    }
                }
            }
            btnPersonalInfo.setOnClickListener {
                if (!groupPersonalInfo.isShown && groupPersonalInfo.tag == "1")
                {
                    activeView = groupPersonalInfo.id
                    switchView()
                }
            }
            btnPostalAddress.setOnClickListener {
                if (!groupPostalAddress.isShown && groupPostalAddress.tag == "1")
                {
                    activeView = groupPostalAddress.id
                    switchView()
                }
            }
            btnInsurance.setOnClickListener {
                if (!groupInsurance.isShown && groupInsurance.tag == "1")
                {
                    activeView = groupInsurance.id
                    switchView()
                }
            }
            btnForEmergency.setOnClickListener {
                if (!groupEmergencyContact.isShown)
                {
                    activeView = groupEmergencyContact.id
                    switchView()
                }
            }/*nationality.editText?.setOnClickListener {
                setUpCountryPicker()
            }*/

            firstName.editText?.addTextChangedListener {
                firstName.isErrorEnabled = false
                checkFieldsNotEmpty()
            } //            cprNumber.editText?.addTextChangedListener {
            //                val string=it.toString()
            //                if (string.isNotEmpty()) {
            //                    // Check if "-" is not already present at index 3, then add it
            //                    if (string.length >= 4 && string[3] != '-') {
            //                        cprNumber.editText?.setText(string.substring(0, 3) + "-" + string.substring(3))
            //                        cprNumber.editText?.setSelection(5) // Move cursor to the end of the inserted "-"
            //                    }
            //
            //                    //123-456
            //                    if (string.length >= 8 && string[6] != '-') {
            //                        cprNumber.editText?.setText(string.substring(0, 6) + "-" + string.substring(6))
            //                        cprNumber.editText?.setSelection(8) // Move cursor to the end of the inserted "-"
            //                    }
            //                }
            //            }
            lastName.editText?.addTextChangedListener {
                lastName.isErrorEnabled = false
                checkFieldsNotEmpty()
            }
            dateOfBirth.editText?.addTextChangedListener {
                dateOfBirth.isErrorEnabled = false
                checkFieldsNotEmpty()
            }
            gender.editText?.addTextChangedListener {
                gender.isErrorEnabled = false
                checkFieldsNotEmpty()
            }
            nationality.editText?.addTextChangedListener {
                nationality.isErrorEnabled = false
                checkFieldsNotEmpty()
            }
            tlfNr.editText?.addTextChangedListener {
                if (tlfNr.text().length < 5 || tlfNrPicker.isValid) tlfNr.isErrorEnabled = false
                else tlfNr.error(getString(R.string.invalid))
                checkFieldsNotEmpty()
            }
            tlfNr2.editText?.addTextChangedListener {
                if (tlfNr2.text().length < 5 || tlfNrPicker2.isValid) tlfNr2.isErrorEnabled = false
                else tlfNr2.error(getString(R.string.invalid))
                checkFieldsNotEmpty()
            }
            email.editText?.addTextChangedListener {
                checkFieldsNotEmpty()
                email.tag = Const.EmailStatus.unverified
                email.isErrorEnabled = false
                if (email.text().isValidEmail())
                {
                    emailTypeDelayTimer?.cancel()
                    emailTypeDelayTimer = object : CountDownTimer(800, 500)
                    {
                        override fun onTick(millisUntilFinished: Long)
                        {
                        }

                        override fun onFinish()
                        {
                            emailTypeDelayTimer = null
                            sendViewEvent(RegisterViewEvent.ValidateEmailEvent(email = email.text()))
                        }
                    }
                    emailTypeDelayTimer?.start()
                }
            }
            password.editText?.addTextChangedListener {
                password.isErrorEnabled = false
                checkFieldsNotEmpty()
                updatePasswordStrength(it.toString())
            }
            tlfNrOrganDonor.editText?.addTextChangedListener {
                tlfNrOrganDonor.isErrorEnabled = false
                checkFieldsNotEmpty()
            }

            postalAddress.editText?.addTextChangedListener {
                postalAddress.isErrorEnabled = false
                checkFieldsNotEmpty()
            }
            postalCode.editText?.addTextChangedListener {
                postalCode.isErrorEnabled = false
                checkFieldsNotEmpty()
            }
            city.editText?.addTextChangedListener {
                city.isErrorEnabled = false
                checkFieldsNotEmpty()
            }
            country.editText?.addTextChangedListener {
                country.isErrorEnabled = false
                checkFieldsNotEmpty()
            }

            //            typeOfInsurance.editText?.addTextChangedListener {
            //                typeOfInsurance.isErrorEnabled = false
            //                checkFieldsNotEmpty()
            //            }
            //            insuranceCompany.editText?.addTextChangedListener {
            //                insuranceCompany.isErrorEnabled = false
            //                checkFieldsNotEmpty()
            //            }
            //            policyNumber.editText?.addTextChangedListener {
            //                policyNumber.isErrorEnabled = false
            //                checkFieldsNotEmpty()
            //            }
            //            emergencyContacts.editText?.addTextChangedListener {
            //                if (emergencyContacts.text().length < 5 || emergencyContactPicker.isValid) emergencyContacts.isErrorEnabled = false
            //                else emergencyContacts.error(getString(R.string.invalid))
            //                checkFieldsNotEmpty()
            //            }


            if (args.name.isNotEmpty())
            {
                val nameSplit = args.name.split(" ")
                firstName.text(nameSplit[0])
                if (nameSplit.size > 1) lastName.text(nameSplit[1])
                email.text(args.email)
                isFromGoogleSignIn = true
                email.isEnabled=false

            }

            switchView()
        }
    }

    private fun updateCard()
    {
        binding.apply {

            newCardDesign.txtName.setText(firstName.text()+" "+lastName.text())
            newCardDesign.txtTravelInsuranceCompanyName.text = insuranceAdapter.items.getOrNull(0)?.company?:"N/A"
            newCardDesign.txtPolicyNumber.text = insuranceAdapter.items.getOrNull(0)?.policy?:"N/A"
            newCardDesign.txtEmergencyPhone.text = emergencyContactsAdapter.items.getOrNull(0)?.phone?:"N/A"
            newCardDesign.txtNationality.text = nationality.text()
            newCardDesign.txtNationalId.text = cprNumber.text()
            newCardDesign.txtBirthDate.text = dateOfBirth.text()
            newCardDesign.txtOrganDonation.text = tlfNrOrganDonor.text()
        }
    }
    private fun setUpCountryPicker()
    {
        binding.apply {
            tlfNrPicker = PhoneNumberKit.Builder(context!!).setIconEnabled(true).build()
            tlfNrPicker.attachToInput(binding.tlfNr, Utility.getISOCountryCode(binding.root.context))
            tlfNrPicker.setupCountryPicker(activity = activity as AppCompatActivity, searchEnabled = true)


            tlfNrPicker2 = PhoneNumberKit.Builder(context!!).setIconEnabled(true).build()
            tlfNrPicker2.attachToInput(binding.tlfNr2, Utility.getISOCountryCode(binding.root.context))
            tlfNrPicker2.setupCountryPicker(activity = activity as AppCompatActivity, searchEnabled = true)


            ssnPicker = PhoneNumberKit.Builder(context!!).setIconEnabled(true).build()
            ssnPicker.attachToInput(binding.cprFlag, Utility.getISOCountryCode(binding.root.context))
            ssnPicker.setupCountryPicker(activity = activity as AppCompatActivity, searchEnabled = true)


        }
    }

    private fun switchView()
    {
        binding.apply {
            groupPersonalInfo.setShow(false)
            groupPostalAddress.setShow(false)
            groupInsurance.setShow(false)
            groupEmergencyContact.setShow(false)

            btnPersonalInfo.isEnabled = false
            btnPostalAddress.isEnabled = false
            btnInsurance.isEnabled = false
            btnForEmergency.isEnabled = false

            when (activeView)
            {
                R.id.groupPersonalInfo ->
                {
                    toolbar.title = getString(R.string.profile_screen_title)
                    groupPersonalInfo.setShow(true)
                    next.text = getString(R.string.button_next)
                    btnPersonalInfo.isEnabled = true
                }

                R.id.groupPostalAddress ->
                {
                    toolbar.title = getString(R.string.postal_address)
                    groupPostalAddress.setShow(true)
                    next.text = getString(R.string.button_next)
                    btnPersonalInfo.isEnabled = true
                    btnPostalAddress.isEnabled = true
                }

                R.id.groupInsurance ->
                {
                    toolbar.title = getString(R.string.profile_screen_title)
                    groupInsurance.setShow(true)
                    next.text = getString(R.string.button_next)
                    btnPersonalInfo.isEnabled = true
                    btnPostalAddress.isEnabled = true
                    btnInsurance.isEnabled = true
                }

                R.id.groupEmergencyContact ->
                {
                    toolbar.title = getString(R.string.profile_screen_title)
                    groupEmergencyContact.setShow(true)
                    next.text = getString(R.string.common_save)
                    btnPersonalInfo.isEnabled = true
                    btnPostalAddress.isEnabled = true
                    btnInsurance.isEnabled = true
                    btnForEmergency.isEnabled = true
                }
            }
        }
        checkFieldsNotEmpty()
    }

    private fun checkFieldsNotEmpty()
    {
        binding.apply {
            when
            {
                groupPersonalInfo.isShown ->
                {
                    val isEnable = !firstName.isEmpty() && !lastName.isEmpty() && !dateOfBirth.isEmpty() && !gender.isEmpty() && !nationality.isEmpty() && !tlfNr.isEmpty() && !email.isEmpty() && email.tag == Const.EmailStatus.verified && !password.isEmpty() && PasswordChecker.isStrongPassword(password.text()) && !tlfNrOrganDonor.isEmpty() && tlfNrPicker.isValid /*&& isValidSSN(cprNumber.editText.toString())*/

                    groupPersonalInfo.tag = if (next.isEnabled) "1" else "0"
                    next.tag = isEnable.toString()
                    if (isEnable) btnPersonalInfo.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_white_square_tick, 0, 0, 0)
                    else btnPersonalInfo.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0)
                }

                groupPostalAddress.isShown ->
                {
                    val isEnable = !postalAddress.isEmpty() && !postalCode.isEmpty() && !city.isEmpty() && !country.isEmpty()
                    groupPostalAddress.tag = if (next.isEnabled) "1" else "0"
                    next.tag = isEnable.toString()
                    if (isEnable) btnPostalAddress.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_white_square_tick, 0, 0, 0)
                    else btnPostalAddress.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0)
                }

                groupInsurance.isShown ->
                { //                    val isEnable = !typeOfInsurance.isEmpty() && !insuranceCompany.isEmpty() && !policyNumber.isEmpty() && !emergencyContacts.isEmpty() && emergencyContactPicker.isValid

                    val isEnable = insuranceAdapter.isValid();
                    groupInsurance.tag = if (next.isEnabled) "1" else "0"
                    next.tag = isEnable.toString()
                    if (isEnable) btnInsurance.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_white_square_tick, 0, 0, 0)
                    else btnInsurance.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0)


                }

                groupEmergencyContact.isShown ->
                {
                    val isEnable = emergencyContactsAdapter.isValid()
                    groupEmergencyContact.tag = if (next.isEnabled) "1" else "0"
                    next.tag = isEnable.toString()
                    if (isEnable) btnForEmergency.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_white_square_tick, 0, 0, 0)
                    else btnForEmergency.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0)
                }
            }
        }

    }

    private fun formValidation()
    {
        binding.apply {
            when
            {
                groupPersonalInfo.isShown ->
                {
                    if (firstName.isEmpty()) firstName.error(getString(R.string.required))
                    if (lastName.isEmpty()) lastName.error(getString(R.string.required))
                    if (dateOfBirth.isEmpty()) dateOfBirth.error(getString(R.string.required))
                    if (gender.isEmpty()) gender.error(getString(R.string.required))
                    if (nationality.isEmpty()) nationality.error(getString(R.string.required))
                    if (!tlfNrPicker.isValid) tlfNr.error(getString(R.string.required))
                    if (email.isEmpty()) email.error(getString(R.string.required))
                    else if (!email.text()
                            .isValidEmail()
                    ) email.error(getString(R.string.invalid_email))
                    if (password.isEmpty()) password.error(getString(R.string.required))
                    if (PasswordChecker.isStrongPassword(password.text())
                            .not()
                    ) password.error("Password should be at least 8 characters with an uppercase letter and a special symbol.")
                    if (tlfNrOrganDonor.isEmpty()) tlfNrOrganDonor.error(getString(R.string.required))
//                    if (cprNumber.isEmpty()) cprNumber.error(getString(R.string.required))
//
//                    if (isValidSSN(binding.cprNumber.editText?.text.toStringOrNull()).not())
//                    {
//                        binding.cprNumber.error("Invalid SSN")
//
//                    }
                }

                groupPostalAddress.isShown ->
                {
                    if (postalAddress.isEmpty()) postalAddress.error(getString(R.string.required))
                    if (postalCode.isEmpty()) postalCode.error(getString(R.string.required))
                    if (city.isEmpty()) city.error(getString(R.string.required))
                    if (country.isEmpty()) country.error(getString(R.string.required))
                }

                groupInsurance.isShown ->
                { //                    if (typeOfInsurance.isEmpty()) typeOfInsurance.error(getString(R.string.required))
                    //                    if (insuranceCompany.isEmpty()) insuranceCompany.error(getString(R.string.required))
                    //                    if (policyNumber.isEmpty()) policyNumber.error(getString(R.string.required))
                    //                    if (!emergencyContactPicker.isValid) emergencyContacts.error(getString(R.string.required))

                }

                groupEmergencyContact.isShown ->
                { //                    if (emergencyContactName1.isEmpty()) emergencyContactName1.error(getString(R.string.required))
                    //                    if (!emergencyPhone1Picker.isValid) emergencyContactPhone1.error(getString(R.string.required))
                    //                    if (emergencyContactRelationship1.isEmpty()) emergencyContactRelationship1.error(getString(R.string.required))
                    //
                    //                    if (emergencyContactName2.isEmpty()) emergencyContactName2.error(getString(R.string.required))
                    //                    if (!emergencyPhone2Picker.isValid) emergencyContactPhone2.error(getString(R.string.required))
                    //                    if (emergencyContactRelationship2.isEmpty()) emergencyContactRelationship2.error(getString(R.string.required))
                    //

                }
            }
        }
    }

    private fun updatePasswordStrength(password: String)
    { // Implement your password strength logic here
        val strength = calculatePasswordStrength(password)

        // Set ProgressBar progress and color based on password strength
        binding.passwordStrengthProgressBar.progress = strength
        val color = when
        {
            strength <= 30 -> R.color.red
            strength <= 50 -> R.color.yellow
            strength >= 100 -> R.color.green
            else -> Color.RED
        }
        binding.passwordStrengthProgressBar.progressTintList = ContextCompat.getColorStateList(requireContext(), color)
        val strengthText = when
        {
            strength <= 30 -> "Week"
            strength <= 50 -> "Medium"
            strength >= 100 -> "Strong"
            else -> "Very Week"
        }
        binding.passwordStrengthTextView.text = strengthText
        binding.passwordStrengthTextView.setTextColor(resources.getColor(color))
    }

    private fun calculatePasswordStrength(password: String): Int
    {
        if (password.isEmpty()) return 0
        if (password.length < 3) return 30
        if (PasswordChecker.isStrongPassword(password)) return 100
        return 50
    }

    fun isValidSSN(str: String?): Boolean
    {
        return str?.isEmpty()?.not() == true
    }

    @SuppressLint("SimpleDateFormat")
    private fun pickDate() {
        val eighteenYearsAgoMillis = Calendar.getInstance().apply {
            add(Calendar.YEAR, -18)
        }.timeInMillis

        val datePicker = MaterialDatePicker.Builder.datePicker()
            .setTheme(R.style.AppDatePicker)
            .setSelection(eighteenYearsAgoMillis)
            .setCalendarConstraints(
                    CalendarConstraints.Builder()
                        .setEnd(eighteenYearsAgoMillis)
                        .setValidator(DateValidatorPointBackward.now())
                        .build()
            )
            .setTitleText("Select Date")
            .build()

        datePicker.addOnPositiveButtonClickListener {
            val selectedDateMillis = it
            val eighteenYearsAgoMillis = Calendar.getInstance().apply {
                add(Calendar.YEAR, -18)
            }.timeInMillis

            if (selectedDateMillis < eighteenYearsAgoMillis) {
                val calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"))
                calendar.timeInMillis = it

                val format = SimpleDateFormat("dd/MM/yyyy")
                val formatted: String = format.format(calendar.time)
                binding.dateOfBirth.editText?.setText(formatted)
            } else {
                // Show error message or handle invalid selection
                Toast.makeText(context, "You must be at least 18 years old.", Toast.LENGTH_SHORT).show()
            }
        }

        datePicker.show(childFragmentManager, "Date Picker")
    }



    var profile: Profile? = null
    private fun prepareData()
    {

        binding.apply {

            profile = Profile(
                firstName = firstName.text(), lastName = lastName.text(), memberSince =getMemberSince(), birthDate = dateOfBirth.text(), gender = if (gender.text() == "Male") Profile.Gender.Male else Profile.Gender.Female, ssn = cprNumber.text(), nationality = nationality.text(), phone = tlfNr.textForPhonePicker(), homePhone = tlfNr2.textForPhonePicker(), email = email.text()
                    .lowercase(), password = password.text().encrypt(), organDonation = tlfNrOrganDonor.text() != "No", postalAddress = listOf(Profile.PostalAddress(info = postalAddress.text(), city.text(), postalCode.text(), country.text())), insurances = insuranceAdapter.items, emergencyContact = emergencyContactsAdapter.items, otherInfo = null, isActiveSubscription = false, isForcedRefreshToken = false, onBoardingRequired = false, cardOrderStatus = null, relationShip = relationship.text(), cardOrderDate = null
            )
            hideKeyboard()

            if (isFromGoogleSignIn)
            {
                profile?.uid = FirebaseAuth.getInstance().currentUser?.uid
                sendViewEvent(RegisterViewEvent.AddUserToFireStoreEvent(profile!!))

            } else
            {
                sendViewEvent(RegisterViewEvent.CreateUserInFireBaseAuth(email = binding.email.text(), password = binding.password.text()))
            }

        }
    }

    private fun getMemberSince(): String?
    {
        return SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).format(Date())
    }

    override fun handleViewAction(viewAction: ViewAction)
    {
        when (viewAction)
        {
            is RegisterViewAction.AddUserFireStoreAction -> handleAddUserFireStoreAction(viewAction.viewState)
            is RegisterViewAction.CreateUserInFireBaseAuth -> handleCreateUserInFireBaseAuthAction(viewAction.viewState)
            is RegisterViewAction.IsEmailValid -> handleIsValidEmail(viewAction.viewState)
            else -> throwActionNotSupported(viewAction)
        }
    }

    private fun handleAddUserFireStoreAction(viewState: ViewState<String>)
    {
        when (viewState)
        {
            is ViewState.Loading ->
            {
                binding.loading.setShow(true)
            }

            is ViewState.Success ->
            { //When user created in FireStore.
                userFireStoreCollectionId = viewState.data ?: ""
                binding.loading.setShow(false)
                if (isFromGoogleSignIn)
                {
                    updatePasswordInFirebaseAuth()
                } else
                {
                    binding.loading.setShow(false) //When user created in FireBase Auth.
                    findNavController().safeNavigate(RegisterFragmentDirections.registerToSubscription(FirebaseAuth.getInstance().currentUser!!.email!!, binding.password.editText!!.text.toString()))


                } //                else
                //                {
                //                    sendViewEvent(RegisterViewEvent.CreateUserInFireBaseAuth(email = binding.email.text(), password = binding.password.text()))
                //                }
            }

            is ViewState.StateError ->
            {
                binding.loading.setShow(false)
                showErrorMessage(viewState.errorMessage)
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun updatePasswordInFirebaseAuth()
    {
        binding.loading.setShow(true)
        FirebaseAuth.getInstance().currentUser?.let {
            it.updatePassword(binding.password.text()).addOnSuccessListener {

                binding.loading.setShow(false)
                findNavController().safeNavigate(RegisterFragmentDirections.registerToSubscription(FirebaseAuth.getInstance().currentUser!!.email!!, binding.password.editText!!.text.toString()))

            }.addOnFailureListener {
                binding.loading.setShow(false)
                showErrorMessage(getString(R.string.error_message))
            }
        }
    }

    private fun handleCreateUserInFireBaseAuthAction(viewState: ViewState<Unit>)
    {
        when (viewState)
        {
            is ViewState.Loading ->
            {
                binding.loading.setShow(true)
            }

            is ViewState.Success ->
            {
                binding.loading.setShow(false) //When user created in FireBase Auth.
                profile?.uid = FirebaseAuth.getInstance().currentUser?.uid
                sendViewEvent(RegisterViewEvent.AddUserToFireStoreEvent(profile!!))


            //                binding.loading.setShow(false) //When user created in FireBase Auth.
                //                findNavController().safeNavigate(RegisterFragmentDirections.registerToSubscription(FirebaseAuth.getInstance().currentUser!!.email!!, binding.password.editText!!.text.toString()))
                //


            }

            is ViewState.StateError ->
            {
                binding.loading.setShow(false)
                showErrorMessage(viewState.errorMessage)
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun handleIsValidEmail(viewState: ViewState<Boolean>)
    {
        when (viewState)
        {
            is ViewState.Loading ->
            {
                binding.loading.setShow(true)
            }

            is ViewState.Success ->
            {
                binding.loading.setShow(false)
                if (viewState.data == true)
                {
                    binding.email.error(getString(R.string.email_already_used))
                    binding.email.tag = Const.EmailStatus.used
                } else
                {
                    binding.email.isErrorEnabled = false
                    binding.email.tag = Const.EmailStatus.verified
                }
                checkFieldsNotEmpty()
            }

            is ViewState.StateError ->
            {
                binding.loading.setShow(false)
                showErrorMessage(viewState.errorMessage)
                Timber.e(viewState.errorMessage)
            }
        }
    }

    fun groupPersonalInfo()
    {

    }
}