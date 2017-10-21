package com.lazexe.kotlinforandroid

import android.app.Application
import com.lazexe.kotlinforandroid.injection.ApplicationModule
import com.lazexe.kotlinforandroid.injection.DaggerNewsComponent
import com.lazexe.kotlinforandroid.injection.NewsComponent

/**
 * Created by Maksym Lazarenko on 21.10.17.
 * Skype: lazexe
 */
class KotlinForAndroidApplication : Application() {

    companion object {
        lateinit var newsComponent: NewsComponent
    }

    override fun onCreate() {
        super.onCreate()
        newsComponent = DaggerNewsComponent.builder().applicationModule(ApplicationModule(this)).build()
    }
}