package no.wmc.ui.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.widget.doAfterTextChanged
import no.wmc.R
import no.wmc.databinding.ViewSearchBarBinding

class SearchBarView(context: Context, attrs: AttributeSet?) : ConstraintLayout(context, attrs) {
    private val binding by lazy {
        ViewSearchBarBinding.inflate(LayoutInflater.from(context), this, true)
    }

    private var afterTextChangedListener: (String) -> Unit = {}

    init {
        binding.etKeyword.doAfterTextChanged {
            afterTextChangedListener(it.toString())
        }

        binding.etKeyword.setOnFocusChangeListener { _, isFocusing ->
            binding.cvParent.cardElevation = if (isFocusing) {
                resources.getDimension(R.dimen.search_bar_active_elevation)
            } else {
                resources.getDimension(R.dimen.search_bar_inactive_elevation)
            }
        }
    }

    fun setAfterTextChangeListener(afterTextChange: (String) -> Unit) {
        afterTextChangedListener = afterTextChange
    }
}
