package no.wmc.ui.terms

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import no.wmc.NavGraphDirections
import no.wmc.R

public class TermsFragmentDirections private constructor() {
  public companion object {
    public fun termsToHome(): NavDirections = ActionOnlyNavDirections(R.id.terms_to_home)

    public fun actionGlobalLogout(): NavDirections = NavGraphDirections.actionGlobalLogout()
  }
}
