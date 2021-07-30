package com.example.kotlinmvvmpratice.bigchicken.utils

import android.content.Context
import com.example.kotlinmvvmpratice.BaseApplication
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.Interceptor
import okhttp3.Response

class AuthInterceptor(context: Context):Interceptor {
    private val sessionManagement = SessionManagement(context)

    override fun intercept(chain: Interceptor.Chain): Response {
        val requestBuilder = chain.request().newBuilder()

//        AppApplication.sessionManager.authDetails.accessToken?.let {
//            //requestBuilder.addHeader("Authorization", "Bearer $it")
//            requestBuilder.addHeader("Authorization", "Bearer $it")
//        }
        return chain.proceed(requestBuilder.build())
    }
}