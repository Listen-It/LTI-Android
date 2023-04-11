package com.example.listenit2.view.activity

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.listenit2.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

class Test : AppCompatActivity() {

    private val testUrl = "http://10.80.163.57:8080/music/download/sounds/20230307/26203107363800.mp3"

    private val player = MediaPlayer()

    private val test = Impl.test

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        findViewById<Button>(R.id.play).setOnClickListener {
            play()
        }

    }


    private fun play() {
        CoroutineScope(Dispatchers.IO).launch {
            test.getMusic("sounds","20230307","26203107363800.mp3").enqueue(object : Callback<Unit>{
                override fun onResponse(call: Call<Unit>, response: Response<Unit>) {
                    if (response.isSuccessful) {
                        Log.d("음악", "성공")
                    } else {
                        Log.d("음악", "실패 ${response.raw()}, ${response.message()}, ${response.errorBody().toString()}")
                    }
                }

                override fun onFailure(call: Call<Unit>, t: Throwable) {
                    Log.e("실패", t.stackTraceToString())
                }

            })
        }
        player.setDataSource(testUrl)
        player.prepare()
        player.start()
    }
}

interface Testinterface {

    @GET("/music/download/{type}/{directory}/{filename}")
    fun getMusic(@Path("type") path : String, @Path("directory") path2 : String, @Path("filename") path3 : String) : Call<Unit>
}

object Impl {
    private const val BASEURL = "http://10.80.163.57:8080"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASEURL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val test : Testinterface = retrofit.create(Testinterface::class.java)
}

