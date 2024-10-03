package no.wmc.ui.profile

import no.wmc.domain.model.Profile
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState

sealed class ProfileViewAction : ViewAction() {
    class GetProfileViewAction(val viewState: ViewState<Profile>) : ProfileViewAction()
    class UpdateProfileViewAction(val viewState: ViewState<Unit>) : ProfileViewAction()
}
