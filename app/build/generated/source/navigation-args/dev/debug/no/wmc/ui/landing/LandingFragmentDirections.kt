package no.wmc.ui.landing

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import kotlin.Boolean
import kotlin.Int
import no.wmc.NavGraphDirections
import no.wmc.R

public class LandingFragmentDirections private constructor() {
  private data class LandingToTerms(
    public val showButton: Boolean = true
  ) : NavDirections {
    public override val actionId: Int = R.id.landing_to_terms

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("showButton", this.showButton)
        return result
      }
  }

  public companion object {
    public fun landingToLogin(): NavDirections = ActionOnlyNavDirections(R.id.landing_to_login)

    public fun landingToTerms(showButton: Boolean = true): NavDirections =
        LandingToTerms(showButton)

    public fun landingToHome(): NavDirections = ActionOnlyNavDirections(R.id.landing_to_home)

    public fun actionGlobalLogout(): NavDirections = NavGraphDirections.actionGlobalLogout()
  }
}
