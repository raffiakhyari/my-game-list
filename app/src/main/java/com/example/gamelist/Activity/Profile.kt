package com.example.gamelist.Activity

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.gamelist.R

class Profile : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        supportActionBar?.setTitle(R.string.Profile)

        val btnMoveActivity: ImageView = findViewById(R.id.arrow_previous)
        btnMoveActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.arrow_previous ->{
                val moveIntent = Intent(this@Profile, MainActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

}