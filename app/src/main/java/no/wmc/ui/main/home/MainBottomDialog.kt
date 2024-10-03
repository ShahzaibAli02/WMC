package no.wmc.ui.main.home

import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.launch
import no.wmc.R
import no.wmc.data.local.manager.LocalDataManager
import no.wmc.data.manager.LogoutHelper
import no.wmc.databinding.MainBottomDialogBinding
import no.wmc.ui.base.DarkBottomSheetDialog
import no.wmc.utils.ext.safeNavigate
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject

class MainBottomDialog : DarkBottomSheetDialog<MainBottomDialogBinding>(
    R.layout.main_bottom_dialog
) {
    private val localDataManager: LocalDataManager by inject()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
    }

    private fun initViews() {
        binding.signOutButton.setOnClickListener {
            val logoutHelper: LogoutHelper = get()
            viewLifecycleOwner.lifecycleScope.launch {
                logoutHelper.logout()
                localDataManager.isLoggedIn(false)
            }

            findNavController().safeNavigate(
                MainBottomDialogDirections.actionGlobalLogout()
            )
            dismiss()
        }

        binding.termsButton.setOnClickListener {
            findNavController().safeNavigate(
                MainBottomDialogDirections.homeToTerms(showButton = false)
            )
            dismiss()
        }

        binding.subscriptionButton.setOnClickListener {
            findNavController().safeNavigate(
                MainBottomDialogDirections.homeToSubscriptionOverview()
            )
            dismiss()
        }
    }
}
