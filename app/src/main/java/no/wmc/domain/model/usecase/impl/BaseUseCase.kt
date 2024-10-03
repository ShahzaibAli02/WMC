package no.wmc.domain.model.usecase.impl

import no.wmc.domain.DataState

open class BaseUseCase {

    protected inline fun <DtoData, reified Data> getErrorResponse(
        errorState: DataState.Error<DtoData>,
        convert: (DtoData?) -> Data? = { errorState.data as? Data }
    ): DataState.Error<Data> {
        return DataState.Error(
            statusCode = errorState.statusCode,
            errorMessage = errorState.errorMessage,
            data = convert(errorState.data)
        )
    }

    protected inline fun <DtoData, reified Data> getSuccessResponse(
        response: DataState.Success<DtoData>,
        convert: (DtoData?) -> Data? = { response.data as? Data }
    ): DataState.Success<Data> {
        return DataState.Success(message = response.message, data = convert(response.data))
    }

    protected inline fun <DtoData, reified Data> getDataState(
        state: DataState<DtoData>,
        convert: (DtoData?) -> Data? = { (state as? DataState.Success)?.data as? Data }
    ): DataState<Data> {
        return when (state) {
            is DataState.Success -> getSuccessResponse(state, convert)
            is DataState.Error -> getErrorResponse(state, convert)
        }
    }
}
