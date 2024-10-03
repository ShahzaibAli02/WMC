package no.wmc.ui.main.home

import android.content.Context
import android.net.Uri
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import no.wmc.data.local.manager.LocalDataManager
import no.wmc.data.remote.providers.FireStoreProvider
import no.wmc.domain.DataState
import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.domain.model.Document
import no.wmc.domain.model.ProfileItem
import no.wmc.domain.model.ShareMedicalInfo
import no.wmc.domain.model.ShareType
import no.wmc.domain.model.usecase.DownloadDocumentUseCase
import no.wmc.domain.model.usecase.GetDocumentsUseCase
import no.wmc.domain.model.usecase.GetProfileItemUseCase
import no.wmc.domain.model.usecase.GetProfileUseCase
import no.wmc.domain.model.usecase.OrderCardUseCase
import no.wmc.domain.model.usecase.RemoveDocumentUseCase
import no.wmc.domain.model.usecase.RemoveMedicalItemUseCase
import no.wmc.domain.model.usecase.ShareUseCase
import no.wmc.domain.model.usecase.UploadDocumentUseCase
import no.wmc.ui.base.BaseViewModel
import no.wmc.ui.base.ViewEvent
import no.wmc.ui.base.ViewState
import no.wmc.ui.base.ViewState.Loading
import no.wmc.ui.main.home.HomeViewAction.DownloadDocumentViewAction
import no.wmc.ui.main.home.HomeViewAction.GetAllergiesViewAction
import no.wmc.ui.main.home.HomeViewAction.GetDiagnosesViewAction
import no.wmc.ui.main.home.HomeViewAction.GetDocumentsViewAction
import no.wmc.ui.main.home.HomeViewAction.GetMedicineViewAction
import no.wmc.ui.main.home.HomeViewAction.GetProfileViewAction
import no.wmc.ui.main.home.HomeViewAction.GetVaccinesViewAction
import no.wmc.ui.main.home.HomeViewAction.OrderCardViewAction
import no.wmc.ui.main.home.HomeViewAction.RemoveDocumentViewAction
import no.wmc.ui.main.home.HomeViewAction.RemoveMedicalItemViewAction
import no.wmc.ui.main.home.HomeViewAction.SetNoAllergiesAction
import no.wmc.ui.main.home.HomeViewAction.ShareViewAction
import no.wmc.ui.main.home.HomeViewEvent.DownloadDocumentViewEvent
import no.wmc.ui.main.home.HomeViewEvent.GetAllergiesViewEvent
import no.wmc.ui.main.home.HomeViewEvent.GetDiagnosesViewEvent
import no.wmc.ui.main.home.HomeViewEvent.GetDocumentsViewEvent
import no.wmc.ui.main.home.HomeViewEvent.GetMedicineViewEvent
import no.wmc.ui.main.home.HomeViewEvent.GetProfileViewEvent
import no.wmc.ui.main.home.HomeViewEvent.GetVaccinesViewEvent
import no.wmc.ui.main.home.HomeViewEvent.OrderCardViewEvent
import no.wmc.ui.main.home.HomeViewEvent.RemoveDocumentViewEvent
import no.wmc.ui.main.home.HomeViewEvent.RemoveMedicalItemViewEvent
import no.wmc.ui.main.home.HomeViewEvent.SetNoAllergiesEvent
import no.wmc.ui.main.home.HomeViewEvent.ShareViewEvent
import no.wmc.utils.AppDispatchers

