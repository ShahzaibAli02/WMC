package no.wmc.data.local.db

import androidx.room.TypeConverter
import kotlinx.datetime.Instant
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.json.Json
import no.wmc.data.local.db.entity.ProfileEntity.EmergencyContactEntity
import no.wmc.data.local.db.entity.ProfileEntity.InsuranceEntity
import no.wmc.data.local.db.entity.ProfileEntity.PostalAddressEntity

object Converters {

    @TypeConverter
    fun toEmergencyContactEntity(string: String?): List<EmergencyContactEntity> {
        return if (string == null) {
            listOf()
        } else {
            Json.decodeFromString(
                ListSerializer(EmergencyContactEntity.serializer()),
                string
            )
        }
    }

    @TypeConverter
    fun fromEmergencyContactEntity(list: List<EmergencyContactEntity>?): String? {
        return if (list == null) {
            null
        } else {
            Json.encodeToString(
                ListSerializer(EmergencyContactEntity.serializer()),
                list
            )
        }
    }

    @TypeConverter
    fun toPostalAddressEntity(string: String?): PostalAddressEntity? {
        return if (string == null) {
            null
        } else {
            Json.decodeFromString(PostalAddressEntity.serializer(), string)
        }
    }

    @TypeConverter
    fun fromPostalAddressEntity(entity: PostalAddressEntity?): String? {
        return if (entity == null) {
            null
        } else {
            Json.encodeToString(PostalAddressEntity.serializer(), entity)
        }
    }

    @TypeConverter
    fun toInsuranceEntity(string: String?): InsuranceEntity? {
        return if (string == null) {
            null
        } else {
            Json.decodeFromString(InsuranceEntity.serializer(), string)
        }
    }

    @TypeConverter
    fun fromInsuranceEntity(entity: InsuranceEntity?): String? {
        return if (entity == null) {
            null
        } else {
            Json.encodeToString(InsuranceEntity.serializer(), entity)
        }
    }

    @TypeConverter
    fun toInstant(dateString: String?): Instant? {
        return if (dateString == null) {
            null
        } else {
            Instant.parse(dateString)
        }
    }

    @TypeConverter
    fun fromInstant(date: Instant?): String? {
        return date?.toString()
    }

}
