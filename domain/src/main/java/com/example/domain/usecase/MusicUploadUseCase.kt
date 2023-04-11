package com.example.domain.usecase

import com.example.domain.model.music.Info
import com.example.domain.model.music.UploadMusic
import com.example.domain.repository.MusicRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MusicUploadUseCase(private val repository: MusicRepository) {
    fun execute(
        soundFile : String,
        albumFile : String,
        title : String
    ): Flow<UploadMusic> = flow {
        val uploadMusic = UploadMusic(soundFile, albumFile, Info(title))
        emit(uploadMusic)
    }
}