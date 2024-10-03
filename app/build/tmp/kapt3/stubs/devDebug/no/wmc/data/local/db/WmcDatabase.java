package no.wmc.data.local.db;

import java.lang.System;

@androidx.room.TypeConverters(value = {no.wmc.data.local.db.Converters.class})
@androidx.room.Database(entities = {no.wmc.data.local.db.entity.AllergyEntity.class}, version = 7, exportSchema = false)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lno/wmc/data/local/db/WmcDatabase;", "Landroidx/room/RoomDatabase;", "()V", "allergiesDao", "Lno/wmc/data/local/dao/AllergiesDao;", "wmc-3.1.40-b11_devDebug"})
public abstract class WmcDatabase extends androidx.room.RoomDatabase {
    
    public WmcDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract no.wmc.data.local.dao.AllergiesDao allergiesDao();
}