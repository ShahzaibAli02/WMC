package no.wmc.ui.medical

import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.domain.model.ProfileItem
import no.wmc.ui.base.ViewEvent

sealed class AddMedicalInfoViewEvent : ViewEvent() {
    class SearchMedicalItemEvent(val profileItemEnum: ProfileItemEnum, val keyword: String) :
        AddMedicalInfoViewEvent()
    class LoadMoreMedicalItemEvent(val profileItemEnum: ProfileItemEnum) : AddMedicalInfoViewEvent()
    class AddMedicalItemEvent(
        val profileItemEnum: ProfileItemEnum,
        val profileItem: ProfileItem.Item
    ) : AddMedicalInfoViewEvent()
}
