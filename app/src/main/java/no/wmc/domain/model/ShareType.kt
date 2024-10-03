package no.wmc.domain.model

import kotlinx.serialization.Serializable

@Serializable
enum class ShareType {
    Allergy,
    Diagnosis,
    Medication,
    Vaccine
}
