package no.wmc.ui.splash

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import no.wmc.NavGraphDirections
import no.wmc.R

public class SplashFragmentDirections private constructor() {
  public companion object {
    public fun splashToIntro(): NavDirections = ActionOnlyNavDirections(R.id.splash_to_intro)

    public fun splashToLanding(): NavDirections = ActionOnlyNavDirections(R.id.splash_to_landing)

    public fun splashToHome(): NavDirections = ActionOnlyNavDirections(R.id.splash_to_home)

    public fun actionGlobalLogout(): NavDirections = NavGraphDirections.actionGlobalLogout()
  }
}
