package no.wmc.ui.main.home

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import no.wmc.R
import no.wmc.databinding.WmcBannerBottomDialogBinding
import no.wmc.ui.base.DarkBottomSheetDialog
import no.wmc.ui.main.home.HomeFragment.Companion.WMC_BANNER_ACTION_RESULT

class WmcBannerBottomDialog : DarkBottomSheetDialog<WmcBannerBottomDialogBinding>(
    R.layout.wmc_banner_bottom_dialog
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
    }

    private fun initViews() {
        val savedStateHandle = findNavController().previousBackStackEntry?.savedStateHandle
        binding.printCardButton.setOnClickListener {
            savedStateHandle?.set(
                WMC_BANNER_ACTION_RESULT,
                WMC_BANNER_PRINT_CARD_ACTION
            )
            findNavController().navigateUp()
        }

        binding.reorderCardButton.setOnClickListener {
            savedStateHandle?.set(
                WMC_BANNER_ACTION_RESULT,
                WMC_BANNER_REORDER_CARD_ACTION
            )
            findNavController().navigateUp()
        }
    }

    companion object {
        const val WMC_BANNER_PRINT_CARD_ACTION = "WMC_BANNER_PRINT_CARD_ACTION"
        const val WMC_BANNER_REORDER_CARD_ACTION = "WMC_BANNER_REORDER_CARD_ACTION"
    }
}
