package no.wmc.data.local.manager.impl

import no.wmc.data.local.db.WmcDatabase
import no.wmc.data.local.db.entity.AllergyEntity
import no.wmc.data.local.db.entity.ProfileEntity
import no.wmc.data.local.manager.DatabaseManager

class DatabaseManagerImpl(
    private val database: WmcDatabase
) : DatabaseManager {

//    override suspend fun getProfile(): ProfileEntity {
//        return database.profileDao().getProfile()
//    }
//
//    override suspend fun saveProfile(profile: ProfileEntity) {
//        database.profileDao().insertReplace(profile)
//    }
//
//    override suspend fun deleteProfile() {
//        database.profileDao().deleteProfile()
//    }

    override suspend fun getAllergies(): List<AllergyEntity> {
        return database.allergiesDao().getAllergies()
    }

    override suspend fun saveAllergies(allergies: List<AllergyEntity>) {
        database.allergiesDao().insertReplace(allergies)
    }
}
