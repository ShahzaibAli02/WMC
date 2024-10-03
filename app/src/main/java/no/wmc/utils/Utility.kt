package no.wmc.utils

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.telephony.TelephonyManager
import android.util.Log
import com.google.gson.Gson
import no.wmc.data.local.manager.SharedPrefManager
import no.wmc.data.local.manager.impl.LocalDataManagerImpl
import no.wmc.data.local.manager.impl.SharedPrefManagerImpl
import java.util.Locale


object Utility
{



    fun getISOCountryCode(context: Context): String {

        return SharedPrefManagerImpl(context).getString("user_country_code","us")?:"us"
//        val telephonyManager = context.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
//        val simCountryIso = telephonyManager.simCountryIso
//        if (simCountryIso != null && !simCountryIso.isEmpty())
//        { // The SIM card country code is available
//            Log.d("TAG", "getISOCountryCode: "+simCountryIso)
//            return simCountryIso
//        }
//        val locale: Locale = context.resources.configuration.locales[0]
//        Log.d("TAG", "getISOCountryCode: "+locale.country)
//        return locale.country
    }
    fun convertToJson(mapData: Map<String, Any>?): String?
    {
        val gsn = Gson()
        return gsn.toJson(mapData)
    }

    fun openLink(context: Context, link: String)
    {
        kotlin.runCatching {
            val uri = Uri.parse(link) // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            context.startActivity(intent)
        }
    }
     fun shareAppLink(context: Context) {
        val playStoreLink = "https://play.google.com/store/apps/details?id=${context.packageName}"

        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Check out this app!")
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, I found this amazing app: $playStoreLink")

        val chooserTitle = "Share via"
        val chooser = Intent.createChooser(shareIntent, chooserTitle)
        context.startActivity(chooser)
    }

    fun shareText(context: Context,text:String) {

        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_TEXT, text)
        val chooserTitle = "Share via"
        val chooser = Intent.createChooser(shareIntent, chooserTitle)
        context.startActivity(chooser)
    }
}