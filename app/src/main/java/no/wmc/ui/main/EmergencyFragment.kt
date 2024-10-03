package no.wmc.ui.main

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.FrameLayout
import androidx.core.widget.doAfterTextChanged
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.google.firebase.firestore.QuerySnapshot
import com.google.gson.Gson
import kotlinx.coroutines.launch
import no.wmc.R
import no.wmc.data.local.manager.LocalDataManager
import no.wmc.databinding.FragmentEmergencyBinding
import no.wmc.firebase.helper.FireStoreHelper
import no.wmc.firebase.interfaces.FireStoreGetUserAllergiesInterface
import no.wmc.firebase.interfaces.FireStoreGetUserDiagnosesInterface
import no.wmc.firebase.interfaces.FireStoreGetUserMedicineInterface
import no.wmc.firebase.interfaces.FireStoreGetUserVaccinesInterface
import no.wmc.firebase.model.AllCategoryModel
import no.wmc.ui.main.home.list.AllergiesUserListAdapter
import no.wmc.ui.main.home.list.DiagnosesUserListAdapter
import no.wmc.ui.main.home.list.MedicineUserListAdapter
import no.wmc.ui.main.home.list.VaccinesUserListAdapter
import no.wmc.utils.Utility
import no.wmc.utils.ext.text
import org.koin.android.ext.android.inject


data class EmergencyProfile(
    var firstName: String?="",
    var lastName: String?="",
    val avatar: String? = null,)
{
    constructor():this(null,null,null)
}
class EmergencyFragment : Fragment()
{


    private val localDataManager: LocalDataManager by inject()

    private lateinit var binding: FragmentEmergencyBinding
    lateinit var diagnosesAdapter: DiagnosesUserListAdapter
    lateinit var medicineAdapter: MedicineUserListAdapter
    lateinit var allergiesAdapter: AllergiesUserListAdapter
    lateinit var vaccinesAdapter: VaccinesUserListAdapter
    private var userDiagnosesList = ArrayList<AllCategoryModel>()
    private var userMedicineList = ArrayList<AllCategoryModel>()
    private var userAllergiesList = ArrayList<AllCategoryModel>()
    private var userVaccinesList = ArrayList<AllCategoryModel>()
    private var selectCategoryAllList = ArrayList<AllCategoryModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View
    {

        binding = FragmentEmergencyBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

        binding.medicines.rvDiagnosesList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        diagnosesAdapter = DiagnosesUserListAdapter(requireContext(), userDiagnosesList)
        binding.medicines.rvDiagnosesList.adapter = diagnosesAdapter

        binding.medicines.rvMedicineList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        medicineAdapter = MedicineUserListAdapter(requireContext(), userMedicineList)
        binding.medicines.rvMedicineList.adapter = medicineAdapter

        binding.medicines.rvAllergiesList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        allergiesAdapter = AllergiesUserListAdapter(requireContext(), userAllergiesList)
        binding.medicines.rvAllergiesList.adapter = allergiesAdapter

        binding.medicines.rvVaccinesList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        vaccinesAdapter = VaccinesUserListAdapter(requireContext(), userVaccinesList)
        binding.medicines.rvVaccinesList.adapter = vaccinesAdapter


        binding.etUserId.editText?.doAfterTextChanged {
            binding.btnSearch.isEnabled=it.toString().isBlank().not()
        }

        binding.medicines.expandableCardDiagnoses.setOnClickListener {

            if (binding.medicines.infoLayoutDiagnoses.visibility == View.VISIBLE)
            {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
                { //                    TransitionManager.beginDelayedTransition(binding.expandableCardDiagnoses, AutoTransition())
                }
                binding.medicines.infoLayoutDiagnoses.visibility = View.GONE

            } else
            {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
                { //                    TransitionManager.beginDelayedTransition(binding.expandableCardDiagnoses, AutoTransition())
                }
                binding.medicines.infoLayoutDiagnoses.visibility = View.VISIBLE //                arrow.setImageResource(R.drawable.ic_baseline_expand_less_24)
            }
        }



        binding.medicines.expandableCardMedicine.setOnClickListener {

            if (binding.medicines.infoLayoutMedicine.visibility == View.VISIBLE)
            {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
                { //                    TransitionManager.beginDelayedTransition(binding.expandableCardDiagnoses, AutoTransition())
                }
                binding.medicines.infoLayoutMedicine.visibility = View.GONE

            } else
            {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
                { //                    TransitionManager.beginDelayedTransition(binding.expandableCardDiagnoses, AutoTransition())
                }
                binding.medicines.infoLayoutMedicine.visibility = View.VISIBLE //                arrow.setImageResource(R.drawable.ic_baseline_expand_less_24)
            }
        }

        binding.medicines.expandableCardAllergies.setOnClickListener {

            if (binding.medicines.infoLayoutAllergies.visibility == View.VISIBLE)
            {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
                { //                    TransitionManager.beginDelayedTransition(binding.expandableCardDiagnoses, AutoTransition())
                }
                binding.medicines.infoLayoutAllergies.visibility = View.GONE

            } else
            {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
                { //                    TransitionManager.beginDelayedTransition(binding.expandableCardDiagnoses, AutoTransition())
                }
                binding.medicines.infoLayoutAllergies.visibility = View.VISIBLE //                arrow.setImageResource(R.drawable.ic_baseline_expand_less_24)
            }
        }

        binding.medicines.expandableCardVaccines.setOnClickListener {

            if (binding.medicines.infoLayoutVaccines.visibility == View.VISIBLE)
            {

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
                { //                    TransitionManager.beginDelayedTransition(binding.expandableCardDiagnoses, AutoTransition())
                }
                binding.medicines.infoLayoutVaccines.visibility = View.GONE

            } else
            {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT)
                { //                    TransitionManager.beginDelayedTransition(binding.expandableCardDiagnoses, AutoTransition())
                }
                binding.medicines.infoLayoutVaccines.visibility = View.VISIBLE //                arrow.setImageResource(R.drawable.ic_baseline_expand_less_24)
            }
        }

