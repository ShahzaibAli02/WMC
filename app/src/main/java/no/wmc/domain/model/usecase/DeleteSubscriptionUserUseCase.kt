package no.wmc.domain.model.usecase

import no.wmc.domain.DataState

interface DeleteSubscriptionUserUseCase {
    suspend operator fun invoke(subscriptionId: Int, customerId: Int): DataState<Unit>
}
