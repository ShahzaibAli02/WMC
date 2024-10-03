package no.wmc.ui.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import no.wmc.databinding.ItemDocumentDetailBinding
import no.wmc.domain.model.Document

class DocumentDetailItem(context: Context, attrs: AttributeSet?) :
    ConstraintLayout(context, attrs) {
    private val binding by lazy {
        ItemDocumentDetailBinding.inflate(LayoutInflater.from(context), this, true)
    }

    fun init(
        document: Document,
        onItemClicked: (Document) -> Unit,
        onMoreClicked: (Document) -> Unit
    ) {
        binding.model = document
        binding.root.setOnClickListener {
            onItemClicked(document)
        }
        binding.moreButton.setOnClickListener {
            onMoreClicked(document)
        }
    }
}
