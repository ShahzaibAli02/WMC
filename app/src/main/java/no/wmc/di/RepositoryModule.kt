package no.wmc.di

import no.wmc.data.repo.AuthRepositoryImpl
import no.wmc.data.repo.DocumentRepositoryImpl
import no.wmc.data.repo.ProfileRepositoryImpl
import no.wmc.data.repo.SubscriptionRepositoryImpl
import no.wmc.data.repo.TranslateRepositoryImpl
import no.wmc.domain.repo.AuthRepository
import no.wmc.domain.repo.DocumentRepository
import no.wmc.domain.repo.ProfileRepository
import no.wmc.domain.repo.SubscriptionRepository
import no.wmc.domain.repo.TranslateRepository
import no.wmc.ui.main.maps.MapsRepository
import org.koin.core.annotation.KoinReflectAPI
import org.koin.dsl.bind
import org.koin.dsl.module
import org.koin.dsl.single

@KoinReflectAPI
val repositoryModule = module {
    single<ProfileRepositoryImpl>() bind ProfileRepository::class
    single<AuthRepositoryImpl>() bind AuthRepository::class
    single<DocumentRepositoryImpl>() bind DocumentRepository::class
    single<TranslateRepositoryImpl>() bind TranslateRepository::class
    single<SubscriptionRepositoryImpl>() bind SubscriptionRepository::class

    single { MapsRepository(get()) }
}
