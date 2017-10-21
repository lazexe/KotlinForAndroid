package com.lazexe.kotlinforandroid.injection

import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by Maksym Lazarenko on 21.10.17.
 * Skype: lazexe
 */
@Singleton
class NewsManager @Inject constructor(private val api: NewsAPI) {

    fun increment(): Int = api.increment()
}