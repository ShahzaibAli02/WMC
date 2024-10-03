package no.wmc.ui.main.home

import android.content.Intent
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.WindowManager
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.QuerySnapshot
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import no.wmc.R
import no.wmc.data.local.manager.LocalDataManager
import no.wmc.data.local.manager.SharedPrefManager
import no.wmc.databinding.AddNewCategoryBottomsheetBinding
import no.wmc.databinding.HomeNewScreenBinding
import no.wmc.domain.enums.MIMEEnum
import no.wmc.domain.model.Document
import no.wmc.domain.model.DocumentList
import no.wmc.domain.model.Profile
import no.wmc.firebase.helper.FireStoreHelper
import no.wmc.firebase.interfaces.FireStoreGetAllDiagnosesInterface
import no.wmc.firebase.interfaces.FireStoreGetUserAllergiesInterface
import no.wmc.firebase.interfaces.FireStoreGetUserDiagnosesInterface
import no.wmc.firebase.interfaces.FireStoreGetUserInterface
import no.wmc.firebase.interfaces.FireStoreGetUserMedicineInterface
import no.wmc.firebase.interfaces.FireStoreGetUserVaccinesInterface
import no.wmc.firebase.model.AllCategoryModel
import no.wmc.ui.base.BaseViewStateFragment
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState
import no.wmc.ui.main.home.list.AddNewCategoryAdapter
import no.wmc.ui.main.home.list.AllergiesUserListAdapter
import no.wmc.ui.main.home.list.DiagnosesUserListAdapter
import no.wmc.ui.main.home.list.DocumentListAdapter
import no.wmc.ui.main.home.list.MedicineUserListAdapter
import no.wmc.ui.main.home.list.VaccinesUserListAdapter
import no.wmc.utils.Utility
import no.wmc.utils.ext.safeNavigate
import no.wmc.utils.ext.setBackAction
import no.wmc.utils.ext.showToast
import org.koin.android.ext.android.inject
import timber.log.Timber
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.File
import java.io.FileReader
import java.io.FileWriter


