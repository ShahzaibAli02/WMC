package no.wmc.ui.base

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.core.app.DialogCompat
import androidx.databinding.ViewDataBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import no.wmc.R
import no.wmc.data.remote.StatusCode.EMPTY_RESPONSE
import no.wmc.data.remote.StatusCode.INTERNAL_ERROR
import no.wmc.data.remote.StatusCode.NO_INTERNET_ERROR
import no.wmc.data.remote.StatusCode.RESOURCE_NOT_FOUND
import no.wmc.data.remote.StatusCode.UNAUTHORIZED_ACCESS
import no.wmc.utils.ext.showSnackBar
import org.koin.androidx.viewmodel.ext.android.getViewModel
import kotlin.reflect.KClass

open class BaseViewStateFragment<DB : ViewDataBinding, VM : BaseViewModel<*>>(
    @LayoutRes layout: Int,
    viewModelClazz: KClass<VM>
) : BaseFragment<DB>(layout) {

    protected val viewModel: VM by lazy { getViewModel(clazz = viewModelClazz) }
    private val loadingDialog by lazy {
        val dialog=Dialog(requireContext())
        dialog.setContentView(R.layout.lyt_loading)
        dialog.setCancelable(false)
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        dialog

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        subscribe()
    }

    protected fun sendViewEvent(viewEvent: ViewEvent) {
        viewModel.viewEventObservable.value = viewEvent
    }

    /**
     * Subscribes for action events from ViewModel to View
     */
    private fun subscribe() {
        viewModel.viewActionObservable.observe(viewLifecycleOwner) {
            singleAction(it) { action ->
                handleViewAction(action)
            }
        }
    }

    protected open fun handleViewAction(viewAction: ViewAction) {}

    protected fun throwActionNotSupported(action: ViewAction) {
        throw IllegalStateException("Action $action not supported")
    }

    private fun <T : ViewAction> singleAction(
        viewAction: T,
        action: (T) -> Unit
    ) {
        if (!viewAction.isRead) {
            viewAction.isRead = true
            action(viewAction)
        }
    }

    protected fun hideDialog()
    {
        if(loadingDialog.isShowing)
            loadingDialog.hide()
    }
    protected fun showLoadingDialog(message:String="Please Wait")
    {
        loadingDialog.findViewById<TextView>(R.id.txtMessage).text = message
        loadingDialog.show()
    }
    protected fun showErrorMessage(
        errorMessage: String? = null,
        errorCode: Int? = INTERNAL_ERROR
    ) {
        showSnackBar(getErrorMessage(requireContext(), errorCode, errorMessage))
    }

    protected fun showErrorDialog(@StringRes errorRes: Int) {
        MaterialAlertDialogBuilder(requireContext())
            .setMessage(errorRes)
            .setCancelable(true)
            .setPositiveButton(R.string.ok_button_title) { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }

    protected fun showErrorDialog(errorMessage: String) {
        MaterialAlertDialogBuilder(requireContext())
            .setMessage(errorMessage)
            .setCancelable(true)
            .setPositiveButton(R.string.ok_button_title) { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }

    private fun getErrorMessage(
        context: Context,
        errorCode: Int?,
        errorMessage: String?
    ): String {
        return errorMessage ?: when (errorCode) {
            INTERNAL_ERROR -> context.getString(R.string.error_message)
            NO_INTERNET_ERROR -> context.getString(R.string.error_no_internet)
            RESOURCE_NOT_FOUND -> context.getString(R.string.error_no_data_found)
            UNAUTHORIZED_ACCESS -> context.getString(R.string.error_unauthorized)
            EMPTY_RESPONSE -> context.getString(R.string.error_empty_response)
            else -> context.getString(R.string.error_message)
        }
    }
}
