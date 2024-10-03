package no.wmc.ui.main.home.list

import android.view.ViewGroup
import androidx.annotation.StringRes
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import no.wmc.R
import no.wmc.databinding.HomeListItemBinding
import no.wmc.domain.model.MedicalItem
import no.wmc.ui.base.BaseHomeCardListAdapter
import no.wmc.ui.main.home.list.ProfileItemListAdapter.ProfileItemViewHolder

class ProfileItemListAdapter(
    @StringRes
    private val emptyStateString: Int,
    private val onItemClicked: (MedicalItem) -> Unit
) : BaseHomeCardListAdapter<MedicalItem, ProfileItemViewHolder>(ProfileItemDiffUtils) {

    object ProfileItemDiffUtils : DiffUtil.ItemCallback<MedicalItem>() {
        override fun areItemsTheSame(oldItem: MedicalItem, newItem: MedicalItem) =
            oldItem.profileItem.code == newItem.profileItem.code

        override fun areContentsTheSame(oldItem: MedicalItem, newItem: MedicalItem) =
            oldItem == newItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileItemViewHolder {
        return ProfileItemViewHolder(getViewBinding(parent, R.layout.home_list_item))
    }

    override fun onBindViewHolder(holder: ProfileItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getStringTitleList(): String =
        currentList.joinToString(", ") { it.profileItem.description!! }

    override fun getEmptyStateString(): Int =
        emptyStateString

    override fun getProfileItemCount(): Int = itemCount

    inner class ProfileItemViewHolder(
        private val binding: HomeListItemBinding
    ) : ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
                onItemClicked(getItem(bindingAdapterPosition))
            }
        }

        fun bind(item: MedicalItem) {
            binding.model = item

            binding.title.isClickable = item.isEditMode
            if (item.isEditMode) {
                binding.title.setOnClickListener {
                    binding.checkbox.isChecked = !binding.checkbox.isChecked
                }
                binding.checkbox.setOnCheckedChangeListener { _, isChecked ->
                    item.isChecked = isChecked
                }
            }
        }
    }
}
