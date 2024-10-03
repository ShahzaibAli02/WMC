package no.wmc.ui.base

import android.os.Handler
import android.os.Looper
import androidx.annotation.StringRes
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView

abstract class BaseHomeCardListAdapter<T, VH : RecyclerView.ViewHolder>(
    diffUtil: DiffUtil.ItemCallback<T>
) : BaseListAdapter<T, VH>(diffUtil) {

    var cardUpdateTrigger: (() -> Unit)? = null

    abstract fun getStringTitleList(): String

    @StringRes
    abstract fun getEmptyStateString(): Int

    abstract fun getProfileItemCount(): Int

    fun updateList(list: List<T>?) {
        submitList(list?.toMutableList())
        /*
            Delay for list to be updated.
            Workaround for getStringTitleList() is not updated when delete an item from the list.
         */
        Handler(Looper.getMainLooper()).postDelayed({
            cardUpdateTrigger?.invoke()
        }, 100)
    }
}
