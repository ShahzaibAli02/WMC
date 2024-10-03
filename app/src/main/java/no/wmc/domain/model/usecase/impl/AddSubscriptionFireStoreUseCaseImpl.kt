package no.wmc.domain.model.usecase.impl

import android.content.Context
import no.wmc.data.remote.model.firestore.SubscriptionFsModel
import no.wmc.domain.DataState
import no.wmc.domain.model.usecase.AddSubscriptionFireStoreUseCase
import no.wmc.domain.model.usecase.ValidateEmailWithFireStoreUseCase
import no.wmc.domain.repo.AuthRepository

class AddSubscriptionFireStoreUseCaseImpl(
    private val context: Context,
    private val authRepository: AuthRepository
) : BaseUseCase(), AddSubscriptionFireStoreUseCase {

    /*override suspend fun invoke(email: String): DataState<Boolean> {
        return authRepository.validateEmailInFireStore(email)
    }*/
    override suspend fun invoke(subscription: SubscriptionFsModel): DataState<String> {
        return authRepository.addSubscriptionInFireStore(subscription)
    }
}
