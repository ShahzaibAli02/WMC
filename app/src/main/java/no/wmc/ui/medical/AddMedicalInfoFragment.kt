package no.wmc.ui.medical

import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.filterNotNull
import no.wmc.R
import no.wmc.data.remote.SUCCESS
import no.wmc.databinding.FragmentAddMedicalInfoBinding
import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.domain.model.ProfileItem
import no.wmc.ui.base.BaseViewStateFragment
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState
import no.wmc.ui.main.home.HomeFragment
import no.wmc.ui.medical.AddMedicalInfoViewAction.AddMedicalItemAction
import no.wmc.ui.medical.AddMedicalInfoViewAction.SearchMedicalItemAction
import no.wmc.ui.medical.AddMedicalInfoViewEvent.AddMedicalItemEvent
import no.wmc.ui.medical.AddMedicalInfoViewEvent.LoadMoreMedicalItemEvent
import no.wmc.ui.medical.AddMedicalInfoViewEvent.SearchMedicalItemEvent
import no.wmc.ui.medical.list.AddMedicalInfoAdapter
import timber.log.Timber

@FlowPreview
class AddMedicalInfoFragment :
    BaseViewStateFragment<FragmentAddMedicalInfoBinding, AddMedicalInfoViewModel>(
        R.layout.fragment_add_medical_info,
        AddMedicalInfoViewModel::class
    ) {
    private val args: AddMedicalInfoFragmentArgs by navArgs()

    private val adapter by lazy {
        AddMedicalInfoAdapter(::loadMoreMedicalItem) {
            createMedicalItem(args.profileItemEnum, it)
        }
    }

    private val queryState = MutableStateFlow<SearchMedicalItemEvent?>(null)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
    }

    private fun initViews() {
        binding.toolbar.setNavigationIcon(R.drawable.ic_back)
        binding.toolbar.setNavigationOnClickListener { findNavController().popBackStack() }
        val title = when (args.profileItemEnum) {
            ProfileItemEnum.ALLERGY -> R.string.add_new_allergy_title
            ProfileItemEnum.MEDICATION -> R.string.add_new_medicine_title
            ProfileItemEnum.DIAGNOSIS -> R.string.add_new_diagnoses_title
            ProfileItemEnum.VACCINE -> R.string.add_new_vaccines_title
            else -> null
        }
        title?.let {
            binding.toolbar.title = context?.getString(title)
        }

        binding.vSearch.setAfterTextChangeListener {
            queryState.value = SearchMedicalItemEvent(args.profileItemEnum, it)
        }
        lifecycleScope.launchWhenResumed {
            queryState.debounce(500)
                .filterNotNull()
                .collect {
                    sendViewEvent(it)
                }
        }

        binding.rvSearchResult.adapter = adapter
    }

    override fun handleViewAction(viewAction: ViewAction) {
        when (viewAction) {
            is SearchMedicalItemAction -> handleGetMedicalItemAction(viewAction.viewState)
            is AddMedicalItemAction -> handleAddMedicalItemAction(viewAction.viewState)
            else -> throwActionNotSupported(viewAction)
        }
    }

    private fun handleGetMedicalItemAction(viewState: ViewState<List<ProfileItem.Item>>) {
        binding.isLoading = viewState is ViewState.Loading
        when (viewState) {
            is ViewState.Loading -> {
                // no op
            }
            is ViewState.Success -> {
                adapter.submitList(viewState.data)
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun handleAddMedicalItemAction(viewState: ViewState<Unit>) {
        binding.isLoading = viewState is ViewState.Loading
        when (viewState) {
            is ViewState.Loading -> {
                // no op
            }
            is ViewState.Success -> {
                val savedStateHandle = findNavController().previousBackStackEntry?.savedStateHandle
                val result = when (args.profileItemEnum) {
                    ProfileItemEnum.ALLERGY -> HomeFragment.ADD_NEW_ALLERGY_RESULT
                    ProfileItemEnum.MEDICATION -> HomeFragment.ADD_NEW_MEDICINE_RESULT
                    ProfileItemEnum.DIAGNOSIS -> HomeFragment.ADD_NEW_DIAGNOSES_RESULT
                    ProfileItemEnum.VACCINE -> HomeFragment.ADD_NEW_VACCINE_RESULT
                    else -> null
                }
                result?.let {
                    savedStateHandle?.set(result, SUCCESS)
                    findNavController().navigateUp()
                }
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
        }
    }

    private fun createMedicalItem(profileItemEnum: ProfileItemEnum, profileItem: ProfileItem.Item) {
        sendViewEvent(AddMedicalItemEvent(profileItemEnum, profileItem))
    }

    private fun loadMoreMedicalItem() {
        sendViewEvent(LoadMoreMedicalItemEvent(args.profileItemEnum))
    }
}
