package no.wmc.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProfileItem(
    val itemsTitle: String?,
    val items: List<Item>?
) : Parcelable {
    @Parcelize
    data class Item(
        val code: String?,
        val description: String?
    ) : Parcelable
}
