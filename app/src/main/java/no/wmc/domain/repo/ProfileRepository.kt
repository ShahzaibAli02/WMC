package no.wmc.domain.repo

import android.content.Context
import no.wmc.data.remote.model.ProfileDtoModel

import no.wmc.domain.DataState
import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.domain.model.Profile
import no.wmc.domain.model.ProfileUpdate
import no.wmc.domain.model.ShareType
import java.io.File

interface ProfileRepository {
    suspend fun getProfile(): DataState<ProfileDtoModel>
    suspend fun getProfileFromFireStore(uId:String): DataState<Profile>

    suspend fun updateProfile(uId: String,updateProfile: ProfileUpdate): DataState<Unit>

//    suspend fun getProfileItem(
//        profileItemEnum: ProfileItemEnum,
//        language: String
//    ): DataState<ProfileItemDtoModel>
//
//    suspend fun getMedicalItem(
//        profileItemEnum: ProfileItemEnum,
//        keyword: String,
//        page: Int
//    ): DataState<ProfileItemDtoModel>
//
//    suspend fun addMedicalItem(
//        profileItemEnum: ProfileItemEnum,
//        profileItem: ProfileItemDtoModel.ItemDtoModel
//    ): DataState<Unit>
//
//    suspend fun removeMedicalItem(
//        profileItemEnum: ProfileItemEnum,
//        profileItem: ProfileItemDtoModel.ItemDtoModel
//    ): DataState<Unit>

//    suspend fun shareMedicalItem(context: Context, shareType: ShareType): DataState<File>

    suspend fun orderCard(): DataState<Unit>
}
