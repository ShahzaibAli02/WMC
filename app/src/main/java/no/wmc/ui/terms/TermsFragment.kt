package no.wmc.ui.terms

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import no.wmc.R
import no.wmc.databinding.TermsScreenBinding
import no.wmc.ui.base.BaseFragment
import no.wmc.utils.ext.safeNavigate

class TermsFragment : BaseFragment<TermsScreenBinding>(R.layout.terms_screen) {

    private val args: TermsFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
    }

    private fun initViews() {
        binding.acceptButton.isVisible = args.showButton

        binding.toolbar.setNavigationIcon(R.drawable.ic_back)
        binding.toolbar.setNavigationOnClickListener { findNavController().popBackStack() }
        binding.acceptButton.setOnClickListener {
            findNavController().safeNavigate(TermsFragmentDirections.termsToHome())
        }
    }
}
