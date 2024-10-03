package no.wmc.domain.model.usecase.impl

import android.content.Context
import kotlinx.coroutines.withTimeoutOrNull
import no.wmc.R
import no.wmc.data.remote.THIRTY_SECONDS_MS
import no.wmc.domain.DataState
import no.wmc.domain.model.usecase.ResetPasswordUseCase
import no.wmc.domain.repo.AuthRepository

class ResetPasswordUseCaseImpl(
    private val context: Context,
    private val authRepository: AuthRepository
) : BaseUseCase(), ResetPasswordUseCase {

    override suspend fun invoke(email: String): DataState<Unit> {
        return withTimeoutOrNull(THIRTY_SECONDS_MS) {
            val result = runCatching { authRepository.resetPassword(email) }
            return@withTimeoutOrNull if (result.isSuccess) DataState.Success()
            else DataState.Error(
                errorMessage = result.exceptionOrNull()?.message
                    ?: context.getString(R.string.forgot_password_screen_error_message)
            )
        } ?: DataState.Error(
            errorMessage = context.getString(R.string.forgot_password_screen_error_message)
        )
    }
}
