package no.wmc.ui.main.dashboard

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import no.wmc.NavGraphDirections
import no.wmc.R

public class DashFragmentDirections private constructor() {
  public companion object {
    public fun dashToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.dash_to_login_fragment)

    public fun actionGlobalLogout(): NavDirections = NavGraphDirections.actionGlobalLogout()
  }
}
