package no.wmc.utils.ext

import android.util.Log
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner

fun Fragment.showSnackBar(message: String) {
    requireActivity().showSnackBar(message)
}

fun Fragment.showSnackBar(@StringRes messageId: Int) {
    requireActivity().showSnackBar(messageId)
}

fun Fragment.hideKeyboard() {
    requireActivity().hideKeyboard()
}

fun Fragment.showKeyboard() {
    requireActivity().showKeyboard()
}

fun Fragment.setBackAction(lifeCycleOwner: LifecycleOwner, action: () -> Unit) {
    requireActivity().setBackAction(lifeCycleOwner, action)
}

fun Fragment.showToast(text: String) {
    Log.d("TAG", "showToast: "+text)
    requireActivity().showToast(text)
}
