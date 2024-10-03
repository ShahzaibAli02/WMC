package no.wmc.di

import no.wmc.domain.model.usecase.*
import no.wmc.domain.model.usecase.impl.*
import org.koin.core.annotation.KoinReflectAPI
import org.koin.dsl.bind
import org.koin.dsl.module
import org.koin.dsl.single

@KoinReflectAPI
val useCaseModule = module {
    single<GetProfileUseCaseImpl>() bind GetProfileUseCase::class
    single<AuthWithFirebaseUseCaseImpl>() bind AuthWithFirebaseUseCase::class
    single<AuthWithEmailAndPasswordUseCaseImpl>() bind AuthWithEmailAndPasswordUseCase::class
    single<ResetPasswordUseCaseImpl>() bind ResetPasswordUseCase::class
    single<RegisterWithEmailAndPasswordUseCaseImpl>() bind RegisterWithEmailAndPasswordUseCase::class
    single<UpdateProfileUseCaseImpl>() bind UpdateProfileUseCase::class
    single<GetProfileItemUseCaseImpl>() bind GetProfileItemUseCase::class
    single<GetProfileFromFireStoreUseCaseImpl>() bind GetProfileFromFireStoreUseCase::class
    single<GetDocumentsUseCaseImpl>() bind GetDocumentsUseCase::class
    single<GetMedicalItemUseCaseImpl>() bind GetMedicalItemUseCase::class
    single<AddMedicalItemUseCaseImpl>() bind AddMedicalItemUseCase::class
    single<RemoveMedicalItemUseCaseImpl>() bind RemoveMedicalItemUseCase::class
    single<GetDocumentTypeUseCaseImpl>() bind GetDocumentTypeUseCase::class
    single<UploadDocumentUseCaseImpl>() bind UploadDocumentUseCase::class
    single<DownloadDocumentUseCaseImpl>() bind DownloadDocumentUseCase::class
    single<RemoveDocumentUseCaseImpl>() bind RemoveDocumentUseCase::class
    single<EditDocumentUseCaseImpl>() bind EditDocumentUseCase::class
    single<ShareUseCaseImpl>() bind ShareUseCase::class
    single<GetTranslateLanguagesUseCaseImpl>() bind GetTranslateLanguagesUseCase::class
    single<OrderCardUseCaseImpl>() bind OrderCardUseCase::class
    single<GetMyOwnSubscriptionsUseCaseImpl>() bind GetMyOwnSubscriptionsUseCase::class
    single<GetMyMemberSubscriptionsUseCaseImpl>() bind GetMyMemberSubscriptionsUseCase::class
    single<GetSubscriptionDetailUseCaseImpl>() bind GetSubscriptionDetailUseCase::class
    single<InviteSubscriptionUserUseCaseImpl>() bind InviteSubscriptionUserUseCase::class
    single<DeleteSubscriptionUserUseCaseImpl>() bind DeleteSubscriptionUserUseCase::class
    single<CancelSubscriptionUseCaseImpl>() bind CancelSubscriptionUseCase::class
    single<RegisterUserUseCaseImpl>() bind RegisterUserUseCase::class
    single<ValidateEmailWithFireStoreUseCaseImpl>() bind ValidateEmailWithFireStoreUseCase::class
    single<AddSubscriptionFireStoreUseCaseImpl>() bind AddSubscriptionFireStoreUseCase::class
}
