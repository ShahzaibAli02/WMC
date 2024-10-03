package no.wmc.ui.subscription.newflow.list

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import no.wmc.R
import no.wmc.databinding.ItemSubscriptionBenefitBinding
import no.wmc.ui.base.BaseListAdapter

class SubscriptionBenefitListAdapter(val context: Context) :
    BaseListAdapter<String, SubscriptionBenefitListAdapter.BenefitListItemViewHolder>(SubscriptionListItemDiffUtils) {
    object SubscriptionListItemDiffUtils : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String) = oldItem == newItem

        override fun areContentsTheSame(oldItem: String, newItem: String) = oldItem == newItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BenefitListItemViewHolder {
        return BenefitListItemViewHolder(getViewBinding(parent, R.layout.item_subscription_benefit))
    }

    override fun onBindViewHolder(holder: BenefitListItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class BenefitListItemViewHolder(private val binding: ItemSubscriptionBenefitBinding) : RecyclerView.ViewHolder(binding.root) {
        init {

        }
        fun bind(subscription: String) {
            binding.model = subscription
        }
    }
}
