package no.wmc.ui.main.home

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import kotlin.Boolean
import kotlin.Int
import no.wmc.NavGraphDirections
import no.wmc.R

public class MainBottomDialogDirections private constructor() {
  private data class HomeToTerms(
    public val showButton: Boolean = true
  ) : NavDirections {
    public override val actionId: Int = R.id.home_to_terms

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("showButton", this.showButton)
        return result
      }
  }

  public companion object {
    public fun homeToTerms(showButton: Boolean = true): NavDirections = HomeToTerms(showButton)

    public fun homeToSubscriptionOverview(): NavDirections =
        ActionOnlyNavDirections(R.id.home_to_subscription_overview)

    public fun actionGlobalLogout(): NavDirections = NavGraphDirections.actionGlobalLogout()
  }
}
