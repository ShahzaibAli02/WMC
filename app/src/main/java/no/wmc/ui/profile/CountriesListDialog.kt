package no.wmc.ui.profile

import android.os.Bundle
import android.view.View
import no.wmc.R
import no.wmc.databinding.CountriesListDialogBinding
import no.wmc.ui.base.FullscreenDialogFragment
import no.wmc.ui.profile.lists.LocalesAdapter
import java.util.Locale

class CountriesListDialog(
    private val dismissCallback: ((Locale?) -> Unit)
) : FullscreenDialogFragment<CountriesListDialogBinding>(R.layout.countries_list_dialog) {

    private val localesAdapter = LocalesAdapter {
        dismissCallback(it)
        dismiss()
    }

    companion object {
        fun createDialog(
            dismissCallback: ((Locale?) -> Unit)
        ) = CountriesListDialog(dismissCallback)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val localesList = Locale.getISOCountries().mapNotNull { code ->
            val locale = Locale("", code)
            if (locale.displayCountry.isNullOrBlank()) {
                null
            } else {
                locale
            }
        }.sortedBy { it.displayName }

        binding.countriesList.adapter = localesAdapter
        localesAdapter.submitList(localesList)

        view.setOnClickListener {
            dismiss()
        }
    }
}
