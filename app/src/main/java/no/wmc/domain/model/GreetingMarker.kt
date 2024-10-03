package no.wmc.domain.model

import java.time.LocalTime

object GreetingMarker {

    private val MORNING = LocalTime.of(4, 0)
    private val AFTERNOON = LocalTime.of(12, 0)
    private val EVENING = LocalTime.of(17, 0)
    private val NIGHT = LocalTime.of(21, 0)

    enum class GreetingTime {
        MORNING,
        AFTERNOON,
        EVENING,
        NIGHT
    }

    fun getCurrentTime(): GreetingTime {
        val now = LocalTime.now()
        return when {
            now.isAfter(MORNING) && now.isBefore(AFTERNOON) -> GreetingTime.MORNING
            now.isAfter(AFTERNOON) && now.isBefore(EVENING) -> GreetingTime.AFTERNOON
            now.isAfter(EVENING) && now.isBefore(NIGHT) -> GreetingTime.EVENING
            now.isAfter(NIGHT) || now.isBefore(MORNING) -> GreetingTime.NIGHT
            else -> GreetingTime.AFTERNOON
        }
    }

}
