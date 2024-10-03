package no.wmc.ui.translate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/translate/TranslateViewAction;", "Lno/wmc/ui/base/ViewAction;", "()V", "GetCurrentLanguageProfileItemsViewAction", "GetTranslateLanguagesViewAction", "GetTranslatedProfileItemsViewAction", "Lno/wmc/ui/translate/TranslateViewAction$GetCurrentLanguageProfileItemsViewAction;", "Lno/wmc/ui/translate/TranslateViewAction$GetTranslateLanguagesViewAction;", "Lno/wmc/ui/translate/TranslateViewAction$GetTranslatedProfileItemsViewAction;", "wmc-3.1.40-b11_prodRelease"})
public abstract class TranslateViewAction extends no.wmc.ui.base.ViewAction {
    
    private TranslateViewAction() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\u0002\u0010\u0006R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/translate/TranslateViewAction$GetTranslateLanguagesViewAction;", "Lno/wmc/ui/translate/TranslateViewAction;", "viewState", "Lno/wmc/ui/base/ViewState;", "", "Lno/wmc/domain/model/Translation;", "(Lno/wmc/ui/base/ViewState;)V", "getViewState", "()Lno/wmc/ui/base/ViewState;", "wmc-3.1.40-b11_prodRelease"})
    public static final class GetTranslateLanguagesViewAction extends no.wmc.ui.translate.TranslateViewAction {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.Translation>> viewState = null;
        
        public GetTranslateLanguagesViewAction(@org.jetbrains.annotations.NotNull
        no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.Translation>> viewState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.Translation>> getViewState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lno/wmc/ui/translate/TranslateViewAction$GetCurrentLanguageProfileItemsViewAction;", "Lno/wmc/ui/translate/TranslateViewAction;", "viewState", "Lno/wmc/ui/base/ViewState;", "Lno/wmc/domain/model/ProfileItem;", "(Lno/wmc/ui/base/ViewState;)V", "getViewState", "()Lno/wmc/ui/base/ViewState;", "wmc-3.1.40-b11_prodRelease"})
    public static final class GetCurrentLanguageProfileItemsViewAction extends no.wmc.ui.translate.TranslateViewAction {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.ui.base.ViewState<no.wmc.domain.model.ProfileItem> viewState = null;
        
        public GetCurrentLanguageProfileItemsViewAction(@org.jetbrains.annotations.NotNull
        no.wmc.ui.base.ViewState<no.wmc.domain.model.ProfileItem> viewState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.ui.base.ViewState<no.wmc.domain.model.ProfileItem> getViewState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\u0002\u0010\u0006R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lno/wmc/ui/translate/TranslateViewAction$GetTranslatedProfileItemsViewAction;", "Lno/wmc/ui/translate/TranslateViewAction;", "viewState", "Lno/wmc/ui/base/ViewState;", "", "Lno/wmc/domain/model/TranslateItem;", "(Lno/wmc/ui/base/ViewState;)V", "getViewState", "()Lno/wmc/ui/base/ViewState;", "wmc-3.1.40-b11_prodRelease"})
    public static final class GetTranslatedProfileItemsViewAction extends no.wmc.ui.translate.TranslateViewAction {
        @org.jetbrains.annotations.NotNull
        private final no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.TranslateItem>> viewState = null;
        
        public GetTranslatedProfileItemsViewAction(@org.jetbrains.annotations.NotNull
        no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.TranslateItem>> viewState) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final no.wmc.ui.base.ViewState<java.util.List<no.wmc.domain.model.TranslateItem>> getViewState() {
            return null;
        }
    }
}