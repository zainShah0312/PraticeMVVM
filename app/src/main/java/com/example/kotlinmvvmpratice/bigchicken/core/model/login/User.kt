package com.example.kotlinmvvmpratice.bigchicken.core.model.login


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class User(
    @SerializedName("user_id")
    var userId: String = "",
    @SerializedName("username")
    var username: String? = null,
    @SerializedName("identity")
    var identity: String = ""
) : Parcelable