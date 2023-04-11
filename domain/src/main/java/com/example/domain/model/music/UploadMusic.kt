package com.example.domain.model.music

data class UploadMusic(
    var soundFile : String,
    var albumFile : String,
    var info : Info
)

data class Info (var title : String)
