package no.wmc.ui.document

import no.wmc.data.local.manager.LocalDataManager
import no.wmc.domain.model.usecase.EditDocumentUseCase
import no.wmc.domain.model.usecase.GetDocumentTypeUseCase
import no.wmc.domain.model.usecase.UploadDocumentUseCase
import no.wmc.ui.base.BaseViewModel
import no.wmc.ui.base.ViewEvent
import no.wmc.ui.base.ViewState
import no.wmc.ui.document.DocumentMetadataViewAction.EditDocumentViewAction
import no.wmc.ui.document.DocumentMetadataViewAction.GetDocumentTypeViewAction
import no.wmc.ui.document.DocumentMetadataViewAction.UploadDocumentViewAction
import no.wmc.ui.document.DocumentMetadataViewEvent.EditDocumentViewEvent
import no.wmc.ui.document.DocumentMetadataViewEvent.GetDocumentTypeViewEvent
import no.wmc.ui.document.DocumentMetadataViewEvent.UploadDocumentViewEvent
import no.wmc.utils.AppDispatchers
import java.io.File

class DocumentMetadataViewModel(
    private val getDocumentTypeUseCase: GetDocumentTypeUseCase,
    private val uploadDocumentUseCase: UploadDocumentUseCase,
    private val editDocumentUseCase: EditDocumentUseCase,
    private val localDataManager: LocalDataManager,
    override val viewState: DocumentMetadataViewState,
    appDispatchers: AppDispatchers
) : BaseViewModel<DocumentMetadataViewState>(appDispatchers) {
    override suspend fun handleViewEvent(event: ViewEvent) {
        when (event) {
            is GetDocumentTypeViewEvent -> handleGetDocumentTypeEvent()
            is UploadDocumentViewEvent -> handleUploadDocumentEvent(
                event.category,
                event.title,
                event.description,
                event.typeId,
                event.document
            )
            is EditDocumentViewEvent -> handleEditDocumentEvent(
                event.fileId,
                event.title,
                event.description,
                event.typeId,
                event.document
            )
            else -> throwEventNotSupported(event)
        }
    }

    private suspend fun handleGetDocumentTypeEvent() {
        postAction(
            GetDocumentTypeViewAction(
                getViewState(
                    state = getDocumentTypeUseCase(),
                    successCallback = {
                        viewState.documentType = it
                    }
                )
            )
        )
    }

    private suspend fun handleUploadDocumentEvent(
        category: String,
        title: String,
        description: String,
        typeId: Int,
        document: File
    ) {
        postAction(UploadDocumentViewAction(ViewState.Loading()))
        localDataManager.getCredentials()?.email?.let {email->
            postAction(
                UploadDocumentViewAction(
                    getViewState(
                        state = uploadDocumentUseCase(category,email,title, description, typeId, document)
                    )
                )
            )
        }


    }

    private suspend fun handleEditDocumentEvent(
        fileId: String,
        title: String,
        description: String,
        typeId: Int,
        document: File?
    ) {
        postAction(EditDocumentViewAction(ViewState.Loading()))
        postAction(
            EditDocumentViewAction(
                getViewState(
                    state = editDocumentUseCase(fileId, title, description, typeId, document)
                )
            )
        )
    }
}
