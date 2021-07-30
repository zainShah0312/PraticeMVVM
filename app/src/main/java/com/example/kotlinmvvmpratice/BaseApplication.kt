package com.example.kotlinmvvmpratice

import android.app.Application
import com.example.kotlinmvvmpratice.bigchicken.utils.SessionManagement
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApplication :Application() {
    private val TAG = Application::class.simpleName
    companion object{
        lateinit var instance: Application
        lateinit var sessionManagement: SessionManagement
    }

    override fun onCreate() {
        super.onCreate()
        initialize()
    }
    private fun initialize()
    {
        instance = this
        sessionManagement = SessionManagement(applicationContext)
    }

    override fun onTerminate() {
        super.onTerminate()
    }

}