package no.wmc.ui.main.home

import no.wmc.domain.model.DocumentList.DocumentGroup
import no.wmc.domain.model.Profile
import no.wmc.domain.model.ProfileItem
import java.io.File

class HomeViewState {
    var profile: Profile? = null
    var noAllergiesSwitch: Boolean = false
    var allergies: ProfileItem? = null
    var medicines: ProfileItem? = null
    var diagnonses: ProfileItem? = null
    var documents: List<DocumentGroup>? = null
    var downloadedDocument: File? = null
}
