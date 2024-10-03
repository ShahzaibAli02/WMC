package no.wmc.ui.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import no.wmc.domain.DataState
import no.wmc.utils.AppDispatchers

abstract class BaseViewModel<VS>(
    private val dispatchers: AppDispatchers
) : ViewModel() {

    private val _viewActionObservable by lazy { MutableLiveData<ViewAction>() }
    val viewActionObservable: LiveData<ViewAction> by lazy { _viewActionObservable }
    val viewEventObservable by lazy { MutableLiveData<ViewEvent>() }

    private val observer = Observer<ViewEvent> {
        viewModelScope.launch(dispatchers.getIODispatcher()) {
            handleViewEvent(it)
        }
    }

    protected suspend fun postAction(viewAction: ViewAction) {
        withContext(dispatchers.getMainDispatcher()) {
            _viewActionObservable.value = viewAction
        }
    }

    init {
        subscribeObservable()
    }

    private fun subscribeObservable() {
        viewEventObservable.observeForever(observer)
    }

    protected inline fun <Data, reified ViewData> getErrorState(
        errorState: DataState.Error<Data>,
        convert: (Data?) -> ViewData? = { errorState.data as? ViewData }
    ): ViewState<ViewData> {
        return ViewState.StateError(
            errorCode = errorState.statusCode,
            data = convert(errorState.data),
            errorMessage = errorState.errorMessage
        )
    }

    protected inline fun <Data, reified ViewData> getSuccessState(
        state: DataState.Success<Data>,
        convert: (Data?) -> ViewData? = { state.data as? ViewData }
    ): ViewState<ViewData> {
        return state.run { ViewState.Success(data = convert(data), message = message) }
    }

    protected inline fun <Data, reified ViewData> getViewState(
        state: DataState<Data>,
        errorCallback: (ViewData?) -> Unit = {},
        errorConverter: DataState.Error<Data>.(Data?) -> ViewData? = { it as? ViewData },
        successCallback: (ViewData?) -> Unit = {},
        successConverter: DataState.Success<Data>.(Data?) -> ViewData? = { it as? ViewData }
    ): ViewState<ViewData> {
        return when (state) {
            is DataState.Success -> {
                ViewState.Success(
                    data = state.successConverter(state.data),
                    message = state.message
                ).also {
                    successCallback(it.data)
                }
            }
            is DataState.Error -> {
                ViewState.StateError(
                    data = state.errorConverter(state.data),
                    errorMessage = state.errorMessage,
                    errorCode = state.statusCode
                ).also {
                    errorCallback(it.data)
                }
            }
        }
    }

    override fun onCleared() {
        viewEventObservable.removeObserver(observer)
        super.onCleared()
    }

    protected fun throwEventNotSupported(event: ViewEvent) {
        throw IllegalStateException("Event $event not supported")
    }

    /**
     * Handle events received from View by ViewModel to run proper
     * actions (i.e request data from repository)
     */
    protected abstract suspend fun handleViewEvent(event: ViewEvent)

    protected abstract val viewState: VS
}
