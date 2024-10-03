package no.wmc.domain.model.usecase.impl

import no.wmc.domain.DataState
import no.wmc.domain.mapper.toModel
import no.wmc.domain.model.Translation
import no.wmc.domain.model.usecase.GetTranslateLanguagesUseCase
import no.wmc.domain.repo.TranslateRepository

class GetTranslateLanguagesUseCaseImpl(
    private val translateRepository: TranslateRepository
) : BaseUseCase(), GetTranslateLanguagesUseCase {
    override suspend fun invoke(): DataState<List<Translation>> {
        return getDataState(translateRepository.getTranslateLanguages()) { translations ->
            translations?.map { it.toModel() }
        }
    }
}
