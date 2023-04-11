package com.example.data.model.music.request

import com.google.gson.annotations.SerializedName

data class MusicUploadRequest(
    @SerializedName("sound-file")
    var soundFile : String,
    @SerializedName("album-file")
    var albumFile : String,
    @SerializedName("info")
    var info : Info
    )

data class Info (var title : String)
