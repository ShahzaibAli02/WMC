package no.wmc.di

import no.wmc.ui.document.DocumentMetadataViewState
import no.wmc.ui.main.home.HomeViewState
import no.wmc.ui.login.LoginViewState
import no.wmc.ui.login.resetpassword.ResetPasswordViewState
import no.wmc.ui.medical.AddMedicalInfoViewState
import no.wmc.ui.profile.ProfileViewState
import no.wmc.ui.registration.RegisterViewState
import no.wmc.ui.subscription.details.SubscriptionDetailViewState
import no.wmc.ui.subscription.invitation.SubscriptionInvitationViewState
import no.wmc.ui.subscription.newflow.NewSubscriptionViewState
import no.wmc.ui.subscription.overview.SubscriptionOverviewViewState
import no.wmc.ui.translate.TranslateViewState
import org.koin.core.annotation.KoinReflectAPI
import org.koin.dsl.factory
import org.koin.dsl.module

@KoinReflectAPI
val viewStateModule = module {
    factory<HomeViewState>()
    factory<LoginViewState>()
    factory<ResetPasswordViewState>()
    factory<ProfileViewState>()
    factory<AddMedicalInfoViewState>()
    factory<DocumentMetadataViewState>()
    factory<TranslateViewState>()
    factory<SubscriptionOverviewViewState>()
    factory<SubscriptionDetailViewState>()
    factory<SubscriptionInvitationViewState>()
    factory<RegisterViewState>()
    factory<NewSubscriptionViewState>()
}
