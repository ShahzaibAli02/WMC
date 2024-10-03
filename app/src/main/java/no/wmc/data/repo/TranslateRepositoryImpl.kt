package no.wmc.data.repo

import no.wmc.data.local.manager.LocalDataManager
import no.wmc.data.manager.NetworkStateManager
import no.wmc.data.remote.model.TranslationDtoModel
import no.wmc.data.remote.service.TranslationApiService
import no.wmc.domain.DataState
import no.wmc.domain.repo.TranslateRepository

class TranslateRepositoryImpl(
    private val translationApiService: TranslationApiService,
    localDataManager: LocalDataManager,
    networkStateManager: NetworkStateManager
) : BaseRepository(networkStateManager, localDataManager), TranslateRepository {
    override suspend fun getTranslateLanguages(): DataState<List<TranslationDtoModel>> {
        return execute {
//            translationApiService.getTranslateLanguages()
            getList()
        }
    }

    fun getList():List<TranslationDtoModel>
    {
        val spanish = TranslationDtoModel(2, "es", "Spanish")
        val french = TranslationDtoModel(3, "fr", "French")
        val german = TranslationDtoModel(4, "de", "German")
        val chinese = TranslationDtoModel(5, "zh", "Chinese")
        val japanese = TranslationDtoModel(6, "ja", "Japanese")
        val korean = TranslationDtoModel(7, "ko", "Korean")
        val russian = TranslationDtoModel(8, "ru", "Russian")
        val arabic = TranslationDtoModel(9, "ar", "Arabic")
        val hindi = TranslationDtoModel(10, "hi", "Hindi")
        val portuguese = TranslationDtoModel(11, "pt", "Portuguese")
        val italian = TranslationDtoModel(12, "it", "Italian")
        val dutch = TranslationDtoModel(13, "nl", "Dutch")
        val swedish = TranslationDtoModel(14, "sv", "Swedish")
        val turkish = TranslationDtoModel(15, "tr", "Turkish")
        val vietnamese = TranslationDtoModel(16, "vi", "Vietnamese")
        val thai = TranslationDtoModel(17, "th", "Thai")
        val indonesian = TranslationDtoModel(18, "id", "Indonesian")
        val greek = TranslationDtoModel(19, "el", "Greek")
        val hebrew = TranslationDtoModel(20, "he", "Hebrew")
        val danish = TranslationDtoModel(21, "da", "Danish")
        val norwegian = TranslationDtoModel(22, "no", "Norwegian")
        val finnish = TranslationDtoModel(23, "fi", "Finnish")
        val polish = TranslationDtoModel(24, "pl", "Polish")
        val czech = TranslationDtoModel(25, "cs", "Czech")
        val romanian = TranslationDtoModel(26, "ro", "Romanian")
        val malay = TranslationDtoModel(27, "ms", "Malay")
        val filipino = TranslationDtoModel(28, "fil", "Filipino")
        val serbian = TranslationDtoModel(29, "sr", "Serbian")
        val croatian = TranslationDtoModel(30, "hr", "Croatian")
        // Add more languages as needed

        // Create a list of TranslationDtoModel objects
        val languageList = listOf(
            spanish, french, german, chinese, japanese, korean, russian, arabic, hindi,
            portuguese, italian, dutch, swedish, turkish, vietnamese, thai, indonesian, greek, hebrew,
            danish, norwegian, finnish, polish, czech, romanian, malay, filipino, serbian, croatian
        )
        return languageList;
    }
}
