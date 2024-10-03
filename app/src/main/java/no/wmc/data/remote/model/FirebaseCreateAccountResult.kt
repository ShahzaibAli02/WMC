package no.wmc.data.remote.model

sealed class FirebaseCreateAccountResult {
    object AccountCreatedSuccessfully : FirebaseCreateAccountResult()
    class AccountExist(val message: String) : FirebaseCreateAccountResult()
    class WeakPassword(val message: String) : FirebaseCreateAccountResult()
    class UnknownCreateAccountError(val message: String) : FirebaseCreateAccountResult()
}
