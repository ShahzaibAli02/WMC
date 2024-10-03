package no.wmc.data.remote.model

import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class DocumentListDtoModel(
    @SerialName("items") val documents: List<DocumentDtoModel>?
) : BasePagingDtoModel() {
    @Serializable
    class DocumentDtoModel(
        @SerialName("fileId") val id: Int,
        @SerialName("fileName") val name: String,
        @SerialName("fileTitle") val title: String,
        @SerialName("fileExtension") val extension: String,
        @SerialName("fileDescription") val description: String?,
        @SerialName("fileCatagory") val category: String,
        @SerialName("dateCreated") val dateCreated: Instant
    )
}
