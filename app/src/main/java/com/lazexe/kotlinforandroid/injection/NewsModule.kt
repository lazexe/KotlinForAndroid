package com.lazexe.kotlinforandroid.injection

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Maksym Lazarenko on 21.10.17.
 * Skype: lazexe
 */
@Module
class NewsModule {

    @Provides @Singleton fun provideNewsApi() : NewsAPI = NewsAPI()
}