package no.wmc.ui.subscription.invitation

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class SubscriptionInvitationFragmentArgs(
  public val subscriptionId: Int
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("subscriptionId", this.subscriptionId)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("subscriptionId", this.subscriptionId)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SubscriptionInvitationFragmentArgs {
      bundle.setClassLoader(SubscriptionInvitationFragmentArgs::class.java.classLoader)
      val __subscriptionId : Int
      if (bundle.containsKey("subscriptionId")) {
        __subscriptionId = bundle.getInt("subscriptionId")
      } else {
        throw IllegalArgumentException("Required argument \"subscriptionId\" is missing and does not have an android:defaultValue")
      }
      return SubscriptionInvitationFragmentArgs(__subscriptionId)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        SubscriptionInvitationFragmentArgs {
      val __subscriptionId : Int?
      if (savedStateHandle.contains("subscriptionId")) {
        __subscriptionId = savedStateHandle["subscriptionId"]
        if (__subscriptionId == null) {
          throw IllegalArgumentException("Argument \"subscriptionId\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"subscriptionId\" is missing and does not have an android:defaultValue")
      }
      return SubscriptionInvitationFragmentArgs(__subscriptionId)
    }
  }
}
