package com.example.listenit2.vm

import android.content.ContentResolver
import android.provider.MediaStore
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.model.music.Info
import com.example.domain.model.music.UploadMusic
import com.example.domain.usecase.MusicUploadUseCase
import kotlinx.coroutines.launch

class MusicUploadViewModel(private val musicUploadUseCase : MusicUploadUseCase) : ViewModel() {

    var audioList = ArrayList<UploadMusic>()
    fun uploadMusic(
        soundFile : String,
        albumFile : String,
        title : String
    ) {
        viewModelScope.launch {
            musicUploadUseCase.execute(soundFile, albumFile, title)
        }
    }

    fun readAudioFile(contentResolver : ContentResolver) {
        val contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI
        val projection = arrayOf(
            MediaStore.Audio.Media._ID,
            MediaStore.Audio.Media.DISPLAY_NAME,
            MediaStore.Audio.Media.MIME_TYPE,
            MediaStore.Audio.Media.DATA
        )
        val cursor = contentResolver.query(contentUri, projection, null, null, null)

        if (cursor == null || !cursor.moveToFirst()) {
            return
        }

        cursor.use {
            val idColumn = it.getColumnIndexOrThrow(MediaStore.Audio.Media._ID)
            val dataColumn = it.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA)
            val nameColumn = cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DISPLAY_NAME)

            while (it.moveToNext()) {
                val id = it.getLong(idColumn)
                val data = it.getString(dataColumn)
                val name = it.getString(nameColumn)
                audioList.add(UploadMusic(data, "", Info(name)))
            }
        }

    }

}