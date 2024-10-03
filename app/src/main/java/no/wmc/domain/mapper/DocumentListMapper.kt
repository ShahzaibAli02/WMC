package no.wmc.domain.mapper

import no.wmc.data.remote.model.DocumentListDtoModel
import no.wmc.data.remote.model.DocumentListDtoModel.DocumentDtoModel
import no.wmc.domain.model.Document
import no.wmc.domain.model.DocumentList

fun DocumentListDtoModel.toModel() = DocumentList(
    documents = documents?.map { it.toModel() }
)

fun DocumentDtoModel.toModel() = Document(
    id = id,
    name = name,
    title = title,
    extension = extension,
    description = description ?: "",
    category = category,
    email="",
    url="",
)
