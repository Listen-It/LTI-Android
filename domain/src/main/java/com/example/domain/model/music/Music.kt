package com.example.domain.model.music

data class Music(
    var content : ContentData,
    var number : Int,
    var size : Int
    )

data class ContentData(var id : Int, var artist : String, var title : String, var filename : String, var album_filename : String)
