package com.example.gamelist

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class viewPagerAdapter(private val listGame: ArrayList<Game>) :RecyclerView.Adapter<viewPagerAdapter.listViewHolder>(){


    inner class listViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_game)
        var tvName: TextView = itemView.findViewById(R.id.tv_namaGame)
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
        holder.tvDetail.text = game.detaill_game

    }

    override fun getItemCount(): Int {
        return listGame.size
    }

}

//(private var list: List<Int>, private var ctx:Context) : PagerAdapter(){
//
//    private lateinit var ImgList: List<Int>
//    lateinit var layoutInflater: LayoutInflater
//    lateinit var context: Context
//
//    override fun getCount(): Int {
//        return list.size
//    }
//
//    override fun isViewFromObject(view: View, `object`: Any): Boolean {
//        return view.equals(`object`)
//    }
//
//    override fun instantiateItem(container: ViewGroup, position: Int): Any {
//
//        val view = LayoutInflater.from(ctx).inflate(R.layout.featured_card_design,container,false)
//
//        //ambil data
//        val name = view.findViewById<TextView>(R.id.tv_namaGame)
//        val detail = view.findViewById<TextView>(R.id.tv_deskripsi)
//        val img = view.findViewById<ImageView>(R.id.img_game)
//        container.addView(view,0)
//        return view
//
//        //handleSetOnclick
//
//        return super.instantiateItem(container, position)
//    }