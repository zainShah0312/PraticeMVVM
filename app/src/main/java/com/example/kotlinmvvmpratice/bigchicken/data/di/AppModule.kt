package com.example.kotlinmvvmpratice.bigchicken.data.di

import android.content.Context
import com.example.kotlinmvvmpratice.BaseApplication
import com.example.kotlinmvvmpratice.bigchicken.core.repo.userRepository
import com.example.kotlinmvvmpratice.bigchicken.data.remote.ApiServices
import com.example.kotlinmvvmpratice.bigchicken.data.remote.RemoteDataSource
import com.example.kotlinmvvmpratice.bigchicken.utils.AppConstants
import com.example.kotlinmvvmpratice.bigchicken.utils.AuthApiKeyInterceptor
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
object AppModule {

    @Singleton
    @Provides
    fun provideRetrofit(
        gson: Gson,
        client: OkHttpClient
    ): Retrofit =
        Retrofit.Builder()
            .baseUrl(AppConstants.BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    fun provideHtpClient(@ApplicationContext context: Context): OkHttpClient {
        val okHttpClient = OkHttpClient.Builder()
        //  okHttpClient.addInterceptor(AuthInterceptor(context))
        //  okHttpClient.addInterceptor(NetworkInterceptor(context))
        okHttpClient.addInterceptor(AuthApiKeyInterceptor(context))
        okHttpClient.hostnameVerifier { hostname, session -> true }
        okHttpClient.addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        okHttpClient.readTimeout(60, TimeUnit.SECONDS)
        okHttpClient.connectTimeout(60, TimeUnit.SECONDS)
        return okHttpClient.build()
    }

    @Provides
    fun provideGson(): Gson = GsonBuilder().create()

    @Provides
    fun provideApiService(retrofit: Retrofit): ApiServices = retrofit.create(ApiServices::class.java)

    @Singleton
    @Provides
    fun provideCharacterRemoteDataSource(apiService: ApiServices) = RemoteDataSource(apiService)

    @Singleton
    @Provides
    fun provideRepository(
        remoteDataSource: RemoteDataSource
    ) =
        userRepository(remoteDataSource)


}