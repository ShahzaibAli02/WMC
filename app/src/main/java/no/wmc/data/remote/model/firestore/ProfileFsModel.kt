package no.wmc.data.remote.model.firestore
//
//import kotlinx.serialization.Serializable
//import no.wmc.data.remote.model.ProfileDtoModel
//import no.wmc.domain.model.Profile
//import java.util.Objects
//
//@Serializable
//data class ProfileFsModel(
//    val firstName: String? = null,
//    val lastName: String? = null,
//    val avatar: String? = null,
//    val memberSince: String? = null,
//    val birthDate: String? = null,
//    val gender: ProfileDtoModel.GenderDtoModel? = null,
//    val organDonation: Boolean? = null,
//    val ssn: String? = null,
//    val nationality: String? = null,
//    val relationShip: String = "",
//    val phone: String? = null,
//    val phone2: String? = null,
//    val email: String? = null,
//    val password: String? = null,
//    val postalAddress: List<PostalAddressDtoModel>? = null,
//    val insurances: List<Profile.Insurance>? = null,
//    val emergencyContact: List<EmergencyContactDtoModel?>? = null,
//    val otherInfo: String? = null,
//    @field:JvmField val isActiveSubscription: Boolean = false,
//    @field:JvmField val isForcedRefreshToken: Boolean = false,
//    val onBoardingRequired: Boolean = true,
//    val cardOrderStatus: ProfileDtoModel.CardOrderStatusDtoModel? = null,
//    val cardOrderDate: String? = null
//) {
//    @Serializable
//    data class PostalAddressDtoModel(
//        val info: String? = null,
//        val city: String? = null,
//        val zipCode: String? = null,
//        val country: String? = null
//    )
//
//
//    fun mapOfOrderCard():Map<String,String?>
//    {
//        return mapOf(Pair("cardOrderDate",cardOrderDate),Pair("cardOrderStatus",cardOrderStatus.toString()))
//    }
//    fun mapOfSub():Map<String,Any?>
//    {
//        return mapOf(Pair("isActiveSubscription",true))
//    }
//    @Serializable
//    data class EmergencyContactDtoModel(
//        val name: String? = null,
//        val phone: String? = null,
//        val relationship: String? = null
//    )
//
//        override fun toString(): String {
//            return """
//                 First Name = $firstName
//                 Last Name = $lastName
//                 Gender = $gender
//                 Social Security Number = $ssn
//                 Nationality = $nationality
//                 RelationShip = $relationShip
//                 Phone = $phone
//                 Email = $email
//        """.trimIndent()
//        }
//}
