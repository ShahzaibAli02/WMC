package no.wmc.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class DocumentTypeDtoModel(
    @SerialName("items") val items: List<DocumentTypeItemDtoModel>?
) : BasePagingDtoModel() {
    @Serializable
    class DocumentTypeItemDtoModel(
        @SerialName("id") val id: Int,
        @SerialName("categoryText") val category: String
    )
}
