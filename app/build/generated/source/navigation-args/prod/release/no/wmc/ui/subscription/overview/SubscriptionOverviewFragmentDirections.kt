package no.wmc.ui.subscription.overview

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import no.wmc.NavGraphDirections
import no.wmc.R

public class SubscriptionOverviewFragmentDirections private constructor() {
  private data class SubscriptionOverviewToSubscriptionDetail(
    public val id: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.subscription_overview_to_subscription_detail

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("id", this.id)
        return result
      }
  }

  public companion object {
    public fun subscriptionOverviewToSubscriptionDetail(id: Int): NavDirections =
        SubscriptionOverviewToSubscriptionDetail(id)

    public fun actionGlobalLogout(): NavDirections = NavGraphDirections.actionGlobalLogout()
  }
}
