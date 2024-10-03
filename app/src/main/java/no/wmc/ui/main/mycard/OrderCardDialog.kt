package no.wmc.ui.main.mycard

import android.os.Bundle
import android.view.View
import no.wmc.R
import no.wmc.databinding.OrderCardBottomBinding
import no.wmc.ui.base.DarkBottomSheetDialog

class OrderCardDialog : DarkBottomSheetDialog<OrderCardBottomBinding>(
    R.layout.order_card_bottom
) {


    var onInit:((OrderCardBottomBinding)->Unit)?=null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
        onInit?.invoke(binding)
    }

    private fun initViews() {
        binding.orderLaterButton.setOnClickListener {
            dismiss()
        }

        binding.orderNowButton.setOnClickListener {
            dismiss()
        }
    }

}
