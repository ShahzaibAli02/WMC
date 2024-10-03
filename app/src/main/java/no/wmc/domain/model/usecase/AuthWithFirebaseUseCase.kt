package no.wmc.domain.model.usecase

import android.content.Intent
import no.wmc.domain.DataState

interface AuthWithFirebaseUseCase {
    suspend operator fun invoke(intent: Intent): DataState<Unit>
}
