package no.wmc.domain.mapper

import no.wmc.data.remote.model.DocumentTypeDtoModel
import no.wmc.data.remote.model.DocumentTypeDtoModel.DocumentTypeItemDtoModel
import no.wmc.domain.model.DocumentType
import no.wmc.domain.model.DocumentType.DocumentTypeItem

fun DocumentTypeDtoModel.toModel() = DocumentType(
    items = items?.map { it.toModel() }
)

fun DocumentTypeItemDtoModel.toModel() = DocumentTypeItem(
    id = id,
    category = category
)
