package no.wmc.ui.main.home

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import no.wmc.R
import no.wmc.databinding.EditCardBottomDialogBinding
import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.ui.base.DarkBottomSheetDialog
import no.wmc.ui.main.home.HomeFragment.Companion.EDIT_CARD_ACTION_RESULT

class EditCardBottomDialog : DarkBottomSheetDialog<EditCardBottomDialogBinding>(
    R.layout.edit_card_bottom_dialog
) {

    private val args: EditCardBottomDialogArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
    }

    private fun initViews() {
        val savedStateHandle = findNavController().previousBackStackEntry?.savedStateHandle
        binding.editItemButton.setOnClickListener {
            savedStateHandle?.set(
                EDIT_CARD_ACTION_RESULT,
                Pair(args.profileItemEnum, EDIT_CARD_EDIT_ITEM_ACTION)
            )
            findNavController().navigateUp()
        }
        binding.removeItemButton.setOnClickListener {
            savedStateHandle?.set(
                EDIT_CARD_ACTION_RESULT,
                Pair(args.profileItemEnum, EDIT_CARD_REMOVE_ITEM_ACTION)
            )
            findNavController().navigateUp()
        }

        if (args.profileItemEnum == ProfileItemEnum.DOCUMENT) {
            binding.editItemButton.visibility = View.VISIBLE
            binding.removeItemButton.text = getString(R.string.edit_card_dialog_remove_item_title)
        }
    }

    companion object {
        const val EDIT_CARD_REMOVE_ITEM_ACTION = "EDIT_CARD_REMOVE_ITEM_ACTION"
        const val EDIT_CARD_EDIT_ITEM_ACTION = "EDIT_CARD_EDIT_ITEM_ACTION"
    }
}
