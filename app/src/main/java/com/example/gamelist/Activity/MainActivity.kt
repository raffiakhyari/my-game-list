package com.example.gamelist.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gamelist.Object.Game
import com.example.gamelist.Object.gameData
import com.example.gamelist.R
import com.example.gamelist.viewPagerAdapter

class MainActivity : AppCompatActivity() {

    //action bar
    private lateinit var actionBar: ActionBar

    private lateinit var rvGameAction : RecyclerView

    private var list: ArrayList<Game> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init actionbar
        actionBar = this.supportActionBar!!

        //hooks
        rvGameAction = findViewById(R.id.rv_GameAction)

        //listadd Data game
        list.addAll(gameData.listData_Action)
        showRecyclerAction()

    }

    private fun showRecyclerAction() {
        rvGameAction.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL,false)
        val viewPagerAdapter = viewPagerAdapter(list)
        rvGameAction.adapter = viewPagerAdapter
    }

}