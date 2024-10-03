package no.wmc.ui.otp

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import kotlin.Boolean
import kotlin.Int
import no.wmc.NavGraphDirections
import no.wmc.R

public class OTPFragmentDirections private constructor() {
  private data class ActionOTPFragmentToTerms(
    public val showButton: Boolean = true
  ) : NavDirections {
    public override val actionId: Int = R.id.action_OTPFragment_to_terms

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("showButton", this.showButton)
        return result
      }
  }

  public companion object {
    public fun actionOTPFragmentToLanding(): NavDirections =
        ActionOnlyNavDirections(R.id.action_OTPFragment_to_landing)

    public fun actionOTPFragmentToTerms(showButton: Boolean = true): NavDirections =
        ActionOTPFragmentToTerms(showButton)

    public fun actionGlobalLogout(): NavDirections = NavGraphDirections.actionGlobalLogout()
  }
}
