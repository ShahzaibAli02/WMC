package no.wmc.domain.model.usecase.impl

import android.content.Context
import no.wmc.domain.DataState
import no.wmc.domain.model.Profile
import no.wmc.domain.model.usecase.RegisterUserUseCase
import no.wmc.domain.repo.AuthRepository

class RegisterUserUseCaseImpl(private val context: Context, private val authRepository: AuthRepository) : BaseUseCase(), RegisterUserUseCase {

    override suspend fun invoke(profile: Profile): DataState<String> {

        return profile.uid?.let {
            authRepository.registerUser(it,profile)
        }?:DataState.Error(errorMessage = "Required uid is null")
    }
}
