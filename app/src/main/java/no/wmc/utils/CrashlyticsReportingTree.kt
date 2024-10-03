package no.wmc.utils

import android.util.Log
import com.google.firebase.crashlytics.FirebaseCrashlytics
import timber.log.Timber

/**
 * Timber logging tree for forward error reports to Firebase Crashlytics
 */
class CrashlyticsReportingTree : Timber.Tree() {

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        if (priority == Log.ERROR) {
            if (t != null) {
                FirebaseCrashlytics.getInstance().recordException(t)
            } else {
                FirebaseCrashlytics.getInstance().log(message)
            }
        }
    }
}
