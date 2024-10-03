package no.wmc.domain.model.usecase

import no.wmc.domain.DataState
import no.wmc.domain.model.DocumentList.DocumentGroup

interface GetDocumentsUseCase {
    suspend operator fun invoke(email:String): DataState<List<DocumentGroup>>
}
