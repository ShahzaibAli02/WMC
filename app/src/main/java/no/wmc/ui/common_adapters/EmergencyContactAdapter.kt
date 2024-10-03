package no.wmc.ui.common_adapters

import android.content.Intent
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.recyclerview.widget.RecyclerView
import com.hbb20.CCPCountry
import com.hbb20.CountryCodePicker
import me.ibrahimsn.lib.PhoneNumberKit
import no.wmc.R
import no.wmc.databinding.ItemAddBinding
import no.wmc.databinding.ItemEmergencyContactBinding
import no.wmc.domain.model.Profile
import no.wmc.utils.Utility


class EmergencyContactAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{

    private val _items: MutableList<Profile.EmergencyContact> = mutableListOf(Profile.EmergencyContact())

    val items: List<Profile.EmergencyContact>
        get() = _items

    companion object
    {
        const val VIEW_TYPE_EMERGENCY_CONTACT = 0
        const val VIEW_TYPE_ADD = 1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder
    {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType)
        {
            VIEW_TYPE_EMERGENCY_CONTACT ->
            {
                val binding = ItemEmergencyContactBinding.inflate(inflater, parent, false)
                EmergencyContactViewHolder(binding)
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
            is EmergencyContactViewHolder -> holder.bind(_items[position], position)
            is AddViewHolder -> holder.bind()
        }
    }

    override fun getItemCount(): Int = _items.size + 1 // Add one for the "Add" item

    override fun getItemViewType(position: Int): Int
    {
        return if (position < _items.size)
        {
            VIEW_TYPE_EMERGENCY_CONTACT
        } else
        {
            VIEW_TYPE_ADD
        }
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
        return true //val isEnable = !typeOfInsurance.isEmpty() && !insuranceCompany.isEmpty() && !policyNumber.isEmpty() && !emergencyContacts.isEmpty() && emergencyContactPicker.isValid
    }

    fun setItems(insuranceList: List<Profile.EmergencyContact>)
    {
        _items.clear()
        _items.addAll(insuranceList)
        notifyDataSetChanged()
    }

    private var callButtonEnabled = false
    fun enableCallButton(): EmergencyContactAdapter
    {
        callButtonEnabled = true
        notifyDataSetChanged()
        return this
    }

    inner class EmergencyContactViewHolder(private val binding: ItemEmergencyContactBinding) :
        RecyclerView.ViewHolder(binding.root)
    {
        var ccpCountry: CountryCodePicker = CountryCodePicker(binding.root.context!!)
        private var emergencyContactPicker: PhoneNumberKit = PhoneNumberKit.Builder(binding.root.context!!)
            .setIconEnabled(true).build()

        init
        {


        }

        fun bind(emergencyContact: Profile.EmergencyContact, position: Int)
        {
            binding.apply {


                emergencyContactPicker.parsePhoneNumber(emergencyContact.phone, null)?.countryCode?.let {
                    ccpCountry.setCountryForPhoneCode(it)
                    emergencyContactPicker.attachToInput(binding.emergencyContactPhone, ccpCountry.selectedCountryNameCode)
                }?: kotlin.run {
                    emergencyContactPicker.attachToInput(binding.emergencyContactPhone, Utility.getISOCountryCode(binding.root.context))
                }
                emergencyContactPicker.setupCountryPicker(activity = binding.root.context as AppCompatActivity, searchEnabled = true)

                binding.imageClose.visibility = if (position == 0) View.GONE else View.VISIBLE

                binding.imageClose.setOnClickListener {
                    _items.removeAt(absoluteAdapterPosition) //notifyItemRemoved(absoluteAdapterPosition)
                    notifyDataSetChanged()
                }
                emergencyContactName.editText?.setText(emergencyContact.name)
                emergencyContactPhone.editText?.setText(emergencyContact.phone)

                val adapter = NoFilterArrayAdapter(binding.root.context, android.R.layout.simple_dropdown_item_1line, binding.root.context.resources.getStringArray(R.array.array_relationship_2))
                (emergencyContactRelationship.editText as AutoCompleteTextView).setAdapter(adapter)
                emergencyContactRelationship.editText?.setText(emergencyContact.relationship)
                btnCall.setOnClickListener {
                    kotlin.runCatching {
                        val phoneNumber = "tel:" + emergencyContact.phone
                        val dialIntent = Intent(Intent.ACTION_DIAL, Uri.parse(phoneNumber))
                        binding.root.context.startActivity(dialIntent)
                    }
                }
                btnCall.visibility = if (callButtonEnabled) View.VISIBLE else View.GONE


                emergencyContactName.editText!!.doAfterTextChanged {
                    emergencyContact.name = it.toString()
                }

                emergencyContactPhone.editText?.doAfterTextChanged {

                    if (it.toString().contains("-"))
                    {
                        emergencyContactPhone.editText?.setText(
                            emergencyContact.phone?.replace("-", "")?.replace(" ", "")
                        )

                        //       emergencyContactPhone.editText?.requestFocus(View.FOCUS_DOWN)
                    } else emergencyContact.phone = it.toString()
                }
                emergencyContactRelationship.editText!!.doAfterTextChanged {
                    emergencyContact.relationship = it.toString()
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
                _items.add(Profile.EmergencyContact())
                notifyItemInserted(_items.size - 1);
            }
        }

        fun bind()
        { // You can customize the "Add" item view if needed
        }
    }
}

