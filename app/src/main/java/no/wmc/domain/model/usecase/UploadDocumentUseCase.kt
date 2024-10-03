package no.wmc.domain.model.usecase

import no.wmc.domain.DataState
import java.io.File

interface UploadDocumentUseCase {
    suspend operator fun invoke(
        category:String,
        email:String,
        title: String,
        description: String,
        typeId: Int,
        document: File
    ): DataState<Unit>
}
