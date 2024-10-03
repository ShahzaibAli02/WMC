package no.wmc.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class ValidationDtoModel(
    @SerialName("validationResult") val validationResult: ValidationResultDtoModel?,
    @SerialName("errorCode") val errorCode: String,
    @SerialName("message") val message: String
) {
    @Serializable
    class ValidationResultDtoModel(
        @SerialName("firstName") val firstName: ValidationStateDtoModel?,
        @SerialName("lastName") val lastName: ValidationStateDtoModel?,
        @SerialName("phone") val phone: ValidationStateDtoModel?,
        @SerialName("birthDate") val birthDate: ValidationStateDtoModel?,
        @SerialName("gender") val gender: ValidationStateDtoModel?,
        @SerialName("nationality") val nationality: ValidationStateDtoModel?
    )

    @Serializable
    class ValidationStateDtoModel(
        @SerialName("errors") val errors: List<ValidationErrorDtoModel>,
        @SerialName("validationState") val validationState: String,
        @SerialName("isContainerNode") val isContainerNode: Boolean
    )

    @Serializable
    class ValidationErrorDtoModel(
        @SerialName("errorMessage") val errorMessage: String
    )
}
