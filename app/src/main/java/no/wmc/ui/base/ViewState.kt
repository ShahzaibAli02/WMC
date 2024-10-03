package no.wmc.ui.base

sealed class ViewState<Data> {
    class Loading<Data>(
        val data: Data? = null
    ) : ViewState<Data>()

    class Success<Data>(
        val data: Data? = null,
        val message: String? = ""
    ) : ViewState<Data>()

    class StateError<Data>(
        val data: Data? = null,
        val errorMessage: String? = null,
        val errorCode: Int? = null
    ) : ViewState<Data>()
}
