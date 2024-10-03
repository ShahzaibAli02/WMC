package no.wmc.data.remote.model

import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import no.wmc.domain.model.Profile

@Serializable
data class ProfileDtoModel(
    @SerialName("firstName") val firstName: String?,
    @SerialName("lastName") val lastName: String?,
    @SerialName("avatar") val avatar: String?,
    @SerialName("memberSince") val memberSince: Instant?,
    @SerialName("birthDate") val birthDate: Instant?,
    @SerialName("gender") val gender: GenderDtoModel?,
    @SerialName("organDonation") val organDonation: Boolean?,
    @SerialName("ssn") val ssn: String?,
    @SerialName("nationality") val nationality: String?,
    @SerialName("phone") val phone: String?,
    @SerialName("email") val email: String? = null,
    @SerialName("password") val password: String? = null,
    @SerialName("postalAddress") val postalAddress: PostalAddressDtoModel?,
    @SerialName("insurances")     val insurances: List<Profile.Insurance>?=null,
    @SerialName("emergencyContact") val emergencyContact: List<EmergencyContactDtoModel>?,
    @SerialName("otherInfo") val otherInfo: String?,
    @SerialName("isActiveSubscription") val isActiveSubscription: Boolean,
    @SerialName("isForcedRefreshToken") val isForcedRefreshToken: Boolean,
    @SerialName("onBoardingRequired") val onBoardingRequired: Boolean,
    @SerialName("cardOrderStatus") val cardOrderStatus: CardOrderStatusDtoModel?=CardOrderStatusDtoModel.Unregistered,
    @SerialName("cardOrderDate") val cardOrderDate: Instant?
) {
    @Serializable
    data class PostalAddressDtoModel(
        @SerialName("info") val info: String?,
        @SerialName("city") val city: String?,
        @SerialName("zipCode") val zipCode: String?,
        @SerialName("country") val country: String?
    )

    @Serializable
    data class InsuranceDtoModel(
        @SerialName("company") val company: String?,
        @SerialName("type") val type: InsuranceTypeDtoModel?,
        @SerialName("phone") val phone: String?,
        @SerialName("policy") val policy: String?
    ) {
        @Serializable
        enum class InsuranceTypeDtoModel {
            @SerialName("Travel")
            Travel,
            @SerialName("Health")
            Health
        }
    }

    @Serializable
    data class EmergencyContactDtoModel(
        @SerialName("name") val name: String?,
        @SerialName("phone") val phone: String?,
        @SerialName("relationship") val relationship: String?
    )

    @Serializable
    enum class GenderDtoModel {

        @SerialName("Male")
        Male,

        @SerialName("Female")
        Female,


    }

    @Serializable
    enum class CardOrderStatusDtoModel {
        @SerialName("Unregistered")
        Unregistered,

        @SerialName("Registered")
        Registered,

        @SerialName("Failed")
        Failed,

        @SerialName("Completed")
        Completed
    }
}
