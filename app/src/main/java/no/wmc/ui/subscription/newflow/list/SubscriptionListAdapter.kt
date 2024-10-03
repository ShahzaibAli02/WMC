package no.wmc.ui.subscription.newflow.list

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import no.wmc.R
import no.wmc.databinding.ItemNewSubscriptionBinding
import no.wmc.domain.model.NewSubscription
import no.wmc.ui.base.BaseListAdapter
import java.text.DecimalFormat

class SubscriptionListAdapter(val context: Context, private val onItemClicked: (NewSubscription) -> Unit) :
    BaseListAdapter<NewSubscription, SubscriptionListAdapter.SubscriptionListItemViewHolder>(SubscriptionListItemDiffUtils) {
    object SubscriptionListItemDiffUtils : DiffUtil.ItemCallback<NewSubscription>() {
        override fun areItemsTheSame(oldItem: NewSubscription, newItem: NewSubscription) = oldItem.name == newItem.name

        override fun areContentsTheSame(oldItem: NewSubscription, newItem: NewSubscription) = oldItem == newItem
    }
    var onClickSub:(()->Unit)? = null
    var onClickRedeem:(()->Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubscriptionListItemViewHolder {
        return SubscriptionListItemViewHolder(getViewBinding(parent, R.layout.item_new_subscription))
    }

    override fun onBindViewHolder(holder: SubscriptionListItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class SubscriptionListItemViewHolder(private val binding: ItemNewSubscriptionBinding) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                onItemClicked(getItem(bindingAdapterPosition))
            }
        }

        fun bind(subscription: NewSubscription) {
            binding.model = subscription
            binding.btnPurchase.setOnClickListener {
                onClickSub?.invoke()
            }
            binding.txtRedeemCode.setOnClickListener{
                onClickRedeem?.invoke()
            }
            binding.apply {
                price.text =subscription.price
             //   thumbnail.setImageResource(subscription.image)
                val adapter = SubscriptionBenefitListAdapter(context)
                adapter.submitList(subscription.benefits)
                recyclerviewBenefit.adapter = adapter
            }
        }
    }
}
