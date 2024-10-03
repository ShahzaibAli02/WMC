package no.wmc.data.manager

import no.wmc.data.remote.model.Promo
import no.wmc.data.remote.providers.FireStoreProvider
import no.wmc.domain.DataState
import no.wmc.firebase.helper.FireStoreHelper

class RedeemCodeManager(private val fireStoreProvider: FireStoreProvider)
{

    suspend fun checkIfAlreadyRedeemed(uid:String,code:String):Boolean
    {
        return fireStoreProvider.isCodeRedeemed(uid,code)
    }
    suspend fun redeemCode(uid:String,code:String):DataState<Promo>
    {
        return fireStoreProvider.redeemCode(uid,code)
    }
    suspend fun hasActivePromo(uid:String):DataState<Boolean>
    {
        return fireStoreProvider.hasActivePromo(uid)
    }
}

