package no.wmc.ui.main.home

import android.animation.LayoutTransition
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import kotlinx.datetime.Instant
import no.wmc.R
import no.wmc.data.remote.SUCCESS
import no.wmc.data.remote.StatusCode
import no.wmc.databinding.HomeScreenBinding
import no.wmc.domain.enums.MIMEEnum
import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.domain.mapper.toMedicalItem
import no.wmc.domain.model.Document
import no.wmc.domain.model.DocumentList.DocumentGroup
import no.wmc.domain.model.GreetingMarker
import no.wmc.domain.model.MedicalItem
import no.wmc.domain.model.Profile
import no.wmc.domain.model.Profile.CardOrderStatus
import no.wmc.domain.model.ProfileItem
import no.wmc.domain.model.ShareMedicalInfo
import no.wmc.domain.model.ShareType
import no.wmc.domain.model.ShareType.Allergy
import no.wmc.ui.base.BaseViewStateFragment
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState
import no.wmc.ui.custom.ExpandableCard
import no.wmc.ui.main.home.EditCardBottomDialog.Companion.EDIT_CARD_EDIT_ITEM_ACTION
import no.wmc.ui.main.home.EditCardBottomDialog.Companion.EDIT_CARD_REMOVE_ITEM_ACTION
import no.wmc.ui.main.home.HomeViewEvent.DownloadDocumentViewEvent
import no.wmc.ui.main.home.HomeViewEvent.GetAllergiesViewEvent
import no.wmc.ui.main.home.HomeViewEvent.GetDiagnosesViewEvent
import no.wmc.ui.main.home.HomeViewEvent.GetDocumentsViewEvent
import no.wmc.ui.main.home.HomeViewEvent.GetMedicineViewEvent
import no.wmc.ui.main.home.HomeViewEvent.GetProfileViewEvent
import no.wmc.ui.main.home.HomeViewEvent.GetVaccinesViewEvent
import no.wmc.ui.main.home.HomeViewEvent.OrderCardViewEvent
import no.wmc.ui.main.home.HomeViewEvent.RemoveMedicalItemViewEvent
import no.wmc.ui.main.home.HomeViewEvent.SetNoAllergiesEvent
import no.wmc.ui.main.home.HomeViewEvent.ShareViewEvent
import no.wmc.ui.main.home.WmcBannerBottomDialog.Companion.WMC_BANNER_PRINT_CARD_ACTION
import no.wmc.ui.main.home.WmcBannerBottomDialog.Companion.WMC_BANNER_REORDER_CARD_ACTION
import no.wmc.ui.main.home.list.DocumentListAdapter
import no.wmc.ui.main.home.list.ProfileItemListAdapter
import no.wmc.utils.FileUtils
import no.wmc.utils.ext.countryCodeToName
import no.wmc.utils.ext.safeNavigate
import no.wmc.utils.ext.setBackAction
import no.wmc.utils.ext.showActionButtons
import timber.log.Timber
import java.io.File

