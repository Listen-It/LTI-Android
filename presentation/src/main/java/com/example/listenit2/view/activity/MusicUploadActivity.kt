 package com.example.listenit2.view.activity

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.databinding.DataBindingUtil
import com.example.listenit2.R
import com.example.listenit2.databinding.ActivityMusicUploadBinding
import java.io.FileNotFoundException
import java.lang.StringBuilder


 class  MusicUploadActivity : AppCompatActivity() {

     lateinit var binding : ActivityMusicUploadBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_music_upload)
    }

     fun readAudioFile() {
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

        cursor.use { it ->
        }

     }
}