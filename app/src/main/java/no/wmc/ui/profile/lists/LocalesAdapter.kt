package no.wmc.ui.profile.lists

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import no.wmc.R
import no.wmc.databinding.CountryListItemBinding
import no.wmc.ui.base.BaseListAdapter
import no.wmc.ui.profile.lists.LocalesAdapter.LocaleViewHolder
import java.util.Locale

class LocalesAdapter(
    private val onLocaleSelected: (locale: Locale) -> Unit
) : BaseListAdapter<Locale, LocaleViewHolder>(LocaleDiffCallback) {

    private object LocaleDiffCallback : DiffUtil.ItemCallback<Locale>() {
        override fun areItemsTheSame(oldItem: Locale, newItem: Locale): Boolean {
            return oldItem.displayCountry == newItem.displayCountry
        }

        override fun areContentsTheSame(oldItem: Locale, newItem: Locale): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocaleViewHolder {
        return LocaleViewHolder(getViewBinding(parent, R.layout.country_list_item))
    }

    override fun onBindViewHolder(holder: LocaleViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class LocaleViewHolder(
        private val binding: CountryListItemBinding
    ) : ViewHolder(binding.root) {

        init {
            binding.title.setOnClickListener {
                onLocaleSelected(getItem(bindingAdapterPosition))
            }
        }

        fun bind(locale: Locale) {
            binding.title.text = locale.displayCountry
        }
    }
}
