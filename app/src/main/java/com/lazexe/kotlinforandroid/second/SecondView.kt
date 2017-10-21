package com.lazexe.kotlinforandroid.second

import com.arellomobile.mvp.MvpView

/**
 * Created by Maksym Lazarenko on 21.10.17.
 * Skype: lazexe
 */
interface SecondView : MvpView {
    fun showToast(message: String)
}