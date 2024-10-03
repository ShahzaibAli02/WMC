package no.wmc.ui.medical

import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.domain.model.ProfileItem
import no.wmc.domain.model.usecase.AddMedicalItemUseCase
import no.wmc.domain.model.usecase.GetMedicalItemUseCase
import no.wmc.ui.base.BaseViewModel
import no.wmc.ui.base.ViewEvent
import no.wmc.ui.base.ViewState
import no.wmc.ui.medical.AddMedicalInfoViewAction.AddMedicalItemAction
import no.wmc.ui.medical.AddMedicalInfoViewAction.SearchMedicalItemAction
import no.wmc.ui.medical.AddMedicalInfoViewEvent.AddMedicalItemEvent
import no.wmc.ui.medical.AddMedicalInfoViewEvent.LoadMoreMedicalItemEvent
import no.wmc.ui.medical.AddMedicalInfoViewEvent.SearchMedicalItemEvent
import no.wmc.utils.AppDispatchers

class AddMedicalInfoViewModel(
    private val getMedicalItemUseCase: GetMedicalItemUseCase,
    private val addMedicalItemUseCase: AddMedicalItemUseCase,
    override val viewState: AddMedicalInfoViewState,
    appDispatchers: AppDispatchers
) : BaseViewModel<AddMedicalInfoViewState>(appDispatchers) {
    override suspend fun handleViewEvent(event: ViewEvent) {
        when (event) {
            is SearchMedicalItemEvent -> handleKeywordChange(event.profileItemEnum, event.keyword)
            is LoadMoreMedicalItemEvent -> handleLoadMoreMedicalItemEvent(event.profileItemEnum)
            is AddMedicalItemEvent -> handleAddMedicalItemEvent(
                event.profileItemEnum,
                event.profileItem
            )
            else -> throwEventNotSupported(event)
        }
    }

    private suspend fun handleKeywordChange(profileItemEnum: ProfileItemEnum, keyword: String) {
        if (viewState.updateKeyword(keyword)) {
            handleLoadMoreMedicalItemEvent(profileItemEnum)
        }
    }

    private suspend fun handleLoadMoreMedicalItemEvent(profileItemEnum: ProfileItemEnum) {
        if (viewState.canQuery()) {
            viewState.isLoading = true
            postAction(SearchMedicalItemAction(ViewState.Loading()))
            postAction(
                SearchMedicalItemAction(
                    getViewState(
                        getMedicalItemUseCase(
                            profileItemEnum,
                            viewState.currentKeyword,
                            viewState.page
                        )
                    ) {
                        viewState.isLoading = false
                        viewState.addProfileItems(data?.items)
                        viewState.getMedicalItems()
                    }
                )
            )
        }
    }

    private suspend fun handleAddMedicalItemEvent(
        profileItemEnum: ProfileItemEnum,
        profileItem: ProfileItem.Item
    ) {
        postAction(AddMedicalItemAction(ViewState.Loading()))
        postAction(
            AddMedicalItemAction(
                getViewState(
                    state = addMedicalItemUseCase(profileItemEnum, profileItem)
                )
            )
        )
    }
}
