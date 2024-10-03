package no.wmc.data.local.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import no.wmc.domain.model.Profile

@Entity
class ProfileEntity(
    @PrimaryKey
    @ColumnInfo(name = "id") val id: String,
    @ColumnInfo(name = "firstName") val firstName: String?,
    @ColumnInfo(name = "lastName") val lastName: String?,
    @ColumnInfo(name = "avatar") val avatar: String?,
    @ColumnInfo(name = "memberSince") val memberSince: Instant?,
    @ColumnInfo(name = "birthDate") val birthDate: Instant?,
    @ColumnInfo(name = "gender") val gender: String?,
    @ColumnInfo(name = "organDonation") val organDonation: Boolean,
    @ColumnInfo(name = "ssn") val ssn: String?,
    @ColumnInfo(name = "nationality") val nationality: String?,
    @ColumnInfo(name = "phone") val phone: String?,
    @ColumnInfo(name = "postalAddress") val postalAddress: PostalAddressEntity?,
    @ColumnInfo(name = "insurances") val insurances: List<Profile.Insurance>?,
    @ColumnInfo(name = "emergencyContact") val emergencyContact: List<EmergencyContactEntity>?,
    @ColumnInfo(name = "otherInfo") val otherInfo: String?,
    @ColumnInfo(name = "isActiveSubscription") val isActiveSubscription: Boolean,
    @ColumnInfo(name = "isForcedRefreshToken") val isForcedRefreshToken: Boolean,
    @ColumnInfo(name = "onBoardingRequired") val onBoardingRequired: Boolean,
    @ColumnInfo(name = "cardOrderStatus") val cardOrderStatus: String?,
    @ColumnInfo(name = "cardOrderDate") val cardOrderDate: Instant?
) {
    @Serializable
    class PostalAddressEntity(
        @SerialName("info") val info: String?,
        @SerialName("city") val city: String?,
        @SerialName("zipCode") val zipCode: String?,
        @SerialName("country") val country: String?
    )

    @Serializable
    class InsuranceEntity(
        @SerialName("company") val company: String?,
        @SerialName("type") val type: String?,
        @SerialName("phone") val phone: String?,
        @SerialName("policy") val policy: String?
    )

    @Serializable
    class EmergencyContactEntity(
        @SerialName("name") val name: String?,
        @SerialName("phone") val phone: String?,
        @SerialName("relationship") val relationship: String?
    )
}
