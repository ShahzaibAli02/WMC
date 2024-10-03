package no.wmc.ui.registration

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String
import no.wmc.NavGraphDirections
import no.wmc.R

public class RegisterFragmentDirections private constructor() {
  private data class RegisterToSubscription(
    public val email: String = "",
    public val password: String = ""
  ) : NavDirections {
    public override val actionId: Int = R.id.register_to_subscription

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("email", this.email)
        result.putString("password", this.password)
        return result
      }
  }

  public companion object {
    public fun registerToSubscription(email: String = "", password: String = ""): NavDirections =
        RegisterToSubscription(email, password)

    public fun actionGlobalLogout(): NavDirections = NavGraphDirections.actionGlobalLogout()
  }
}
