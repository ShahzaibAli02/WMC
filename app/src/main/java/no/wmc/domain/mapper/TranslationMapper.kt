package no.wmc.domain.mapper

import no.wmc.data.remote.model.TranslationDtoModel
import no.wmc.domain.model.Translation

fun TranslationDtoModel.toModel() = Translation(
    id = id,
    iso = iso,
    name = name
)
