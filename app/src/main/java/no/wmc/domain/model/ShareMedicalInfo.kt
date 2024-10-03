package no.wmc.domain.model

import java.io.File

data class ShareMedicalInfo(
    val shareType: ShareType,
    val file: File?
)
