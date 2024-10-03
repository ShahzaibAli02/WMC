package no.wmc.data.remote

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import no.wmc.data.remote.StatusCode.INTERNAL_ERROR
import java.io.IOException

@Serializable
data class ApiErrorBody(
    @SerialName("statusCode") var statusCode: Int = INTERNAL_ERROR,
    @SerialName("errorCode") val code: String = "",
    @SerialName("message") val message: String = ""
)

data class ApiException(
    val error: ApiErrorBody?
) : IOException("${error?.code} ${error?.message}")
