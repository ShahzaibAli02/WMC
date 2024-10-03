package no.wmc.ui.document

import android.net.Uri
import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic
import no.wmc.domain.model.Document

public data class DocumentMetadataFragmentArgs(
  public val fileUri: Uri?,
  public val document: Document?
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(Uri::class.java)) {
      result.set("fileUri", this.fileUri as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Uri::class.java)) {
      result.set("fileUri", this.fileUri as Serializable?)
    } else {
      throw UnsupportedOperationException(Uri::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    if (Parcelable::class.java.isAssignableFrom(Document::class.java)) {
      result.set("document", this.document as Parcelable?)
    } else if (Serializable::class.java.isAssignableFrom(Document::class.java)) {
      result.set("document", this.document as Serializable?)
    } else {
      throw UnsupportedOperationException(Document::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DocumentMetadataFragmentArgs {
      bundle.setClassLoader(DocumentMetadataFragmentArgs::class.java.classLoader)
      val __fileUri : Uri?
      if (bundle.containsKey("fileUri")) {
        if (Parcelable::class.java.isAssignableFrom(Uri::class.java) ||
            Serializable::class.java.isAssignableFrom(Uri::class.java)) {
          __fileUri = bundle.get("fileUri") as Uri?
        } else {
          throw UnsupportedOperationException(Uri::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"fileUri\" is missing and does not have an android:defaultValue")
      }
      val __document : Document?
      if (bundle.containsKey("document")) {
        if (Parcelable::class.java.isAssignableFrom(Document::class.java) ||
            Serializable::class.java.isAssignableFrom(Document::class.java)) {
          __document = bundle.get("document") as Document?
        } else {
          throw UnsupportedOperationException(Document::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"document\" is missing and does not have an android:defaultValue")
      }
      return DocumentMetadataFragmentArgs(__fileUri, __document)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        DocumentMetadataFragmentArgs {
      val __fileUri : Uri?
      if (savedStateHandle.contains("fileUri")) {
        if (Parcelable::class.java.isAssignableFrom(Uri::class.java) ||
            Serializable::class.java.isAssignableFrom(Uri::class.java)) {
          __fileUri = savedStateHandle.get<Uri?>("fileUri")
        } else {
          throw UnsupportedOperationException(Uri::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"fileUri\" is missing and does not have an android:defaultValue")
      }
      val __document : Document?
      if (savedStateHandle.contains("document")) {
        if (Parcelable::class.java.isAssignableFrom(Document::class.java) ||
            Serializable::class.java.isAssignableFrom(Document::class.java)) {
          __document = savedStateHandle.get<Document?>("document")
        } else {
          throw UnsupportedOperationException(Document::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"document\" is missing and does not have an android:defaultValue")
      }
      return DocumentMetadataFragmentArgs(__fileUri, __document)
    }
  }
}
