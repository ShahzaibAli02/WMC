package no.wmc.domain.model.usecase

import no.wmc.domain.DataState

interface InviteSubscriptionUserUseCase {
    suspend operator fun invoke(subscriptionId: Int, email: String): DataState<Unit>
}
