package no.wmc.data.remote

import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Response
import okhttp3.ResponseBody.Companion.toResponseBody

/**
 * Intercept 204 and 205 code responses and change them to 200.
 *
 * This required because HTTP 204/205 response codes bypass Retrofit
 * converter and unconditionally sends null to adapter
 *
 * https://github.com/square/retrofit/issues/2867
 */
object EmptyBodyInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val response = chain.proceed(chain.request())
        if (response.code.let { it != 204 && it != 205 }) {
            return response
        }

        if ((response.body?.contentLength() ?: -1) >= 0) {
            return response.newBuilder().code(200).build()
        }

        val emptyBody = "".toResponseBody("text/plain".toMediaType())

        return response
            .newBuilder()
            .code(200)
            .body(emptyBody)
            .build()
    }
}
