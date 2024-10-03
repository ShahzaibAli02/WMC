package no.wmc.ui.registration

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class RegisterFragmentArgs(
  public val name: String = "",
  public val email: String = ""
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("name", this.name)
    result.putString("email", this.email)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("name", this.name)
    result.set("email", this.email)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): RegisterFragmentArgs {
      bundle.setClassLoader(RegisterFragmentArgs::class.java.classLoader)
      val __name : String?
      if (bundle.containsKey("name")) {
        __name = bundle.getString("name")
        if (__name == null) {
          throw IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.")
        }
      } else {
        __name = ""
      }
      val __email : String?
      if (bundle.containsKey("email")) {
        __email = bundle.getString("email")
        if (__email == null) {
          throw IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.")
        }
      } else {
        __email = ""
      }
      return RegisterFragmentArgs(__name, __email)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): RegisterFragmentArgs {
      val __name : String?
      if (savedStateHandle.contains("name")) {
        __name = savedStateHandle["name"]
        if (__name == null) {
          throw IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value")
        }
      } else {
        __name = ""
      }
      val __email : String?
      if (savedStateHandle.contains("email")) {
        __email = savedStateHandle["email"]
        if (__email == null) {
          throw IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value")
        }
      } else {
        __email = ""
      }
      return RegisterFragmentArgs(__name, __email)
    }
  }
}
