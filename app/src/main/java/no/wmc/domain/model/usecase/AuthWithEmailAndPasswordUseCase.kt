package no.wmc.domain.model.usecase

import no.wmc.data.remote.model.FirebaseAuthResult
import no.wmc.domain.DataState

interface AuthWithEmailAndPasswordUseCase {
    suspend operator fun invoke(email: String, password: String,isRemember : Boolean): DataState<FirebaseAuthResult>
}
