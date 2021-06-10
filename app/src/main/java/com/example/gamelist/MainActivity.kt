package com.example.gamelist

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.LinearLayout.HORIZONTAL
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.HORIZONTAL

class MainActivity : AppCompatActivity() {

    private lateinit var rvGame : RecyclerView
    private var list: ArrayList<Game> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //hooks
        rvGame = findViewById(R.id.rv_Game)
        rvGame.setHasFixedSize(true)

        list.addAll(gameData.listData_Horor)

        showRecycler()
    }

    private fun showRecycler() {
        rvGame.layoutManager = LinearLayoutManager(this)
    }
}