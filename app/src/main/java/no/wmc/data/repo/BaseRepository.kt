package no.wmc.data.repo

import no.wmc.data.local.manager.LocalDataManager
import no.wmc.data.manager.NetworkStateManager
import no.wmc.data.remote.ApiException
import no.wmc.data.remote.StatusCode.INTERNAL_ERROR
import no.wmc.data.remote.StatusCode.NO_INTERNET_ERROR
import no.wmc.data.remote.StatusCode.TIMEOUT_ERROR
import no.wmc.data.remote.StatusCode.UNAUTHORIZED_ACCESS
import no.wmc.domain.DataState
import no.wmc.domain.DataState.Error
import no.wmc.domain.DataState.Success
import java.net.SocketTimeoutException
import java.net.UnknownHostException

open class BaseRepository(
    private val networkStateManager: NetworkStateManager,
    protected val localDataManager: LocalDataManager
) {

    protected suspend fun <Data> execute(
        shouldRetry: Boolean = true,
        fallback: suspend () -> DataState<Data> = { Error(NO_INTERNET_ERROR) },
        onOnline: suspend () -> Data
    ): DataState<Data> {
        return try {
            if (networkStateManager.isOnline()) {
                Success(onOnline())
            } else {
                fallback()
            }
        } catch (apiException: ApiException) {
            if (apiException.error?.statusCode == UNAUTHORIZED_ACCESS && shouldRetry) {
                retryLogin(onOnline, apiException)
            } else {
                Error(
                    statusCode = apiException.error?.statusCode ?: INTERNAL_ERROR,
                    errorMessage = apiException.error?.message
                )
            }
        } catch (timeoutException: SocketTimeoutException) {
            Error(TIMEOUT_ERROR)
        } catch (unknownHostException: UnknownHostException) {
            Error(NO_INTERNET_ERROR)
        } catch (ex: Exception) {
            Error(
                statusCode = INTERNAL_ERROR,
                errorMessage = ex.message
            )
        }
    }

    private suspend fun <Data> retryLogin(
        callback: suspend () -> Data,
        apiException: ApiException
    ): DataState<Data> {
        return when (loginUser()) {
            is Success -> execute(false, onOnline = callback)
            is Error -> Error(
                statusCode = apiException.error?.statusCode ?: INTERNAL_ERROR,
                errorMessage = apiException.message
            )
        }
    }

    // TODO update refresh token logic
    private fun loginUser(): DataState<Unit> {
        return if (true) {
            Success()
        } else {
            Error(INTERNAL_ERROR)
        }
    }
}
