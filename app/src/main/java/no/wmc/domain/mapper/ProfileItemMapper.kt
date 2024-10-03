package no.wmc.domain.mapper

import no.wmc.domain.model.MedicalItem
import no.wmc.domain.model.ProfileItem
import no.wmc.domain.model.ProfileItem.Item


fun ProfileItem.toMedicalItem() = items?.map {
    MedicalItem(
        profileItem = it
    )
}
