package no.wmc.utils.ext

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load
import coil.transform.RoundedCornersTransformation
import no.wmc.R

@BindingAdapter(value = ["avatar"], requireAll = true)
fun ImageView.setAvatarImage(imageUrl: String?) {
    load(imageUrl) {
        crossfade(true)
        placeholder(R.drawable.avatar_placeholder)
        transformations(RoundedCornersTransformation(12f.dpToPx(context)))
        error(R.drawable.avatar_placeholder)
        fallback(R.drawable.avatar_placeholder)
    }
}
