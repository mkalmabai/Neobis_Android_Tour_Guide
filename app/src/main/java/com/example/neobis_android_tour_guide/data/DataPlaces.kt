package com.example.neobis_android_tour_guide.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataPlaces(
    val image: Int,
    val namePlace: String,
    val address: String,
    val worktime: String,
    val distance: String,
    val description: String
):Parcelable
