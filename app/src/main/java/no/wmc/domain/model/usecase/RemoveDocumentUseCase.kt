package no.wmc.domain.model.usecase

import no.wmc.domain.DataState

interface RemoveDocumentUseCase {
    suspend operator fun invoke(documentId: Int): DataState<Unit>
}
