package no.wmc.ui.translate

import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.firebase.model.AllCategoryModel
import no.wmc.ui.base.ViewEvent

sealed class TranslateViewEvent : ViewEvent() {
    object GetTranslateLanguagesViewEvent : TranslateViewEvent()

    class GetCurrentLanguageProfileItemsViewEvent(
        val profileItemEnum: ProfileItemEnum
    ) : TranslateViewEvent()

    class GetTranslatedProfileItemsViewEvent(
        val list: Array<AllCategoryModel>,
        val language: String
    ) : TranslateViewEvent()
}
