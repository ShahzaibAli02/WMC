package no.wmc.ui.main.home

import android.net.Uri
import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import no.wmc.R
import no.wmc.domain.model.Document

public class HomeNewFragmentDirections private constructor() {
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

  public companion object {
    public fun showMainBottomDialog(): NavDirections =
        ActionOnlyNavDirections(R.id.showMainBottomDialog)

    public fun showWmcBottomDialog(): NavDirections =
        ActionOnlyNavDirections(R.id.showWmcBottomDialog)

    public fun editProfile(): NavDirections = ActionOnlyNavDirections(R.id.editProfile)

    public fun homeToAddMedicalInfo(): NavDirections =
        ActionOnlyNavDirections(R.id.home_to_add_medical_info)

    public fun showEditCardBottomDialog(): NavDirections =
        ActionOnlyNavDirections(R.id.showEditCardBottomDialog)

    public fun homeToDocumentMetadata(fileUri: Uri?, document: Document?): NavDirections =
        HomeToDocumentMetadata(fileUri, document)

    public fun homeToTranslateBottomDialog(): NavDirections =
        ActionOnlyNavDirections(R.id.home_to_translate_bottom_dialog)
  }
}
