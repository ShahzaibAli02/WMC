package no.wmc.utils.ext

import no.wmc.data.remote.EmptyBodyInterceptor
import no.wmc.data.remote.NoAuthRequired
import okhttp3.Authenticator
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route
import retrofit2.Invocation

fun Request.isAuthRequired(): Boolean = annotation(NoAuthRequired::class.java) == null

// Retrofit conveniently saves original method info, so that we can check its annotations
fun <T : Annotation> Request.annotation(annotationClass: Class<T>): T? =
    tag(Invocation::class.java)?.method()?.getAnnotation(annotationClass)

fun Request.getAccessTokenFromHeader() =
    header("Authorization")?.removePrefix("Bearer ")

fun OkHttpClient.Builder.setEmptyResponseHandler() =
    addInterceptor(EmptyBodyInterceptor)

fun OkHttpClient.Builder.setAuth(
    setAuthHeader: Request.Builder.() -> Request.Builder,
    refreshToken: (String?) -> Unit
): OkHttpClient.Builder {
    // Adding auth header for restricted API methods
    addInterceptor { chain ->
        val request = if (chain.request().isAuthRequired()) {
            chain.request().newBuilder().setAuthHeader().build()
        } else {
            chain.request()
        }
        chain.proceed(request)
    }

    // Handling 401 errors with OkHTTP Authenticator
    authenticator(object : Authenticator {
        override fun authenticate(route: Route?, response: Response): Request? {
            return if (response.request.isAuthRequired()) {
                val isRetry = response.priorResponse != null

                return if (isRetry) {
                    // Already tried to re-auth, nothing we can do anymore
                    null
                } else {
                    val unacceptedToken = response.request.getAccessTokenFromHeader()
                    refreshToken(unacceptedToken)
                    // Setting auth header (new access token will be requested if needed)
                    response.request.newBuilder().setAuthHeader().build()
                }
            } else {
                // No auth is needed but we got 401, nothing we should do
                null
            }
        }
    })

    return this
}
