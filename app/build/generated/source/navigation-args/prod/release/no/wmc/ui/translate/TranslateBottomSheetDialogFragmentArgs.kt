package no.wmc.ui.translate

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.String
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import no.wmc.domain.enums.ProfileItemEnum

public data class TranslateBottomSheetDialogFragmentArgs(
  public val itemType: ProfileItemEnum,
  public val title: String
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(ProfileItemEnum::class.java)) {
      result.putParcelable("itemType", this.itemType as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ProfileItemEnum::class.java)) {
      result.putSerializable("itemType", this.itemType as Serializable)
    } else {
      throw UnsupportedOperationException(ProfileItemEnum::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.putString("title", this.title)
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(ProfileItemEnum::class.java)) {
      result.set("itemType", this.itemType as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ProfileItemEnum::class.java)) {
      result.set("itemType", this.itemType as Serializable)
    } else {
      throw UnsupportedOperationException(ProfileItemEnum::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    result.set("title", this.title)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): TranslateBottomSheetDialogFragmentArgs {
      bundle.setClassLoader(TranslateBottomSheetDialogFragmentArgs::class.java.classLoader)
      val __itemType : ProfileItemEnum?
      if (bundle.containsKey("itemType")) {
        if (Parcelable::class.java.isAssignableFrom(ProfileItemEnum::class.java) ||
            Serializable::class.java.isAssignableFrom(ProfileItemEnum::class.java)) {
          __itemType = bundle.get("itemType") as ProfileItemEnum?
        } else {
          throw UnsupportedOperationException(ProfileItemEnum::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__itemType == null) {
          throw IllegalArgumentException("Argument \"itemType\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"itemType\" is missing and does not have an android:defaultValue")
      }
      val __title : String?
      if (bundle.containsKey("title")) {
        __title = bundle.getString("title")
        if (__title == null) {
          throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue")
      }
      return TranslateBottomSheetDialogFragmentArgs(__itemType, __title)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        TranslateBottomSheetDialogFragmentArgs {
      val __itemType : ProfileItemEnum?
      if (savedStateHandle.contains("itemType")) {
        if (Parcelable::class.java.isAssignableFrom(ProfileItemEnum::class.java) ||
            Serializable::class.java.isAssignableFrom(ProfileItemEnum::class.java)) {
          __itemType = savedStateHandle.get<ProfileItemEnum?>("itemType")
        } else {
          throw UnsupportedOperationException(ProfileItemEnum::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__itemType == null) {
          throw IllegalArgumentException("Argument \"itemType\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"itemType\" is missing and does not have an android:defaultValue")
      }
      val __title : String?
      if (savedStateHandle.contains("title")) {
        __title = savedStateHandle["title"]
        if (__title == null) {
          throw IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue")
      }
      return TranslateBottomSheetDialogFragmentArgs(__itemType, __title)
    }
  }
}
