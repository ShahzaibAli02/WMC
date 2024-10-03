package no.wmc.domain.model.usecase

import no.wmc.domain.DataState
import no.wmc.domain.model.Subscription

interface GetSubscriptionDetailUseCase {
    suspend operator fun invoke(id: Int): DataState<Subscription>
}
