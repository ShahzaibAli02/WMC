package no.wmc

import android.app.Application
import android.graphics.Color
import android.os.Build
import android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
import android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE
import android.view.Window
import android.view.WindowManager
import androidx.core.view.WindowCompat
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import no.wmc.di.apiModule
import no.wmc.di.appModule
import no.wmc.di.dataModule
import no.wmc.di.repositoryModule
import no.wmc.di.useCaseModule
import no.wmc.di.viewModelModule
import no.wmc.di.viewStateModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber


class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@App)
            modules(
                listOf(
                    appModule,
                    dataModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule,
                    apiModule,
                    viewStateModule
                )
            )
        }
    }
}

val errorHandler by lazy {
    CoroutineExceptionHandler { _, throwable ->
        Timber.e(throwable)
    }
}
val applicationScope by lazy { CoroutineScope(Dispatchers.Main + SupervisorJob() + errorHandler) }
