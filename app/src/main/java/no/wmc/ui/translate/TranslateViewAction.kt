package no.wmc.ui.translate

import no.wmc.domain.model.ProfileItem
import no.wmc.domain.model.TranslateItem
import no.wmc.domain.model.Translation
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState

sealed class TranslateViewAction : ViewAction() {
    class GetTranslateLanguagesViewAction(
        val viewState: ViewState<List<Translation>>
    ) : TranslateViewAction()

    class GetCurrentLanguageProfileItemsViewAction(
        val viewState: ViewState<ProfileItem>
    ) : TranslateViewAction()

    class GetTranslatedProfileItemsViewAction(
        val viewState: ViewState< List<TranslateItem>>
    ) : TranslateViewAction()
}
