package no.wmc.data.mapper

import no.wmc.data.local.db.entity.ProfileEntity
import no.wmc.data.local.db.entity.ProfileEntity.*
import no.wmc.data.remote.model.ProfileDtoModel
import no.wmc.data.remote.model.ProfileDtoModel.*
import no.wmc.data.remote.model.ProfileDtoModel.InsuranceDtoModel.InsuranceTypeDtoModel
import no.wmc.domain.model.Profile

//fun ProfileEntity.toDtoModel() = ProfileDtoModel(
//    firstName = firstName,
//    lastName = lastName,
//    avatar = avatar,
//    memberSince = memberSince,
//    birthDate = birthDate,
//    gender = gender?.let { GenderDtoModel.valueOf(it) },
//    organDonation = organDonation,
//    ssn = ssn,
//    nationality = nationality,
//    phone = phone,
//    postalAddress = postalAddress?.toDtoModel(),
//    insurances =insurances,
//    emergencyContact = emergencyContact?.map { it.toDtoModel() },
//    otherInfo = otherInfo,
//    isActiveSubscription = isActiveSubscription,
//    isForcedRefreshToken = isForcedRefreshToken,
//    onBoardingRequired = onBoardingRequired,
//    cardOrderStatus = cardOrderStatus?.let { CardOrderStatusDtoModel.valueOf(it) },
//    cardOrderDate = cardOrderDate
//)
//
//fun Profile.toDtoModel() = ProfileDtoModel(
//    firstName = firstName,
//    lastName = lastName,
//    avatar = avatar,
//    memberSince = memberSince,
//    birthDate = birthDate,
//    gender = gender?.let { GenderDtoModel.valueOf(it.name) },
//    organDonation = organDonation,
//    ssn = ssn,
//    nationality = nationality,
//    phone = phone,
//    email = email,
//    password = password,
//    postalAddress = postalAddress?.toDtoModel(),
//    insurances = insurances,
//    emergencyContact = emergencyContact?.map { it.toDtoModel() },
//    otherInfo = otherInfo,
//    isActiveSubscription = isActiveSubscription,
//    isForcedRefreshToken = isForcedRefreshToken,
//    onBoardingRequired = onBoardingRequired,
//    cardOrderStatus = cardOrderStatus?.let { CardOrderStatusDtoModel.valueOf(it.name) },
//    cardOrderDate = cardOrderDate
//)
//
//
//fun EmergencyContactEntity.toDtoModel() = EmergencyContactDtoModel(
//    name = name,
//    relationship = relationship,
//    phone = phone
//)
//
//fun Profile.EmergencyContact.toDtoModel() = EmergencyContactDtoModel(
//    name = name,
//    relationship = relationship,
//    phone = phone
//)
//
//fun PostalAddressEntity.toDtoModel() = PostalAddressDtoModel(
//    info = info,
//    city = city,
//    country = country,
//    zipCode = zipCode
//)
//
//fun Profile.PostalAddress.toDtoModel() = PostalAddressDtoModel(
//    info = info,
//    city = city,
//    country = country,
//    zipCode = zipCode
//)
//
//
//fun InsuranceEntity.toDtoModel() = InsuranceDtoModel(
//    company = company,
//    type = type?.let { InsuranceTypeDtoModel.valueOf(it) },
//    phone = phone,
//    policy = policy
//)
//
//fun Profile.Insurance.toDtoModel() = InsuranceDtoModel(
//    company = company,
//    type = type?.let { InsuranceTypeDtoModel.valueOf(it.name) },
//    phone = phone,
//    policy = policy
//)
//
//fun ProfileDtoModel.toEntity() = ProfileEntity(
//    id = "1",
//    firstName = firstName,
//    lastName = lastName,
//    avatar = avatar,
//    memberSince = memberSince,
//    birthDate = birthDate,
//    gender = gender?.name,
//    organDonation = organDonation ?: false,
//    ssn = ssn,
//    nationality = nationality,
//    phone = phone,
//    postalAddress = postalAddress?.toEntity(),
//    insurances =insurances,
//    emergencyContact = emergencyContact?.map { it.toEntity() },
//    otherInfo = otherInfo,
//    isActiveSubscription = isActiveSubscription,
//    isForcedRefreshToken = isForcedRefreshToken,
//    onBoardingRequired = onBoardingRequired,
//    cardOrderStatus = cardOrderStatus?.name,
//    cardOrderDate = cardOrderDate
//)
//
//fun EmergencyContactDtoModel.toEntity() = EmergencyContactEntity(
//    name = name,
//    relationship = relationship,
//    phone = phone
//)
//
//fun PostalAddressDtoModel.toEntity() = PostalAddressEntity(
//    info = info,
//    city = city,
//    country = country,
//    zipCode = zipCode
//)
