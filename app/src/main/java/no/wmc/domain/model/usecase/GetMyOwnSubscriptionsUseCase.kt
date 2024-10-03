package no.wmc.domain.model.usecase

import no.wmc.domain.DataState
import no.wmc.domain.model.Subscription

interface GetMyOwnSubscriptionsUseCase {
    suspend operator fun invoke(): DataState<List<Subscription>>
}
