package no.wmc.ui.login

import no.wmc.data.remote.model.FirebaseAuthResult
import no.wmc.domain.model.Profile
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState

sealed class LoginViewAction : ViewAction() {
    class AuthWithGoogleViewAction(val viewState: ViewState<Unit>) : LoginViewAction()
    class AuthWithEmailAndPasswordAction(
        val viewState: ViewState<FirebaseAuthResult>
    ) : LoginViewAction()
    class GetProfileAction(val viewState: ViewState<Profile>) : LoginViewAction()
}
