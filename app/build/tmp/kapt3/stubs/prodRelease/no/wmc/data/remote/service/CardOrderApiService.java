package no.wmc.data.remote.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'\u00a8\u0006\u0006"}, d2 = {"Lno/wmc/data/remote/service/CardOrderApiService;", "", "orderCard", "Lretrofit2/Call;", "", "userId", "wmc-3.1.40-b11_prodRelease"})
public abstract interface CardOrderApiService {
    
    @org.jetbrains.annotations.NotNull
    @retrofit2.http.GET(value = "/PdfGenerator/Get")
    public abstract retrofit2.Call<java.lang.String> orderCard(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "userId")
    java.lang.String userId);
}