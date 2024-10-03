package no.wmc.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import no.wmc.data.local.dao.AllergiesDao
import no.wmc.data.local.db.entity.AllergyEntity
import no.wmc.data.local.db.entity.ProfileEntity

@Database(
    entities = [ AllergyEntity::class],
    version = 7,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class WmcDatabase : RoomDatabase() {
//    abstract fun profileDao(): ProfileDao
    abstract fun allergiesDao(): AllergiesDao
}
