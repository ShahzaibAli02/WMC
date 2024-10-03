package no.wmc.domain.model.usecase.impl

import android.content.Context
import android.content.Intent
import kotlinx.coroutines.withTimeoutOrNull
import no.wmc.R
import no.wmc.data.remote.THIRTY_SECONDS_MS
import no.wmc.domain.DataState
import no.wmc.domain.model.usecase.AuthWithFirebaseUseCase
import no.wmc.domain.repo.AuthRepository

class AuthWithFirebaseUseCaseImpl(
    private val context: Context,
    private val authRepository: AuthRepository
) : BaseUseCase(), AuthWithFirebaseUseCase {

    override suspend fun invoke(intent: Intent): DataState<Unit> {
        return withTimeoutOrNull(THIRTY_SECONDS_MS) {
            return@withTimeoutOrNull DataState.Success(authRepository.signInWithGoogle(intent))
        } ?: DataState.Error(errorMessage = context.getString(R.string.error_message))
    }
}
