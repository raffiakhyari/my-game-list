package com.example.gamelist.Activity

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
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

    //static
    companion object{
        const val intent_game = "object_intentGame"
        const val intent_nama = "object_nama"
        const val intent_genre = "object_genre"
        const val intent_detail = "object_detail"
        const val intent_gambar = "object_gambar"
    }

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

        val tvViewAll: TextView = findViewById(R.id.tv_viewAll)
        tvViewAll.setOnClickListener(this)
    }

    private fun showRecyclerAction() {
        rvGameAction.layoutManager = LinearLayoutManager(this, LinearLayout.HORIZONTAL,false)
//        val viewPagerAdapter = viewPagerAdapter(list, listener)
        rvGameAction.adapter = viewPagerAdapter(list, this){
            val intent = Intent(this, DetailGame::class.java)
            intent.putExtra(intent_game, it)
            startActivity(intent)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_user ->{
                val moveIntent = Intent(this@MainActivity, Profile::class.java)
                startActivity(moveIntent)
            }

            R.id.tv_viewAll ->{
                val pindahActivity = Intent(this@MainActivity, DetailGame::class.java)
                startActivity(pindahActivity)
            }
        }
    }



}