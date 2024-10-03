package no.wmc.ui.subscription.details

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import no.wmc.NavGraphDirections
import no.wmc.R

public class SubscriptionDetailFragmentDirections private constructor() {
  private data class SubscriptionDetailToSubscriptionInvitation(
    public val subscriptionId: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.subscription_detail_to_subscription_invitation

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("subscriptionId", this.subscriptionId)
        return result
      }
  }

  public companion object {
    public fun subscriptionDetailToSubscriptionInvitation(subscriptionId: Int): NavDirections =
        SubscriptionDetailToSubscriptionInvitation(subscriptionId)

    public fun actionGlobalLogout(): NavDirections = NavGraphDirections.actionGlobalLogout()
  }
}
