package no.wmc.ui.document

import no.wmc.ui.base.ViewEvent
import java.io.File

sealed class DocumentMetadataViewEvent : ViewEvent() {
    object GetDocumentTypeViewEvent : DocumentMetadataViewEvent()
    class UploadDocumentViewEvent(
        val category:String,
        val title: String,
        val description: String,
        val typeId: Int,
        val document: File
    ) : DocumentMetadataViewEvent()
    class EditDocumentViewEvent(
        val fileId: String,
        val title: String,
        val description: String,
        val typeId: Int,
        val document: File?
    ) : DocumentMetadataViewEvent()
}