class HomeFragment : BaseViewStateFragment<HomeScreenBinding, HomeViewModel>(
    R.layout.home_screen,
    HomeViewModel::class
) {

    private val allergiesAdapter = ProfileItemListAdapter(R.string.no_allergies_listed) {
        // TODO click action
    }

    private val medicineAdapter = ProfileItemListAdapter(R.string.no_medications_listed) {
        // TODO click action
    }

    private val diagnosesAdapter = ProfileItemListAdapter(R.string.no_diagnoses_listed) {
        // TODO click action
    }

    private val vaccinesAdapter = ProfileItemListAdapter(R.string.no_vaccines_listed) {
        // TODO click action
    }

    private val allergyItems by lazy { mutableListOf<MedicalItem>() }
    private val medicineItems by lazy { mutableListOf<MedicalItem>() }
    private val diagnoseItems by lazy { mutableListOf<MedicalItem>() }
    private val vaccineItems by lazy { mutableListOf<MedicalItem>() }

    private var selectedDocument: Document? = null

    private val documentAdapter = DocumentListAdapter(
        emptyStateString = R.string.no_documents_added,
        onItemClicked = {
            downloadDocument(requireContext(), it)
        },
        onMoreClicked = {
            selectedDocument = it
            findNavController().navigate(
                HomeFragmentDirections.showEditCardBottomDialog(ProfileItemEnum.DOCUMENT)
            )
        }
    )

    private val currentBackStackEntry by lazy { findNavController().currentBackStackEntry }

    private val savedStateHandle by lazy { currentBackStackEntry?.savedStateHandle }

    private var addAllergyResultObserver: Unit? = null
    private var addMedicineResultObserver: Unit? = null
    private var addDiagnosesResultObserver: Unit? = null
    private var addVaccinesResultObserver: Unit? = null
    private var addDocumentResultObserver: Unit? = null
    private var editDocumentResultObserver: Unit? = null
    private var editCardActionResultObserver: Unit? = null
    private var wmcBannerDialogResultObserver: Unit? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        requestProfile()

        requestAllergies()
        requestMedicine()
        requestDiagnoses()
        requestVaccines()
        requestDocuments()
    }

    private fun initViews() {
        setBackAction(viewLifecycleOwner, requireActivity()::finish)
        binding.mainLayout.layoutTransition.enableTransitionType(LayoutTransition.CHANGING)

        showDynamicGreeting()

        binding.allergies.infoListAdapter = allergiesAdapter
        binding.medicine.infoListAdapter = medicineAdapter
        binding.diagnoses.infoListAdapter = diagnosesAdapter
        binding.documents.infoListAdapter = documentAdapter
        binding.vaccines.infoListAdapter = vaccinesAdapter

        binding.profileExpandableCard.profileCard.setOnClickListener {
            if (isProfileComplete(binding.profileExpandableCard.profileData)) {
                // Profile is complete. Allow to show info
                if (binding.profileExpandableCard.personalInfo.isVisible) {
                    // Hide
                    binding.profileExpandableCard.personalInfo.isVisible = false
                    binding.profileExpandableCard.profileExpandButton.rotation = 0f
                } else {
                    // Show
                    binding.profileExpandableCard.personalInfo.isVisible = true
                    binding.profileExpandableCard.profileExpandButton.rotation = 180f
                }
            } else {
                findNavController().safeNavigate(HomeFragmentDirections.editProfile())
            }
        }
        binding.profileExpandableCard.editButton.setOnClickListener {
            findNavController().safeNavigate(HomeFragmentDirections.editProfile())
        }
        binding.menuButton.setOnClickListener {
            findNavController().safeNavigate(HomeFragmentDirections.showMainBottomDialog())
        }
        binding.subscribeNowButton.setOnClickListener {
            startActivity(
                Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse(getString(R.string.purchase_subscription_web_link))
                }
            )
        }

        setupCardAction(
            ProfileItemEnum.ALLERGY,
            binding.allergies,
            allergyItems,
            allergiesAdapter
        ) {
            shareAllergies()
        }

        setupCardAction(
            ProfileItemEnum.MEDICATION,
            binding.medicine,
            medicineItems,
            medicineAdapter
        ) {
            shareMedicine()
        }

        setupCardAction(
            ProfileItemEnum.VACCINE,
            binding.vaccines,
            vaccineItems,
            vaccinesAdapter
        ) {
            shareVaccines()
        }

        setupCardAction(
            ProfileItemEnum.DIAGNOSIS,
            binding.diagnoses,
            diagnoseItems,
            diagnosesAdapter
        ) {
            shareDiagnoses()
        }

        binding.documents.onAddClicked = {
            val intent = Intent(Intent.ACTION_OPEN_DOCUMENT)
            intent.addCategory(Intent.CATEGORY_OPENABLE)
            val supportedMIMEType = arrayOf(
                MIMEEnum.PDF.type,
                MIMEEnum.JPEG.type,
                MIMEEnum.PNG.type,
                MIMEEnum.DOC.type,
                MIMEEnum.DOCX.type
            )
            intent.type = "*/*"
            intent.putExtra(Intent.EXTRA_MIME_TYPES, supportedMIMEType)
            documentFilePicker.launch(intent)
        }

        handleAddMedicalItemResult()
        handleOnTranslateClicked()
        handleWmcBannerDialogResult()
    }

    override fun handleViewAction(viewAction: ViewAction) {
        when (viewAction) {
            is HomeViewAction.GetProfileViewAction -> handleGetProfileAction(viewAction.viewState)
            is HomeViewAction.SetNoAllergiesAction ->
                handleAllergiesSwitchAction(viewAction.viewState)
            is HomeViewAction.GetAllergiesViewAction -> handleAllergiesAction(viewAction.viewState)
            is HomeViewAction.GetMedicineViewAction ->
                handleGetMedicineViewAction(viewAction.viewState)
            is HomeViewAction.GetDiagnosesViewAction ->
                handleGetDiagnosesViewAction(viewAction.viewState)
            is HomeViewAction.GetVaccinesViewAction ->
                handleGetVaccinesViewAction(viewAction.viewState)
            is HomeViewAction.GetDocumentsViewAction ->
                handleGetDocumentAction(viewAction.viewState)
            is HomeViewAction.RemoveMedicalItemViewAction ->
                handleRemoveMedicalItemAction(viewAction.viewState)
            is HomeViewAction.DownloadDocumentViewAction ->
                handleDownloadDocumentAction(viewAction.viewState)
            is HomeViewAction.RemoveDocumentViewAction ->
                handleRemoveDocumentAction(viewAction.viewState)
            is HomeViewAction.ShareViewAction ->
                handleShareAction(viewAction.viewState)
            is HomeViewAction.OrderCardViewAction -> handleOrderCardAction(viewAction.viewState)
            else -> throwActionNotSupported(viewAction)
        }
    }

    private fun handleGetProfileAction(viewState: ViewState<Profile>) {
        binding.loading.isVisible = (viewState is ViewState.Loading && viewState.data == null)
        when (viewState) {
            is ViewState.Loading -> Unit
            is ViewState.StateError -> {
                showErrorMessage(
                    when (viewState.errorCode) {
                        StatusCode.TIMEOUT_ERROR -> {
                            getString(R.string.subscription_time_out_dialog_message)
                        }
                        else -> viewState.errorMessage ?: getString(R.string.error_message)
                    }
                )
                Timber.e(viewState.errorMessage)
            }
            is ViewState.Success -> {
                binding.profileExpandableCard.profileData = viewState.data!!
                binding.wmcBanner.wmcCard.isVisible = viewState.data.isActiveSubscription
                binding.noSubscriptionPanel.isVisible = !viewState.data.isActiveSubscription

                binding.profileExpandableCard.gender.text = viewState.data.gender?.name ?: "-"
                binding.profileExpandableCard.birthdate.text =
                    viewState.data.birthDate

                if (!isProfileComplete(viewState.data)) {
                    binding.profileExpandableCard.profileTitle.text = "-"
                    binding.profileExpandableCard.description.setText(
                        R.string.complete_your_profile
                    )
                    binding.profileExpandableCard.description.setTextColor(
                        ContextCompat.getColor(
                            requireContext(),
                            R.color.completeProfileByline
                        )
                    )
                    binding.profileExpandableCard.editOptionGroup.isVisible = true
                    binding.incompleteProfileByline.isVisible = true
                    binding.incompleteProfileDescription.isVisible = true
                } else {
                    binding.incompleteProfileByline.isVisible = false
                    binding.incompleteProfileDescription.isVisible = false
                    binding.profileExpandableCard.profileTitle.text =
                        "${viewState.data.firstName} ${viewState.data.lastName}"
                    binding.profileExpandableCard.description.text = getString(
                        R.string.member_since,
                        viewState.data.memberSince
                    )
                    binding.profileExpandableCard.description.setTextColor(
                        ContextCompat.getColor(
                            requireContext(),
                            R.color.memberSinceByline
                        )
                    )
                    binding.profileExpandableCard.editOptionGroup.isVisible = false
                }

//                binding.profileExpandableCard.addressData =
//                    "${viewState.data.postalAddress?.info}\n" +
//                            "${viewState.data.postalAddress?.postalCode ?: "-"}, " +
//                            "${viewState.data.postalAddress?.city ?: "-"}\n" +
//                            (viewState.data.postalAddress?.country?.countryCodeToName()
//                                ?: "-").trim()

                binding.profileExpandableCard.emergencyContactsData =
                    viewState.data.emergencyContact?.joinToString("") {
                        "${it.name}, ${it.relationship.orEmpty()}\n${it.phone.orEmpty()}\n\n"
                    }?.trim()
                binding.profileExpandableCard.root.isVisible = true

                if (viewState.data.isActiveSubscription) {
                    binding.allergies.isActive = true
                    binding.medicine.isActive = true
                    binding.diagnoses.isActive = true
                    binding.vaccines.isActive = true
                    binding.documents.isActive = true

                    requestAllergies()
                    requestMedicine()
                    requestDiagnoses()
                    requestVaccines()
                    requestDocuments()
                } else {
                    binding.allergies.isActive = false
                    binding.medicine.isActive = false
                    binding.diagnoses.isActive = false
                    binding.vaccines.isActive = false
                    binding.documents.isActive = false
                }

                when (viewState.data.cardOrderStatus) {
                    CardOrderStatus.Failed,CardOrderStatus.Unregistered -> setUnregisteredWMCBanner()
                    CardOrderStatus.Registered -> setRegisteredWMCBanner()
                    CardOrderStatus.Completed -> {
                        setUnregisteredWMCBanner()
                        //checkReOrderCardAvailability(viewState.data.cardOrderDate)
                    }
                    null -> binding.wmcBanner.wmcCard.visibility = View.GONE
                }
            }
        }
    }

    private fun handleAllergiesSwitchAction(viewState: ViewState<Boolean>) {
        when (viewState) {
            is ViewState.Loading -> {
                // no op
            }
            is ViewState.Success -> {
                // TODO hide complete card and show info
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun handleAllergiesAction(viewState: ViewState<ProfileItem>) {
        when (viewState) {
            is ViewState.Loading -> {
                // no op
            }
            is ViewState.Success -> {
                transformToMedicalItem(viewState.data, allergyItems, allergiesAdapter)
                binding.allergies.showActionButtons(allergyItems.isNotEmpty())
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun handleGetMedicineViewAction(viewState: ViewState<ProfileItem>) {
        when (viewState) {
            is ViewState.Loading -> {
                // no op
            }
            is ViewState.Success -> {
                transformToMedicalItem(viewState.data, medicineItems, medicineAdapter)
                binding.medicine.showActionButtons(medicineItems.isNotEmpty())
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun handleGetDiagnosesViewAction(viewState: ViewState<ProfileItem>) {
        when (viewState) {
            is ViewState.Loading -> {
                // no op
            }
            is ViewState.Success -> {
                transformToMedicalItem(viewState.data, diagnoseItems, diagnosesAdapter)
                binding.diagnoses.showActionButtons(diagnoseItems.isNotEmpty())
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun handleGetVaccinesViewAction(viewState: ViewState<ProfileItem>) {
        when (viewState) {
            is ViewState.Loading -> {
                // no op
            }
            is ViewState.Success -> {
                transformToMedicalItem(viewState.data, vaccineItems, vaccinesAdapter)
                binding.vaccines.showActionButtons(vaccineItems.isNotEmpty())
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun handleGetDocumentAction(viewState: ViewState<List<DocumentGroup>>) {
        when (viewState) {
            is ViewState.Loading -> {
                // no op
            }
            is ViewState.Success -> {
                documentAdapter.updateList(viewState.data)
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun handleRemoveMedicalItemAction(viewState: ViewState<ProfileItemEnum>) {
        when (viewState) {
            is ViewState.Loading -> {
                // no op
            }
            is ViewState.Success -> {
                when (viewState.data) {
                    ProfileItemEnum.ALLERGY -> requestAllergies()
                    ProfileItemEnum.DIAGNOSIS -> requestDiagnoses()
                    ProfileItemEnum.MEDICATION -> requestMedicine()
                    ProfileItemEnum.VACCINE -> requestVaccines()
                    else -> {
                        showErrorMessage(getString(R.string.error_message))
                    }
                }
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun handleDownloadDocumentAction(viewState: ViewState<File>) {
        binding.documents.setLoading(viewState is ViewState.Loading)
        when (viewState) {
            is ViewState.Loading -> {
            }
            is ViewState.Success -> {
                viewState.data?.let { file ->
                    try {
                        FileUtils.openFile(requireActivity(), file)
                    } catch (e: Exception) {
                        showErrorMessage(getString(R.string.error_message))
                        Timber.e(e)
                    }
                }
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun handleRemoveDocumentAction(viewState: ViewState<Unit>) {
        binding.documents.setLoading(viewState is ViewState.Loading)
        when (viewState) {
            is ViewState.Loading -> {
            }
            is ViewState.Success -> {
                requestDocuments()
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun handleShareAction(viewState: ViewState<ShareMedicalInfo>) {
        when (viewState) {
            is ViewState.Loading -> {
                showShareCardLoading(viewState.data!!.shareType, true)
            }
            is ViewState.Success -> {
                showShareCardLoading(viewState.data!!.shareType, false)
                try {
                    FileUtils.openFile(requireActivity(), viewState.data.file!!)
                } catch (e: Exception) {
                    Timber.e(e)
                    showErrorMessage(getString(R.string.error_message))
                }
            }
            is ViewState.StateError -> {
                showShareCardLoading(viewState.data!!.shareType, false)
                Timber.e(viewState.errorMessage)
                showErrorMessage(getString(R.string.error_message))
            }
        }
    }

    private fun showShareCardLoading(shareType: ShareType, isLoading: Boolean) {
        when (shareType) {
            Allergy -> binding.allergies.setLoading(isLoading)
            ShareType.Medication -> binding.medicine.setLoading(isLoading)
            ShareType.Vaccine -> binding.vaccines.setLoading(isLoading)
            ShareType.Diagnosis -> binding.diagnoses.setLoading(isLoading)
        }
    }

    private fun handleOrderCardAction(viewState: ViewState<Unit>) {
        when (viewState) {
            is ViewState.Loading -> {}
            is ViewState.Success -> requestProfile()
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun requestProfile() {
        sendViewEvent(GetProfileViewEvent)
    }

    private fun turnNoAllergies() {
        sendViewEvent(SetNoAllergiesEvent)
    }

    private fun requestAllergies() {
        sendViewEvent(GetAllergiesViewEvent)
    }

    private fun requestMedicine() {
        sendViewEvent(GetMedicineViewEvent)
    }

    private fun requestDiagnoses() {
        sendViewEvent(GetDiagnosesViewEvent)
    }

    private fun requestVaccines() {
        sendViewEvent(GetVaccinesViewEvent)
    }

    private fun requestDocuments() {
        sendViewEvent(GetDocumentsViewEvent)
    }

    private fun shareAllergies() {
        sendViewEvent(ShareViewEvent(requireContext(), Allergy))
    }

    private fun shareMedicine() {
        sendViewEvent(ShareViewEvent(requireContext(), ShareType.Medication))
    }

    private fun shareDiagnoses() {
        sendViewEvent(ShareViewEvent(requireContext(), ShareType.Diagnosis))
    }

    private fun shareVaccines() {
        sendViewEvent(ShareViewEvent(requireContext(), ShareType.Vaccine))
    }

    private fun removeMedicalItem(
        profileItemEnum: ProfileItemEnum,
        profileItem: ProfileItem.Item
    ) {
        sendViewEvent(RemoveMedicalItemViewEvent(profileItemEnum, profileItem))
    }

    private fun downloadDocument(
        context: Context,
        document: Document
    ) {
        sendViewEvent(DownloadDocumentViewEvent(context, document))
    }

    private fun removeDocument(documentId: Int) {
        sendViewEvent(HomeViewEvent.RemoveDocumentViewEvent(documentId))
    }

    private fun orderCard() {
        sendViewEvent(OrderCardViewEvent)
    }

    private fun setUnregisteredWMCBanner() {
        binding.wmcBanner.wmcOrderLayout.isVisible = true
        binding.wmcBanner.orderSuccessful.isVisible = false
        setWMCBannerOnClickActions(true)
    }

    private fun setRegisteredWMCBanner() {
        binding.wmcBanner.wmcOrderLayout.isVisible = false
        binding.wmcBanner.orderSuccessful.isVisible = true
        setWMCBannerOnClickActions(false)
    }

    private fun setCompletedWMCBanner() {
        binding.wmcBanner.wmcOrderLayout.isVisible = false
        binding.wmcBanner.orderSuccessful.isVisible = false
        setWMCBannerOnClickActions(false)
    }

    private fun setWMCBannerOnClickActions(isEnable: Boolean) {
        binding.wmcBanner.orderLaterButton.setOnClickListener {
            if (isEnable) {
                binding.wmcBanner.wmcOrderLayout.isVisible = false
            }
        }
        binding.wmcBanner.orderNowButton.setOnClickListener {
            if (isEnable) {
                orderCard()
            }
        }
        binding.wmcBanner.wmcCard.setOnClickListener {
            if (isEnable) {
                binding.wmcBanner.wmcOrderLayout.isVisible =
                    !binding.wmcBanner.wmcOrderLayout.isVisible
            }
        }
    }

    private fun checkReOrderCardAvailability(cardOrderDate: Instant?) {
//        cardOrderDate?.let {
//            val today = Instant.fromEpochMilliseconds(Date().time)
//            val reorderDate = it.plus(365.toDuration(DurationUnit.DAYS)) // 1 year after order date
//            val reorderDuration = (reorderDate - today).inWholeDays.toInt()
//            val isReOrderAvailable = reorderDuration <= 0
//            binding.wmcBanner.wmcMenuButton.isVisible = isReOrderAvailable
//            binding.wmcBanner.wmcMenuButton.setOnClickListener {
//                if (isReOrderAvailable) {
//                    findNavController().safeNavigate(HomeFragmentDirections.showWmcBottomDialog())
//                }
//            }
//            binding.wmcBanner.reorderDurationText.isVisible = !isReOrderAvailable
//            binding.wmcBanner.reorderDurationText.text = resources.getQuantityString(
//                    R.plurals.card_reorder_period_title,
//                    reorderDuration,
//                    reorderDuration
//                )
//        }
    }

    private fun isProfileComplete(profile: Profile?): Boolean {
        return profile != null &&
                !profile.firstName.isNullOrBlank() &&
                !profile.lastName.isNullOrBlank() &&
                profile.birthDate != null &&
                profile.gender != null &&
                !profile.nationality.isNullOrBlank() &&
                !profile.phone.isNullOrBlank()
    }

    private fun transformToMedicalItem(
        profileItem: ProfileItem?,
        medicalItemList: MutableList<MedicalItem>,
        medicalItemAdapter: ProfileItemListAdapter
    ) {
        profileItem?.toMedicalItem()?.let {
            medicalItemList.clear()
            medicalItemList.addAll(it)
            medicalItemAdapter.updateList(medicalItemList)
        }
    }

    private fun setupCardAction(
        profileItemEnum: ProfileItemEnum,
        expandableCard: ExpandableCard,
        medicalItemList: MutableList<MedicalItem>,
        medicalItemAdapter: ProfileItemListAdapter,
        onShareClicked: () -> Unit
    ) {
        expandableCard.onAddClicked = {
            findNavController().safeNavigate(
                HomeFragmentDirections.homeToAddMedicalInfo(profileItemEnum)
            )
        }

        expandableCard.onEditClicked = {
            findNavController().safeNavigate(
                HomeFragmentDirections.showEditCardBottomDialog(profileItemEnum)
            )
        }

        expandableCard.onShareClicked = onShareClicked

        expandableCard.onCancelEditItemClicked = {
            toggleRemoveItemAction(medicalItemList, expandableCard, medicalItemAdapter)
        }

        expandableCard.onRemoveItemClicked = {
            medicalItemList.filter { it.isChecked }.forEach {
                removeMedicalItem(profileItemEnum, it.profileItem)
            }
            toggleRemoveItemAction(medicalItemList, expandableCard, medicalItemAdapter)
        }

        handleEditCardDialogResult()
    }

    private fun handleAddMedicalItemResult() {
        currentBackStackEntry?.let {
            // Add Allergy Result
            if (addAllergyResultObserver == null) {
                addAllergyResultObserver =
                    savedStateHandle?.getLiveData<String>(ADD_NEW_ALLERGY_RESULT)
                        ?.observe(it) { result ->
                            if (result == SUCCESS) {
                                requestAllergies()
                            }
                        }
            }
            // Add Medicine Result
            if (addMedicineResultObserver == null) {
                addMedicineResultObserver =
                    savedStateHandle?.getLiveData<String>(ADD_NEW_MEDICINE_RESULT)
                        ?.observe(it) { result ->
                            if (result == SUCCESS) {
                                requestMedicine()
                            }
                        }
            }
            // Add Diagnoses Result
            if (addDiagnosesResultObserver == null) {
                addDiagnosesResultObserver =
                    savedStateHandle?.getLiveData<String>(ADD_NEW_DIAGNOSES_RESULT)
                        ?.observe(it) { result ->
                            if (result == SUCCESS) {
                                requestDiagnoses()
                            }
                        }
            }
            // Add Vaccine Result
            if (addVaccinesResultObserver == null) {
                addVaccinesResultObserver =
                    savedStateHandle?.getLiveData<String>(ADD_NEW_VACCINE_RESULT)
                        ?.observe(it) { result ->
                            if (result == SUCCESS) {
                                requestVaccines()
                            }
                        }
            }
            // Add Document Result
            if (addDocumentResultObserver == null) {
                addDocumentResultObserver =
                    savedStateHandle?.getLiveData<String>(ADD_NEW_DOCUMENT_RESULT)
                        ?.observe(it) { result ->
                            if (result == SUCCESS) {
                                requestDocuments()
                            }
                        }
            }
            // Edit Result
            if (editDocumentResultObserver == null) {
                editDocumentResultObserver =
                    savedStateHandle?.getLiveData<String>(EDIT_DOCUMENT_ACTION_RESULT)
                        ?.observe(it) { result ->
                            if (result == SUCCESS) {
                                requestDocuments()
                            }
                        }
            }
        }
    }

    private fun handleEditCardDialogResult() {
        currentBackStackEntry?.let {
            // Edit Card Action
            if (editCardActionResultObserver == null) {
                editCardActionResultObserver =
                    savedStateHandle
                        ?.getLiveData<Pair<ProfileItemEnum, String>>(EDIT_CARD_ACTION_RESULT)
                        ?.observe(it) { result ->
                            val profileItemEnum = result.first
                            when (result.second) {
                                EDIT_CARD_REMOVE_ITEM_ACTION -> {
                                    when (profileItemEnum) {
                                        ProfileItemEnum.ALLERGY -> toggleRemoveItemAction(
                                            allergyItems,
                                            binding.allergies,
                                            allergiesAdapter
                                        )
                                        ProfileItemEnum.DIAGNOSIS -> toggleRemoveItemAction(
                                            diagnoseItems,
                                            binding.diagnoses,
                                            diagnosesAdapter
                                        )
                                        ProfileItemEnum.MEDICATION -> toggleRemoveItemAction(
                                            medicineItems,
                                            binding.medicine,
                                            medicineAdapter
                                        )
                                        ProfileItemEnum.VACCINE -> toggleRemoveItemAction(
                                            vaccineItems,
                                            binding.vaccines,
                                            vaccinesAdapter
                                        )
                                        ProfileItemEnum.DOCUMENT ->
                                            selectedDocument?.let { document ->
                                                removeDocument(document.id)
                                            }
                                    }
                                }
                                EDIT_CARD_EDIT_ITEM_ACTION -> {
                                    when (profileItemEnum) {
                                        ProfileItemEnum.DOCUMENT ->
                                            selectedDocument?.let { document ->
                                                Handler(Looper.getMainLooper()).post {
                                                    navigateToDocumentMetadata(null, document)
                                                }
                                            }
                                        else -> {}
                                    }
                                }
                            }
                        }
            }
        }
    }

    private fun handleWmcBannerDialogResult() {
        currentBackStackEntry?.let {
            if (wmcBannerDialogResultObserver == null) {
                wmcBannerDialogResultObserver =
                    savedStateHandle?.getLiveData<String>(WMC_BANNER_ACTION_RESULT)
                        ?.observe(it) { result ->
                            when (result) {
                                WMC_BANNER_PRINT_CARD_ACTION -> {
                                    // no op
                                }
                                WMC_BANNER_REORDER_CARD_ACTION -> {
                                    orderCard()
                                }
                            }
                        }
            }
        }
    }

    private val documentFilePicker =
        registerForActivityResult(StartActivityForResult()) { result ->
            result.data?.let {
                val fileUri = it.data as Uri
                navigateToDocumentMetadata(fileUri, null)
            }
        }

    private fun toggleRemoveItemAction(
        medicalItems: List<MedicalItem>,
        expandableCard: ExpandableCard,
        profileItemAdapter: ProfileItemListAdapter
    ) {
        medicalItems.forEach { it.isEditMode = !it.isEditMode }
        expandableCard.setEditMode(medicalItems.first().isEditMode)
        profileItemAdapter.notifyItemRangeChanged(0, medicalItems.size)
    }

    private fun navigateToDocumentMetadata(fileUri: Uri?, document: Document?) {
        findNavController().safeNavigate(
            HomeFragmentDirections.homeToDocumentMetadata(
                fileUri = fileUri,
                document = document
            )
        )
    }

    private fun showDynamicGreeting() {
        binding.title.text = when (GreetingMarker.getCurrentTime()) {
            GreetingMarker.GreetingTime.MORNING -> getString(R.string.dashboard_screen_title_morning)
            GreetingMarker.GreetingTime.AFTERNOON -> getString(R.string.screen_title_good_afternoon)
            GreetingMarker.GreetingTime.EVENING -> getString(R.string.dashboard_screen_title_evening)
            GreetingMarker.GreetingTime.NIGHT -> getString(R.string.dashboard_screen_title_night)
        }
    }

    private fun handleOnTranslateClicked() {
        binding.allergies.onTranslateClicked = {
            onTranslateClicked(ProfileItemEnum.ALLERGY, binding.allergies.getTitle())
        }
        binding.medicine.onTranslateClicked = {
            onTranslateClicked(ProfileItemEnum.MEDICATION, binding.medicine.getTitle())
        }
        binding.diagnoses.onTranslateClicked = {
            onTranslateClicked(ProfileItemEnum.DIAGNOSIS, binding.diagnoses.getTitle())
        }
        binding.vaccines.onTranslateClicked = {
            onTranslateClicked(ProfileItemEnum.VACCINE, binding.vaccines.getTitle())
        }
    }

    private fun onTranslateClicked(profileItemEnum: ProfileItemEnum, title: String) {
        findNavController().navigate(
            HomeFragmentDirections.homeToTranslateBottomDialog(profileItemEnum, title)
        )
    }

    companion object {
        const val ADD_NEW_ALLERGY_RESULT = "ADD_NEW_ALLERGY_RESULT"
        const val ADD_NEW_MEDICINE_RESULT = "ADD_NEW_MEDICINE_RESULT"
        const val ADD_NEW_DIAGNOSES_RESULT = "ADD_NEW_DIAGNOSES_RESULT"
        const val ADD_NEW_VACCINE_RESULT = "ADD_NEW_VACCINE_RESULT"
        const val ADD_NEW_DOCUMENT_RESULT = "ADD_NEW_DOCUMENT_RESULT"

        const val EDIT_CARD_ACTION_RESULT = "EDIT_CARD_ACTION_RESULT"
        const val EDIT_DOCUMENT_ACTION_RESULT = "EDIT_DOCUMENT_ACTION_RESULT"
        const val WMC_BANNER_ACTION_RESULT = "WMC_BANNER_ACTION_RESULT"
    }
}
