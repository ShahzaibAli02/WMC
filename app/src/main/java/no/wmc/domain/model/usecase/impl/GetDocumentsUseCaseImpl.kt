package no.wmc.domain.model.usecase.impl

import no.wmc.data.remote.providers.FireStoreProvider
import no.wmc.domain.DataState
import no.wmc.domain.mapper.toModel
import no.wmc.domain.model.DocumentList.DocumentGroup
import no.wmc.domain.model.usecase.GetDocumentsUseCase
import no.wmc.domain.repo.DocumentRepository

class GetDocumentsUseCaseImpl(
    private val fireStoreProvider: FireStoreProvider
) : BaseUseCase(), GetDocumentsUseCase {
    override suspend fun invoke(email:String): DataState<List<DocumentGroup>> {
        return try
        {
            DataState.Success(fireStoreProvider.getDocuments(email))
        }
        catch (e:Exception)
        {
            DataState.Error(errorMessage = "failed to get documents")
        }
    }
}
