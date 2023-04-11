package com.example.data.model.music

import com.google.gson.annotations.SerializedName

data class MusicData(
    @SerializedName("contents")
    var content : ContentData,
    @SerializedName("number")
    var number : Int,
    @SerializedName("size")
    var size : Int

)

data class ContentData(var id : Int, var artist : String, var title : String, var filename : String, var album_filename : String)
