package no.wmc.data.repo

import android.content.Context
import com.google.firebase.firestore.FirebaseFirestore
import no.wmc.data.local.manager.LocalDataManager
import no.wmc.data.manager.NetworkStateManager
import no.wmc.data.remote.MEDICAL_ITEM_SEARCH_PAGING_SIZE
import no.wmc.data.remote.StatusCode.NO_INTERNET_ERROR
import no.wmc.data.remote.model.ProfileDtoModel
import no.wmc.data.remote.model.toMap
import no.wmc.data.remote.providers.FireStoreProvider
import no.wmc.data.remote.service.ProfileApiService
import no.wmc.domain.DataState
import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.domain.model.Profile
import no.wmc.domain.model.ProfileItem
import no.wmc.domain.model.ProfileUpdate
import no.wmc.domain.model.ShareType
import no.wmc.domain.repo.AuthRepository
import no.wmc.domain.repo.ProfileRepository
import no.wmc.utils.FileUtils
import no.wmc.utils.ext.getCurrentLocaleLang
import no.wmc.utils.ext.toMap
import java.io.File

class ProfileRepositoryImpl(
    private val profileApiService: ProfileApiService,
    private val fireStoreProvider: FireStoreProvider,
    private val authRepository: AuthRepository,
    localDataManager: LocalDataManager,
    networkStateManager: NetworkStateManager
) : BaseRepository(networkStateManager, localDataManager), ProfileRepository {

    override suspend fun getProfile(): DataState<ProfileDtoModel> {
//        return execute(
//            fallback = {
//                DataState.Error(
//                    data = localDataManager.getProfile().toDtoModel(),
//                    statusCode = NO_INTERNET_ERROR
//                )
//            }
//        ) {
//            profileApiService.getProfile().also {
//                if (it.isForcedRefreshToken) {
//                    authRepository.refreshToken(authRepository.getCurrentToken(), true)
//                }
//                localDataManager.saveProfile(it.copy(isForcedRefreshToken = false).toEntity())
//            }
//        }
        return TODO("Provide the return value")
    }

    override suspend fun getProfileFromFireStore(uId: String): DataState<Profile> {
        return execute {
            fireStoreProvider.getUser(uId)
        }
    }

    override suspend fun updateProfile(uId: String,updateProfile: ProfileUpdate): DataState<Unit> {
        return execute {
            fireStoreProvider.updateProfile(uId,updateProfile.toMap())
        }
    }

    override suspend fun orderCard(): DataState<Unit> {
        return execute {
            profileApiService.orderCard(lang = getCurrentLocaleLang())
        }
    }
}
