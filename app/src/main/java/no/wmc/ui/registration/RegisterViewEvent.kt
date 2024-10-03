package no.wmc.ui.registration

import no.wmc.domain.model.Profile
import no.wmc.ui.base.ViewEvent

sealed class RegisterViewEvent : ViewEvent() {
    class AddUserToFireStoreEvent(val profile: Profile) : RegisterViewEvent()
    class ValidateEmailEvent(val email: String) : RegisterViewEvent()
    class CreateUserInFireBaseAuth(val email: String, val password: String) : RegisterViewEvent()
}
