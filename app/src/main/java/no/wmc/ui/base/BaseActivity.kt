package no.wmc.ui.base

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import org.koin.android.ext.android.inject

abstract class BaseActivity : AppCompatActivity() {

    private val lokaliseService: LokaliseService by inject()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(lokaliseService.wrap(newBase))
    }
}
