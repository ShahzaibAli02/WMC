package no.wmc.utils.ext

import android.text.Editable
import android.util.Patterns
import kotlinx.datetime.Instant
import kotlinx.datetime.toInstant
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun String.isEmail(): Boolean = Patterns.EMAIL_ADDRESS.matcher(this).matches()
fun String?.countryCodeToName(): String? {
    return this?.uppercase()?.let { Locale("", it) }?.displayCountry
}
fun String?.countryNameToCode(): String? {
    Locale.getISOCountries().forEach {
        val locale = Locale("", it)
        if (locale.displayName == this) {
            return locale.country
        }
    }
    return null
}

fun Instant?.toStringDate(): String {
    return if (this == null) {
        "-"
    } else {
        val date = Date(toString().toInstant().toEpochMilliseconds())
        val formatter = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        return formatter.format(date)
    }
}

fun Editable?.toStringOrNull(): String? =
    if (this.isNullOrBlank()) {
        null
    } else {
        toString()
    }
