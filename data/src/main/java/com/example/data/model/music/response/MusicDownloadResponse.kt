package com.example.data.model.music.response

import com.google.gson.annotations.SerializedName

data class MusicDownloadResponse (
    @SerializedName("id")
    var id : Int,
    @SerializedName("artist")
    var artist : String,
    @SerializedName("title")
    var title : String,
    @SerializedName("filename")
    var fileName : String,
    @SerializedName("album_filename")
    var albumFileName : String
        )