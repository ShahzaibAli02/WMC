package no.wmc.ui.main.home

import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.domain.model.DocumentList.DocumentGroup
import no.wmc.domain.model.Profile
import no.wmc.domain.model.ProfileItem
import no.wmc.domain.model.ShareMedicalInfo
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState
import java.io.File

sealed class HomeViewAction : ViewAction() {
    class GetProfileViewAction(val viewState: ViewState<Profile>) : HomeViewAction()
    class SetNoAllergiesAction(val viewState: ViewState<Boolean>) : HomeViewAction()
    class GetAllergiesViewAction(val viewState: ViewState<ProfileItem>) : HomeViewAction()
    class GetMedicineViewAction(val viewState: ViewState<ProfileItem>) : HomeViewAction()
    class GetDiagnosesViewAction(val viewState: ViewState<ProfileItem>) : HomeViewAction()
    class GetVaccinesViewAction(val viewState: ViewState<ProfileItem>) : HomeViewAction()
    class GetDocumentsViewAction(val viewState: ViewState<List<DocumentGroup>>) : HomeViewAction()
    class RemoveMedicalItemViewAction(val viewState: ViewState<ProfileItemEnum>) : HomeViewAction()
    class DownloadDocumentViewAction(val viewState: ViewState<File>) : HomeViewAction()
    class RemoveDocumentViewAction(val viewState: ViewState<Unit>) : HomeViewAction()
    class ShareViewAction(val viewState: ViewState<ShareMedicalInfo>) : HomeViewAction()
    class OrderCardViewAction(val viewState: ViewState<Unit>) : HomeViewAction()
}
