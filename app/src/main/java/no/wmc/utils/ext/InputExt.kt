package no.wmc.utils.ext

import android.text.TextUtils
import android.widget.AutoCompleteTextView
import com.google.android.material.textfield.TextInputLayout

fun TextInputLayout.isEmpty(): Boolean {
    return this.editText?.text.toString().isEmpty()
}

fun TextInputLayout.error(error: String) {
    this.error = error
    this.isErrorEnabled = true
}

fun TextInputLayout.text(): String {
    return this.editText?.text.toString().trim()
}

fun TextInputLayout.textForPhonePicker(): String {
    return this.editText?.text.toString().trim().replace("-", "").replace(" ", "")
}

fun TextInputLayout.text(value: String?) {
    this.editText?.setText(value ?: "")
}

fun TextInputLayout.textForAutoComplete(value: String?) {
    (this.editText as AutoCompleteTextView).setText(value ?: "", false)
}

fun String.isValidEmail(): Boolean {
    return if (TextUtils.isEmpty(this)) false
    else android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches();
}