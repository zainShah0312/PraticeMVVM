package com.example.kotlinmvvmpratice.bigchicken.core.model.login


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Drivers(
    @SerializedName("id")
    var id: String = "",
    @SerializedName("first_name")
    var firstName: String = "",
    @SerializedName("last_name")
    var lastName: String = "",
    @SerializedName("email")
    var email: String = "",
    @SerializedName("phone")
    var phone: String = "",
    @SerializedName("password")
    var password: String = "",
    @SerializedName("status")
    var status: String = "",
    @SerializedName("account_status")
    var accountStatus: String = "",
    @SerializedName("created_at")
    var createdAt: String = "",
    @SerializedName("updated_at")
    var updatedAt: String = ""
) : Parcelable