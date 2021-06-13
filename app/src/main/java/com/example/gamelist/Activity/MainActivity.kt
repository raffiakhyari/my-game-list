package com.example.gamelist.Activity

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gamelist.Object.Game
import com.example.gamelist.Object.gameData
import com.example.gamelist.R
import com.example.gamelist.viewPagerAdapter

class MainActivity : AppCompatActivity(), View.OnClickListener {

    //action bar
    private lateinit var rvGameAction : RecyclerView

    private var list: ArrayList<Game> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //hooks
        rvGameAction = findViewById(R.id.rv_GameAction)

        //listadd Data game
        list.addAll(gameData.listData_Action)
        showRecyclerAction()


        val btnMoveActivity: ImageView = findViewById(R.id.btn_user)
        btnMoveActivity.setOnClickListener(this)

    }
    private fun showRecyclerAction() {
        rvGameAction.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL,false)
        val viewPagerAdapter = viewPagerAdapter(list)
        rvGameAction.adapter = viewPagerAdapter
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_user ->{
                val moveIntent = Intent(this@MainActivity, Profile::class.java)
                startActivity(moveIntent)
            }
        }
    }

}