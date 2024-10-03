package no.wmc.ui.landing

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import no.wmc.R
import no.wmc.databinding.LandingScreenBinding
import no.wmc.ui.base.BaseFragment
import no.wmc.utils.ext.safeNavigate

class LandingFragment : BaseFragment<LandingScreenBinding>(R.layout.landing_screen) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
    }

    private fun initViews() {
        binding.loginButton.setOnClickListener {
            findNavController().safeNavigate(LandingFragmentDirections.landingToLogin())
        }
    }
}
