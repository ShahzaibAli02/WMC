package no.wmc.domain.enums

enum class MIMEEnum(val type: String) {
    PDF("application/pdf"),
    JPEG("image/jpeg"),
    PNG("image/png"),
    DOC("application/msword"),
    DOCX("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
}
