package com.example.data.model

import com.google.gson.annotations.SerializedName

data class UserData (
    @SerializedName("email")
    var email : String,
    @SerializedName("password")
    var password : String,
    @SerializedName("nickname")
    var nickname : String
)