package no.wmc.utils.ext

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.appcompat.content.res.AppCompatResources
import com.lokalise.sdk.LokaliseResources

fun Context.getStringResourceByName(stringName: String): String {
    val lokaliseRes = LokaliseResources(this)
    val lokaliseString = lokaliseRes.getString(stringName)
    return if (lokaliseString == null) {
        val resId = resources.getIdentifier(stringName, "string", packageName)
        getString(resId)
    } else {
        lokaliseString
    }
}

fun Context.getDrawableResourceByName(stringName: String): Drawable? {
    val lokaliseRes = LokaliseResources(this)
    val lokaliseString = lokaliseRes.getString(stringName)
    val resId = if (lokaliseString == null) {
        resources.getIdentifier(stringName, "drawable", packageName)
    } else {
        resources.getIdentifier(lokaliseString, "drawable", packageName)
    }
    return AppCompatResources.getDrawable(this, resId)
}
