package com.sumeetb.kotlindemo.ui

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.sumeetb.kotlindemo.R
import com.sumeetb.kotlindemo.ui.login.LoginActivity

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent=Intent(this, LoginActivity::class.java);
            startActivity(intent);
            finish()
        }, 3000)
    }
}
