package no.wmc.data.local.manager

import no.wmc.data.local.db.entity.AllergyEntity
import no.wmc.data.local.db.entity.ProfileEntity

interface DatabaseManager {
//    suspend fun getProfile(): ProfileEntity
//    suspend fun saveProfile(profile: ProfileEntity)
//    suspend fun deleteProfile()
    suspend fun getAllergies(): List<AllergyEntity>
    suspend fun saveAllergies(allergies: List<AllergyEntity>)
}
