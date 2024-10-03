package no.wmc.data.remote

import no.wmc.data.remote.StatusCode.UNAUTHORIZED_ACCESS

class AuthException(val code: Int = UNAUTHORIZED_ACCESS) : Throwable()
