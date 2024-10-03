package no.wmc.domain.model.usecase

import android.content.Context
import no.wmc.domain.DataState
import no.wmc.domain.model.Document
import java.io.File

interface DownloadDocumentUseCase {
    suspend operator fun invoke(context: Context, document: Document): DataState<File>
}
