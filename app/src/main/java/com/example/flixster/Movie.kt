package com.example.flixster

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a movie from The Movie Database API
 */
class Movie {

    @JvmField
    @SerializedName("title")
    var title: String? = null

    @JvmField
    @SerializedName("overview")
    var description: String? = null

    @JvmField
    @SerializedName("poster_path")
    var imageUrl: String? = null
}