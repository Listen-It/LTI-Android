package com.example.data.datasource.impl

import com.example.data.datasource.source.MusicRemoteSource
import com.example.data.model.music.request.MusicUploadRequest
import com.example.data.retrofit.service.MusicInterface

class MusicRemoteDataSourceImpl(private val api : MusicInterface) : MusicRemoteSource {

    override suspend fun uploadMusic(): MusicUploadRequest {
        return api.uploadMusic()
    }

}