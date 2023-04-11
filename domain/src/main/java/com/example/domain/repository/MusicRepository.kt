package com.example.domain.repository

import com.example.domain.model.music.*
import kotlinx.coroutines.flow.Flow
import java.util.*

interface MusicRepository {

    suspend fun uploadMusic(soundFile : String, albumFile : String, title : String) : Flow<UploadMusic>

    suspend fun getMusicById(id : Int) : Flow<Music>

    suspend fun deleteMusicById(id : Int) : Unit

    suspend fun updateMusicById(id : Int) : Flow<MusicTitle>

    suspend fun updateMusicCoverById(id : Int) : Flow<MusicCover>

    suspend fun searchByTitle(title : String, page : Int) : Flow<List<Music>>

    suspend fun getMyMusics() : Flow<List<Music>>

    fun getMusicLink(type : String, filename : String) : String

    suspend fun getMusicByCategory(category : String) : Flow<Music>

}