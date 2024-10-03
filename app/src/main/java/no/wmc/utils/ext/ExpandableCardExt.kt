package no.wmc.utils.ext

import no.wmc.ui.custom.ExpandableCard

fun ExpandableCard.showActionButtons(isShow: Boolean) {
    isEditVisible = isShow
    isShareVisible = isShow
    isTranslateVisible = isShow
}
