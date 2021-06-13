package com.example.gamelist.Object

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Game(
    var name: String = "",
    var images: Int = 0,
    var genre_game: String = "",
    var detaill_game: String = ""
) : Parcelable
