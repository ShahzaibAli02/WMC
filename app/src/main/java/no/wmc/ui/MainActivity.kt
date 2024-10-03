package no.wmc.ui

import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat.Type
import androidx.core.view.updateLayoutParams
import androidx.core.view.updateMargins
import androidx.core.view.updatePadding
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import no.wmc.R
import no.wmc.databinding.ActivityMainBinding
import no.wmc.ui.base.BaseActivity

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHost) as NavHostFragment
        navController = navHostFragment.navController
        WindowCompat.setDecorFitsSystemWindows(window, false)
        updateInsets()
        if(!isNotificationPermissionGranted())
        {
            requestNotificationPermission()
        }

        handleDeepLink(intent?.data)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        handleDeepLink(intent?.data)
    }

    private fun handleDeepLink(uri: Uri?) {
        uri?.let { deepLink ->
            if (deepLink.scheme == "intent" && deepLink.host == "emergencypage") {
                // Navigate to the desired fragment using NavController
                navController.navigate(R.id.emergencyFragment2)
            }
        }
    }
    fun requestNotificationPermission() {
        if (!isNotificationPermissionGranted()) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(  android.Manifest.permission.POST_NOTIFICATIONS),
                11
            )
        }
    }

    fun isNotificationPermissionGranted(): Boolean {
        return ContextCompat.checkSelfPermission(
            this,
            android.Manifest.permission.POST_NOTIFICATIONS
        ) == PackageManager.PERMISSION_GRANTED
    }

    private fun setWindowFlag(bits: Int, on: Boolean) {
        val win = window
        val winParams = win.attributes
        if (on) {
            winParams.flags = winParams.flags or bits
        } else {
            winParams.flags = winParams.flags and bits.inv()
        }
        win.attributes = winParams
    }

    private fun updateInsets() {
        ViewCompat.setOnApplyWindowInsetsListener(binding.content) { v, insets ->
            if (ViewCompat.getRootWindowInsets(v)?.isVisible(Type.ime()) == true) {
                v.updatePadding(bottom = insets.getInsets(Type.ime()).bottom)
            } else {
                v.updatePadding(bottom = insets.getInsets(Type.navigationBars()).bottom)
            }

            insets
        }
        ViewCompat.setOnApplyWindowInsetsListener(binding.navHost) { v, insets ->
            v.updateLayoutParams<LayoutParams> {
                updateMargins(
                    top = insets.getInsets(Type.statusBars()).top
                )
            }

            insets
        }
    }
}
