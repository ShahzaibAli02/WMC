package no.wmc.domain.model

data class DocumentType(
    val items: List<DocumentTypeItem>?
) {
    data class DocumentTypeItem(
        val id: Int,
        val category: String
    )
}
