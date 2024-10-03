package no.wmc.ui.profile

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView.INVALID_POSITION
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.core.widget.doAfterTextChanged
import androidx.navigation.fragment.findNavController
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.textfield.TextInputLayout
import kotlinx.serialization.json.Json
import me.ibrahimsn.lib.PhoneNumberKit
import me.ibrahimsn.lib.internal.model.State
import no.wmc.R
import no.wmc.data.remote.model.ValidationDtoModel
import no.wmc.databinding.ProfileScreenBinding
import no.wmc.domain.model.Profile
import no.wmc.domain.model.Profile.EmergencyContact
import no.wmc.domain.model.Profile.Gender
import no.wmc.domain.model.Profile.Gender.Female
import no.wmc.domain.model.Profile.Gender.Male
import no.wmc.domain.model.Profile.PostalAddress
import no.wmc.domain.model.ProfileUpdate
import no.wmc.ui.base.BaseViewStateFragment
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState
import no.wmc.ui.base.ViewState.Loading
import no.wmc.ui.base.ViewState.StateError
import no.wmc.ui.base.ViewState.Success
import no.wmc.ui.common_adapters.EmergencyContactAdapter
import no.wmc.ui.common_adapters.InsuranceAdapter
import no.wmc.ui.common_adapters.NoFilterArrayAdapter
import no.wmc.ui.profile.ProfileViewAction.GetProfileViewAction
import no.wmc.ui.profile.ProfileViewAction.UpdateProfileViewAction
import no.wmc.ui.profile.ProfileViewEvent.GetProfileViewEvent
import no.wmc.ui.profile.ProfileViewEvent.UpdateProfileViewEvent
import no.wmc.utils.CountryUtil
import no.wmc.utils.Utility
import no.wmc.utils.ext.countryCodeToName
import no.wmc.utils.ext.countryNameToCode
import no.wmc.utils.ext.text
import no.wmc.utils.ext.toStringOrNull
import timber.log.Timber
import java.text.SimpleDateFormat
import java.time.Instant.now
import java.time.temporal.ChronoUnit
import java.util.Date
import java.util.Locale


private fun String?.fixPhoneNum(): String?
{
    return  this?.replace(" ","")?.replace("-","")
}

