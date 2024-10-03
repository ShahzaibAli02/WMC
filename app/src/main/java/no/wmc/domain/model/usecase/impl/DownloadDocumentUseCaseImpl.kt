package no.wmc.domain.model.usecase.impl

import android.content.Context
import no.wmc.domain.DataState
import no.wmc.domain.model.Document
import no.wmc.domain.model.usecase.DownloadDocumentUseCase
import no.wmc.domain.repo.DocumentRepository
import java.io.File

class DownloadDocumentUseCaseImpl(
    private val documentRepository: DocumentRepository
) : BaseUseCase(), DownloadDocumentUseCase {
    override suspend fun invoke(
        context: Context,
        document: Document
    ): DataState<File> {
        return getDataState(documentRepository.downloadDocument(context, document))
    }
}
