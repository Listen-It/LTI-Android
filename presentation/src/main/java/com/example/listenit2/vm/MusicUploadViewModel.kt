package com.example.listenit2.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.usecase.MusicUploadUseCase
import kotlinx.coroutines.launch

class MusicUploadViewModel(private val musicUploadUseCase : MusicUploadUseCase) : ViewModel() {


    fun uploadMusic(
        soundFile : String,
        albumFile : String,
        title : String
    ) {
        viewModelScope.launch {
            musicUploadUseCase.execute(soundFile, albumFile, title)
        }
    }

}