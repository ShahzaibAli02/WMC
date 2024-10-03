package no.wmc.ui.translate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/translate/TranslateViewEvent;", "Lno/wmc/ui/base/ViewEvent;", "()V", "GetCurrentLanguageProfileItemsViewEvent", "GetTranslateLanguagesViewEvent", "GetTranslatedProfileItemsViewEvent", "Lno/wmc/ui/translate/TranslateViewEvent$GetCurrentLanguageProfileItemsViewEvent;", "Lno/wmc/ui/translate/TranslateViewEvent$GetTranslateLanguagesViewEvent;", "Lno/wmc/ui/translate/TranslateViewEvent$GetTranslatedProfileItemsViewEvent;", "wmc-3.1.40-b11_prodRelease"})
public abstract class TranslateViewEvent extends no.wmc.ui.base.ViewEvent {
    
    private TranslateViewEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lno/wmc/ui/translate/TranslateViewEvent$GetTranslateLanguagesViewEvent;", "Lno/wmc/ui/translate/TranslateViewEvent;", "()V", "wmc-3.1.40-b11_prodRelease"})
    public static final class GetTranslateLanguagesViewEvent extends no.wmc.ui.translate.TranslateViewEvent {
        @org.jetbrains.annotations.NotNull
        public static final no.wmc.ui.translate.TranslateViewEvent.GetTranslateLanguagesViewEvent INSTANCE = null;
        
        private GetTranslateLanguagesViewEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lno/wmc/ui/translate/TranslateViewEvent$GetCurrentLanguageProfileItemsViewEvent;", "Lno/wmc/ui/translate/TranslateViewEvent;", "profileItemEnum", "Lno/wmc/domain/enums/ProfileItemEnum;", "(Lno/wmc/domain/enums/ProfileItemEnum;)V", "getProfileItemEnum", "()Lno/wmc/domain/enums/ProfileItemEnum;", "wmc-3.1.40-b11_prodRelease"})
    public static final class GetCurrentLanguageProfileItemsViewEvent extends no.wmc.ui.translate.TranslateViewEvent {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.domain.enums.ProfileItemEnum profileItemEnum = null;
        
        public GetCurrentLanguageProfileItemsViewEvent(@org.jetbrains.annotations.NotNull
        no.wmc.domain.enums.ProfileItemEnum profileItemEnum) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.domain.enums.ProfileItemEnum getProfileItemEnum() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lno/wmc/ui/translate/TranslateViewEvent$GetTranslatedProfileItemsViewEvent;", "Lno/wmc/ui/translate/TranslateViewEvent;", "list", "", "Lno/wmc/firebase/model/AllCategoryModel;", "language", "", "([Lno/wmc/firebase/model/AllCategoryModel;Ljava/lang/String;)V", "getLanguage", "()Ljava/lang/String;", "getList", "()[Lno/wmc/firebase/model/AllCategoryModel;", "[Lno/wmc/firebase/model/AllCategoryModel;", "wmc-3.1.40-b11_prodRelease"})
    public static final class GetTranslatedProfileItemsViewEvent extends no.wmc.ui.translate.TranslateViewEvent {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.firebase.model.AllCategoryModel[] list = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String language = null;
        
        public GetTranslatedProfileItemsViewEvent(@org.jetbrains.annotations.NotNull
        no.wmc.firebase.model.AllCategoryModel[] list, @org.jetbrains.annotations.NotNull
        java.lang.String language) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.firebase.model.AllCategoryModel[] getList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getLanguage() {
            return null;
        }
    }
}