package com.example.gamelist

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.LinearLayout
import android.widget.LinearLayout.HORIZONTAL
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.HORIZONTAL

class MainActivity : AppCompatActivity() {

    //action bar
    private lateinit var actionBar: ActionBar

    private lateinit var rvGameHoror : RecyclerView
    private lateinit var rvGameAction : RecyclerView
    private lateinit var rvGameShooter : RecyclerView

    private var list: ArrayList<Game> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //init actionbar
        actionBar = this.supportActionBar!!

        //hooks
        rvGameHoror = findViewById(R.id.rv_GameHoror)
        rvGameAction = findViewById(R.id.rv_GameAction)
        rvGameShooter = findViewById(R.id.rv_GameShooter)


        //listadd Data game
        list.addAll(gameData.listData_Action)
        shorRecyclerAction()

        list.addAll(gameData.listData_Horor)
        showRecyclerHoror()

        list.addAll(gameData.listData_Shooter)
        showRecyclerShooter()
    }

    @SuppressLint("WrongConstant")
    private fun showRecyclerShooter() {
        rvGameShooter.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL,false)
        val viewPagerAdapter = viewPagerAdapter(list)
        rvGameShooter.adapter = viewPagerAdapter
    }

    @SuppressLint("WrongConstant")
    private fun shorRecyclerAction() {
        rvGameAction.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL,false)
        val viewPagerAdapter = viewPagerAdapter(list)
        rvGameAction.adapter = viewPagerAdapter
    }

    @SuppressLint("WrongConstant")
    private fun showRecyclerHoror() {
        rvGameHoror.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL,false)
        val viewPagerAdapter = viewPagerAdapter(list)
        rvGameHoror.adapter = viewPagerAdapter
    }
}