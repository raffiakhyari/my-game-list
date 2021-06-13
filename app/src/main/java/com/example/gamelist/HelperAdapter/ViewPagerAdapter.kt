package com.example.gamelist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.gamelist.Object.Game
import org.w3c.dom.Text

class viewPagerAdapter(private val listGame: ArrayList<Game>) :RecyclerView.Adapter<viewPagerAdapter.listViewHolder>(){


    inner class listViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_game)
        var tvName: TextView = itemView.findViewById(R.id.tv_namaGame)
        var tvGenre: TextView = itemView.findViewById(R.id.tv_genreGame)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_deskripsi)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): listViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.featured_card_design, viewGroup,false)
        return listViewHolder(view)
    }

    override fun onBindViewHolder(holder: listViewHolder, position: Int) {
        val game = listGame[position]

        Glide.with(holder.itemView.context)
            .load(game.images)
            .into(holder.imgPhoto)

        holder.tvName.text = game.name
        holder.tvGenre.text = game.genre_game
        holder.tvDetail.text = game.detaill_game

    }

    override fun getItemCount(): Int {
        return listGame.size
    }
}
