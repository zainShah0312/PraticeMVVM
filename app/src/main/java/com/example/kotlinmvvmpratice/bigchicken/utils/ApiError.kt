package com.example.kotlinmvvmpratice.bigchicken.utils

import com.google.gson.annotations.SerializedName

data class ApiError(
    @SerializedName("error")
    var error : String,
    @SerializedName("error_description")
    var error_description: String,
)