package no.wmc.data.remote.providers

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import no.wmc.BuildConfig
import no.wmc.data.remote.API_TIMEOUT
import no.wmc.data.remote.ApiErrorParser
import no.wmc.domain.repo.AuthRepository
import no.wmc.utils.ext.setAuth
import no.wmc.utils.ext.setEmptyResponseHandler
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import timber.log.Timber
import java.util.concurrent.TimeUnit.SECONDS

class RetrofitProvider(
    private val authRepo: AuthRepository,
    private val apiUrl: String,
    private val errorParser: ApiErrorParser
) {

    fun provide(): Retrofit {
        val client = OkHttpClient.Builder()
            .requestInterceptor()
            .setLogger(HttpLoggingInterceptor.Level.BODY)
            .setAuth(::setAuthHeader, ::refreshToken)
            .setEmptyResponseHandler()
            .connectTimeout(API_TIMEOUT, SECONDS)
            .readTimeout(API_TIMEOUT, SECONDS)
            .writeTimeout(API_TIMEOUT, SECONDS)
            .build()

        return Retrofit.Builder()
            .client(client)
            .setConverters()
            .baseUrl(apiUrl)
            .build()
    }

    private fun Retrofit.Builder.setConverters() =
        addConverterFactory(
            Json {
                explicitNulls = false
                ignoreUnknownKeys = true
            }.asConverterFactory("application/json".toMediaType())
        )

    private fun OkHttpClient.Builder.setLogger(
        logLevel: HttpLoggingInterceptor.Level
    ): OkHttpClient.Builder {
        if (BuildConfig.DEBUG) {
            addInterceptor(
                HttpLoggingInterceptor().apply {
                    level = logLevel
                }
            )
        }

        return this
    }

    private fun setAuthHeader(
        builder: Request.Builder
    ): Request.Builder {
        val currentToken = authRepo.getCurrentToken()
        if (BuildConfig.DEBUG) {
            Timber.d("Token $currentToken")
        }
        return builder.header("Authorization", "Bearer $currentToken")
    }

    private fun refreshToken(unacceptedToken: String?) {
        authRepo.refreshToken(unacceptedToken)
    }

    private fun OkHttpClient.Builder.requestInterceptor() = addInterceptor { chain ->
        val response = chain.proceed(chain.request())

        if (response.isSuccessful) {
            response
        } else {
            throw errorParser.getApiErrorResponse(
                statusCode = response.code,
                body = response.body,
                url = response.request.url.toUrl().toString(),
                method = response.request.method
            )
        }
    }
}
