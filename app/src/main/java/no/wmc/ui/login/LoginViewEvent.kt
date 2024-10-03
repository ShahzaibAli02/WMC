package no.wmc.ui.login

import android.content.Intent
import no.wmc.ui.base.ViewEvent
import no.wmc.ui.main.home.HomeViewEvent

sealed class LoginViewEvent : ViewEvent() {
    class AuthWithGoogleViewEvent(val intent: Intent) : LoginViewEvent()
    class AuthWithEmailAndPasswordViewEvent(val email: String, val password: String,var isRemember : Boolean) : LoginViewEvent()
}
