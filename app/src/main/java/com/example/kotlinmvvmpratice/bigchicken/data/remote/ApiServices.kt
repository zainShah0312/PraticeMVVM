package com.example.kotlinmvvmpratice.bigchicken.data.remote

import com.example.kotlinmvvmpratice.bigchicken.core.model.login.loginResponceModel
import com.example.kotlinmvvmpratice.bigchicken.utils.AppConstants
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiServices {
    @FormUrlEncoded
    @POST(AppConstants.LOGIN)
   suspend fun userLogin(
        @Field("email") email: String,
        @Field("password") password: String,
        @Field("login") login: String,
        @Field("kitchen_token") kitchen_token: String
    ) : Response<loginResponceModel>



}