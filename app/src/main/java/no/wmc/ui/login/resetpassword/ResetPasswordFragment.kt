package no.wmc.ui.login.resetpassword

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.navigation.fragment.findNavController
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import no.wmc.R
import no.wmc.databinding.ResetPasswordScreenBinding
import no.wmc.ui.base.BaseViewStateFragment
import no.wmc.ui.base.ViewAction
import no.wmc.ui.base.ViewState
import no.wmc.utils.ext.hideKeyboard
import timber.log.Timber

class ResetPasswordFragment :
    BaseViewStateFragment<ResetPasswordScreenBinding, ResetPasswordViewModel>(
        R.layout.reset_password_screen,
        ResetPasswordViewModel::class
    ) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        binding.toolbar.setNavigationIcon(R.drawable.ic_back)
        binding.toolbar.setNavigationOnClickListener { findNavController().popBackStack() }

        binding.email.editText?.addTextChangedListener { checkFieldsNotEmpty() }
        binding.resetPasswordButton.setOnClickListener {
            hideKeyboard()
            sendViewEvent(
                ResetPasswordViewEvent(
                    binding.email.editText?.text.toString()
                )
            )
        }
    }

    override fun handleViewAction(viewAction: ViewAction) {
        when (viewAction) {
            is ResetPasswordViewAction -> handleResetPasswordViewAction(viewAction.viewState)
        }
    }

    private fun handleResetPasswordViewAction(viewState: ViewState<Unit>) {
        when (viewState) {
            is ViewState.Loading -> {
                binding.loading.isVisible = true
            }
            is ViewState.StateError -> {
                binding.loading.isVisible = false
                Timber.e(viewState.errorMessage)
                showErrorMessage(viewState.errorMessage)
            }
            is ViewState.Success -> {
                binding.loading.isVisible = false
                MaterialAlertDialogBuilder(
                    requireContext(),
                    R.style.App_MaterialAlertDialog
                ).apply {
                    setTitle(R.string.forgot_password_screen_success_title)
                    setMessage(R.string.forgot_password_alert_message)
                    setPositiveButton(R.string.ok_button_title) { _, _ ->
                        findNavController().popBackStack()
                    }
                }.show()
            }
        }
    }

    private fun checkFieldsNotEmpty() {
        binding.resetPasswordButton.isEnabled = !binding.email.editText?.text.isNullOrBlank()
    }
}
