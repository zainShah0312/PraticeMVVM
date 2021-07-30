package com.example.kotlinmvvmpratice.bigchicken.core.model.login


import android.annotation.SuppressLint
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class loginResponceModel(
    @SerializedName("error")
    var error: Int = 0,
    @SerializedName("success")
    var success: Int = 0,
    @SerializedName("message")
    var message: String = "",
    @SerializedName("data")
    var `data`: Data = Data(),
    @SerializedName("drivers_list")
    var driversList: List<Drivers> = listOf()
) : Parcelable