class ProfileFragment : BaseViewStateFragment<ProfileScreenBinding, ProfileViewModel>(
    R.layout.profile_screen, ProfileViewModel::class
)
{

    private val insuranceAdapter : InsuranceAdapter by lazy {
        InsuranceAdapter()
    }
    private val emergencyContactsAdapter : EmergencyContactAdapter by lazy {
        EmergencyContactAdapter().enableCallButton()
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        sendViewEvent(GetProfileViewEvent)
    }

    private fun initViews()
    {
        binding.toolbar.setNavigationIcon(R.drawable.ic_back)
        binding.toolbar.setNavigationOnClickListener { findNavController().popBackStack() }

        binding.recyclerInsurance.adapter=insuranceAdapter
        binding.recyclerEmergency.adapter=emergencyContactsAdapter



//        binding.countryCodePicker.registerCarrierNumberEditText(binding.phone.editText)
        val adapter = NoFilterArrayAdapter(binding.root.context, android.R.layout.simple_dropdown_item_1line, binding.root.context.resources.getStringArray(R.array.array_relationship))
        (  binding.relationship.editText as AutoCompleteTextView).setAdapter(adapter)

        attachPhoneNumberPicker1(binding.phone)
        attachPhoneNumberPicker(binding.phone2)

        binding.saveButton.setOnClickListener {

            if (!isValid())
            {
                return@setOnClickListener
            }
            sendViewEvent(
                UpdateProfileViewEvent(
                    ProfileUpdate(
                      ssn_country_code  =tlfNrPicker.getCountrySelected(), firstName = binding.firstName.editText?.text.toString(),lastName = binding.lastName.editText?.text.toString(), birthDate = getBirthdayString(), gender = getSelectedGender(), organDonation = getOrganDonation(), ssn = binding.cprNumber.editText?.text.toStringOrNull(), nationality = binding.nationality.editText?.text.toString(), phone = binding.phone.editText?.text.toString(), postalAddress = getPostalAddress(), insurances = insuranceAdapter.items, emergencyContact = getEmergencyContactsItems(), otherInfo = binding.otherInfoField.editText?.text.toStringOrNull(),homePhone=binding.phone2.text(), relationShip = binding.relationship.text()
                    )
                )
            )
        }
        binding.birthDate.editText?.setOnClickListener {
            val birthDayDialog = MaterialDatePicker.Builder.datePicker()
                .setTitleText(R.string.profile_edit_select_birthdata).setCalendarConstraints(
                    CalendarConstraints.Builder()
                        .setEnd( // Don't allow to set age less that 18 years
                            now().minus(18 * 365, ChronoUnit.DAYS).toEpochMilli()
                        ).build()
                ).setSelection(getBirthdaySelected()).setTheme(R.style.CalendarDialogTheme).build()
            birthDayDialog.show(childFragmentManager, "birth_day_dialog")

            birthDayDialog.addOnPositiveButtonClickListener { timeInMs ->
                binding.birthDate.editText?.setText(SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).format(Date(timeInMs)))
                binding.birthDate.error = null
            }
        }
        tlfNrPicker = PhoneNumberKit.Builder(context!!).setIconEnabled(true).build()
        tlfNrPicker.attachToInput(binding.cprFlag, Utility.getISOCountryCode(binding.root.context))
        tlfNrPicker.setupCountryPicker(activity = activity as AppCompatActivity, searchEnabled = true)

        binding.country.editText?.setOnClickListener {
            CountriesListDialog.createDialog { countryLocale ->
                countryLocale?.displayCountry?.let {
                    binding.country.editText?.setText(it)
                    binding.country.editText?.tag = countryLocale
                }
                binding.country.error = null
            }.show(childFragmentManager, "countries_dialog")
        }

        clearErrorAfterInput()
    }

    private fun getEmergencyContactsItems(): List<Profile.EmergencyContact>
    {
       return emergencyContactsAdapter.items.ifEmpty {
           listOf(EmergencyContact())
       }
    }

    lateinit var mPhonePicker:PhoneNumberKit

    private fun attachPhoneNumberPicker1(phone: TextInputLayout)
    {

        mPhonePicker = PhoneNumberKit.Builder(context!!).setIconEnabled(true).build()
        mPhonePicker.attachToInput(phone, Utility.getISOCountryCode(binding.root.context))
        mPhonePicker.setupCountryPicker(activity = activity as AppCompatActivity, searchEnabled = true)
    }
    private fun attachPhoneNumberPicker(phone: TextInputLayout)
    {

        val mPhonePicker = PhoneNumberKit.Builder(context!!).setIconEnabled(true).build()
        mPhonePicker.attachToInput(phone, Utility.getISOCountryCode(requireContext()))
        mPhonePicker.setupCountryPicker(activity = activity as AppCompatActivity, searchEnabled = true)

    }

    private fun isValid(): Boolean
    {
        var isValid = true
        if (validate(binding.firstName).not()) isValid = false
        if (validate(binding.lastName).not()) isValid = false
        if (validate(binding.birthDate).not()) isValid = false
//        if (validate(binding.gender).not()) isValid = false
//        if (validate(binding.cprNumber).not()) isValid = false
        if (validate(binding.nationality).not()) isValid = false
        if (validate(binding.relationship).not()) isValid = false
        if (validate(binding.phone).not()) isValid = false
        if (validate(binding.postalCode).not()) isValid = false
        if (validate(binding.city).not()) isValid = false
        if (validate(binding.country).not()) isValid = false
        if (validate(binding.street).not()) isValid = false
        if(mPhonePicker.isValid.not()){
            binding.phone.error="Invalid phone number"
            isValid=false
        }
//        if (validate(binding.insuranceCompany).not()) isValid = false
//        if (validate(binding.contactOneName).not()) isValid = false
//        if (validate(binding.contactOnePhone).not()) isValid = false
//        if (validate(binding.contactOnePhone).not()) isValid = false
//        if (validate(binding.contactOneRelation).not()) isValid = false
//        if (validate(binding.contactTwoName).not()) isValid = false
//        if (validate(binding.contactTwoPhone).not()) isValid = false
//        if (validate(binding.contactTwoRelation).not()) isValid = false

        return isValid

    }

    fun validate(field: TextInputLayout, errorMsg: String = "Required Field"): Boolean
    {
        if (field.editText?.text?.toString()?.isBlank() == true)
        {
            field.error = errorMsg
            return false
        }
        field.error=null
        return true;
    }

    private lateinit var tlfNrPicker: PhoneNumberKit



    override fun handleViewAction(viewAction: ViewAction)
    {
        when (viewAction)
        {
            is GetProfileViewAction -> handleGetProfileAction(viewAction.viewState)
            is UpdateProfileViewAction -> handleUpdateProfileAction(viewAction.viewState)
        }
    }

    fun isValidSSN(str: String?): Boolean
    {
        return str?.isEmpty()?.not() == true
    }

    private fun handleGetProfileAction(viewState: ViewState<Profile>)
    {
        binding.loading.isVisible = viewState is Loading
        when (viewState)
        {
            is Loading ->
            { // no op
            }

            is Success ->
            {
                binding.profile = viewState.data!!
                binding.phone.editText?.setText(viewState.data.phone)
                binding.phone2.editText?.setText(viewState.data.homePhone)

                viewState.data.ssn_country_code?.let {
                    tlfNrPicker.attachToInput(binding.cprFlag, viewState.data.ssn_country_code)
                }


//                binding.phone.editText?.setText(viewState.data.phone)
//                binding.phone2.editText?.setText(viewState.data.phone2)


                ArrayAdapter.createFromResource(
                    requireContext(), R.array.genders, android.R.layout.simple_spinner_item
                ).also { adapter ->
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                    binding.genderSpinner.adapter = adapter
                }

                when (viewState.data.gender)
                {
                    Male -> binding.genderSpinner.setSelection(0)
                    Female -> binding.genderSpinner.setSelection(1)
                    else ->
                    {
                    }
                }

                // Birthdate
                binding.birthDate.editText?.setText( viewState.data.birthDate)
//                viewState.data.birthDate?.toLocalDateTime(Companion.UTC)?.let {
//                    binding.birthDate.editText?.setText(
//                        "%02d.%02d.%d".format(it.dayOfMonth, it.month.value, it.year)
//                    )
//                }

                // Donor
                ArrayAdapter.createFromResource(
                    requireContext(), R.array.yes_no, android.R.layout.simple_spinner_item
                ).also { adapter ->
                    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                    binding.donorSpinner.adapter = adapter
                }
                when (viewState.data.organDonation)
                {
                    false -> binding.donorSpinner.setSelection(0)
                    true -> binding.donorSpinner.setSelection(1)
                    else ->
                    {
                    }
                }

                binding.cprNumber.editText?.setText(viewState.data.ssn) // Address
                viewState.data.postalAddress?.getOrNull(0)?.let {
                    binding.postalCode.editText?.setText(it.postalCode)
                    binding.city.editText?.setText(it.city)
                    binding.street.editText?.setText(it.info)


                    it.country?.countryCodeToName()?.let { countryName ->
                        binding.country.editText?.setText(countryName)
                    }
                }

//                // Insurance
//                ArrayAdapter.createFromResource(
//                    requireContext(), R.array.insurance, android.R.layout.simple_spinner_item
//                ).also { adapter ->
//                    adapter.setDropDownViewResource(
//                        android.R.layout.simple_spinner_dropdown_item
//                    )
//                    binding.insuranceSpinner.adapter = adapter
//                }


                //TODO INSURANCE FIX
//                viewState.data.insurance?.let {
//                    binding.insuranceCompany.editText?.setText(it.company)
//                    binding.insurancePolicy.editText?.setText(it.policy)
//                    binding.insurancePhone.editText?.setText(it.phone)
//
//                    when (viewState.data.insurance.type)
//                    {
//                        Travel -> binding.insuranceSpinner.setSelection(0)
//                        Health -> binding.insuranceSpinner.setSelection(1)
//                        else ->
//                        {
//                        }
//                    }
//                }



                viewState.data.emergencyContact?.let {emergencyContactsAdapter.setItems(it)  }
                viewState.data.insurances?.let {insuranceAdapter.setItems(it)  }

            }

            is StateError ->
            {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun handleUpdateProfileAction(viewState: ViewState<Unit>)
    {
        binding.loading.isVisible = viewState is Loading
        when (viewState)
        {
            is Loading ->
            { // no op
            }

            is Success ->
            {
                findNavController().popBackStack()
            }

            is StateError ->
            {
                Timber.e(viewState.errorMessage)
                if (viewState.errorCode == 400)
                {
                    val errorBody = viewState.errorMessage?.substringAfter("Body: ")
                    errorBody?.let {
                        val validation = Json {
                            explicitNulls = false
                            ignoreUnknownKeys = true
                        }.decodeFromString(ValidationDtoModel.serializer(), it)
                        val errorMessage = getString(R.string.field_required_title)
                        with(validation.validationResult) {
                            this?.firstName?.let {
                                binding.firstName.error = errorMessage
                            }
                            this?.lastName?.let {
                                binding.lastName.error = errorMessage
                            }
                            this?.phone?.let {
                                binding.phone.error = errorMessage
                            }
                            this?.birthDate?.let {
                                binding.birthDate.error = errorMessage
                            }
                            this?.nationality?.let {
                                binding.nationality.error = errorMessage
                            }
                        }
                    }
                } else
                {
                    showErrorMessage(getString(R.string.error_message))
                }
            }
        }
    }


    private fun getBirthdayInstant(): Long?
    {
        kotlin.runCatching {
            return SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH).parse(binding.birthDate.text())?.time
        }
        return null
    }
    private fun getBirthdayString(): String?
    {
        return binding.birthDate.text()
    }

    private fun getSelectedGender(): Gender?
    {
        val position = binding.genderSpinner.selectedItemPosition
        return if (position == INVALID_POSITION)
        {
            null
        } else
        {
            Gender.values()[position]
        }
    }

    private fun getOrganDonation(): Boolean
    {
        return when (binding.donorSpinner.selectedItemPosition)
        {
            0 -> false
            1 -> true
            else -> false
        }
    }

    private fun getPostalAddress(): List<PostalAddress>?
    {
        return if (binding.postalCode.editText?.text.toStringOrNull()
                .isNullOrBlank() && binding.city.editText?.text.toStringOrNull()
                .isNullOrBlank() && binding.country.editText?.text.toStringOrNull()
                .isNullOrBlank() && binding.street.editText?.text.toStringOrNull().isNullOrBlank()
        )
        {
            null
        } else
        {
            listOf(PostalAddress(
                info = binding.street.editText?.text.toStringOrNull(), city = binding.city.editText?.text.toStringOrNull(), country = (binding.country.editText?.tag as? Locale)?.country
                    ?: binding.country.editText?.text?.toStringOrNull()
                        ?.countryNameToCode(), postalCode = binding.postalCode.editText?.text.toStringOrNull()
            ))
        }
    }



    private fun getBirthdaySelected(): Long
    {
        return getBirthdayInstant() ?: now().minus(18L * 365, ChronoUnit.DAYS).toEpochMilli()
    }

    private fun clearErrorAfterInput()
    {

        binding.firstName.editText?.doAfterTextChanged {
            binding.firstName.error = null
        }
        binding.lastName.editText?.doAfterTextChanged {
            binding.lastName.error = null
        }
        binding.birthDate.editText?.doAfterTextChanged {
            binding.birthDate.error = null
        }
        binding.phone.editText?.doAfterTextChanged {
            binding.phone.error = null
        }
        binding.nationality.editText?.doAfterTextChanged {
            binding.nationality.error = null
        }
    }
}
