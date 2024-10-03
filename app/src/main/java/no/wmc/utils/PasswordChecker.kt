package no.wmc.utils

import java.util.regex.Pattern

object PasswordChecker
{

    fun isStrongPassword(password: String): Boolean {
        // Minimum 8 characters, at least one uppercase letter, and at least one special symbol
        val passwordPattern = "^(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$"

        val pattern = Pattern.compile(passwordPattern)
        val matcher = pattern.matcher(password)

        return matcher.matches()
    }
}