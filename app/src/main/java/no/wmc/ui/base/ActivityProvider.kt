package no.wmc.ui.base

import android.app.Activity
import android.app.Application

class ActivityProvider(app: Application) {
    var topActivity: Activity? = null
        get() = field
    private set

    init {
        app.registerActivityLifecycleCallbacks(object : ActivityCallbacks() {
            override fun onActivityResumed(activity: Activity) {
                topActivity = activity
            }

            override fun onActivityStarted(activity: Activity) {
                topActivity = activity
            }

            override fun onActivityStopped(activity: Activity) {
                if (topActivity == activity) {
                    topActivity = null
                }
            }
        })
    }
}
