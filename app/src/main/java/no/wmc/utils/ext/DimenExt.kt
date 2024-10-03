package no.wmc.utils.ext

import android.content.Context
import android.util.TypedValue

fun Float.pxToDp(context: Context) =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this, context.resources.displayMetrics)

fun Float.dpToPx(context: Context) = context.resources.displayMetrics.density * this
