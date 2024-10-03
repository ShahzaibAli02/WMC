package no.wmc.data.remote.model.firestore

import java.util.Date


data class SubscriptionFsModel(
    val email:String?,
    val content_id: String?,
    val created_at: String?,
    val expires_at: String?,
    val sbr_id: String?,
    val status: String?,
    val trn_id: String?,
    val trn_from: String = "Google_Play_Store",
    val updated_at: String?,
    val user_id: String?,
)
