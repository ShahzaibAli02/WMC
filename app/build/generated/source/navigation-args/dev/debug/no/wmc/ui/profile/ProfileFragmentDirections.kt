package no.wmc.ui.profile

import androidx.navigation.NavDirections
import no.wmc.NavGraphDirections

public class ProfileFragmentDirections private constructor() {
  public companion object {
    public fun actionGlobalLogout(): NavDirections = NavGraphDirections.actionGlobalLogout()
  }
}
