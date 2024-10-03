package no.wmc.domain.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/domain/repo/TranslateRepository;", "", "getTranslateLanguages", "Lno/wmc/domain/DataState;", "", "Lno/wmc/data/remote/model/TranslationDtoModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_prodRelease"})
public abstract interface TranslateRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getTranslateLanguages(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<java.util.List<no.wmc.data.remote.model.TranslationDtoModel>>> continuation);
}