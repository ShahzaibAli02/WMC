package no.wmc.domain.model.usecase

import android.content.Context
import no.wmc.domain.DataState
import no.wmc.domain.model.ShareType
import java.io.File

interface ShareUseCase {
    suspend operator fun invoke(
        context: Context,
        shareType: ShareType
    ): DataState<File>
}
