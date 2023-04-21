 package com.example.listenit2.view.activity

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.databinding.DataBindingUtil
import com.example.domain.model.music.Info
import com.example.domain.model.music.UploadMusic
import com.example.listenit2.R
import com.example.listenit2.databinding.ActivityMusicUploadBinding
import com.example.listenit2.vm.MusicUploadViewModel
import dagger.hilt.android.AndroidEntryPoint
import java.io.FileNotFoundException
import java.lang.StringBuilder
import javax.inject.Inject


 @AndroidEntryPoint
 class  MusicUploadActivity : AppCompatActivity() {

     lateinit var binding : ActivityMusicUploadBinding

     @Inject lateinit var viewModel : MusicUploadViewModel

     var list = ArrayList<UploadMusic>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_music_upload)
    }


}