package no.wmc.domain.model.usecase

import no.wmc.domain.DataState

interface CancelSubscriptionUseCase {
    suspend operator fun invoke(subscriptionId: Int): DataState<Unit>
}
