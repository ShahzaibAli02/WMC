package no.wmc.ui.document

import no.wmc.domain.model.DocumentType
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState

sealed class DocumentMetadataViewAction : ViewAction() {
    class GetDocumentTypeViewAction(val viewState: ViewState<DocumentType>) :
        DocumentMetadataViewAction()
    class UploadDocumentViewAction(val viewState: ViewState<Unit>) : DocumentMetadataViewAction()
    class EditDocumentViewAction(val viewState: ViewState<Unit>) : DocumentMetadataViewAction()
}
