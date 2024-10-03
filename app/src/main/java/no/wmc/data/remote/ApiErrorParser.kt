package no.wmc.data.remote

import kotlinx.serialization.json.Json
import no.wmc.data.remote.StatusCode.INTERNAL_ERROR
import okhttp3.ResponseBody

/**
 * Provide a mechanism to customize error parsing based on Api Endpoint and Status Code based on ApiTags
 * In case an api endpoint provides with different response for different status code
 * @ApiResponseParser will use this parser to parse error responses
 * */

interface ApiErrorParser {
    fun getApiErrorResponse(
        statusCode: Int = INTERNAL_ERROR,
        url: String = "",
        method: String = "",
        body: ResponseBody? = null
    ): ApiException
}

class ApiErrorParserImpl : ApiErrorParser {
    override fun getApiErrorResponse(
        statusCode: Int,
        url: String,
        method: String,
        body: ResponseBody?
    ): ApiException {
        return if (body == null) {
            ApiException(
                ApiErrorBody(
                    statusCode,
                    "ServerError",
                    "Server response is empty"
                )
            )
        } else {
            val bodyString = body.string()
            try {
                val error = Json.decodeFromString(ApiErrorBody.serializer(), bodyString)
                error.statusCode = statusCode
                ApiException(error)
            } catch (ex: Exception) {
                ApiException(
                    ApiErrorBody(
                        statusCode = statusCode,
                        code = "ParsingError",
                        message = "Cannot parse error: ${ex.message} Body: $bodyString"
                    )
                )
            } finally {
                body.close()
            }
        }
    }
}
