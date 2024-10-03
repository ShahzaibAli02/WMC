package no.wmc.domain.model.usecase.impl

import android.content.Context
import kotlinx.coroutines.withTimeoutOrNull
import no.wmc.R
import no.wmc.data.remote.THIRTY_SECONDS_MS
import no.wmc.data.remote.model.FirebaseAuthResult
import no.wmc.data.remote.model.FirebaseAuthResult.SignInSuccessResult
import no.wmc.data.remote.model.FirebaseAuthResult.UserNotFoundError
import no.wmc.data.remote.model.FirebaseAuthResult.WrongPasswordError
import no.wmc.domain.DataState
import no.wmc.domain.model.usecase.AuthWithEmailAndPasswordUseCase
import no.wmc.domain.repo.AuthRepository

class AuthWithEmailAndPasswordUseCaseImpl(
    private val context: Context,
    private val authRepository: AuthRepository
) : BaseUseCase(), AuthWithEmailAndPasswordUseCase {

    override suspend fun invoke(email: String, password: String,isRemember : Boolean): DataState<FirebaseAuthResult> {
        return withTimeoutOrNull(THIRTY_SECONDS_MS) {
            return@withTimeoutOrNull when (val result =
                authRepository.signInWithEmail(email, password,isRemember)
            ) {
                is SignInSuccessResult -> DataState.Success(result)
                is WrongPasswordError ->
                    DataState.Error(errorMessage = result.message, data = result)
                is UserNotFoundError ->
                    DataState.Error(errorMessage = result.message, data = result)
                else -> DataState.Error(errorMessage = "Unknown error", data = result)
            }
        } ?: DataState.Error(errorMessage = context.getString(R.string.error_message))
    }
}
