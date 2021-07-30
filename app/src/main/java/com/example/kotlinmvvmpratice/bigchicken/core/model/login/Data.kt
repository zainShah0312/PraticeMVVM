package com.example.kotlinmvvmpratice.bigchicken.core.model.login


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Data(
    @SerializedName("data")
    var `data`: User = User()
) : Parcelable