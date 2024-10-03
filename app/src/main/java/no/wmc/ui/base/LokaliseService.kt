package no.wmc.ui.base

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.Resources
import androidx.appcompat.R
import androidx.appcompat.view.ContextThemeWrapper
import com.lokalise.sdk.Lokalise
import com.lokalise.sdk.LokaliseContextWrapper
import com.lokalise.sdk.LokaliseResources
import no.wmc.BuildConfig
import no.wmc.utils.CrashlyticsReportingTree
import no.wmc.utils.ext.lazyUnsafe
import timber.log.Timber

class LokaliseService(appContext: Context) {

    init {
        Lokalise.init(
            appContext = appContext,
            sdkToken = BuildConfig.LOKALISE_TOKEN,
            projectId = BuildConfig.LOKALISE_PROJECT_ID
        )

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            Timber.plant(CrashlyticsReportingTree())
        }

        Lokalise.isPreRelease = BuildConfig.DEBUG
        Lokalise.updateTranslations()
        Timber.d("LokaliseService initialized")
    }

    fun wrap(context: Context): Context = LokaliseContextFixed(context)
}

@SuppressLint("PrivateResource")
private class LokaliseContextFixed(base: Context) :
    ContextThemeWrapper(LokaliseContextWrapper.wrap(base), R.style.Theme_AppCompat_Empty) {

    private val lokaliseResources: Resources by lazyUnsafe {
        LokaliseResources(baseContext)
    }

    override fun getResources(): Resources = lokaliseResources
}
