package no.wmc.ui.medical

import no.wmc.domain.model.ProfileItem
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState

sealed class AddMedicalInfoViewAction : ViewAction() {
    class SearchMedicalItemAction(val viewState: ViewState<List<ProfileItem.Item>>) :
        AddMedicalInfoViewAction()
    class AddMedicalItemAction(val viewState: ViewState<Unit>) :
        AddMedicalInfoViewAction()
}
