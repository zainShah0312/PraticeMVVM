package com.example.kotlinmvvmpratice.bigchicken.core.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class UserModel(
    @SerializedName("email")
    @Expose
    var email: String?,
    @SerializedName("password")
    @Expose
    var password: String?,
    @SerializedName("login")
    @Expose
    var login: String?,
    @SerializedName("token")
    @Expose
    var token: String?
)