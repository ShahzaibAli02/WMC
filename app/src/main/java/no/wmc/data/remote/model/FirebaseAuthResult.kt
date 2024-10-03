package no.wmc.data.remote.model

sealed class FirebaseAuthResult {
    object CodeSentResult : FirebaseAuthResult()
    object SignInSuccessResult : FirebaseAuthResult()
    class WrongPasswordError(val message: String) : FirebaseAuthResult()
    class UserNotFoundError(val message: String) : FirebaseAuthResult()
    class TooManyRequestsError(val message: String) : FirebaseAuthResult()
    class FirebaseApiNotAvailableError(val message: String) : FirebaseAuthResult()
    class AppNotAuthorizedError(val message: String) : FirebaseAuthResult()
    class UnknownAuthError(val message: String) : FirebaseAuthResult()
}
