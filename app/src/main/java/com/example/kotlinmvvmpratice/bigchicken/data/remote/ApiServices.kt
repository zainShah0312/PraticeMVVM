package com.example.kotlinmvvmpratice.bigchicken.data.remote

import com.example.kotlinmvvmpratice.bigchicken.core.model.login.LoginResponceModel
import com.example.kotlinmvvmpratice.bigchicken.utils.AppConstants
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiServices {
    @POST(AppConstants.LOGIN)
    @FormUrlEncoded
    suspend fun userLogin(
        @Field("email") email: String,
        @Field("password") password: String,
        @Field("login") login: String,
        @Field("kitchen_token") kitchen_token: String
    ): Response<LoginResponceModel>


}