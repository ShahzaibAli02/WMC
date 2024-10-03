package no.wmc.di

import com.google.firebase.auth.FirebaseAuth
import no.wmc.BuildConfig
import no.wmc.data.remote.ApiErrorParser
import no.wmc.data.remote.ApiErrorParserImpl
import no.wmc.data.remote.providers.FirebaseAuthProvider
import no.wmc.data.remote.providers.RetrofitProvider
import no.wmc.data.remote.service.DocumentApiService
import no.wmc.data.remote.service.ProfileApiService
import no.wmc.data.remote.service.SubscriptionApiService
import no.wmc.data.remote.service.TranslateService
import no.wmc.data.remote.service.TranslationApiService
import org.koin.core.annotation.KoinReflectAPI
import org.koin.dsl.bind
import org.koin.dsl.module
import org.koin.dsl.single
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@KoinReflectAPI
val apiModule = module {
    single { FirebaseAuth.getInstance() }
    single<FirebaseAuthProvider>()

    single<ApiErrorParserImpl>() bind ApiErrorParser::class
    single {
        RetrofitProvider(
            authRepo = get(),
            errorParser = get(),
            apiUrl = BuildConfig.API_BASE_URL
        ).provide()
    }

    single {
        get<Retrofit>().create(ProfileApiService::class.java)
    }

    single {
        get<Retrofit>().create(DocumentApiService::class.java)
    }

    single {
        get<Retrofit>().create(TranslationApiService::class.java)
    }

    single {
        get<Retrofit>().create(SubscriptionApiService::class.java)
    }


    single {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://translate.google.com.hk/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(TranslateService::class.java)
    }
}
