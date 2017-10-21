package com.lazexe.kotlinforandroid.first

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.presenter.InjectPresenter
import com.lazexe.kotlinforandroid.R
import com.lazexe.kotlinforandroid.second.SecondActivity

class MainActivity : MvpAppCompatActivity(), MainView {

    @InjectPresenter lateinit var presenter : MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val helloWorldTextView = findViewById(R.id.hello_world) as TextView
        val button = findViewById(R.id.button) as Button

        helloWorldTextView.setOnClickListener {
            presenter.showToastMessage()
        }

        button.setOnClickListener {
            val intent = Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun showToast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}
