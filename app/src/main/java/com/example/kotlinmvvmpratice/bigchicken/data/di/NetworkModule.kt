package com.example.kotlinmvvmpratice.bigchicken.data.di

import android.content.Context
import com.example.kotlinmvvmpratice.bigchicken.core.repo.userRepository
import com.example.kotlinmvvmpratice.bigchicken.data.remote.ApiServices
import com.example.kotlinmvvmpratice.bigchicken.data.remote.RemoteDataSource
import com.example.kotlinmvvmpratice.bigchicken.utils.AppConstants
import com.example.kotlinmvvmpratice.bigchicken.utils.AuthApiKeyInterceptor
import com.example.kotlinmvvmpratice.bigchicken.utils.AuthInterceptor
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object NetworkModule{



}