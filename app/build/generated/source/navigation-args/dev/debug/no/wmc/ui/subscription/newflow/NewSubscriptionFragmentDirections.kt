package no.wmc.ui.subscription.newflow

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import no.wmc.NavGraphDirections
import no.wmc.R

public class NewSubscriptionFragmentDirections private constructor() {
  public companion object {
    public fun subscribeToLogin(): NavDirections = ActionOnlyNavDirections(R.id.subscribe_to_login)

    public fun subscribeToHome(): NavDirections = ActionOnlyNavDirections(R.id.subscribe_to_home)

    public fun actionGlobalLogout(): NavDirections = NavGraphDirections.actionGlobalLogout()
  }
}
