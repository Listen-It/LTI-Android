package com.example.data.model.music.request

import com.google.gson.annotations.SerializedName

data class AlbumCoverRequest (@SerializedName("album-file") var albumFile : String)