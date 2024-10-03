package no.wmc.ui.main.home.list

import android.view.ViewGroup
import androidx.annotation.StringRes
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import no.wmc.R
import no.wmc.databinding.ItemDocumentBinding
import no.wmc.domain.model.Document
import no.wmc.domain.model.DocumentList.DocumentGroup
import no.wmc.ui.base.BaseHomeCardListAdapter
import no.wmc.ui.custom.DocumentDetailItem
import no.wmc.ui.main.home.list.DocumentListAdapter.DocumentItemViewHolder

class DocumentListAdapter(
    @StringRes
    private val emptyStateString: Int,
    private val onItemClicked: (Document) -> Unit,
    private val onMoreClicked: (Document) -> Unit
) : BaseHomeCardListAdapter<DocumentGroup, DocumentItemViewHolder>(DocumentItemDiffUtils) {

    object DocumentItemDiffUtils : DiffUtil.ItemCallback<DocumentGroup>() {
        override fun areItemsTheSame(oldItem: DocumentGroup, newItem: DocumentGroup) =
            oldItem.category == newItem.category &&
                    oldItem.documents == newItem.documents

        override fun areContentsTheSame(oldItem: DocumentGroup, newItem: DocumentGroup) =
            oldItem == newItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DocumentItemViewHolder {
        return DocumentItemViewHolder(getViewBinding(parent, R.layout.item_document))
    }

    override fun onBindViewHolder(holder: DocumentItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getStringTitleList(): String =
        currentList.flatMap { it.documents }.joinToString(", ") { it.title }

    override fun getEmptyStateString(): Int = emptyStateString

    override fun getProfileItemCount(): Int = currentList.flatMap { it.documents }.size

    inner class DocumentItemViewHolder(
        private val binding: ItemDocumentBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(documentGroup: DocumentGroup) {
            binding.model = documentGroup
            documentGroup.documents.forEach {
                binding.documentList.addView(
                    DocumentDetailItem(binding.root.context, null).apply {
                        init(
                            document = it,
                            onItemClicked = onItemClicked,
                            onMoreClicked = onMoreClicked
                        )
                    }
                )
            }
        }
    }
}
