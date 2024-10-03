package no.wmc.data.repo

import android.content.ContentResolver
import android.content.Context
import android.net.Uri
import no.wmc.data.local.manager.LocalDataManager
import no.wmc.data.manager.NetworkStateManager
import no.wmc.data.remote.model.DocumentListDtoModel
import no.wmc.data.remote.model.DocumentTypeDtoModel
import no.wmc.data.remote.model.OpenableUriRequestBody
import no.wmc.data.remote.service.DocumentApiService
import no.wmc.domain.DataState
import no.wmc.domain.model.Document
import no.wmc.domain.repo.DocumentRepository
import no.wmc.utils.FileUtils
import no.wmc.utils.ext.getCurrentLocaleLang
import okhttp3.MultipartBody.Part
import java.io.File

class DocumentRepositoryImpl(
    private val documentApiService: DocumentApiService,
    private val contentResolver: ContentResolver,
    localDataManager: LocalDataManager,
    networkStateManager: NetworkStateManager
) : BaseRepository(networkStateManager, localDataManager), DocumentRepository {

    override suspend fun getDocuments(): DataState<DocumentListDtoModel> {
        return execute {
            documentApiService.getDocuments(
                page = 1,
                pageSize = 100
            )
        }
    }

    override suspend fun getDocumentType(): DataState<DocumentTypeDtoModel> {
        return execute {
            documentApiService.getDocumentType(
                page = 1,
                pageSize = 100,
                lang = getCurrentLocaleLang()
            )
        }
    }

    override suspend fun uploadDocument(
        title: String,
        description: String,
        typeId: Int,
        document: File
    ): DataState<Unit> {
        val titlePart = Part.createFormData("FileTitle", title)
        val descriptionPart = Part.createFormData("FileDescription", description)
        val typeIdPart = Part.createFormData("FileCategoryId", typeId.toString())
        val documentMultipartBody = Part.createFormData(
            "FileData",
            document.name,
            OpenableUriRequestBody(contentResolver, Uri.fromFile(document))
        )
        return execute {
            documentApiService.uploadDocument(
                title = titlePart,
                description = descriptionPart,
                categoryId = typeIdPart,
                document = documentMultipartBody
            )
        }
    }

    override suspend fun editDocument(
        fileId: String,
        title: String,
        description: String,
        typeId: Int,
        document: File?
    ): DataState<Unit> {
        val titlePart = Part.createFormData("FileTitle", title)
        val descriptionPart = Part.createFormData("FileDescription", description)
        val typeIdPart = Part.createFormData("FileCategoryId", typeId.toString())
        val documentMultipartBody = if (document != null) {
            Part.createFormData(
                "FileData",
                document.name,
                OpenableUriRequestBody(contentResolver, Uri.fromFile(document))
            )
        } else {
            null
        }
        return execute {
            documentApiService.editDocument(
                id = fileId,
                title = titlePart,
                description = descriptionPart,
                categoryId = typeIdPart,
                document = documentMultipartBody
            )
        }
    }

    override suspend fun downloadDocument(context: Context, document: Document): DataState<File> {
        return execute {
            val response = documentApiService.downloadDocument(document.id)
            FileUtils.writeToFile(
                context,
                document.title,
                document.extension,
                response.byteStream()
            )
        }
    }

    override suspend fun removeDocument(documentId: Int): DataState<Unit> {
        return execute {
            documentApiService.removeDocument(documentId)
        }
    }
}
