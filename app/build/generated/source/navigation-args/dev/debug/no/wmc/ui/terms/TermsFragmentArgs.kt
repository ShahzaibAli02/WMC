package no.wmc.ui.terms

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Boolean
import kotlin.jvm.JvmStatic

public data class TermsFragmentArgs(
  public val showButton: Boolean = true
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putBoolean("showButton", this.showButton)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("showButton", this.showButton)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): TermsFragmentArgs {
      bundle.setClassLoader(TermsFragmentArgs::class.java.classLoader)
      val __showButton : Boolean
      if (bundle.containsKey("showButton")) {
        __showButton = bundle.getBoolean("showButton")
      } else {
        __showButton = true
      }
      return TermsFragmentArgs(__showButton)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): TermsFragmentArgs {
      val __showButton : Boolean?
      if (savedStateHandle.contains("showButton")) {
        __showButton = savedStateHandle["showButton"]
        if (__showButton == null) {
          throw IllegalArgumentException("Argument \"showButton\" of type boolean does not support null values")
        }
      } else {
        __showButton = true
      }
      return TermsFragmentArgs(__showButton)
    }
  }
}
