package no.wmc.utils.ext

import android.app.Activity
import android.content.Context
import android.os.Build
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.util.DisplayMetrics
import android.view.View
import android.view.Window
import android.view.WindowInsets.Type
import android.view.WindowInsetsController
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback
import androidx.annotation.StringRes
import androidx.lifecycle.LifecycleOwner
import com.google.android.material.snackbar.Snackbar

fun Activity.hideKeyboard(view: View)
{
    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(view.windowToken, 0)
}

fun Activity.hideKeyboard()
{
    val imm = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    var view = currentFocus
    if (view == null)
    {
        view = View(this)
    }
    imm.hideSoftInputFromWindow(view.windowToken, 0)
    view.clearFocus()
}

fun Activity.showKeyboard()
{
    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY)
    window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)
}

/**
 * Custom behavior for back button at Fragments from Android Navigation Component
 */
fun ComponentActivity.setBackAction(lifeCycleOwner: LifecycleOwner, action: () -> Unit)
{
    this.onBackPressedDispatcher.addCallback(lifeCycleOwner, object : OnBackPressedCallback(true)
    {
        override fun handleOnBackPressed()
        {
            action()
        }
    })
}

fun Activity.showToast(text: String)
{
    Toast.makeText(this, text, LENGTH_LONG).show()
}

fun Activity.showSnackBar(message: String)
{
    Snackbar.make(
        findViewById(android.R.id.content), message, Snackbar.LENGTH_SHORT
    ).show()
}

fun Activity.showSnackBar(@StringRes messageId: Int)
{
    Snackbar.make(
        findViewById(android.R.id.content), messageId, Snackbar.LENGTH_SHORT
    ).show()
}

fun Activity.getWindowHeight(): Int
{
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R)
    {
        windowManager.currentWindowMetrics.bounds.height()
    } else
    {
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        displayMetrics.heightPixels
    }
}

fun Activity.showNavigationBar()
{
    if (VERSION.SDK_INT >= VERSION_CODES.R)
    {
        window.setDecorFitsSystemWindows(false)
        val controller = window.insetsController
        controller?.show(Type.navigationBars())
    } else
    {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
    }
}

fun Activity.hideStatusBar()
{

    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

}

fun Activity.showStatusBAr()
{

    getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
}

fun Activity.hideNavigationBar()
{
    if (VERSION.SDK_INT >= VERSION_CODES.R)
    {
        window.setDecorFitsSystemWindows(false)
        val controller = window.insetsController
        controller?.let {
            it.hide(Type.navigationBars())
            it.systemBarsBehavior = WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
    } else
    {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
    }
}
