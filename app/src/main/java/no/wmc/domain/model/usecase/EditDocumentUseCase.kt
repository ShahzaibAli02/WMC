package no.wmc.domain.model.usecase

import no.wmc.domain.DataState
import java.io.File

interface EditDocumentUseCase {
    suspend operator fun invoke(
        fileId: String,
        title: String,
        description: String,
        typeId: Int,
        document: File?
    ): DataState<Unit>
}
