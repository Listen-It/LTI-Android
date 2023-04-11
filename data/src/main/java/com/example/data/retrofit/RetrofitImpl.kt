package com.example.data.retrofit

import com.example.data.retrofit.service.FavoriteInterface
import com.example.data.retrofit.service.MusicInterface
import com.example.data.retrofit.service.UserInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitImpl {
    private const val BASEURL = "http://10.80.163.57:8080"

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASEURL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val UserService : UserInterface = retrofit.create(UserInterface::class.java)
    val MusicService : MusicInterface = retrofit.create(MusicInterface::class.java)
    val FavoriteService : FavoriteInterface = retrofit.create(FavoriteInterface::class.java)
}