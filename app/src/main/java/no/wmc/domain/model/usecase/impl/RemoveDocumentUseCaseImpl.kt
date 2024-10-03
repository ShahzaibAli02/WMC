package no.wmc.domain.model.usecase.impl

import no.wmc.domain.DataState
import no.wmc.domain.model.usecase.RemoveDocumentUseCase
import no.wmc.domain.repo.DocumentRepository

class RemoveDocumentUseCaseImpl(
    private val documentRepository: DocumentRepository
) : BaseUseCase(), RemoveDocumentUseCase {
    override suspend fun invoke(documentId: Int): DataState<Unit> {
        return getDataState(documentRepository.removeDocument(documentId))
    }
}
