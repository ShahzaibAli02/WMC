package no.wmc.utils.ext

import androidx.annotation.NonNull
import androidx.navigation.NavController
import androidx.navigation.NavDirections

/**
 * Safely navigate to destination
 * Prevent App crash if destination action id is not found in current destination
 */
fun NavController.safeNavigate(@NonNull direction: NavDirections) {
    currentDestination?.getAction(direction.actionId)?.run {
        navigate(direction)
    }
}
