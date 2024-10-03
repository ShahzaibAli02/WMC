package no.wmc.domain.model.usecase.impl

import android.content.Context
import kotlinx.coroutines.withTimeoutOrNull
import no.wmc.R
import no.wmc.data.remote.THIRTY_SECONDS_MS
import no.wmc.data.remote.model.FirebaseCreateAccountResult
import no.wmc.data.remote.model.FirebaseCreateAccountResult.AccountCreatedSuccessfully
import no.wmc.data.remote.model.FirebaseCreateAccountResult.AccountExist
import no.wmc.data.remote.model.FirebaseCreateAccountResult.UnknownCreateAccountError
import no.wmc.data.remote.model.FirebaseCreateAccountResult.WeakPassword
import no.wmc.domain.DataState
import no.wmc.domain.model.usecase.RegisterWithEmailAndPasswordUseCase
import no.wmc.domain.repo.AuthRepository

class RegisterWithEmailAndPasswordUseCaseImpl(
    private val context: Context,
    private val authRepository: AuthRepository
) : BaseUseCase(), RegisterWithEmailAndPasswordUseCase {

    override suspend fun invoke(
        email: String,
        password: String
    ): DataState<FirebaseCreateAccountResult> {
        return withTimeoutOrNull(THIRTY_SECONDS_MS) {
            return@withTimeoutOrNull when (val result =
                authRepository.registerWithEmail(email, password)) {
                is AccountCreatedSuccessfully -> DataState.Success(result)
                is AccountExist ->
                    DataState.Error(errorMessage = "Account exists", data = result)
                is WeakPassword ->
                    DataState.Error(errorMessage = "Weak password", data = result)
                is UnknownCreateAccountError ->
                    DataState.Error(errorMessage = result.message, data = result)
            }
        } ?: DataState.Error(errorMessage = context.getString(R.string.error_message))
    }
}
