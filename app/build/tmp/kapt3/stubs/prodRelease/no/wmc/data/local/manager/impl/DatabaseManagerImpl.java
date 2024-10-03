package no.wmc.data.local.manager.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lno/wmc/data/local/manager/impl/DatabaseManagerImpl;", "Lno/wmc/data/local/manager/DatabaseManager;", "database", "Lno/wmc/data/local/db/WmcDatabase;", "(Lno/wmc/data/local/db/WmcDatabase;)V", "getAllergies", "", "Lno/wmc/data/local/db/entity/AllergyEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAllergies", "", "allergies", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_prodRelease"})
public final class DatabaseManagerImpl implements no.wmc.data.local.manager.DatabaseManager {
    private final no.wmc.data.local.db.WmcDatabase database = null;
    
    public DatabaseManagerImpl(@org.jetbrains.annotations.NotNull
    no.wmc.data.local.db.WmcDatabase database) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getAllergies(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<no.wmc.data.local.db.entity.AllergyEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object saveAllergies(@org.jetbrains.annotations.NotNull
    java.util.List<no.wmc.data.local.db.entity.AllergyEntity> allergies, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}