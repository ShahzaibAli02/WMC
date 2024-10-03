package no.wmc.ui.main

import androidx.navigation.NavDirections
import no.wmc.NavGraphDirections

public class EmergencyFragmentDirections private constructor() {
  public companion object {
    public fun actionGlobalLogout(): NavDirections = NavGraphDirections.actionGlobalLogout()
  }
}
