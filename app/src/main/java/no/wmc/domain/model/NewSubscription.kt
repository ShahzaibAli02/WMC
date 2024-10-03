package no.wmc.domain.model

import java.util.ArrayList

/**
 * @property price value is per month and in USD
 */
data class NewSubscription(val name: String, val price: String, val image: Int, var benefits: ArrayList<String>)
