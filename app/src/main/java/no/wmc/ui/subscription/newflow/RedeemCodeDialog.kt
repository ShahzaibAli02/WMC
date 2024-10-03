package no.wmc.ui.subscription.newflow

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import no.wmc.R
import no.wmc.databinding.OrderCardBottomBinding
import no.wmc.databinding.RedeemCodeBottomBinding
import no.wmc.ui.base.DarkBottomSheetDialog

class RedeemCodeDialog : DarkBottomSheetDialog<RedeemCodeBottomBinding>(
    R.layout.redeem_code_bottom
) {

    var onInit:((RedeemCodeBottomBinding)->Unit)?=null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onInit?.invoke(binding)
        dialog?.window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE)
    }


}