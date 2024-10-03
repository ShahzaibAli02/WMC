package no.wmc.domain.model.usecase

import no.wmc.data.remote.model.FirebaseCreateAccountResult
import no.wmc.domain.DataState

interface RegisterWithEmailAndPasswordUseCase {
    suspend operator fun invoke(
        email: String,
        password: String
    ): DataState<FirebaseCreateAccountResult>
}
