package no.wmc.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Document(
    val id: Int,
    val name: String,
    val title: String,
    val extension: String,
    val description: String,
    val category: String,
    val url:String,
    val email:String
) : Parcelable
{
    constructor():this(0,"","","","","","","")
}