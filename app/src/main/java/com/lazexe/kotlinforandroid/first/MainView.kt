package com.lazexe.kotlinforandroid.first

import com.arellomobile.mvp.MvpView

/**
* Created by Maksym Lazarenko on 21.10.17.
* Skype: lazexe
*/
interface MainView : MvpView {
    fun showToast(message: String)
}