class HomeViewModel(
    private val getProfileUseCase: GetProfileUseCase,
    private val getProfileItemUseCase: GetProfileItemUseCase,
    private val getDocumentsUseCase: GetDocumentsUseCase,
    private val removeMedicalItemUseCase: RemoveMedicalItemUseCase,
    private val downloadDocumentUseCase: DownloadDocumentUseCase,
    private val removeDocumentUseCase: RemoveDocumentUseCase,
    private val shareUseCase: ShareUseCase,
    private val orderCardUseCase: OrderCardUseCase,
    private val fireStoreProvider: FireStoreProvider,
    private val localDataManager: LocalDataManager,
    override val viewState: HomeViewState = HomeViewState(),
    appDispatchers: AppDispatchers,
) : BaseViewModel<HomeViewState>(
    appDispatchers
)
{


    override suspend fun handleViewEvent(event: ViewEvent)
    {
        when (event)
        {
            is GetProfileViewEvent -> handleGetProfileEvent()
            is SetNoAllergiesEvent -> handleSetNoAllergiesEvent()
            is GetAllergiesViewEvent -> handleGetAllergiesEvent()
            is GetMedicineViewEvent -> handleGetMedicineEvent()
            is GetDiagnosesViewEvent -> handleGetDiagnosesEvent()
            is GetVaccinesViewEvent -> handleGetVaccinesEvent()
            is GetDocumentsViewEvent -> handleGetDocumentsEvent()
            is RemoveMedicalItemViewEvent -> handleRemoveMedicalItemEvent(
                event.profileItemEnum, event.profileItem
            )

            is DownloadDocumentViewEvent -> handleDownloadDocumentEvent(
                event.context, event.document
            )

            is RemoveDocumentViewEvent -> handleRemoveDocumentEvent(event.documentId)
            is ShareViewEvent -> handleShareViewEvent(event.context, event.shareType)
            is OrderCardViewEvent -> handleOrderCardEvent()
            else -> throwEventNotSupported(event)
        }
    }

    fun updateImage(uri: Uri, result: (Boolean) -> Unit) = viewModelScope.launch {
        localDataManager.getCredentials()?.email?.let {
            result.invoke(fireStoreProvider.updateUserImage(it, uri))
        } ?: result.invoke(false)
    }

    private suspend fun handleGetProfileEvent()
    {
        val cachedProfile = viewState.profile
        if (cachedProfile != null)
        { // Profile already cached in view model
            postAction(GetProfileViewAction(ViewState.Success(viewState.profile)))
        }
        postAction(GetProfileViewAction(Loading(cachedProfile)))
        postAction(GetProfileViewAction(getViewState(state = getProfileUseCase(""), successCallback = { viewState.profile = it })))
    }

    private suspend fun handleSetNoAllergiesEvent()
    {
        postAction(SetNoAllergiesAction(Loading()))
        postAction(SetNoAllergiesAction(getViewState(state = DataState.Success(data = true), successCallback = { viewState.noAllergiesSwitch = it!! })))
    }

    private suspend fun handleGetAllergiesEvent()
    {
        postAction(GetAllergiesViewAction(Loading()))
        postAction(GetAllergiesViewAction(getViewState(state = getProfileItemUseCase(ProfileItemEnum.ALLERGY), successCallback = { viewState.allergies = it })))
    }

    private suspend fun handleGetMedicineEvent()
    {
        postAction(GetMedicineViewAction(Loading()))
        postAction(GetMedicineViewAction(getViewState(state = getProfileItemUseCase(ProfileItemEnum.MEDICATION), successCallback = { viewState.medicines = it })))
    }

    private suspend fun handleGetDiagnosesEvent()
    {
        postAction(GetDiagnosesViewAction(Loading()))
        postAction(GetDiagnosesViewAction(getViewState(state = getProfileItemUseCase(ProfileItemEnum.DIAGNOSIS), successCallback = { viewState.diagnonses = it })))
    }

    private suspend fun handleGetVaccinesEvent()
    {
        postAction(GetVaccinesViewAction(Loading()))
        postAction(GetVaccinesViewAction(getViewState(state = getProfileItemUseCase(ProfileItemEnum.VACCINE), successCallback = { viewState.diagnonses = it })))
    }

    private suspend fun handleGetDocumentsEvent()
    {
        postAction(GetDocumentsViewAction(Loading()))
        localDataManager.getCredentials()?.email?.let {
            postAction(GetDocumentsViewAction(getViewState(state = getDocumentsUseCase(it), successCallback = { viewState.documents = it })))

        }
    }

    private suspend fun handleRemoveMedicalItemEvent(
        profileItemEnum: ProfileItemEnum,
        profileItem: ProfileItem.Item,
    )
    {
        postAction(
            RemoveMedicalItemViewAction(getViewState(
                state = removeMedicalItemUseCase(profileItemEnum, profileItem)
            ) {
                profileItemEnum
            })
        )
    }

    private suspend fun handleDownloadDocumentEvent(context: Context, document: Document)
    {
        postAction(DownloadDocumentViewAction(Loading()))
        postAction(DownloadDocumentViewAction(getViewState(state = downloadDocumentUseCase(context, document), successCallback = { viewState.downloadedDocument = it })))
    }

    private suspend fun handleRemoveDocumentEvent(documentId: Int)
    {
        postAction(RemoveDocumentViewAction(Loading()))
        postAction(
            RemoveDocumentViewAction(
                getViewState(
                    state = removeDocumentUseCase(documentId)
                )
            )
        )
    }

    private suspend fun handleShareViewEvent(context: Context, shareType: ShareType)
    {
        postAction(
            ShareViewAction(
                Loading(
                    data = ShareMedicalInfo(shareType, null)
                )
            )
        )
        postAction(ShareViewAction(getViewState(state = shareUseCase(context, shareType), successConverter = { file ->
            ShareMedicalInfo(
                shareType = shareType, file = file
            )
        }, errorConverter = {
            ShareMedicalInfo(
                shareType = shareType, file = null
            )
        })))
    }

    private suspend fun handleOrderCardEvent()
    {
        postAction(
            OrderCardViewAction(
                getViewState(
                    state = orderCardUseCase()
                )
            )
        )
    }
}
