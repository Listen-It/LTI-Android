package com.example.data.repository

import com.example.data.datasource.source.MusicRemoteSource
import com.example.data.mapper.MusicDataMapper
import com.example.domain.model.music.Music
import com.example.domain.model.music.MusicCover
import com.example.domain.model.music.MusicTitle
import com.example.domain.model.music.UploadMusic
import com.example.domain.repository.MusicRepository
import kotlinx.coroutines.flow.Flow

class MusicRepositoryImpl(private val dataSource : MusicRemoteSource) : MusicRepository {

    override suspend fun uploadMusic(
        soundFile: String,
        albumFile: String,
        title: String
    ): Flow<UploadMusic> {
        return MusicDataMapper.uploadMusicRequestToUploadMusic(dataSource.uploadMusic())
    }

    override suspend fun getMusicById(id: Int): Flow<Music> {
         TODO("Not yet implemented")
    }

    override suspend fun deleteMusicById(id: Int) {
        TODO("Not yet implemented")
    }

    override suspend fun updateMusicById(id: Int): Flow<MusicTitle> {
        TODO("Not yet implemented")
    }

    override suspend fun updateMusicCoverById(id: Int): Flow<MusicCover> {
        TODO("Not yet implemented")
    }

    override suspend fun searchByTitle(title: String, page: Int): Flow<List<Music>> {
        TODO("Not yet implemented")
    }

    override suspend fun getMyMusics(): Flow<List<Music>> {
        TODO("Not yet implemented")
    }

    override fun getMusicLink(type: String, filename: String): String {
        TODO("Not yet implemented")
    }

    override suspend fun getMusicByCategory(category: String): Flow<Music> {
        TODO("Not yet implemented")
    }
}