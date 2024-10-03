package no.wmc.ui.translate.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import no.wmc.R
import no.wmc.databinding.ItemTranslateBinding
import no.wmc.domain.model.TranslateItem
import no.wmc.ui.base.BaseListAdapter
import no.wmc.ui.translate.adapter.TranslateListAdapter.TranslateItemViewHolder

class TranslateListAdapter :
    BaseListAdapter<TranslateItem, TranslateItemViewHolder>(TranslateItemDiffUtils) {
    object TranslateItemDiffUtils : DiffUtil.ItemCallback<TranslateItem>() {
        override fun areItemsTheSame(oldItem: TranslateItem, newItem: TranslateItem) =
            oldItem.code == newItem.code

        override fun areContentsTheSame(oldItem: TranslateItem, newItem: TranslateItem) =
            oldItem == newItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TranslateItemViewHolder {
        return TranslateItemViewHolder(getViewBinding(parent, R.layout.item_translate))
    }

    override fun onBindViewHolder(holder: TranslateItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class TranslateItemViewHolder(
        private val binding: ItemTranslateBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(translateItem: TranslateItem) {
            binding.model = translateItem
        }
    }
}
