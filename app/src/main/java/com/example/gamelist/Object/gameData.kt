package com.example.gamelist.Object

import com.example.gamelist.R

object gameData {

    private val gameAction_Names = arrayOf(
        "Assasins Creed",
        "Monter Hunter World",
        "Fall Guy",
        "Dread Out",
        "Little Nightmare 1",
        "Little Nightmare 2",
        "Resident Evil",
        "Apex Legends",
        "Counter Strike",
        "Valorant"
    )

    private val gameAction_Detail = arrayOf(
        "deskripsi assasins",
        "deskripsi mhw",
        "deskripsi fall guy",
        "deskripsi dreadout",
        "deskripsi little nightmare 1",
        "deskripsi little nightmare 2",
        "deskripsi re biohazard",
        "deskripsi apex",
        "deskripsi csgo",
        "deskripsi valorant"
    )

    private val gameAction_Images = intArrayOf(
        R.drawable.assasins,
        R.drawable.monsterhunter,
        R.drawable.fallguy,
        R.drawable.dreadout,
        R.drawable.little_nightmare1,
        R.drawable.little_nightmare2,
        R.drawable.resident_evil,
        R.drawable.apex,
        R.drawable.csgo,
        R.drawable.valorant
    )


    val listData_Action: ArrayList<Game>
        get() {
            val list = arrayListOf<Game>()
            for (position in gameAction_Names.indices){
                val gameAction = Game()
                gameAction.name = gameAction_Names[position]
                gameAction.detaill_game = gameAction_Detail[position]
                gameAction.images = gameAction_Images[position]

                list.add(gameAction)
            }
            return list
        }


}