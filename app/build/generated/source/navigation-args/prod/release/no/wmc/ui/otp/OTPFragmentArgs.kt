package no.wmc.ui.otp

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class OTPFragmentArgs(
  public val phoneNumber: String,
  public val email: String,
  public val password: String
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("phoneNumber", this.phoneNumber)
    result.putString("email", this.email)
    result.putString("password", this.password)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("phoneNumber", this.phoneNumber)
    result.set("email", this.email)
    result.set("password", this.password)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): OTPFragmentArgs {
      bundle.setClassLoader(OTPFragmentArgs::class.java.classLoader)
      val __phoneNumber : String?
      if (bundle.containsKey("phoneNumber")) {
        __phoneNumber = bundle.getString("phoneNumber")
        if (__phoneNumber == null) {
          throw IllegalArgumentException("Argument \"phoneNumber\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"phoneNumber\" is missing and does not have an android:defaultValue")
      }
      val __email : String?
      if (bundle.containsKey("email")) {
        __email = bundle.getString("email")
        if (__email == null) {
          throw IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue")
      }
      val __password : String?
      if (bundle.containsKey("password")) {
        __password = bundle.getString("password")
        if (__password == null) {
          throw IllegalArgumentException("Argument \"password\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"password\" is missing and does not have an android:defaultValue")
      }
      return OTPFragmentArgs(__phoneNumber, __email, __password)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): OTPFragmentArgs {
      val __phoneNumber : String?
      if (savedStateHandle.contains("phoneNumber")) {
        __phoneNumber = savedStateHandle["phoneNumber"]
        if (__phoneNumber == null) {
          throw IllegalArgumentException("Argument \"phoneNumber\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"phoneNumber\" is missing and does not have an android:defaultValue")
      }
      val __email : String?
      if (savedStateHandle.contains("email")) {
        __email = savedStateHandle["email"]
        if (__email == null) {
          throw IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue")
      }
      val __password : String?
      if (savedStateHandle.contains("password")) {
        __password = savedStateHandle["password"]
        if (__password == null) {
          throw IllegalArgumentException("Argument \"password\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"password\" is missing and does not have an android:defaultValue")
      }
      return OTPFragmentArgs(__phoneNumber, __email, __password)
    }
  }
}
