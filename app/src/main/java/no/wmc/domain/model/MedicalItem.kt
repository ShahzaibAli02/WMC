package no.wmc.domain.model

data class MedicalItem(
    var isChecked: Boolean = false,
    var isEditMode: Boolean = false,
    val profileItem: ProfileItem.Item
)
