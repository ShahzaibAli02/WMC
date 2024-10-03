package no.wmc.utils.ext

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("show")
fun View.setShow(show: Boolean?) {
    visibility = if (show == true) View.VISIBLE else View.GONE
}
