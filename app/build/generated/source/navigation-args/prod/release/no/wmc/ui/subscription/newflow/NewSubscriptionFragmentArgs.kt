package no.wmc.ui.subscription.newflow

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class NewSubscriptionFragmentArgs(
  public val email: String = "",
  public val password: String = ""
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("email", this.email)
    result.putString("password", this.password)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("email", this.email)
    result.set("password", this.password)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): NewSubscriptionFragmentArgs {
      bundle.setClassLoader(NewSubscriptionFragmentArgs::class.java.classLoader)
      val __email : String?
      if (bundle.containsKey("email")) {
        __email = bundle.getString("email")
        if (__email == null) {
          throw IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.")
        }
      } else {
        __email = ""
      }
      val __password : String?
      if (bundle.containsKey("password")) {
        __password = bundle.getString("password")
        if (__password == null) {
          throw IllegalArgumentException("Argument \"password\" is marked as non-null but was passed a null value.")
        }
      } else {
        __password = ""
      }
      return NewSubscriptionFragmentArgs(__email, __password)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        NewSubscriptionFragmentArgs {
      val __email : String?
      if (savedStateHandle.contains("email")) {
        __email = savedStateHandle["email"]
        if (__email == null) {
          throw IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value")
        }
      } else {
        __email = ""
      }
      val __password : String?
      if (savedStateHandle.contains("password")) {
        __password = savedStateHandle["password"]
        if (__password == null) {
          throw IllegalArgumentException("Argument \"password\" is marked as non-null but was passed a null value")
        }
      } else {
        __password = ""
      }
      return NewSubscriptionFragmentArgs(__email, __password)
    }
  }
}
