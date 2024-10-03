package no.wmc.ui.intro

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import no.wmc.NavGraphDirections
import no.wmc.R

public class IntroFragmentDirections private constructor() {
  public companion object {
    public fun introToLanding(): NavDirections = ActionOnlyNavDirections(R.id.intro_to_landing)

    public fun introToLogin(): NavDirections = ActionOnlyNavDirections(R.id.intro_to_login)

    public fun actionGlobalLogout(): NavDirections = NavGraphDirections.actionGlobalLogout()
  }
}
