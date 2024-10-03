package no.wmc.ui.custom

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.PorterDuff.Mode.SCREEN
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.core.content.ContextCompat
import androidx.core.content.res.use
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import no.wmc.R
import no.wmc.databinding.ExpandableCardBinding
import no.wmc.ui.base.BaseHomeCardListAdapter

class ExpandableCard @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = R.style.App_ExpandableCard
) : FrameLayout(context, attrs, defStyleAttr) {

    var onAddClicked: () -> Unit = {}
    var onTranslateClicked: () -> Unit = {}
    var onEditClicked: () -> Unit = {}
    var onShareClicked: () -> Unit = {}
    var onCancelEditItemClicked: () -> Unit = {}
    var onRemoveItemClicked: () -> Unit = {}

    var icon: Drawable? = null
        set(value) {
            field = value
            binding.icon.setImageDrawable(value)
        }

    var infoListAdapter: BaseHomeCardListAdapter<out Any, out RecyclerView.ViewHolder>? = null
        set(value) {
            value?.cardUpdateTrigger = { invalidateState() }
            field = value
            binding.list.adapter = value
        }

    var isActive: Boolean = false
        set(value) {
            field = value
            invalidateActive()
        }

    var isEditVisible: Boolean = true
        set(value) {
            field = value
            binding.editButton.isVisible = value
        }

    var isShareVisible: Boolean = true
        set(value) {
            field = value
            binding.shareButton.isVisible = value
        }

    var isTranslateVisible: Boolean = true
        set(value) {
            field = value
            binding.translateButton.isVisible = value
        }

    private val binding: ExpandableCardBinding = DataBindingUtil.inflate(
        LayoutInflater.from(context),
        R.layout.expandable_card,
        this,
        true
    )

    init {
        context.obtainStyledAttributes(
            attrs,
            R.styleable.ExpandableCard,
            defStyleAttr,
            defStyleRes
        ).use {
            icon = it.getDrawable(R.styleable.ExpandableCard_titleIcon)
            binding.title.text = it.getString(R.styleable.ExpandableCard_title) ?: ""
            binding.description.text = it.getString(R.styleable.ExpandableCard_description) ?: ""
            isActive = it.getBoolean(R.styleable.ExpandableCard_isActive, false)
            isEditVisible = it.getBoolean(R.styleable.ExpandableCard_isEditVisible, true)
            isShareVisible = it.getBoolean(R.styleable.ExpandableCard_isShareVisible, true)
            isTranslateVisible = it.getBoolean(R.styleable.ExpandableCard_isTranslateVisible, true)
        }

        binding.list.itemAnimator = null

        binding.addButton.setOnClickListener {
            onAddClicked()
        }
        binding.editButton.setOnClickListener {
            onEditClicked()
        }
        binding.translateButton.setOnClickListener {
            onTranslateClicked()
        }
        binding.shareButton.setOnClickListener {
            onShareClicked()
        }
        binding.titlePanel.setOnClickListener {
            if (isActive) {
                toggle()
            }
        }
        binding.cancelEditItemButton.setOnClickListener {
            onCancelEditItemClicked()
        }
        binding.removeItemButton.setOnClickListener {
            onRemoveItemClicked()
        }
    }

    fun toggle() {
        with(binding) {
            if (infoLayout.isVisible) {
                // Hide
                infoLayout.isVisible = false
                expandButton.rotation = 0f
            } else {
                // Show
                infoLayout.isVisible = true
                expandButton.rotation = 180f
            }
        }
    }

    private fun invalidateState() {
        if (infoListAdapter != null && infoListAdapter!!.itemCount > 0) {
            binding.translateButton.isVisible = isTranslateVisible
            binding.editButton.isVisible = isEditVisible
            binding.shareButton.isVisible = isShareVisible

            binding.description.text = context.getString(
                R.string.card_items_description,
                infoListAdapter!!.getProfileItemCount().toString(),
                infoListAdapter!!.getStringTitleList()
            )
            binding.icon.imageTintList = ColorStateList.valueOf(
                ContextCompat.getColor(context, R.color.cardActiveIconTint)
            )
        } else {
            binding.description.setText(infoListAdapter!!.getEmptyStateString())
            binding.icon.imageTintList = null
        }
    }

    private fun invalidateActive() {
        if (isActive) {
            binding.expandableCard.cardElevation =
                resources.getDimension(R.dimen.expandable_card_active_elevation)
            binding.expandableCard.foregroundTintList = null
        } else {
            binding.expandableCard.foregroundTintMode = SCREEN
            binding.expandableCard.foregroundTintList = ColorStateList.valueOf(
                ContextCompat.getColor(context, R.color.cardInActiveTint)
            )
            binding.expandableCard.cardElevation =
                resources.getDimension(R.dimen.expandable_card_inactive_elevation)
        }
    }

    fun setEditMode(isEditMode: Boolean) {
        binding.isEditMode = isEditMode
    }

    fun setLoading(isLoading: Boolean) {
        binding.isLoading = isLoading
    }

    fun getTitle() = binding.title.text.toString()
}
