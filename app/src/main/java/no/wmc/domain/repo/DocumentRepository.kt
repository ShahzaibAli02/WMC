package no.wmc.domain.repo

import android.content.Context
import no.wmc.data.remote.model.DocumentListDtoModel
import no.wmc.data.remote.model.DocumentTypeDtoModel
import no.wmc.domain.DataState
import no.wmc.domain.model.Document
import java.io.File

interface DocumentRepository {
    suspend fun getDocuments(): DataState<DocumentListDtoModel>

    suspend fun getDocumentType(): DataState<DocumentTypeDtoModel>

    suspend fun uploadDocument(
        title: String,
        description: String,
        typeId: Int,
        document: File
    ): DataState<Unit>

    suspend fun editDocument(
        fileId: String,
        title: String,
        description: String,
        typeId: Int,
        document: File?
    ): DataState<Unit>

    suspend fun downloadDocument(context: Context, document: Document): DataState<File>

    suspend fun removeDocument(documentId: Int): DataState<Unit>
}
