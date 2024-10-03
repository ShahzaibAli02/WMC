package no.wmc.domain.model

import kotlinx.serialization.Serializable
import no.wmc.data.remote.model.Promo

import no.wmc.domain.model.Profile.EmergencyContact
import no.wmc.domain.model.Profile.Gender
import no.wmc.domain.model.Profile.Insurance
import no.wmc.domain.model.Profile.PostalAddress

data class Profile(
    val firstName: String?="",
    val lastName: String?="",
    val avatar: String? = null,
    val memberSince: String?="",
    val birthDate: String?="",
    val gender: Gender?=Gender.Male,
    val organDonation: Boolean?=false,
    val ssn: String?="",
    val ssn_country_code:String?="+1",
    val nationality: String?="",
    val phone: String?="",
    val homePhone: String?=null,
    val email: String? = null,
    val password: String? = null,
    val postalAddress: List<PostalAddress>?=null,
    val insurances: List<Insurance>?=null,
    val emergencyContact: List<EmergencyContact>?=null,
    val otherInfo: String?="",
    val isActiveSubscription: Boolean=false,
    val isForcedRefreshToken: Boolean=false,
    val onBoardingRequired: Boolean=false,
    val cardOrderStatus: CardOrderStatus?=null,
    val cardOrderDate: String?="",
    val relationShip:String="",
    var uid:String?=null,
    var promo: Promo?=null,
    val registerationPlatform:String="android"
) {


    data class PostalAddress(
        val info: String?,
        val city: String?,
        val postalCode: String?,
        val country: String?
    )

        fun mapOfOrderCard():Map<String,String?>
        {
            return mapOf(Pair("cardOrderDate",cardOrderDate),Pair("cardOrderStatus",cardOrderStatus.toString()))
        }

    @Serializable
    data class Insurance(
        var company: String?=null,
        var type: InsuranceType?=null,
        var phone: String?=null,
        var policy: String?=null,
    ) {

        enum class InsuranceType(val displayName: String?="") {
            Travel("Travel"),
            Health("Health")
        }
    }

    public data class EmergencyContact(
        var name: String?=null,
        var phone: String?=null,
        var relationship: String?=null,
    )

    enum class Gender {
        Male,
        Female
    }

    enum class CardOrderStatus {
        Unregistered,
        Registered,
        Failed,
        Completed
    }
}


data class ProfileUpdate(
    val ssn_country_code: String?,
    val firstName: String?,
    val lastName: String?,
    val avatar: String? = null,
    val birthDate: String?,
    val gender: Gender?,
    val organDonation: Boolean?,
    val relationShip: String?,
    val ssn: String?,
    val nationality: String?,
    val phone: String?,
    val homePhone: String?,
    val postalAddress: List<PostalAddress>?,
    val insurances: List<Insurance>?,
    val emergencyContact: List<EmergencyContact>?,
    val otherInfo: String?
)

