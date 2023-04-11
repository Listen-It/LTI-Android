package com.example.data.retrofit.service

import com.example.data.model.music.request.MusicUploadRequest
import retrofit2.Call
import retrofit2.http.GET

interface MusicInterface {

    @GET("/music/upload")
    fun uploadMusic() : MusicUploadRequest

}