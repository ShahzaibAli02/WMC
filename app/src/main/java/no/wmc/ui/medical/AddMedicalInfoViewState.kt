package no.wmc.ui.medical

import no.wmc.data.remote.EMPTY_STRING
import no.wmc.data.remote.INVALID_POSITION
import no.wmc.domain.model.ProfileItem

class AddMedicalInfoViewState {
    var page = 1
    var isLoading = false
    var currentKeyword = EMPTY_STRING
    private val medicalItems = mutableListOf<ProfileItem.Item>()

    fun addProfileItems(items: List<ProfileItem.Item>?) {
        if (page == 1) {
            medicalItems.clear()
        }

        page = if (items.isNullOrEmpty()) {
            INVALID_POSITION
        } else {
            page + 1
        }

        items?.let { medicalItems.addAll(it) }
    }

    fun updateKeyword(keyword: String): Boolean {
        val shouldSearch = keyword.trim() != this.currentKeyword
        if (shouldSearch) {
            page = 1
            isLoading = false
            this.currentKeyword = keyword
        }
        return shouldSearch
    }

    fun getMedicalItems() = medicalItems.toList()

    fun canQuery() = page != INVALID_POSITION && !isLoading
}
