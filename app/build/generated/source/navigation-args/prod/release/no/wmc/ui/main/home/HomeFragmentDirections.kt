package no.wmc.ui.main.home

import android.net.Uri
import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import no.wmc.NavGraphDirections
import no.wmc.R
import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.domain.model.Document

public class HomeFragmentDirections private constructor() {
  private data class HomeToAddMedicalInfo(
    public val profileItemEnum: ProfileItemEnum
  ) : NavDirections {
    public override val actionId: Int = R.id.home_to_add_medical_info

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  private data class ShowEditCardBottomDialog(
    public val profileItemEnum: ProfileItemEnum
  ) : NavDirections {
    public override val actionId: Int = R.id.showEditCardBottomDialog

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  private data class HomeToDocumentMetadata(
    public val fileUri: Uri?,
    public val document: Document?
  ) : NavDirections {
    public override val actionId: Int = R.id.home_to_document_metadata

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Uri::class.java)) {
          result.putParcelable("fileUri", this.fileUri as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Uri::class.java)) {
          result.putSerializable("fileUri", this.fileUri as Serializable?)
        } else {
          throw UnsupportedOperationException(Uri::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (Parcelable::class.java.isAssignableFrom(Document::class.java)) {
          result.putParcelable("document", this.document as Parcelable?)
        } else if (Serializable::class.java.isAssignableFrom(Document::class.java)) {
          result.putSerializable("document", this.document as Serializable?)
        } else {
          throw UnsupportedOperationException(Document::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
      }
  }

  private data class HomeToTranslateBottomDialog(
    public val itemType: ProfileItemEnum,
    public val title: String
  ) : NavDirections {
    public override val actionId: Int = R.id.home_to_translate_bottom_dialog

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun showMainBottomDialog(): NavDirections =
        ActionOnlyNavDirections(R.id.showMainBottomDialog)

    public fun showWmcBottomDialog(): NavDirections =
        ActionOnlyNavDirections(R.id.showWmcBottomDialog)

    public fun editProfile(): NavDirections = ActionOnlyNavDirections(R.id.editProfile)

    public fun homeToAddMedicalInfo(profileItemEnum: ProfileItemEnum): NavDirections =
        HomeToAddMedicalInfo(profileItemEnum)

    public fun showEditCardBottomDialog(profileItemEnum: ProfileItemEnum): NavDirections =
        ShowEditCardBottomDialog(profileItemEnum)

    public fun homeToDocumentMetadata(fileUri: Uri?, document: Document?): NavDirections =
        HomeToDocumentMetadata(fileUri, document)

    public fun homeToTranslateBottomDialog(itemType: ProfileItemEnum, title: String): NavDirections
        = HomeToTranslateBottomDialog(itemType, title)

    public fun actionGlobalLogout(): NavDirections = NavGraphDirections.actionGlobalLogout()
  }
}
