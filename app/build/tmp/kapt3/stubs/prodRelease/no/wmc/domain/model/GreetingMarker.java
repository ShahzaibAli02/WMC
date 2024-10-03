package no.wmc.domain.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lno/wmc/domain/model/GreetingMarker;", "", "()V", "AFTERNOON", "Ljava/time/LocalTime;", "kotlin.jvm.PlatformType", "EVENING", "MORNING", "NIGHT", "getCurrentTime", "Lno/wmc/domain/model/GreetingMarker$GreetingTime;", "GreetingTime", "wmc-3.1.40-b11_prodRelease"})
public final class GreetingMarker {
    @org.jetbrains.annotations.NotNull
    public static final no.wmc.domain.model.GreetingMarker INSTANCE = null;
    private static final java.time.LocalTime MORNING = null;
    private static final java.time.LocalTime AFTERNOON = null;
    private static final java.time.LocalTime EVENING = null;
    private static final java.time.LocalTime NIGHT = null;
    
    private GreetingMarker() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final no.wmc.domain.model.GreetingMarker.GreetingTime getCurrentTime() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/domain/model/GreetingMarker$GreetingTime;", "", "(Ljava/lang/String;I)V", "MORNING", "AFTERNOON", "EVENING", "NIGHT", "wmc-3.1.40-b11_prodRelease"})
    public static enum GreetingTime {
        /*public static final*/ MORNING /* = new MORNING() */,
        /*public static final*/ AFTERNOON /* = new AFTERNOON() */,
        /*public static final*/ EVENING /* = new EVENING() */,
        /*public static final*/ NIGHT /* = new NIGHT() */;
        
        GreetingTime() {
        }
    }
}