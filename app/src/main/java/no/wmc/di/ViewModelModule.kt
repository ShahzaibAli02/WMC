package no.wmc.di

import no.wmc.ui.document.DocumentMetadataViewModel
import no.wmc.ui.main.home.HomeViewModel
import no.wmc.ui.login.LoginViewModel
import no.wmc.ui.login.resetpassword.ResetPasswordViewModel
import no.wmc.ui.main.maps.MapsViewModel
import no.wmc.ui.medical.AddMedicalInfoViewModel
import no.wmc.ui.profile.ProfileViewModel
import no.wmc.ui.registration.RegisterViewModel
import no.wmc.ui.subscription.details.SubscriptionDetailViewModel
import no.wmc.ui.subscription.invitation.SubscriptionInvitationViewModel
import no.wmc.ui.subscription.newflow.NewSubscriptionViewModel
import no.wmc.ui.subscription.overview.SubscriptionOverviewViewModel
import no.wmc.ui.translate.TranslateViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.annotation.KoinReflectAPI
import org.koin.dsl.module

@KoinReflectAPI
val viewModelModule = module {
    viewModel<HomeViewModel>()
    viewModel<LoginViewModel>()
    viewModel<ResetPasswordViewModel>()
    viewModel<ProfileViewModel>()
    viewModel<AddMedicalInfoViewModel>()
    viewModel<DocumentMetadataViewModel>()
    viewModel<TranslateViewModel>()
    viewModel<SubscriptionOverviewViewModel>()
    viewModel<SubscriptionDetailViewModel>()
    viewModel<SubscriptionInvitationViewModel>()
    viewModel<RegisterViewModel>()
    viewModel<NewSubscriptionViewModel>()
    viewModel<MapsViewModel>()

}
