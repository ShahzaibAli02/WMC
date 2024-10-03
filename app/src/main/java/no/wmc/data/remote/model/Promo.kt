package no.wmc.data.remote.model

import com.google.firebase.Timestamp
import java.util.Calendar

data class Promo(var id:String="",var code:String,var duration:String,var validity:Int,var subTime:Long,var expireTime:Long)
{


    constructor():this("","","",0,0,0)
}
fun Promo?.isActivePromo(): Boolean
{
    if(this==null)
        return false

    return expireTime > Calendar.getInstance().timeInMillis

}
