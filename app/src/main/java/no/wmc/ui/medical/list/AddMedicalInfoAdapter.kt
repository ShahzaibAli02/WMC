package no.wmc.ui.medical.list

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import no.wmc.R
import no.wmc.data.remote.MEDICAL_ITEM_SEARCH_PAGING_SIZE
import no.wmc.databinding.ItemAddMedicalInfoBinding
import no.wmc.domain.model.ProfileItem.Item
import no.wmc.ui.base.BaseListAdapter
import no.wmc.ui.medical.list.AddMedicalInfoAdapter.AddMedicalInfoItemViewHolder

class AddMedicalInfoAdapter(
    private val loadMore: () -> Unit,
    private val onItemClicked: (Item) -> Unit
) : BaseListAdapter<Item, AddMedicalInfoItemViewHolder>(AddMedicalInfoItemDiffUtils) {
    object AddMedicalInfoItemDiffUtils : DiffUtil.ItemCallback<Item>() {
        override fun areItemsTheSame(oldItem: Item, newItem: Item) =
            oldItem.code == newItem.code

        override fun areContentsTheSame(oldItem: Item, newItem: Item) =
            oldItem == newItem
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AddMedicalInfoItemViewHolder {
        return AddMedicalInfoItemViewHolder(getViewBinding(parent, R.layout.item_add_medical_info))
    }

    override fun onBindViewHolder(holder: AddMedicalInfoItemViewHolder, position: Int) {
        holder.bind(getItem(position))
        if (position > itemCount - MEDICAL_ITEM_SEARCH_PAGING_SIZE) loadMore()
    }

    inner class AddMedicalInfoItemViewHolder(
        private val binding: ItemAddMedicalInfoBinding
    ) : ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                onItemClicked(getItem(bindingAdapterPosition))
            }
        }

        fun bind(item: Item) {
            binding.model = item
        }
    }
}
