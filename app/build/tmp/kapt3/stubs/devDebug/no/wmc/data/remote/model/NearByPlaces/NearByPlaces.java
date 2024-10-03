package no.wmc.data.remote.model.NearByPlaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR \u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u0015\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lno/wmc/data/remote/model/NearByPlaces/NearByPlaces;", "", "()V", "htmlAttributions", "", "getHtmlAttributions", "()Ljava/util/List;", "setHtmlAttributions", "(Ljava/util/List;)V", "nextPageToken", "", "getNextPageToken", "()Ljava/lang/String;", "setNextPageToken", "(Ljava/lang/String;)V", "results", "Lno/wmc/data/remote/model/NearByPlaces/Result;", "getResults", "setResults", "status", "getStatus", "setStatus", "wmc-3.1.40-b11_devDebug"})
public final class NearByPlaces {
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "html_attributions")
    private java.util.List<? extends java.lang.Object> htmlAttributions;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "next_page_token")
    private java.lang.String nextPageToken;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "results")
    private java.util.List<no.wmc.data.remote.model.NearByPlaces.Result> results;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "status")
    private java.lang.String status;
    
    public NearByPlaces() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.Object> getHtmlAttributions() {
        return null;
    }
    
    public final void setHtmlAttributions(@org.jetbrains.annotations.Nullable
    java.util.List<? extends java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNextPageToken() {
        return null;
    }
    
    public final void setNextPageToken(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<no.wmc.data.remote.model.NearByPlaces.Result> getResults() {
        return null;
    }
    
    public final void setResults(@org.jetbrains.annotations.Nullable
    java.util.List<no.wmc.data.remote.model.NearByPlaces.Result> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}