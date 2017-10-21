package com.lazexe.kotlinforandroid.injection

import android.content.Context
import com.lazexe.kotlinforandroid.KotlinForAndroidApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Maksym Lazarenko on 21.10.17.
 * Skype: lazexe
 */
@Module
class ApplicationModule(val app: KotlinForAndroidApplication) {
    @Provides @Singleton fun provideContext(): Context = app
    @Provides @Singleton fun provideApplication(): KotlinForAndroidApplication = app
}