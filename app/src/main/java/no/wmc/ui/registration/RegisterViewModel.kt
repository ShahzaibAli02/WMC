package no.wmc.ui.registration

import no.wmc.domain.model.Profile
import no.wmc.domain.model.usecase.RegisterUserUseCase
import no.wmc.domain.model.usecase.RegisterWithEmailAndPasswordUseCase
import no.wmc.domain.model.usecase.ValidateEmailWithFireStoreUseCase
import no.wmc.ui.base.BaseViewModel
import no.wmc.ui.base.ViewEvent
import no.wmc.ui.base.ViewState
import no.wmc.utils.AppDispatchers

class RegisterViewModel(
    private val registerUserUseCase: RegisterUserUseCase,
    private val validateEmailWithFireStoreUseCase: ValidateEmailWithFireStoreUseCase,
    private val registerWithEmailAndPasswordUseCase: RegisterWithEmailAndPasswordUseCase,
    override val viewState: RegisterViewState = RegisterViewState(),
    appDispatchers: AppDispatchers
) : BaseViewModel<RegisterViewState>(
    appDispatchers
) {
    override suspend fun handleViewEvent(event: ViewEvent) {
        when (event) {
            is RegisterViewEvent.AddUserToFireStoreEvent -> handleRegisterUserViewEvent(event.profile)
            is RegisterViewEvent.ValidateEmailEvent -> validateEmail(event.email)
            is RegisterViewEvent.CreateUserInFireBaseAuth -> handleCreateUserInFirebaseAuthViewEvent(event.email, event.password)
            else -> throwEventNotSupported(event)
        }
    }

    private suspend fun handleRegisterUserViewEvent(profile: Profile) {
        postAction(RegisterViewAction.AddUserFireStoreAction(ViewState.Loading()))
        postAction(
            RegisterViewAction.AddUserFireStoreAction(
                getViewState(
                    state = registerUserUseCase(profile)
                )
            )
        )
    }

    private suspend fun handleCreateUserInFirebaseAuthViewEvent(email: String, password: String) {
        postAction(RegisterViewAction.CreateUserInFireBaseAuth(ViewState.Loading()))
        postAction(
            RegisterViewAction.CreateUserInFireBaseAuth(
                getViewState(
                    state = registerWithEmailAndPasswordUseCase(email, password)
                )
            )
        )
    }


    private suspend fun validateEmail(email: String) {
        postAction(RegisterViewAction.AddUserFireStoreAction(ViewState.Loading()))
        val isEmailValid = validateEmailWithFireStoreUseCase(email)
        postAction(
            RegisterViewAction.IsEmailValid(
                getViewState(
                    state = isEmailValid,
                )
            )
        )
    }
}
