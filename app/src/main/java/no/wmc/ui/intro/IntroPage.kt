package no.wmc.ui.intro

import android.graphics.drawable.Drawable

data class IntroPage(
    val imageUrl: Drawable?, // FIXME Change to String when images will be uploaded to BE
    val title: String,
    val message: String,
    val videoUrl: String, // FIXME Change to String when images will be uploaded to BE
)