class HomeNewFragment : BaseViewStateFragment<HomeNewScreenBinding, HomeViewModel>(
    R.layout.home_new_screen, HomeViewModel::class
)
{
    private val TAG = "HomeNewFragment"
    private val sharedPrefManage: SharedPrefManager by inject()
    lateinit var diagnosesAdapter: DiagnosesUserListAdapter
    lateinit var medicineAdapter: MedicineUserListAdapter
    lateinit var allergiesAdapter: AllergiesUserListAdapter
    lateinit var vaccinesAdapter: VaccinesUserListAdapter
    private var userDiagnosesList = ArrayList<AllCategoryModel>()
    private var userMedicineList = ArrayList<AllCategoryModel>()
    private var userAllergiesList = ArrayList<AllCategoryModel>()
    private var userVaccinesList = ArrayList<AllCategoryModel>()
    private var bottomMedicineList = ArrayList<AllCategoryModel>()
    lateinit var addNewCategoryBottomSheet: BottomSheetDialog
    private val localDataManager: LocalDataManager by inject()
    private val currentBackStackEntry by lazy { findNavController().currentBackStackEntry }

    private val documentAdapter = DocumentListAdapter(emptyStateString = R.string.no_documents_added, onItemClicked = {
        Utility.openLink(requireContext(), it.url)

    }, onMoreClicked = { //            selectedDocument = it
        //            findNavController().navigate(
        //                HomeFragmentDirections.showEditCardBottomDialog(ProfileItemEnum.DOCUMENT)
        //            )
    })

    private fun requestDocuments()
    {
        sendViewEvent(HomeViewEvent.GetDocumentsViewEvent)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

        Log.d(TAG, "onViewCreated: ")

        // Attachment recycleView
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

        binding.medicines.rvDocumentsList.adapter = documentAdapter
        initView()
        onCoroutine { getUser() }
        getUserDiagnoses()
        getUserMedicine()
        getUserAllergies()
        getUserVaccines()
        requestDocuments()
        swipeToRemove()
        setBackAction(viewLifecycleOwner, requireActivity()::finish)
        arguments?.let {
            if (it.getBoolean("view_doc", false))
            {

                binding.medicines.infoLayoutDocuments.visibility = View.VISIBLE
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q)
                {
                    binding.medicines.scrollView.scrollToDescendant(binding.medicines.expandableCardDocuments)
                }
            }
        }
    }


    fun pickImage()
    {
        pickImage.launch("image/*")
    }

    //    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
    //    {
    //        super.onActivityResult(requestCode, resultCode, data)
    //        if (resultCode == Activity.RESULT_OK)
    //        {
    //            val uri: Uri = data?.data!!
    //            binding.medicines.topBar.imageUser.setImageURI(uri)
    //        } else if (resultCode == ImagePicker.RESULT_ERROR)
    //        {
    //            Toast.makeText(requireContext(), ImagePicker.getError(data), Toast.LENGTH_SHORT).show()
    //        }
    //    }

    override fun handleViewAction(viewAction: ViewAction)
    {
        super.handleViewAction(viewAction)
        when (viewAction)
        {
            is HomeViewAction.GetDocumentsViewAction -> handleGetDocumentAction(viewAction.viewState)
        }
    }

    private fun handleGetDocumentAction(viewState: ViewState<List<DocumentList.DocumentGroup>>)
    {
        when (viewState)
        {
            is ViewState.Loading ->
            {
                binding.medicines.documentLoading.visibility = View.VISIBLE
            }

            is ViewState.Success ->
            {
                binding.medicines.descriptionDocuments.text = "${viewState.data?.size} Items"
                binding.medicines.documentLoading.visibility = View.GONE
                documentAdapter.updateList(viewState.data)
            }

            is ViewState.StateError ->
            {
                binding.medicines.documentLoading.visibility = View.GONE
                showErrorMessage(viewState.errorMessage)
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun onCoroutine(function: suspend () -> Unit)
    {
        lifecycleScope.launch {
            function()
        }
    }

    private val pickImage = registerForActivityResult(ActivityResultContracts.GetContent()) { uri: Uri? ->
        if (uri != null)
        {
            binding.topBar.imageUser.setImageResource(R.drawable.loading)
            viewModel.updateImage(uri) {
                if (it)
                {
                    binding.topBar.imageUser.setImageURI(uri)
                    onCoroutine { getUser() }
                }
            }

        }
    }

    suspend fun getUser()
    {

        localDataManager.getCredentials()?.id?.let {
            FireStoreHelper().getUser(it, object : FireStoreGetUserInterface
            {

                override fun onSuccess(chatsData: DocumentSnapshot)
                {

                    val jsonData = Utility.convertToJson(chatsData.data)
                    val gsn = Gson()
                    val requireModel: Profile = gsn.fromJson(
                        jsonData.toString(), Profile::class.java
                    )
                    lifecycleScope.launch { sharedPrefManage.putString("user_date", jsonData) }
                    if (requireModel.avatar?.isEmpty() == false)
                    {
                        Glide.with(this@HomeNewFragment).load(requireModel.avatar)
                            .placeholder(R.drawable.loading).error(R.drawable.avatar_placeholder)
                            .into(binding.topBar.imageUser)
                    }

                    binding.topBar.memberName.text = requireModel.firstName + " " + requireModel.lastName
                    binding.topBar.memberSinceDate.text = "Member Since ${
                        requireModel.memberSince?.split("-")?.getOrNull(0)
                    }"
                }

                override fun onError(error: String)
                {
                    Toast.makeText(requireContext(), "ERROR : ${error}", Toast.LENGTH_SHORT).show()
                }
            })
        }
    }

    private fun initView()
    {
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

        binding.medicines.expandableCardDocuments.setOnClickListener {

            if (binding.medicines.infoLayoutDocuments.visibility == View.VISIBLE)
            {
                binding.medicines.infoLayoutDocuments.visibility = View.GONE

            } else
            {
                binding.medicines.infoLayoutDocuments.visibility = View.VISIBLE
            }
        }

        binding.medicines.addButtonDiagnoses.setOnClickListener {
            addNewBottomSheet("diagnoses")
        }

        binding.medicines.addButtonMedicine.setOnClickListener {
            addNewBottomSheet("medicine")
        }

        binding.medicines.addButtonAllergies.setOnClickListener {
            addNewBottomSheet("allergies")
        }

        binding.medicines.addButtonVaccines.setOnClickListener {
            addNewBottomSheet("vaccines")
        }
        binding.topBar.imageUser.setOnClickListener {
            pickImage()
        }
        binding.medicines.addButtonDocuments.setOnClickListener {
            val intent = Intent(Intent.ACTION_OPEN_DOCUMENT)
            intent.addCategory(Intent.CATEGORY_OPENABLE)
            val supportedMIMEType = arrayOf(
                MIMEEnum.PDF.type, MIMEEnum.JPEG.type, MIMEEnum.PNG.type, MIMEEnum.DOC.type, MIMEEnum.DOCX.type
            )
            intent.type = "*/*"
            intent.putExtra(Intent.EXTRA_MIME_TYPES, supportedMIMEType)
            documentFilePicker.launch(intent)
        }






        binding.medicines.shareButtonDiagnoses.setOnClickListener {
            shareUserDate("Diagnoses", "diagnoses")
        }

        binding.medicines.shareButtonMedicine.setOnClickListener {
            shareUserDate("Medicines", "medicine")
        }
        binding.medicines.shareButtonAllergies.setOnClickListener {
            shareUserDate("Allergies", "allergies")
        }

        binding.medicines.shareButtonVaccines.setOnClickListener {
            shareUserDate("Vaccines", "vaccines")
        }
        binding.medicines.translateButtonDiagnoses.setOnClickListener {

            val b = Bundle().apply {
                putParcelableArray("list", userDiagnosesList.toTypedArray())
                putString("title", "Diagnoses")
            }
            findNavController().navigate(R.id.home_to_translate_bottom_dialog, b)
        }
        binding.medicines.translateButtonMedicine.setOnClickListener {

            val b = Bundle().apply {
                putParcelableArray("list", userMedicineList.toTypedArray())
                putString("title", "Medicines")
            }
            findNavController().navigate(R.id.home_to_translate_bottom_dialog, b)
        }
        binding.medicines.translateButtonAllergies.setOnClickListener {

            val b = Bundle().apply {
                putParcelableArray("list", userAllergiesList.toTypedArray())
                putString("title", "Allergies")
            }
            findNavController().navigate(R.id.home_to_translate_bottom_dialog, b)
        }
        binding.medicines.translateButtonVaccines.setOnClickListener {

            val b = Bundle().apply {
                putParcelableArray("list", userVaccinesList.toTypedArray())
                putString("title", "Vaccines")
            }
            findNavController().navigate(R.id.home_to_translate_bottom_dialog, b)
        }
    }

    private fun getUserDiagnoses()
    {
        getUserId().let {
            binding.medicines.diagnosesLoading.visibility = VISIBLE
            userDiagnosesList.clear()


            FireStoreHelper().getUserDiagnoses(getUserId()!!, object :
                FireStoreGetUserDiagnosesInterface
            {
                override fun onSuccess(diagnosesUserListData: QuerySnapshot)
                {
                    binding.medicines.diagnosesLoading.visibility = GONE
                    userDiagnosesList.clear()
                    onCoroutine { sharedPrefManage.putString("diagnoses", "") }
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
                    onCoroutine { sharedPrefManage.putString("diagnoses", diagnoses) }

                    diagnosesAdapter.notifyDataSetChanged()
                    binding.medicines.descriptionDiagnoses.text = "${userDiagnosesList.size} items"
                    Log.e(TAG, "diagnoses List: $userDiagnosesList")
                }

                override fun onError(error: String)
                {
                    binding.medicines.diagnosesLoading.visibility = GONE
                    Log.e(TAG, "diagnoses List Error: $error")

                }

            })
        }
    }

    private fun getUserMedicine()
    {
        getUserId()?.let {
            binding.medicines.medicineLoading.visibility = VISIBLE
            userMedicineList.clear()

            FireStoreHelper().getUserMedicine(getUserId()!!, object :
                FireStoreGetUserMedicineInterface
            {
                override fun onSuccess(medicineUserListData: QuerySnapshot)
                {
                    binding.medicines.medicineLoading.visibility = GONE
                    userMedicineList.clear()

                    onCoroutine { sharedPrefManage.putString("medicine", "") }
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
                    onCoroutine { sharedPrefManage.putString("medicine", medicine) }

                    medicineAdapter.notifyDataSetChanged()
                    binding.medicines.descriptionMedicine.text = "${userMedicineList.size}  items"
                    Log.e(TAG, "medicine List: $userMedicineList")

                }

                override fun onError(error: String)
                {
                    binding.medicines.medicineLoading.visibility = GONE
                    Log.e(TAG, "medicine List Error: $error")

                }

            })
        }
    }

    private fun getUserAllergies()
    {
        getUserId()?.let {
            binding.medicines.allergiesLoading.visibility = VISIBLE
            userAllergiesList.clear()

            FireStoreHelper().getUserAllergies(getUserId()!!, object :
                FireStoreGetUserAllergiesInterface
            {
                override fun onSuccess(allergiesUserListData: QuerySnapshot)
                {
                    binding.medicines.allergiesLoading.visibility = GONE
                    userAllergiesList.clear()

                    onCoroutine { sharedPrefManage.putString("allergies", "") }
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
                    onCoroutine { sharedPrefManage.putString("allergies", allergies) }

                    allergiesAdapter.notifyDataSetChanged()
                    binding.medicines.descriptionAllergies.text = "${userAllergiesList.size} items"
                    Log.e(TAG, "allergies List: $userAllergiesList")

                }

                override fun onError(error: String)
                {
                    binding.medicines.allergiesLoading.visibility = GONE
                    Log.e(TAG, "allergies List Error: $error")

                }

            })
        }
    }

    private fun navigateToDocumentMetadata(fileUri: Uri?, document: Document?)
    {
        findNavController().safeNavigate(
            HomeNewFragmentDirections.homeToDocumentMetadata(
                fileUri = fileUri, document = document
            )
        )
    }

    private val documentFilePicker = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        result.data?.let {
            val fileUri = it.data as Uri
            navigateToDocumentMetadata(fileUri, null)
        }
    }

    private fun getUserVaccines()
    {
        getUserId()?.let {

            binding.medicines.vaccinesLoading.visibility = VISIBLE
            userVaccinesList.clear()
            FireStoreHelper().getUserVaccines(getUserId()!!, object :
                FireStoreGetUserVaccinesInterface
            {
                override fun onSuccess(vaccinesUserListData: QuerySnapshot)
                {

                    binding.medicines.vaccinesLoading.visibility = GONE
                    userVaccinesList.clear()
                    onCoroutine { sharedPrefManage.putString("vaccines", "") }
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

                    onCoroutine { sharedPrefManage.putString("vaccines", vaccines) }
                    vaccinesAdapter.notifyDataSetChanged()
                    binding.medicines.descriptionVaccines.text = "${userVaccinesList.size} items"
                    Log.e(TAG, "vaccines List: $userVaccinesList")

                }

                override fun onError(error: String)
                {
                    binding.medicines.vaccinesLoading.visibility = GONE
                    Log.e(TAG, "vaccines List Error: $error")

                }

            })
        }
    }


    fun attachSwiper(
        recyclerView: RecyclerView,
        collectionRef: CollectionReference,
        list: ArrayList<AllCategoryModel>,
        textView: TextView,
    )
    {

        Log.d(TAG, "attachSwiper: ${list.size}")
        ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT)
        {
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder,
            ): Boolean
            { // this method is called
                // when the item is moved.
                return false
            }

            override fun onChildDraw(
                canvas: Canvas,
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                dX: Float,
                dY: Float,
                actionState: Int,
                isCurrentlyActive: Boolean,
            )
            {
                Log.d(TAG, "onChildDraw: isCurrentlyActive = ${isCurrentlyActive}")
                val itemView = viewHolder.itemView
                val itemHeight = itemView.bottom - itemView.top
                val background: ColorDrawable = ColorDrawable()
                val deleteIcon = context?.getDrawable(R.drawable.ic_delete_subscription)
                val iconMargin: Int = 16 // Adjust margin as needed // Set background color
                background.color = Color.RED
                background.setBounds(
                    itemView.right + dX.toInt(), itemView.top, itemView.right, itemView.bottom
                )
                background.draw(canvas)


                // Draw delete icon
                if (deleteIcon != null && isCurrentlyActive)
                {
                    val iconTop = itemView.top + (itemHeight - deleteIcon.intrinsicHeight) / 2
                    val iconMargin = (itemHeight - deleteIcon.intrinsicHeight) / 2
                    val iconLeft = itemView.right - iconMargin - deleteIcon.intrinsicWidth
                    val iconRight = itemView.right - iconMargin
                    val iconBottom = iconTop + deleteIcon.intrinsicHeight

                    deleteIcon.setBounds(iconLeft, iconTop, iconRight, iconBottom)
                    deleteIcon.draw(canvas)
                }

                super.onChildDraw(canvas, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int)
            {
                val deletedDiagnoses = list.getOrNull(viewHolder.absoluteAdapterPosition) ?: return
                val position = viewHolder.absoluteAdapterPosition


                showLoadingDialog("Deleting..")
                collectionRef.whereEqualTo("description", deletedDiagnoses.description).get()
                    .addOnSuccessListener { querySnapshot ->
                        if (!querySnapshot.isEmpty)
                        {
                            val docId = querySnapshot.documents[0].id
                            collectionRef.document(docId)
                                .update("userIds", FieldValue.arrayRemove(getUserId()))
                                .addOnSuccessListener {

                                    hideDialog() //                                    Log.d(TAG, "BEFORE REMOVED attachSwiper: ${list.size}")
                                    //                                    if(list.remove(deletedDiagnoses))
                                    //                                    {
                                    //                                        textView.text = "${list.size} items"
                                    //                                        showToast("Diagnoses deleted successfully")
                                    //                                    }
                                    //                                    Log.d(TAG, "AFTER REMOVED attachSwiper: ${list.size}")
                                    //                                    recyclerView.adapter?.notifyDataSetChanged()

                                }.addOnFailureListener { err ->
                                    hideDialog()
                                    showToast("Failed to delete")
                                }

                            return@addOnSuccessListener
                        }
                        hideDialog()

                    }.addOnFailureListener { err ->
                        hideDialog()
                        recyclerView.adapter?.notifyDataSetChanged()
                    }
            }
        }).attachToRecyclerView(recyclerView)
    }

    private fun swipeToRemove()
    {


        attachSwiper(recyclerView = binding.medicines.rvDiagnosesList, list = userDiagnosesList, collectionRef = FireStoreHelper().diagnosesColl(), textView = binding.medicines.descriptionDiagnoses)

        attachSwiper(recyclerView = binding.medicines.rvMedicineList, list = userMedicineList, collectionRef = FireStoreHelper().medicineColl(), textView = binding.medicines.descriptionMedicine)
        attachSwiper(recyclerView = binding.medicines.rvAllergiesList, list = userAllergiesList, collectionRef = FireStoreHelper().allergiesColl(), textView = binding.medicines.descriptionAllergies)
        attachSwiper(recyclerView = binding.medicines.rvVaccinesList, list = userVaccinesList, collectionRef = FireStoreHelper().vaccinesColl(), textView = binding.medicines.descriptionVaccines) //        attachSwiper(recyclerView = binding.medicines.rvDocumentsList, list = , collectionRef =   FireStoreHelper().diagnosesColl(), textView = binding.medicines. )


    }


    private fun addNewBottomSheet(whichCategory: String)
    {

        val VIEW_DEFAULT: Int = 1
        val VIEW_LOADING: Int = 2
        val VIEW_DATA: Int = 3

        addNewCategoryBottomSheet = BottomSheetDialog(requireContext())
        val addNewBottomSheetBinding = AddNewCategoryBottomsheetBinding.inflate(addNewCategoryBottomSheet.layoutInflater)

        fun updateView(viewType: Int)
        {


            addNewBottomSheetBinding.txtMostRelevnt.isVisible = false
            addNewBottomSheetBinding.rvAddNewList.isVisible = false
            addNewBottomSheetBinding.tvLoadingData.isVisible = false
            addNewBottomSheetBinding.txtSearchSomething.isVisible = false
            addNewBottomSheetBinding.txtLoadText.isVisible = false


            if (viewType == VIEW_DEFAULT)
            {
                addNewBottomSheetBinding.txtSearchSomething.isVisible = true
                return
            }
            if (viewType == VIEW_LOADING)
            {
                addNewBottomSheetBinding.tvLoadingData.isVisible = true
                addNewBottomSheetBinding.txtLoadText.isVisible = true
                return
            }
            if (viewType == VIEW_DATA)
            {
                addNewBottomSheetBinding.txtMostRelevnt.isVisible = true
                addNewBottomSheetBinding.rvAddNewList.isVisible = true
                return
            }


        }

        addNewCategoryBottomSheet.setContentView(addNewBottomSheetBinding.root)
        addNewCategoryBottomSheet.behavior.state = BottomSheetBehavior.STATE_EXPANDED


        val addNewCategoryAdapter = AddNewCategoryAdapter(
            addNewCategoryBottomSheet.context, bottomMedicineList,
            object : AddNewCategoryAdapter.AddNewCategoryListener
            {
                override fun itemClick(data: AllCategoryModel)
                {
                    Log.d(TAG, "itemClick: ${data}")
                    saveMedicine(whichCategory, data)
                }
            },
        )


        addNewBottomSheetBinding.rvAddNewList.apply {
            adapter = addNewCategoryAdapter
            layoutManager = LinearLayoutManager(requireContext())

        }



        suspend fun showFilteredList(filter: String?)
        {

            withContext(Dispatchers.Main) {
                updateView(VIEW_DATA)
            }
            filter?.let {
                val searchList = bottomMedicineList.filter {
                    it.description?.lowercase()?.contains(filter.toString().lowercase()) ?: false
                } as ArrayList<AllCategoryModel>

                withContext(Dispatchers.Main) {
                    addNewCategoryAdapter.updateList(searchList)
                }

            } ?: run {
                withContext(Dispatchers.Main) {
                    addNewCategoryAdapter.updateList(bottomMedicineList)
                }
            }

        }

        suspend fun initSearch(keyword: String)
        {
            withContext(Dispatchers.Main) {
                updateView(VIEW_LOADING)
            }
            if (bottomMedicineList.isNullOrEmpty().not())
            {
                showFilteredList(keyword)
                return
            }
            val file = File(requireContext().cacheDir, "$whichCategory.json")
            if (file.exists())
            {
                runCatching {
                    var jsonString = ""
                    BufferedReader(FileReader(file)).use { reader ->
                        jsonString = reader.readText()
                    }
                    val listType = object : TypeToken<List<AllCategoryModel>>()
                    {}.type
                    val medicinesList: List<AllCategoryModel> = Gson().fromJson(jsonString, listType)
                    bottomMedicineList.clear()
                    bottomMedicineList.addAll(medicinesList)
                    showFilteredList(null)
                    return
                }


            }
            FireStoreHelper().getMedicines(whichCategory, object : FireStoreGetAllDiagnosesInterface
            {
                override fun onSuccess(listData: QuerySnapshot)
                {

                    val list: MutableList<Deferred<AllCategoryModel>> = mutableListOf()
                    lifecycleScope.launch(Dispatchers.IO) {
                        for (document in listData)
                        {
                            val newVal = async {
                                val result = kotlin.runCatching {
                                    val jsonData = Utility.convertToJson(document.data)
                                    val gsn = Gson()
                                    val categoryModel: AllCategoryModel = gsn.fromJson<AllCategoryModel>(
                                        jsonData.toString(), AllCategoryModel::class.java
                                    )
                                    categoryModel
                                } //AllCategoryModel()
                                result.getOrElse { AllCategoryModel() }
                            }
                            list.add(newVal)

                        }


                        val nList = list.awaitAll().filter { it.description.isNullOrBlank().not() }


                        runCatching {
                            val json = Gson().toJson(nList)
                            val file = File(requireContext().cacheDir, whichCategory + ".json")
                            BufferedWriter(FileWriter(file)).use { writer ->
                                writer.write(json)
                            }
                        }


                        bottomMedicineList.clear()
                        bottomMedicineList.addAll(nList)
                        showFilteredList(null)

                    }
                }


                override fun onError(error: String)
                {
                    updateView(VIEW_DATA)
                }

            })
        }


        addNewBottomSheetBinding.search.etKeyword.addTextChangedListener(object : TextWatcher
        {

            var query: String = ""
            val handler: Handler = Handler()
            val runnable = Runnable {
                lifecycleScope.launch(Dispatchers.IO) { initSearch(query) }
            }

            override fun afterTextChanged(s: Editable?)
            {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int)
            {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int)
            {
                if (s.isNullOrBlank().not())
                {
                    query = s.toString()
                    handler.removeCallbacks(runnable)
                    handler.postDelayed(runnable, 2000)
                }

            }
        })


        addNewBottomSheetBinding.tvAddNew.text = "Add New $whichCategory"
        addNewBottomSheetBinding.tvCancel.setOnClickListener {
            addNewCategoryBottomSheet.dismiss()
        }



        addNewBottomSheetBinding.tvSave.setOnClickListener {
            val searchText = addNewBottomSheetBinding.search.etKeyword.text.toString()
            if (searchText.isBlank().not())
            {
                saveMedicine(whichCategory, AllCategoryModel(description = searchText))
                addNewCategoryBottomSheet.dismiss()
            }


        }


        bottomMedicineList.clear()

        updateView(VIEW_DEFAULT)
        setupFullHeight(addNewCategoryBottomSheet)
        addNewCategoryBottomSheet.show()
    }

    private fun setupFullHeight(bottomSheetDialog: BottomSheetDialog)
    {
        bottomSheetDialog.setOnShowListener {

            val bottomSheetDialog = it as BottomSheetDialog
            val parentLayout = bottomSheetDialog.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet)
            parentLayout?.let { it ->
                val behaviour = BottomSheetBehavior.from(it)
                setupFullHeight(it)
                behaviour.state = BottomSheetBehavior.STATE_EXPANDED
            }
        }
    }

    private fun setupFullHeight(bottomSheet: View)
    {
        val layoutParams = bottomSheet.layoutParams
        layoutParams.height = WindowManager.LayoutParams.MATCH_PARENT
        bottomSheet.layoutParams = layoutParams
    }

    private fun saveMedicine(whichCategory: String, data: AllCategoryModel)
    {
        when (whichCategory)
        {
            "diagnoses" -> addMedicine(FireStoreHelper().diagnosesColl(), data) { //                getUserDiagnoses()
            }

            "medicine" -> addMedicine(FireStoreHelper().medicineColl(), data) { //                getUserMedicine()
            }

            "allergies" -> addMedicine(FireStoreHelper().allergiesColl(), data) { //                getUserAllergies()
            }

            "vaccines" -> addMedicine(FireStoreHelper().vaccinesColl(), data) { //                getUserVaccines()
            }
        }
    }

    private fun shareUserDate(title: String, what: String)
    {

        lifecycleScope.launch {

            val jsonUser = sharedPrefManage.getString("user_date")
            if (jsonUser != null)
            {
                val gsn = Gson()
                val what = sharedPrefManage.getString(what, "")

                val requireModel: Profile = gsn.fromJson(jsonUser.toString(), Profile::class.java)
                var shareText = requireModel.toString()



                shareText = "$shareText\n\n${title} : $what"
                Utility.shareText(requireContext(), shareText)
            }

        }

    }

    private fun addMedicine(
        collectionRef: CollectionReference,
        data: AllCategoryModel,
        onSuccess: () -> Unit,
    )
    {

        val id = getUserId()
        if (id == null)
        {
            Timber.e("addMedicine() user id not found ")
            showToast("ID ERROR")
            return
        }
        collectionRef.whereEqualTo("description", data.description).get()
            .addOnSuccessListener { querySnapshot ->
                if (!querySnapshot.isEmpty)
                {
                    val docId = querySnapshot.documents[0].id
                    collectionRef.document(docId)
                        .update("userIds", FieldValue.arrayUnion(getUserId()))
                        .addOnSuccessListener {
                            onSuccess.invoke()
                            addNewCategoryBottomSheet.dismiss()
                        }.addOnFailureListener { err ->
                            showToast("Diagnoses not added successfully!")
                        }
                } else
                {
                    data.userIds = arrayListOf(id)
                    collectionRef.add(data).addOnCompleteListener {
                        if (it.isSuccessful.not())
                        {
                            showToast("Diagnoses not added successfully!")
                        } else
                        {
                            onSuccess.invoke()
                        }
                        addNewCategoryBottomSheet.dismiss()
                    }
                }

            }.addOnFailureListener { err ->
                showToast("Diagnoses not added successfully")
            }
    }

    fun getUserId(): String?
    {
        Timber.d("ID : " + localDataManager.getCredentials()?.id)
        return localDataManager.getCredentials()?.id
    }

}

private fun <E> MutableList<E>.removeIfInRange(position: Int): Boolean
{
    if (this.size > position) return this.removeAt(position) != null

    return false
}
