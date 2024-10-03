package no.wmc.ui.medical

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import no.wmc.domain.enums.ProfileItemEnum

public data class AddMedicalInfoFragmentArgs(
  public val profileItemEnum: ProfileItemEnum
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(ProfileItemEnum::class.java)) {
      result.putParcelable("profileItemEnum", this.profileItemEnum as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ProfileItemEnum::class.java)) {
      result.putSerializable("profileItemEnum", this.profileItemEnum as Serializable)
    } else {
      throw UnsupportedOperationException(ProfileItemEnum::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(ProfileItemEnum::class.java)) {
      result.set("profileItemEnum", this.profileItemEnum as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ProfileItemEnum::class.java)) {
      result.set("profileItemEnum", this.profileItemEnum as Serializable)
    } else {
      throw UnsupportedOperationException(ProfileItemEnum::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): AddMedicalInfoFragmentArgs {
      bundle.setClassLoader(AddMedicalInfoFragmentArgs::class.java.classLoader)
      val __profileItemEnum : ProfileItemEnum?
      if (bundle.containsKey("profileItemEnum")) {
        if (Parcelable::class.java.isAssignableFrom(ProfileItemEnum::class.java) ||
            Serializable::class.java.isAssignableFrom(ProfileItemEnum::class.java)) {
          __profileItemEnum = bundle.get("profileItemEnum") as ProfileItemEnum?
        } else {
          throw UnsupportedOperationException(ProfileItemEnum::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__profileItemEnum == null) {
          throw IllegalArgumentException("Argument \"profileItemEnum\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"profileItemEnum\" is missing and does not have an android:defaultValue")
      }
      return AddMedicalInfoFragmentArgs(__profileItemEnum)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        AddMedicalInfoFragmentArgs {
      val __profileItemEnum : ProfileItemEnum?
      if (savedStateHandle.contains("profileItemEnum")) {
        if (Parcelable::class.java.isAssignableFrom(ProfileItemEnum::class.java) ||
            Serializable::class.java.isAssignableFrom(ProfileItemEnum::class.java)) {
          __profileItemEnum = savedStateHandle.get<ProfileItemEnum?>("profileItemEnum")
        } else {
          throw UnsupportedOperationException(ProfileItemEnum::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__profileItemEnum == null) {
          throw IllegalArgumentException("Argument \"profileItemEnum\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"profileItemEnum\" is missing and does not have an android:defaultValue")
      }
      return AddMedicalInfoFragmentArgs(__profileItemEnum)
    }
  }
}
