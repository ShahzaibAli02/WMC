package no.wmc.data.mapper

import kotlinx.datetime.Instant
import kotlinx.datetime.toJavaInstant
import kotlinx.datetime.toKotlinInstant
import no.wmc.data.remote.model.ProfileDtoModel

import no.wmc.domain.model.Profile
import no.wmc.utils.Const
import java.text.SimpleDateFormat
import java.util.*

/**
 * This mapper is used for fire store dto
 */

//fun Profile.toFsModel() = ProfileFsModel(
//
//    firstName = firstName,
//    lastName = lastName,
//    avatar  = avatar,
//    memberSince = convertInstantDateToString(memberSince),
//    birthDate = convertInstantDateToString(birthDate),
//    gender = gender?.let { ProfileDtoModel.GenderDtoModel.valueOf(it.name) },
//    organDonation = organDonation,
//    ssn = ssn,
//    nationality = nationality,
//    phone = phone,
//    phone2 = phone2,
//    email = email,
//    password = password,
//    postalAddress = postalAddress?.toFsModel()?.let { listOf(it) },
//    insurances = insurances,
//    emergencyContact = emergencyContact?.map { it.toFsModel() },
//    otherInfo = otherInfo,
//    isActiveSubscription = isActiveSubscription,
//    isForcedRefreshToken = isForcedRefreshToken,
//    onBoardingRequired = onBoardingRequired,
//    cardOrderStatus = cardOrderStatus?.let { ProfileDtoModel.CardOrderStatusDtoModel.valueOf(it.name) },
//    cardOrderDate = convertInstantDateToString(cardOrderDate)
//)
//
//fun Profile.EmergencyContact.toFsModel() = ProfileFsModel.EmergencyContactDtoModel(
//    name = name,
//    relationship = relationship,
//    phone = phone
//)
//
//fun Profile.PostalAddress.toFsModel() = ProfileFsModel.PostalAddressDtoModel(
//    info = info,
//    city = city,
//    country = country,
//    zipCode = zipCode
//)
//
//
//fun ProfileFsModel.toModel() = Profile(
//    firstName = firstName,
//    lastName = lastName,
//    avatar = avatar,
//    memberSince = convertStringToInstant(memberSince),
//    birthDate = convertStringToInstant(birthDate),
//    gender = gender?.let { Profile.Gender.valueOf(it.name) },
//    organDonation = organDonation,
//    ssn = ssn,
//    nationality = nationality,
//    phone = phone,
//    phone2=phone2,
//    relationShip = relationShip,
//    email = email,
//    password = password,
//    postalAddress = postalAddress?.getOrNull(0)?.toModel(),
//    insurances =insurances,
//    emergencyContact = emergencyContact?.map { it?.toModel()?:Profile.EmergencyContact() },
//    otherInfo = otherInfo,
//    isActiveSubscription = isActiveSubscription,
//    isForcedRefreshToken = isForcedRefreshToken,
//    onBoardingRequired = onBoardingRequired,
//    cardOrderStatus = cardOrderStatus?.let { Profile.CardOrderStatus.valueOf(it.name) },
//    cardOrderDate = convertStringToInstant(cardOrderDate),
//)
//
//fun ProfileFsModel.PostalAddressDtoModel.toModel() = Profile.PostalAddress(
//    info = info,
//    city = city,
//    country = country,
//    zipCode = zipCode
//)
//
//
//fun ProfileFsModel.EmergencyContactDtoModel.toModel() = Profile.EmergencyContact(
//    name = name,
//    relationship = relationship,
//    phone = phone
//)

fun convertInstantDateToString(date: Instant?): String? {
    if (date == null) return null
    val dateFormat = SimpleDateFormat(Const.FireStoreDateFormat, Locale.getDefault())
    val dateObj = Date.from(date.toJavaInstant())
    return dateFormat.format(dateObj)
}

fun convertStringToInstant(date: String?): Instant? {
    if (date == null) return null
    return try {
        val dateFormat = SimpleDateFormat(Const.FireStoreDateFormat, Locale.getDefault())
        val dateObj = dateFormat.parse(date)
        dateObj.toInstant().toKotlinInstant()
    } catch (e: Exception) {
        e.printStackTrace()
        Calendar.getInstance().time.toInstant().toKotlinInstant()
    }
}