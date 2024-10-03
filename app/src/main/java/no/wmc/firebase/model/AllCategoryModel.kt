package no.wmc.firebase.model

import com.google.firebase.firestore.PropertyName

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AllCategoryModel(
    @set:PropertyName("description")
    @get:PropertyName("description")
    var description: String? = null,

    @set:PropertyName("userIds")
    @get:PropertyName("userIds")
    var userIds: ArrayList<String>? = null,
): Parcelable
{
    constructor():this("",null)
}
