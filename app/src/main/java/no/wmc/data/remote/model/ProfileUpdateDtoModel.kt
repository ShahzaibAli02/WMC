package no.wmc.data.remote.model

import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import no.wmc.data.remote.model.ProfileDtoModel.EmergencyContactDtoModel
import no.wmc.data.remote.model.ProfileDtoModel.GenderDtoModel
import no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel
import no.wmc.data.remote.model.ProfileDtoModel.PostalAddressDtoModel
import no.wmc.domain.model.Profile

@Serializable
class ProfileUpdateDtoModel(
    @SerialName("firstName") val firstName: String?,
    @SerialName("lastName") val lastName: String?,
    @SerialName("avatar") val avatarUrl: String? = null,
    @SerialName("birthDate") val birthDate: String?,
    @SerialName("gender") val gender: GenderDtoModel?,
    @SerialName("organDonation") val organDonation: Boolean?,
    @SerialName("ssn") val ssn: String?,
    @SerialName("relationShip") val relationShip: String?,

    @SerialName("nationality") val nationality: String?,
    @SerialName("phone") val phone: String?,
    @SerialName("phone2") val phone2: String?,
    @SerialName("postalAddress") val postalAddress: List<PostalAddressDtoModel>?,
    @SerialName("insurances") val insurances: List<Profile.Insurance>?,
    @SerialName("emergencyContact") val emergencyContact: List<EmergencyContactDtoModel>?,
    @SerialName("otherInfo") val otherInfo: String?
)
fun ProfileUpdateDtoModel.toMap(): Map<String, Any?> {
    return mapOf(
        "firstName" to firstName,
        "lastName" to lastName,
//        "avatar" to avatarUrl,
        "birthDate" to birthDate,
        "gender" to gender,
        "organDonation" to organDonation,
        "ssn" to ssn,
        "nationality" to nationality,
        "relationShip" to relationShip,
        "phone" to phone,
        "phone2" to phone2,
        "postalAddress" to postalAddress,
        "insurances" to insurances,
        "emergencyContact" to emergencyContact,
        "otherInfo" to otherInfo
    )
}
