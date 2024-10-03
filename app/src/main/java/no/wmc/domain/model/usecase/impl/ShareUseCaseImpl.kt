package no.wmc.domain.model.usecase.impl

import android.content.Context
import no.wmc.domain.DataState
import no.wmc.domain.model.ShareType
import no.wmc.domain.model.usecase.ShareUseCase
import no.wmc.domain.repo.ProfileRepository
import java.io.File

class ShareUseCaseImpl(
    private val profileRepo: ProfileRepository
) : BaseUseCase(), ShareUseCase {
    override suspend fun invoke(
        context: Context,
        shareType: ShareType
    ): DataState<File> {

        throw Exception("TODO REMOVE CODE")
//        return getDataState(
//            profileRepo.shareMedicalItem(context, shareType)
//        )
    }
}
