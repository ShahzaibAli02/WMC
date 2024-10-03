package no.wmc.ui.common_adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.recyclerview.widget.RecyclerView
import com.hbb20.CountryCodePicker
import me.ibrahimsn.lib.PhoneNumberKit
import no.wmc.R
import no.wmc.databinding.ItemAddBinding
import no.wmc.databinding.ItemInsuranceBinding
import no.wmc.domain.model.Profile
import no.wmc.utils.Utility


class InsuranceAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{

    private val _items: MutableList<Profile.Insurance> = mutableListOf(Profile.Insurance())

    val items: List<Profile.Insurance>
        get() = _items

    companion object
    {
        const val VIEW_TYPE_INSURANCE = 0
        const val VIEW_TYPE_ADD = 1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
    {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType)
        {
            VIEW_TYPE_INSURANCE ->
            {
                val binding = ItemInsuranceBinding.inflate(inflater, parent, false)
                InsuranceViewHolder(binding)
            }

            VIEW_TYPE_ADD ->
            {
                val binding = ItemAddBinding.inflate(inflater, parent, false)
                AddViewHolder(binding)
            }

            else -> throw IllegalArgumentException("Invalid view type")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int)
    {
        when (holder)
        {
            is InsuranceViewHolder -> holder.bind(_items[position], position)
            is AddViewHolder -> holder.bind()
        }
    }

    override fun getItemCount(): Int = _items.size + 1 // Add one for the "Add" item

    override fun getItemViewType(position: Int): Int
    {
        return if (position < _items.size)
        {
            VIEW_TYPE_INSURANCE
        } else
        {
            VIEW_TYPE_ADD
        }
    }

    fun setItems(insuranceList: List<Profile.Insurance>)
    {
        _items.clear()
        _items.addAll(insuranceList)
        notifyDataSetChanged()
    }

//    fun updateInsurance(index: Int, updatedInsurance: Profile.Insurance)
//    {
//        if (index in 0 until _items.size)
//        {
//            _items[index] = updatedInsurance
//            notifyItemChanged(index)
//        }
//    }

    fun isValid(): Boolean
    {
        return true
        //val isEnable = !typeOfInsurance.isEmpty() && !insuranceCompany.isEmpty() && !policyNumber.isEmpty() && !emergencyContacts.isEmpty() && emergencyContactPicker.isValid
    }

    inner class InsuranceViewHolder(private val binding: ItemInsuranceBinding) :
        RecyclerView.ViewHolder(binding.root)
    {
        var ccpCountry: CountryCodePicker = CountryCodePicker(binding.root.context!!)
        private var emergencyContactPicker: PhoneNumberKit = PhoneNumberKit.Builder(binding.root.context!!)
            .setIconEnabled(true).build()

        fun bind(insurance: Profile.Insurance, position: Int)
        {
            binding.apply {


                emergencyContactPicker.parsePhoneNumber(insurance.phone, null)?.countryCode?.let {
                    ccpCountry.setCountryForPhoneCode(it)
                    emergencyContactPicker.attachToInput(binding.emergencyContacts, ccpCountry.selectedCountryNameCode)
                }?: kotlin.run {
                    emergencyContactPicker.attachToInput(binding.emergencyContacts, Utility.getISOCountryCode(binding.root.context))
                }
                emergencyContactPicker.setupCountryPicker(activity = binding.root.context as AppCompatActivity, searchEnabled = true)


                binding.imageClose.visibility = if (position == 0) View.GONE else View.VISIBLE

                binding.imageClose.setOnClickListener {
                    _items.removeAt(absoluteAdapterPosition)
                    notifyDataSetChanged()
                }
                binding.typeOfInsurance.editText?.setText(insurance.type?.displayName)
                binding.insuranceCompany.editText?.setText(insurance.company)
                val adapter = NoFilterArrayAdapter(binding.root.context, android.R.layout.simple_dropdown_item_1line, binding.root.context.resources.getStringArray(R.array.array_insurance_type))
                (  binding.typeOfInsurance.editText as AutoCompleteTextView).setAdapter(adapter)
                binding.policyNumber.editText?.setText(insurance.policy)
                binding.emergencyContacts.editText?.setText(insurance.phone)


                // Update the data when text fields are changed
                typeOfInsurance.editText!!.doAfterTextChanged {
                    val type = Profile.Insurance.InsuranceType.values().find {
                        it.displayName == it.toString()
                    }
                    insurance.type=type
//                    updateInsurance(position, insurance.copy(type = type))
                }

                insuranceCompany.editText!!.doAfterTextChanged {
                    insurance.company=it.toString()
//                    updateInsurance(position, insurance.copy(company = it.toString()))
                }


                binding.emergencyContacts.editText?.doAfterTextChanged {

                    if(it.toString().contains("-"))
                    {
                        binding.emergencyContacts.editText?.setText(insurance.phone?.replace("-","")?.replace(" ",""))
                    }
                    else
                    {
                        insurance.phone = it.toString()
                    }
                }
                policyNumber.editText!!.doAfterTextChanged {
                    insurance.policy = it.toString() //                    updateInsurance(position, insurance.copy(policy = it.toString()))
                    //                }

                }
            }
        }
    }

    inner class AddViewHolder(private val binding: ItemAddBinding) :
        RecyclerView.ViewHolder(binding.root)
    {
        init
        {
            binding.favAdd.setOnClickListener { // Handle the click event for the "Add" item
                _items.add(Profile.Insurance())
                notifyItemInserted(_items.size - 1);
            }
        }

        fun bind()
        { // You can customize the "Add" item view if needed
        }
    }
}

