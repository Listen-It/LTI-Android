package com.example.data.datasource.source

import com.example.data.model.music.request.MusicUploadRequest

interface MusicRemoteSource {

    suspend fun uploadMusic() :MusicUploadRequest

}