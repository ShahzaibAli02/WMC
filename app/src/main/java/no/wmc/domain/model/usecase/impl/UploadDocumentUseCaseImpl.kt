package no.wmc.domain.model.usecase.impl

import no.wmc.data.remote.providers.FireStoreProvider
import no.wmc.domain.DataState
import no.wmc.domain.model.usecase.UploadDocumentUseCase
import no.wmc.domain.repo.DocumentRepository
import no.wmc.firebase.helper.FireStoreHelper
import java.io.File

class UploadDocumentUseCaseImpl(
    private val fireStoreProvider: FireStoreProvider,
) : BaseUseCase(), UploadDocumentUseCase {
    override suspend fun invoke(
        category:String,
        email:String,
        title: String,
        description: String,
        typeId: Int,
        document: File
    ): DataState<Unit> {

        val result=fireStoreProvider.uploadDocument(category,email, title, description, typeId, document)
        if(result)
        {
            return DataState.Success()
        }
        else{
            return  DataState.Error(errorMessage = "Error uploading documents")
        }
    }
}
