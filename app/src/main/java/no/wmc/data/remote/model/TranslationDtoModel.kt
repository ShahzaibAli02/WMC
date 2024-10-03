package no.wmc.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class TranslationDtoModel(
    @SerialName("id") val id: Int,
    @SerialName("iso") val iso: String,
    @SerialName("name") val name: String
)
