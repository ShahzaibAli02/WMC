package no.wmc.domain.model.usecase

import no.wmc.data.remote.model.firestore.SubscriptionFsModel
import no.wmc.domain.DataState
import no.wmc.domain.model.Profile

interface AddSubscriptionFireStoreUseCase {
    suspend operator fun invoke(
        subscription: SubscriptionFsModel
    ): DataState<String>
}
