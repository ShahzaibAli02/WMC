package no.wmc.ui.translate

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import no.wmc.data.remote.service.TranslateService
import no.wmc.domain.DataState
import no.wmc.domain.enums.ProfileItemEnum
import no.wmc.domain.model.TranslateItem
import no.wmc.domain.model.Translation
import no.wmc.domain.model.usecase.GetProfileItemUseCase
import no.wmc.domain.model.usecase.GetTranslateLanguagesUseCase
import no.wmc.firebase.model.AllCategoryModel
import no.wmc.ui.base.BaseViewModel
import no.wmc.ui.base.ViewEvent
import no.wmc.ui.translate.TranslateViewAction.GetCurrentLanguageProfileItemsViewAction
import no.wmc.ui.translate.TranslateViewAction.GetTranslateLanguagesViewAction
import no.wmc.ui.translate.TranslateViewAction.GetTranslatedProfileItemsViewAction
import no.wmc.ui.translate.TranslateViewEvent.GetCurrentLanguageProfileItemsViewEvent
import no.wmc.ui.translate.TranslateViewEvent.GetTranslateLanguagesViewEvent
import no.wmc.ui.translate.TranslateViewEvent.GetTranslatedProfileItemsViewEvent
import no.wmc.utils.AppDispatchers
import org.json.JSONArray

class TranslateViewModel(
    private val translateLanguagesUseCase: GetTranslateLanguagesUseCase,
    private val getProfileItemUseCase: GetProfileItemUseCase,
    private val translateService: TranslateService,
    override val viewState: TranslateViewState,
    appDispatchers: AppDispatchers,
) : BaseViewModel<TranslateViewState>(appDispatchers)
{
    override suspend fun handleViewEvent(event: ViewEvent)
    {
        when (event)
        {
            is GetTranslateLanguagesViewEvent -> handleGetTranslateLanguagesEvent()
            is GetCurrentLanguageProfileItemsViewEvent -> handleGetCurrentLanguageProfileItemsEvent(event.profileItemEnum)
            is GetTranslatedProfileItemsViewEvent -> handleGetTranslatedProfileItemsEvent(event.list, event.language)
            else -> throwEventNotSupported(event)
        }
    }

    private suspend fun handleGetTranslateLanguagesEvent()
    {
        postAction(
            GetTranslateLanguagesViewAction(
                getViewState(
                    state = translateLanguagesUseCase()
                )
            )
        )
    }

    private suspend fun handleGetCurrentLanguageProfileItemsEvent(
        profileItemEnum: ProfileItemEnum,
    )
    {
        postAction(
            GetCurrentLanguageProfileItemsViewAction(
                getViewState(
                    state = getProfileItemUseCase(profileItemEnum)
                )
            )
        )
    }

    suspend fun translate(targetLanguage: String, text: String): String
    {
        if (text.isEmpty()) return ""
        var translation = ""
        try
        {
            val result = translateService.translate(targetLanguage = targetLanguage, text = text)
            val jsonArray: JSONArray = JSONArray(result.body()).getJSONArray(0)
            for (i in 0 until jsonArray.length())
            {
                translation += jsonArray.getJSONArray(i).getString(0)
            }
        } catch (e: Exception)
        {
            translation = ""
        }
        return translation
    }

    private suspend fun handleGetTranslatedProfileItemsEvent(
        profileItemEnum: Array<AllCategoryModel>,
        language: String,
    )
    {

        val translatedItems = mutableListOf<Deferred<TranslateItem>>()
        coroutineScope {
            profileItemEnum.forEach {
                val translatedItem = async {
                    TranslateItem(
                        "", it.description ?: "", translate(
                            language, it.description ?: ""
                        )
                    )
                }
                translatedItems.add(translatedItem)
            }
        }
        postAction(
            GetTranslatedProfileItemsViewAction(
                getViewState( //                    state = getProfileItemUseCase(profileItemEnum, language)
                    state = DataState.Success(translatedItems.awaitAll())
                )
            )
        )
    }
}
