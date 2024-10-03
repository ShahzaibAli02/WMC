package no.wmc.domain.model.usecase.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\'\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0096B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lno/wmc/domain/model/usecase/impl/RegisterWithEmailAndPasswordUseCaseImpl;", "Lno/wmc/domain/model/usecase/impl/BaseUseCase;", "Lno/wmc/domain/model/usecase/RegisterWithEmailAndPasswordUseCase;", "context", "Landroid/content/Context;", "authRepository", "Lno/wmc/domain/repo/AuthRepository;", "(Landroid/content/Context;Lno/wmc/domain/repo/AuthRepository;)V", "invoke", "Lno/wmc/domain/DataState;", "Lno/wmc/data/remote/model/FirebaseCreateAccountResult;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wmc-3.1.40-b11_devDebug"})
public final class RegisterWithEmailAndPasswordUseCaseImpl extends no.wmc.domain.model.usecase.impl.BaseUseCase implements no.wmc.domain.model.usecase.RegisterWithEmailAndPasswordUseCase {
    private final android.content.Context context = null;
    private final no.wmc.domain.repo.AuthRepository authRepository = null;
    
    public RegisterWithEmailAndPasswordUseCaseImpl(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    no.wmc.domain.repo.AuthRepository authRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object invoke(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super no.wmc.domain.DataState<no.wmc.data.remote.model.FirebaseCreateAccountResult>> continuation) {
        return null;
    }
}