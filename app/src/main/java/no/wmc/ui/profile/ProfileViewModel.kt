package no.wmc.ui.profile

import no.wmc.data.local.manager.LocalDataManager
import no.wmc.domain.model.ProfileUpdate
import no.wmc.domain.model.usecase.GetProfileUseCase
import no.wmc.domain.model.usecase.UpdateProfileUseCase
import no.wmc.ui.base.BaseViewModel
import no.wmc.ui.base.ViewEvent
import no.wmc.ui.base.ViewState.Loading
import no.wmc.ui.profile.ProfileViewAction.GetProfileViewAction
import no.wmc.ui.profile.ProfileViewAction.UpdateProfileViewAction
import no.wmc.ui.profile.ProfileViewEvent.GetProfileViewEvent
import no.wmc.ui.profile.ProfileViewEvent.UpdateProfileViewEvent
import no.wmc.utils.AppDispatchers

class ProfileViewModel(
    private val getProfileUseCase: GetProfileUseCase,
    private val updateProfileUseCase: UpdateProfileUseCase,
    override val viewState: ProfileViewState = ProfileViewState(),
    private val localDataManager: LocalDataManager,
    appDispatchers: AppDispatchers
) : BaseViewModel<ProfileViewState>(
    appDispatchers
) {
    override suspend fun handleViewEvent(event: ViewEvent) {
        when (event) {
            is GetProfileViewEvent -> handleGetProfileEvent()
            is UpdateProfileViewEvent -> handleUpdateProfileEvent(event.profileUpdate)
        }
    }

    private suspend fun handleGetProfileEvent() {
        postAction(GetProfileViewAction(Loading()))
        localDataManager.getCredentials()?.id?.let {uid->
            postAction(
                GetProfileViewAction(
                    getViewState(
                        state = getProfileUseCase(uid),
                        successCallback = { viewState.profile = it }
                    )
                )
            )
        }



    }

    private suspend fun handleUpdateProfileEvent(profileUpdate: ProfileUpdate) {
        postAction(UpdateProfileViewAction(Loading()))
        localDataManager.getCredentials()?.id?.let {uid->

            postAction(
                UpdateProfileViewAction(
                    getViewState(
                        state = updateProfileUseCase(uid,profileUpdate)
                    )
                )
            )
        }

    }
}
