package no.wmc.ui.custom

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import no.wmc.databinding.ItemSubscriptionMemberBinding
import no.wmc.domain.model.Subscription.SubscriptionMember

class SubscriptionMemberItem(context: Context, attrs: AttributeSet?) :
    ConstraintLayout(context, attrs) {
    private val binding by lazy {
        ItemSubscriptionMemberBinding.inflate(LayoutInflater.from(context), this, true)
    }

    fun init(
        subscriptionMember: SubscriptionMember,
        onDeleteClicked: (SubscriptionMember) -> Unit
    ) {
        binding.model = subscriptionMember
        binding.deleteIcon.setOnClickListener {
            onDeleteClicked(subscriptionMember)
        }

        binding.avatarTitle.text = getAvatarName(subscriptionMember.name)
    }

    private fun getAvatarName(name: String): String {
        val firstName = name.getOrNull(0) ?: ""
        val secondName = name.substringAfter(" ").getOrNull(0) ?: ""
        return "$firstName$secondName"
    }
}
