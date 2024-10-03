package no.wmc.ui.login

import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import no.wmc.domain.model.Profile

class LoginViewState {
    var profile: Profile? = null
    var googleAccount: GoogleSignInAccount? = null
}
