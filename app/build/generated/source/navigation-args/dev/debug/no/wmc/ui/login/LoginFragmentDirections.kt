package no.wmc.ui.login

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import no.wmc.NavGraphDirections
import no.wmc.R

public class LoginFragmentDirections private constructor() {
  private data class LoginToTerms(
    public val showButton: Boolean = true
  ) : NavDirections {
    public override val actionId: Int = R.id.login_to_terms

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putBoolean("showButton", this.showButton)
        return result
      }
  }

  private data class LoginToRegister(
    public val name: String = "",
    public val email: String = ""
  ) : NavDirections {
    public override val actionId: Int = R.id.login_to_register

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("name", this.name)
        result.putString("email", this.email)
        return result
      }
  }

  private data class LoginToSubscription(
    public val email: String = "",
    public val password: String = ""
  ) : NavDirections {
    public override val actionId: Int = R.id.login_to_subscription

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("email", this.email)
        result.putString("password", this.password)
        return result
      }
  }

  private data class ActionLoginToOTPFragment(
    public val phoneNumber: String,
    public val email: String,
    public val password: String
  ) : NavDirections {
    public override val actionId: Int = R.id.action_login_to_OTPFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("phoneNumber", this.phoneNumber)
        result.putString("email", this.email)
        result.putString("password", this.password)
        return result
      }
  }

  public companion object {
    public fun loginToHome(): NavDirections = ActionOnlyNavDirections(R.id.login_to_home)

    public fun loginToTerms(showButton: Boolean = true): NavDirections = LoginToTerms(showButton)

    public fun loginToResetPassword(): NavDirections =
        ActionOnlyNavDirections(R.id.login_to_reset_password)

    public fun loginToRegister(name: String = "", email: String = ""): NavDirections =
        LoginToRegister(name, email)

    public fun loginToSubscription(email: String = "", password: String = ""): NavDirections =
        LoginToSubscription(email, password)

    public fun actionLoginToOTPFragment(
      phoneNumber: String,
      email: String,
      password: String
    ): NavDirections = ActionLoginToOTPFragment(phoneNumber, email, password)

    public fun actionLoginToDash(): NavDirections =
        ActionOnlyNavDirections(R.id.action_login_to_dash)

    public fun actionGlobalLogout(): NavDirections = NavGraphDirections.actionGlobalLogout()
  }
}
