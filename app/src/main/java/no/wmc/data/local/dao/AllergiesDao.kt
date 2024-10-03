package no.wmc.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import no.wmc.data.local.db.entity.AllergyEntity

@Dao
interface AllergiesDao : BaseDao<AllergyEntity> {

    @Query("SELECT * FROM AllergyEntity")
    suspend fun getAllergies(): List<AllergyEntity>
}
