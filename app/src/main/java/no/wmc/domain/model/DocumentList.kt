package no.wmc.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

data class DocumentList(
    val documents: List<Document>?
) {
    data class DocumentGroup(
        val category: String,
        val documents: List<Document>
    )
}