        binding.btnSearch.setOnClickListener {

            hideKeyboard(binding.etUserId.editText!!)

            loadUserInfo()
        }
        hideUnneccassaryElements()
    }
//    suspend fun getUserInfo(): Profile?
//    {
//
//        FirebaseHe
//
//    }
    fun hideKeyboard(view: View) {
        val inputMethodManager =
            view.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }
    private fun hideUnneccassaryElements()
    {
        binding.medicines.apply {
            cardActionDiagnosesLayout.visibility=View.GONE
            cardActionLayoutMedicine.visibility=View.GONE
            cardActionAllergiesLayout.visibility=View.GONE
            cardActionLayoutVaccines.visibility=View.GONE
            expandableCardDocuments.visibility=View.GONE
            binding.userInfo.visibility=View.GONE
            parent.visibility=View.GONE
            binding.extraEmergencyInfo.visibility=View.VISIBLE
        }
    }

    private fun loadUserInfo()
    {

        lifecycleScope.launch {
            binding.btnSearch.isEnabled=false
            val id=FireStoreHelper().getUserFromId(getUserId())
            if(id==null)
            {
                binding.txtShowingResultsFor.text="User id not found"
                hideUnneccassaryElements()
                changeGravity(Gravity.CENTER)
            }
            else
            {
               loadData(id)
            }
            binding.btnSearch.isEnabled=true
        }


    }

    private fun loadData(id: EmergencyProfile)
    {

        showUserProfile(id)
        binding.txtShowingResultsFor.text = "Showing results for : ${getUserId()}"
        getUserDiagnoses()
        getUserMedicine()
        getUserAllergies()
        getUserVaccines()
        binding.medicines.parent.visibility=View.VISIBLE
        binding.userInfo.visibility=View.VISIBLE
        binding.extraEmergencyInfo.visibility=View.GONE
        changeGravity(Gravity.TOP)
    }

    private fun changeGravity(gravity: Int)
    {
        val layoutParams = binding.mainLyt.layoutParams as FrameLayout.LayoutParams
        layoutParams.gravity =gravity
        binding.mainLyt.layoutParams = layoutParams
    }

    private fun showUserProfile(id: EmergencyProfile)
    {

        if(id.avatar!=null && id.avatar.isBlank().not())
        {
            Glide.with(this).load(id.avatar)
                .placeholder(R.drawable.loading).error(R.drawable.avatar_placeholder)
                .into(binding.imageUser)
        }
        if(id.firstName==null)
        {
            binding.userInfo.visibility=View.GONE
            return
        }

        binding.memberName.text = "${id.firstName} ${id.lastName.ifNull { "" }}"
    }

    private fun getUserVaccines()
    {
        getUserId().let {

            binding.medicines.vaccinesLoading.visibility = View.VISIBLE
            userVaccinesList.clear()
            FireStoreHelper().getUserVaccines(getUserId()!!, object :
                FireStoreGetUserVaccinesInterface
            {
                override fun onSuccess(vaccinesUserListData: QuerySnapshot)
                {

                    binding.medicines.vaccinesLoading.visibility = View.GONE
                    userVaccinesList.clear()
                    var vaccines = ""
                    for (document in vaccinesUserListData)
                    {
                        val jsonData = Utility.convertToJson(document.data)
                        val gsn = Gson()
                        val categoryModel: AllCategoryModel = gsn.fromJson<AllCategoryModel>(
                            jsonData.toString(), AllCategoryModel::class.java
                        )

                        if (categoryModel != null)
                        {
                            if (categoryModel.userIds?.contains(getUserId()) == true)
                            {
                                vaccines = vaccines + "\n -> " + categoryModel.description
                                userVaccinesList.add(categoryModel)
                            }
                        }
                    }

                    vaccinesAdapter.notifyDataSetChanged()
                    binding.medicines.descriptionVaccines.text = "${userVaccinesList.size} items"

                }

                override fun onError(error: String)
                {
                    binding.medicines.vaccinesLoading.visibility = View.GONE
                }

            })
        }
    }

    private fun getUserDiagnoses()
    {
        getUserId().let {
            binding.medicines.diagnosesLoading.visibility = View.VISIBLE
            userDiagnosesList.clear()


            FireStoreHelper().getUserDiagnoses(getUserId()!!, object :
                FireStoreGetUserDiagnosesInterface
            {
                override fun onSuccess(diagnosesUserListData: QuerySnapshot)
                {
                    binding.medicines.diagnosesLoading.visibility = View.GONE
                    userDiagnosesList.clear()
                    var diagnoses = ""
                    for (document in diagnosesUserListData)
                    {
                        val jsonData = Utility.convertToJson(document.data)
                        val gsn = Gson()
                        val diagnosesModel: AllCategoryModel = gsn.fromJson<AllCategoryModel>(
                            jsonData.toString(), AllCategoryModel::class.java
                        )

                        if (diagnosesModel != null)
                        {

                            diagnoses = diagnoses + "\n -> " + diagnosesModel.description
                            userDiagnosesList.add(diagnosesModel)
                        }
                    }


                    diagnosesAdapter.notifyDataSetChanged()
                    binding.medicines.descriptionDiagnoses.text = "${userDiagnosesList.size} items"
                }

                override fun onError(error: String)
                {
                    binding.medicines.diagnosesLoading.visibility = View.GONE

                }

            })
        }
    }

    private fun getUserMedicine()
    {
        getUserId()?.let {
            binding.medicines.medicineLoading.visibility = View.VISIBLE
            userMedicineList.clear()

            FireStoreHelper().getUserMedicine(getUserId()!!, object :
                FireStoreGetUserMedicineInterface
            {
                override fun onSuccess(medicineUserListData: QuerySnapshot)
                {
                    binding.medicines.medicineLoading.visibility = View.GONE
                    userMedicineList.clear()

                    var medicine = ""
                    for (document in medicineUserListData)
                    {
                        val jsonData = Utility.convertToJson(document.data)
                        val gsn = Gson()
                        val categoryModel: AllCategoryModel = gsn.fromJson<AllCategoryModel>(
                            jsonData.toString(), AllCategoryModel::class.java
                        )

                        if (categoryModel != null)
                        {
                            if (categoryModel.userIds?.contains(getUserId()) == true)
                            {
                                medicine = medicine + "\n -> " + categoryModel.description
                                userMedicineList.add(categoryModel)
                            }
                        }
                    }

                    medicineAdapter.notifyDataSetChanged()
                    binding.medicines.descriptionMedicine.text = "${userMedicineList.size}  items"


                }

                override fun onError(error: String)
                {
                    binding.medicines.medicineLoading.visibility = View.GONE


                }

            })
        }
    }

    private fun getUserAllergies()
    {
        getUserId()?.let {
            binding.medicines.allergiesLoading.visibility = View.VISIBLE
            userAllergiesList.clear()

            FireStoreHelper().getUserAllergies(getUserId()!!, object :
                FireStoreGetUserAllergiesInterface
            {
                override fun onSuccess(allergiesUserListData: QuerySnapshot)
                {
                    binding.medicines.allergiesLoading.visibility = View.GONE
                    userAllergiesList.clear()

                    var allergies = ""
                    for (document in allergiesUserListData)
                    {
                        val jsonData = Utility.convertToJson(document.data)
                        val gsn = Gson()
                        val categoryModel: AllCategoryModel = gsn.fromJson<AllCategoryModel>(
                            jsonData.toString(), AllCategoryModel::class.java
                        )

                        if (categoryModel != null)
                        {
                            if (categoryModel.userIds?.contains(getUserId()) == true)
                            {
                                allergies = allergies + "\n -> " + categoryModel.description
                                userAllergiesList.add(categoryModel)
                            }
                        }
                    }

                    allergiesAdapter.notifyDataSetChanged()
                    binding.medicines.descriptionAllergies.text = "${userAllergiesList.size} items"

                }

                override fun onError(error: String)
                {
                    binding.medicines.allergiesLoading.visibility = View.GONE
                }

            })
        }
    }

    fun getUserId(): String
    {

        return binding.etUserId.text()
    }
}

private fun String?.ifNull(function: () -> String): String
{
    return this ?: function()

}
