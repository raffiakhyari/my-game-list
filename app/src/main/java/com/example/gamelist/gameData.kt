package com.example.gamelist

object gameData {

    private val gameAction_Names = arrayOf(
        "Assasins Creed",
        "Monter Hunter World",
        "Fall Guy"
    )

    private val gameHoror_Names = arrayOf(
        "Dread Out",
        "Little Nightmare 1",
        "Little Nightmare 2",
        "Resident Evil Biohazard"
    )

    private val gameShooter_Names = arrayOf(
        "Apex Legends",
        "Counter Strike Global Offensive",
        "Valorant"
    )

    private val gameAction_Detail = arrayOf(
        "deskripsi assasins",
        "deskripsi mhw",
        "deskripsi fall guy"
    )

    private val gameHoror_Detail = arrayOf(
        "deskripsi dreadout",
        "deskripsi little nightmare 1",
        "deskripsi little nightmare 2",
        "deskripsi re biohazard"
    )

    private val gameShooter_Detail = arrayOf(
        "deskripsi apex",
        "deskripsi csgo",
        "deskripsi valorant"
    )

    private val gameAction_Images = intArrayOf(
        R.drawable.assasins,
        R.drawable.monsterhunter,
        R.drawable.fallguy,
    )

    private val gameHoror_Images = intArrayOf(
        R.drawable.dreadout,
        R.drawable.little_nightmare1,
        R.drawable.little_nightmare2,
        R.drawable.resident_evil,
    )

    private val gameShooter_Images = intArrayOf(
        R.drawable.apex,
        R.drawable.csgo,
        R.drawable.valorant
    )
    //menginisialisasi data setiap kategori/genre

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

    val listData_Horor: ArrayList<Game>
        get() {
            val list = arrayListOf<Game>()
            for (position in gameHoror_Names.indices){
                val gameHoror = Game()
                gameHoror.name = gameHoror_Names[position]
                gameHoror.detaill_game = gameHoror_Detail[position]
                gameHoror.images = gameHoror_Images[position]
                list.add(gameHoror)
            }
            return list
        }

    val listData_Shooter: ArrayList<Game>
        get() {
            val list = arrayListOf<Game>()
            for (position in gameShooter_Names.indices){
                val gameShooter = Game()
                gameShooter.name = gameShooter_Names[position]
                gameShooter.detaill_game = gameShooter_Detail[position]
                gameShooter.images = gameShooter_Images[position]
                list.add(gameShooter)
            }
            return list
        }

}