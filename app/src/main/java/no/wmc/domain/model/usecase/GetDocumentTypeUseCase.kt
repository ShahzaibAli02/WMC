package no.wmc.domain.model.usecase

import no.wmc.domain.DataState
import no.wmc.domain.model.DocumentType

interface GetDocumentTypeUseCase {
    suspend operator fun invoke(): DataState<DocumentType>
}
