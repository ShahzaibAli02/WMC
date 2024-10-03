package no.wmc.ui.translate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\'\u0010\u0016\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001eH\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ!\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001aH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0002X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lno/wmc/ui/translate/TranslateViewModel;", "Lno/wmc/ui/base/BaseViewModel;", "Lno/wmc/ui/translate/TranslateViewState;", "translateLanguagesUseCase", "Lno/wmc/domain/model/usecase/GetTranslateLanguagesUseCase;", "getProfileItemUseCase", "Lno/wmc/domain/model/usecase/GetProfileItemUseCase;", "translateService", "Lno/wmc/data/remote/service/TranslateService;", "viewState", "appDispatchers", "Lno/wmc/utils/AppDispatchers;", "(Lno/wmc/domain/model/usecase/GetTranslateLanguagesUseCase;Lno/wmc/domain/model/usecase/GetProfileItemUseCase;Lno/wmc/data/remote/service/TranslateService;Lno/wmc/ui/translate/TranslateViewState;Lno/wmc/utils/AppDispatchers;)V", "getViewState", "()Lno/wmc/ui/translate/TranslateViewState;", "handleGetCurrentLanguageProfileItemsEvent", "", "profileItemEnum", "Lno/wmc/domain/enums/ProfileItemEnum;", "(Lno/wmc/domain/enums/ProfileItemEnum;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGetTranslateLanguagesEvent", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGetTranslatedProfileItemsEvent", "", "Lno/wmc/firebase/model/AllCategoryModel;", "language", "", "([Lno/wmc/firebase/model/AllCategoryModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleViewEvent", "event", "Lno/wmc/ui/base/ViewEvent;", "(Lno/wmc/ui/base/ViewEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "translate", "targetLanguage", "text", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_prodRelease"})
public final class TranslateViewModel extends no.wmc.ui.base.BaseViewModel<no.wmc.ui.translate.TranslateViewState> {
    private final no.wmc.domain.model.usecase.GetTranslateLanguagesUseCase translateLanguagesUseCase = null;
    private final no.wmc.domain.model.usecase.GetProfileItemUseCase getProfileItemUseCase = null;
    private final no.wmc.data.remote.service.TranslateService translateService = null;
    @org.jetbrains.annotations.NotNull
    private final no.wmc.ui.translate.TranslateViewState viewState = null;
    
    public TranslateViewModel(@org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.GetTranslateLanguagesUseCase translateLanguagesUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.domain.model.usecase.GetProfileItemUseCase getProfileItemUseCase, @org.jetbrains.annotations.NotNull
    no.wmc.data.remote.service.TranslateService translateService, @org.jetbrains.annotations.NotNull
    no.wmc.ui.translate.TranslateViewState viewState, @org.jetbrains.annotations.NotNull
    no.wmc.utils.AppDispatchers appDispatchers) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected no.wmc.ui.translate.TranslateViewState getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    protected java.lang.Object handleViewEvent(@org.jetbrains.annotations.NotNull
    no.wmc.ui.base.ViewEvent event, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleGetTranslateLanguagesEvent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object handleGetCurrentLanguageProfileItemsEvent(no.wmc.domain.enums.ProfileItemEnum profileItemEnum, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object translate(@org.jetbrains.annotations.NotNull
    java.lang.String targetLanguage, @org.jetbrains.annotations.NotNull
    java.lang.String text, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    private final java.lang.Object handleGetTranslatedProfileItemsEvent(no.wmc.firebase.model.AllCategoryModel[] profileItemEnum, java.lang.String language, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}