package no.wmc.utils.ext

import java.util.Locale

fun getCurrentLocaleLang(): String {
    var lang = Locale.getDefault().language
    if (lang == "nb") {
        lang = "no"
    }

    return lang
}
