package no.wmc.data.remote

object StatusCode {
    const val NO_INTERNET_ERROR = 104
    const val INTERNAL_ERROR = 105
    const val TIMEOUT_ERROR = 106

    const val SUCCESS = 200
    const val EMPTY_RESPONSE = 204
    const val RESET_CONTENT = 205

    const val BAD_REQUEST = 400
    const val UNAUTHORIZED_ACCESS = 401
    const val RESOURCE_NOT_FOUND = 404

    const val SERVER_ERROR = 500
    const val CACHE_NOT_FOUND = 504
}

const val CONTENT_TYPE = "Content-Type"
const val APPLICATION_JSON = "application/json"
const val AUTHORIZATION = "Authorization"
const val API_TIMEOUT = 100L // Default is 30. Set 100 due to the subscriptions related endpoint.
const val PLATFORM_NAME = "android"
const val REQUEST_DATE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss z"
const val EXPIRE_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSX"
const val DEFAULT_RESPONSE_MAX_AGE = 5 * 60 // 5 minutes
const val HEADER_NAME_EXPIRE = "Expires"
const val HEADER_NAME_DATE = "Date"
const val TOKEN_PREFIX = "Token"
const val EMPTY_STRING = ""
const val INVALID_POSITION = -1
const val MEDICAL_ITEM_SEARCH_PAGING_SIZE = 30
const val SUCCESS = "Success"
const val THIRTY_SECONDS_MS = 30000L

fun getApiTag(url: String, baseUrl: String): String {
    return url.removePrefix(baseUrl)
}
