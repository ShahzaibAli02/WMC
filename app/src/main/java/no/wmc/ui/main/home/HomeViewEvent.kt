package no.wmc.ui.main.home

import android.content.Context
import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.domain.model.Document
import no.wmc.domain.model.ProfileItem
import no.wmc.domain.model.ShareType
import no.wmc.ui.base.ViewEvent

sealed class HomeViewEvent : ViewEvent() {
    object GetProfileViewEvent : HomeViewEvent()
    object SetNoAllergiesEvent : HomeViewEvent()
    object GetAllergiesViewEvent : HomeViewEvent()
    object GetMedicineViewEvent : HomeViewEvent()
    object GetDiagnosesViewEvent : HomeViewEvent()
    object GetVaccinesViewEvent : HomeViewEvent()
    object GetDocumentsViewEvent : HomeViewEvent()
    class ShareViewEvent(
        val context: Context,
        val shareType: ShareType
    ) : HomeViewEvent()
    class RemoveMedicalItemViewEvent(
        val profileItemEnum: ProfileItemEnum,
        val profileItem: ProfileItem.Item
    ) : HomeViewEvent()
    class DownloadDocumentViewEvent(
        val context: Context,
        val document: Document
    ) : HomeViewEvent()
    class RemoveDocumentViewEvent(val documentId: Int) : HomeViewEvent()
    object OrderCardViewEvent : HomeViewEvent()
}
