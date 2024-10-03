package no.wmc.ui.subscription.overview.list

import android.graphics.PorterDuff
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import no.wmc.R
import no.wmc.databinding.ItemSubscriptionOverviewBinding
import no.wmc.domain.model.Subscription
import no.wmc.ui.base.BaseListAdapter
import no.wmc.ui.subscription.overview.list.SubscriptionOverviewAdapter.SubscriptionOverviewItemViewHolder

class SubscriptionOverviewAdapter(
    private val onItemClicked: (Subscription) -> Unit,
    private val onRemoveMembershipClicked: (Subscription) -> Unit
) : BaseListAdapter<Subscription, SubscriptionOverviewItemViewHolder>(
    SubscriptionOverviewItemDiffUtils
) {
    object SubscriptionOverviewItemDiffUtils : DiffUtil.ItemCallback<Subscription>() {
        override fun areItemsTheSame(oldItem: Subscription, newItem: Subscription) =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: Subscription, newItem: Subscription) =
            oldItem == newItem
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SubscriptionOverviewItemViewHolder {
        return SubscriptionOverviewItemViewHolder(
            getViewBinding(
                parent,
                R.layout.item_subscription_overview
            )
        )
    }

    override fun onBindViewHolder(holder: SubscriptionOverviewItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class SubscriptionOverviewItemViewHolder(
        private val binding: ItemSubscriptionOverviewBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.root.setOnClickListener {
                onItemClicked(getItem(bindingAdapterPosition))
            }
        }

        fun bind(subscription: Subscription) {
            binding.model = subscription

            binding.rectangleBar.setColorFilter(
                ContextCompat.getColor(
                    binding.root.context,
                    if (subscription.isMySubscription) {
                        R.color.colorPrimaryBlue
                    } else {
                        R.color.blue300
                    }
                ),
                PorterDuff.Mode.SRC_IN
            )

            binding.subscriptionManagerTitle.text =
                detailStringBuilder(
                    binding.root.context.getString(
                        R.string.subscription_overview_item_subscription_manager_title
                    ),
                    subscription.subscriptionOwner
                )
            binding.membershipOccupancyTitle.text =
                detailStringBuilder(
                    binding.root.context.getString(
                        R.string.subscription_overview_item_membership_occupancy_title
                    ),
                    "${subscription.currentMembers}/${subscription.totalMembers}"
                )

            val date = Instant.fromEpochMilliseconds(subscription.expireOn.toEpochMilliseconds())
                .toLocalDateTime(TimeZone.UTC)
            binding.expiredTitle.text =
                detailStringBuilder(
                    binding.root.context.getString(
                        R.string.subscription_overview_item_expired_title
                    ),
                    "${date.monthNumber}/${date.year}"
                )

//            Hide remove membership button for now
//            binding.removeMembershipButton.isVisible = !subscription.isMySubscription
            binding.removeMembershipButton.setOnClickListener {
                onRemoveMembershipClicked(subscription)
            }
        }

        private fun detailStringBuilder(
            titleString: String,
            detailString: String?
        ): SpannableStringBuilder {
            val title = setTextSpanColor(
                titleString,
                ContextCompat.getColor(binding.root.context, R.color.memberSinceByline)
            )
            val detail = detailString?.let {
                setTextSpanColor(
                    it,
                    ContextCompat.getColor(binding.root.context, R.color.switchThumbDisabled)
                )
            }
            val spannableStringBuilder = SpannableStringBuilder().apply {
                append(title)
                append(" ")
                append(detail ?: "")
            }
            return spannableStringBuilder
        }

        private fun setTextSpanColor(text: String, color: Int) =
            SpannableString(text).apply {
                setSpan(
                    ForegroundColorSpan(color),
                    0,
                    text.length,
                    Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
                )
            }
    }
}
