@file:Suppress("DEPRECATION")

package com.example.gamelist.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.gamelist.R

class splashscreen : AppCompatActivity() {

    private val splashScreentimeout : Long = 2500

    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        },splashScreentimeout)
    }
}