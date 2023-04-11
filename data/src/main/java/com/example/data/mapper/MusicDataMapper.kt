package com.example.data.mapper

import com.example.data.model.music.MusicData
import com.example.data.model.music.request.Info
import com.example.data.model.music.request.MusicUploadRequest
import com.example.domain.model.music.ContentData
import com.example.domain.model.music.Music
import com.example.domain.model.music.UploadMusic
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

object MusicDataMapper {

    fun musicDataToMusic(
        musicData : MusicData
    ) : Music = Music(
            ContentData(musicData.content.id,
                musicData.content.artist,
                musicData.content.title,
                musicData.content.filename,
                musicData.content.album_filename
            ),
            musicData.number,
            musicData.size
        )

    fun musicToMusicData(
        music : Music
    ) : MusicData = MusicData(
        com.example.data.model.music.ContentData(
            music.content.id,
            music.content.artist,
            music.content.title,
            music.content.filename,
            music.content.album_filename
        ),
        music.number,
        music.size
    )

    fun uploadMusicToUploadMusicRequest(
        uploadMusic : UploadMusic
    ) : MusicUploadRequest = MusicUploadRequest(
        uploadMusic.soundFile,
        uploadMusic.albumFile,
        Info(uploadMusic.info.title)
    )

    fun uploadMusicRequestToUploadMusic(
        uploadMusic : MusicUploadRequest
    ) : Flow<UploadMusic> = flow {
        val upload = UploadMusic(
            uploadMusic.soundFile,
            uploadMusic.albumFile,
            com.example.domain.model.music.Info(uploadMusic.info.title)
            )
        emit(upload)
    }

}