package no.wmc.ui.profile

import no.wmc.domain.model.ProfileUpdate
import no.wmc.ui.base.ViewEvent

sealed class ProfileViewEvent : ViewEvent() {
    object GetProfileViewEvent : ProfileViewEvent()
    class UpdateProfileViewEvent(val profileUpdate: ProfileUpdate) : ProfileViewEvent()
}
