package no.wmc.data.local.dao;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/local/dao/AllergiesDao;", "Lno/wmc/data/local/dao/BaseDao;", "Lno/wmc/data/local/db/entity/AllergyEntity;", "getAllergies", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_devDebug"})
public abstract interface AllergiesDao extends no.wmc.data.local.dao.BaseDao<no.wmc.data.local.db.entity.AllergyEntity> {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM AllergyEntity")
    public abstract java.lang.Object getAllergies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<no.wmc.data.local.db.entity.AllergyEntity>> continuation);
}