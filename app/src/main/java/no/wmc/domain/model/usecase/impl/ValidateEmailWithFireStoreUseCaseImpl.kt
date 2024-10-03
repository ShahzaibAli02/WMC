package no.wmc.domain.model.usecase.impl

import android.content.Context
import no.wmc.domain.DataState
import no.wmc.domain.model.usecase.ValidateEmailWithFireStoreUseCase
import no.wmc.domain.repo.AuthRepository

class ValidateEmailWithFireStoreUseCaseImpl(
    private val context: Context,
    private val authRepository: AuthRepository
) : BaseUseCase(), ValidateEmailWithFireStoreUseCase {

    override suspend fun invoke(email: String): DataState<Boolean> {
        return authRepository.validateEmailInFireStore(email)
    }
}
