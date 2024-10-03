package no.wmc.ui.registration

import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState

sealed class RegisterViewAction : ViewAction() {
    class AddUserFireStoreAction(val viewState: ViewState<String>) : RegisterViewAction()
    class CreateUserInFireBaseAuth(val viewState: ViewState<Unit>) : RegisterViewAction()
    class IsEmailValid(val viewState: ViewState<Boolean>) : RegisterViewAction()
}
