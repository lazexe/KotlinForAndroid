package com.lazexe.kotlinforandroid.injection

import com.lazexe.kotlinforandroid.first.MainPresenter
import com.lazexe.kotlinforandroid.second.SecondPresenter
import dagger.Component
import javax.inject.Singleton

/**
 * Created by Maksym Lazarenko on 21.10.17.
 * Skype: lazexe
 */
@Singleton
@Component(modules = arrayOf(ApplicationModule::class, NewsModule::class))
interface NewsComponent {
    fun inject(mainPresenter: MainPresenter)
    fun inject(secondPresenter: SecondPresenter)
}