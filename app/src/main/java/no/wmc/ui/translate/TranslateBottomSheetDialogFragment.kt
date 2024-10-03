package no.wmc.ui.translate

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.navigation.fragment.navArgs
import no.wmc.R
import no.wmc.databinding.DialogTranslateBinding
import no.wmc.domain.model.ProfileItem
import no.wmc.domain.model.TranslateItem
import no.wmc.domain.model.Translation
import no.wmc.firebase.model.AllCategoryModel
import no.wmc.ui.base.BaseViewStateBottomSheetDialogFragment
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState
import no.wmc.ui.translate.TranslateViewAction.GetCurrentLanguageProfileItemsViewAction
import no.wmc.ui.translate.TranslateViewAction.GetTranslateLanguagesViewAction
import no.wmc.ui.translate.TranslateViewAction.GetTranslatedProfileItemsViewAction
import no.wmc.ui.translate.TranslateViewEvent.GetCurrentLanguageProfileItemsViewEvent
import no.wmc.ui.translate.TranslateViewEvent.GetTranslateLanguagesViewEvent
import no.wmc.ui.translate.TranslateViewEvent.GetTranslatedProfileItemsViewEvent
import no.wmc.ui.translate.adapter.TranslateListAdapter
import timber.log.Timber

class TranslateBottomSheetDialogFragment :
    BaseViewStateBottomSheetDialogFragment<DialogTranslateBinding, TranslateViewModel>(
        R.layout.dialog_translate, TranslateViewModel::class
    ) {
    private val translations by lazy { mutableListOf<Translation>() }
    private val currentProfileItems by lazy { mutableListOf<ProfileItem.Item>() }

    private val adapter by lazy { TranslateListAdapter() }
    private var title:String?=""
    private var list:Array<AllCategoryModel> = arrayOf()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.topBar.setOnClickListener {
            dismiss()
        }

        title=arguments?.getString("title")
        list= arguments?.getParcelableArray("list") as Array<AllCategoryModel>
        binding.title.text = getString(R.string.translate_my_title,title)
        binding.itemList.adapter = adapter

        binding.translateLanguageSpinner.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parentView: AdapterView<*>?,
                    selectedItemView: View?,
                    position: Int,
                    id: Long
                ) {
                    getTranslatedProfileItems(getSelectedTranslationIso())
                }

                override fun onNothingSelected(parentView: AdapterView<*>?) {
                    // no op
                }
            }

        getTranslationLanguage()
    }

    private fun getTranslationLanguage() {
        sendViewEvent(GetTranslateLanguagesViewEvent)
    }

    private fun getCurrentLanguageProfileItems() {
     //   sendViewEvent(GetCurrentLanguageProfileItemsViewEvent(args.itemType))
    }

    private fun getTranslatedProfileItems(languageIso: String) {
        sendViewEvent(GetTranslatedProfileItemsViewEvent(list, languageIso))
    }

    override fun handleViewAction(viewAction: ViewAction) {
        when (viewAction) {
            is GetTranslateLanguagesViewAction ->
                handleGetTranslateLanguagesAction(viewAction.viewState)
            is GetCurrentLanguageProfileItemsViewAction ->
                handleGetCurrentLanguageProfileItemsAction(viewAction.viewState)
            is GetTranslatedProfileItemsViewAction ->
                handleGetTranslatedProfileItemsAction(viewAction.viewState)
            else -> throwActionNotSupported(viewAction)
        }
    }

    private fun handleGetTranslateLanguagesAction(viewState: ViewState<List<Translation>>) {
        when (viewState) {
            is ViewState.Loading -> {
                // no op
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
            is ViewState.Success -> {
                viewState.data?.let {
                    translations.clear()
                    translations.addAll(it)
                    it.map { translation -> translation.name }.also {
                        ArrayAdapter(
                            requireContext(),
                            android.R.layout.simple_spinner_item,
                            it
                        ).also { adapter ->
                            adapter.setDropDownViewResource(
                                android.R.layout.simple_spinner_dropdown_item
                            )
                            binding.translateLanguageSpinner.adapter = adapter
                        }
                    }
                    getCurrentLanguageProfileItems()
                }
            }
        }
    }

    private fun handleGetCurrentLanguageProfileItemsAction(
        viewState: ViewState<ProfileItem>
    ) {
        when (viewState) {
            is ViewState.Loading -> {
                // no op
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
            is ViewState.Success -> {
                viewState.data?.items?.let {
                    currentProfileItems.clear()
                    currentProfileItems.addAll(it)
                    getTranslatedProfileItems(getSelectedTranslationIso())
                }
            }
        }
    }

    private fun handleGetTranslatedProfileItemsAction(
        viewState: ViewState< List<TranslateItem>>
    ) {
        when (viewState) {
            is ViewState.Loading -> {
                // no op
            }
            is ViewState.StateError -> {
                showErrorMessage(getString(R.string.error_message))
                Timber.e(viewState.errorMessage)
            }
            is ViewState.Success -> {
//                binding.itemsTitle.text = viewState.data?.itemsTitle
                adapter.submitList(  viewState.data)
            }
        }
    }

    private fun getSelectedTranslationIso(): String {
        val position = binding.translateLanguageSpinner.selectedItemPosition
        return translations[position].iso
    }
}
