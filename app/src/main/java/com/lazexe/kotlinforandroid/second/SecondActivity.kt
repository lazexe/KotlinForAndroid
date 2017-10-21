package com.lazexe.kotlinforandroid.second

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.lazexe.kotlinforandroid.R

class SecondActivity : MvpAppCompatActivity(), SecondView {

    @InjectPresenter lateinit var presenter: SecondPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView = findViewById(R.id.click_textview) as TextView
        textView.setOnClickListener {
            presenter.showToastMessage()
        }
    }

    override fun showToast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}
