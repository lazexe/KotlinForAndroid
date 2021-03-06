package com.lazexe.kotlinforandroid.first

import com.arellomobile.mvp.InjectViewState
import com.arellomobile.mvp.MvpPresenter
import com.lazexe.kotlinforandroid.KotlinForAndroidApplication
import com.lazexe.kotlinforandroid.injection.NewsManager
import javax.inject.Inject

/**
 * Created by Maksym Lazarenko on 21.10.17.
 * Skype: lazexe
 */
@InjectViewState
class MainPresenter : MvpPresenter<MainView>() {

    @Inject lateinit var newsManager: NewsManager

    init {
        KotlinForAndroidApplication.newsComponent.inject(this)
    }

    fun showToastMessage() {
        viewState.showToast(newsManager.increment().toString())
    }
}