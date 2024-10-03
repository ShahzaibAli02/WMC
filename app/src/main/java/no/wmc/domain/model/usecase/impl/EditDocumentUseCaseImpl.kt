package no.wmc.domain.model.usecase.impl

import no.wmc.domain.DataState
import no.wmc.domain.model.usecase.EditDocumentUseCase
import no.wmc.domain.repo.DocumentRepository
import java.io.File

class EditDocumentUseCaseImpl(
    private val documentRepository: DocumentRepository
) : BaseUseCase(), EditDocumentUseCase {
    override suspend fun invoke(
        fileId: String,
        title: String,
        description: String,
        typeId: Int,
        document: File?
    ): DataState<Unit> {
        return getDataState(
            documentRepository.editDocument(
                fileId,
                title,
                description,
                typeId,
                document
            )
        )
    }
}
