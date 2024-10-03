package no.wmc.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
open class BasePagingDtoModel(
    @SerialName("page") val page: Int? = null,
    @SerialName("take") val take: Int? = null,
    @SerialName("total") val total: Int? = null
)
