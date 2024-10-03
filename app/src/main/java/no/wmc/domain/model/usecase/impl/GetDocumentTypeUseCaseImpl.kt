package no.wmc.domain.model.usecase.impl

import no.wmc.domain.DataState
import no.wmc.domain.mapper.toModel
import no.wmc.domain.model.DocumentType
import no.wmc.domain.model.usecase.GetDocumentTypeUseCase
import no.wmc.domain.repo.DocumentRepository

class GetDocumentTypeUseCaseImpl(
    private val documentRepository: DocumentRepository
) : BaseUseCase(), GetDocumentTypeUseCase {
    override suspend fun invoke(): DataState<DocumentType> {


       return DataState.Success(DocumentType(listOf(
            DocumentType.DocumentTypeItem(0, "Certificate"),
            DocumentType.DocumentTypeItem(1, "Discharge Summary"),
            DocumentType.DocumentTypeItem(2, "Insurance"),
            DocumentType.DocumentTypeItem(3, "Living Will"),
            DocumentType.DocumentTypeItem(4, "Passport"),
            DocumentType.DocumentTypeItem(4, "Prescription"),
            DocumentType.DocumentTypeItem(4, "Travel Document"),
            DocumentType.DocumentTypeItem(4, "X-Ray"),
            DocumentType.DocumentTypeItem(4, "Other"),
        )))
//        return getDataState(documentRepository.getDocumentType()) {
//            it?.toModel()
//        }
    }
}
