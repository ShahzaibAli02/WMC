package no.wmc.ui.login.resetpassword

import no.wmc.domain.model.usecase.ResetPasswordUseCase
import no.wmc.ui.base.BaseViewModel
import no.wmc.ui.base.ViewEvent
import no.wmc.ui.base.ViewState.Loading
import no.wmc.utils.AppDispatchers

class ResetPasswordViewModel(
    private val resetPasswordUseCase: ResetPasswordUseCase,
    override val viewState: ResetPasswordViewState = ResetPasswordViewState(),
    appDispatchers: AppDispatchers
) : BaseViewModel<ResetPasswordViewState>(
    appDispatchers
) {

    override suspend fun handleViewEvent(event: ViewEvent) {
        when (event) {
            is ResetPasswordViewEvent -> handleResetPasswordViewEvent(event.email)
            else -> throwEventNotSupported(event)
        }
    }

    private suspend fun handleResetPasswordViewEvent(email: String) {
        postAction(ResetPasswordViewAction(Loading()))
        val result = resetPasswordUseCase(email)
        postAction(ResetPasswordViewAction(getViewState(state = result)))
    }
}
