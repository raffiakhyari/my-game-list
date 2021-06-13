package com.example.gamelist.Activity

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.gamelist.Object.Game
import com.example.gamelist.R

class DetailGame : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_game)

        val btnKembali: ImageView = findViewById(R.id.btn_kembali)
        btnKembali.setOnClickListener(this)

        val btnFavorit: ImageView = findViewById(R.id.favorit)
        btnFavorit.setOnClickListener(this)

        val btnShare: ImageView = findViewById(R.id.share)
        btnShare.setOnClickListener(this)

        val game = intent.getParcelableExtra<Game>(MainActivity.intent_game)

        val gambar = findViewById<ImageView>(R.id.detail_image)
        val name = findViewById<TextView>(R.id.detail_nama)
        val genre = findViewById<TextView>(R.id.detail_genre)
        val detail = findViewById<TextView>(R.id.detail_deskripsi)

        game?.images?.let { gambar.setImageResource(it) }
        name.text = game?.name
        genre.text = game?.genre_game
        detail.text = game?.detaill_game

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_kembali ->{
                val kembali = Intent(this@DetailGame, MainActivity::class.java)
                startActivity(kembali)
            }

            R.id.favorit->{
                Toast.makeText(this, "I Love this Game ! ", Toast.LENGTH_SHORT).show()
            }

            R.id.share->{
                val kirimIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, R.id.detail_nama + R.id.detail_genre + R.id.detail_deskripsi)
                    type = "text/plain"
                }
                val  implicitIntent = Intent.createChooser(kirimIntent, null)
                startActivity(implicitIntent)
            }
        }
    }

}