package no.wmc.ui.base

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import no.wmc.R
import no.wmc.data.remote.StatusCode
import no.wmc.utils.ext.showSnackBar
import org.koin.androidx.viewmodel.ext.android.getViewModel
import kotlin.reflect.KClass

open class BaseViewStateBottomSheetDialogFragment<DB : ViewDataBinding, VM : BaseViewModel<*>>(
    @LayoutRes private val layoutId: Int,
    clazz: KClass<VM>
) : BaseBottomSheetDialogFragment<DB>(layoutId) {

    private val viewModel: VM by lazy { getViewModel(clazz = clazz) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        subscribe()
    }

    protected fun sendViewEvent(viewEvent: ViewEvent) {
        viewModel.viewEventObservable.value = viewEvent
    }

    private fun subscribe() {
        viewModel.viewActionObservable.observe(viewLifecycleOwner) {
            handleViewAction(it)
        }
    }

    protected open fun handleViewAction(viewAction: ViewAction) {}

    protected fun throwActionNotSupported(action: ViewAction) {
        throw IllegalStateException("Action $action not supported")
    }

    protected fun showErrorMessage(
        errorMessage: String? = null,
        errorCode: Int? = StatusCode.INTERNAL_ERROR
    ) {
        showSnackBar(getErrorMessage(requireContext(), errorCode, errorMessage))
    }

    private fun getErrorMessage(
        context: Context,
        errorCode: Int?,
        errorMessage: String?
    ): String {
        return errorMessage ?: when (errorCode) {
            StatusCode.INTERNAL_ERROR -> context.getString(R.string.error_message)
            StatusCode.NO_INTERNET_ERROR -> context.getString(R.string.error_no_internet)
            StatusCode.RESOURCE_NOT_FOUND -> context.getString(R.string.error_no_data_found)
            StatusCode.UNAUTHORIZED_ACCESS -> context.getString(R.string.error_unauthorized)
            StatusCode.EMPTY_RESPONSE -> context.getString(R.string.error_empty_response)
            else -> context.getString(R.string.error_message)
        }
    }
}
