package com.example.kotlinmvvmpratice.bigchicken.core.ui.activities

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlinmvvmpratice.BaseApplication
import com.example.kotlinmvvmpratice.R
import com.example.kotlinmvvmpratice.bigchicken.MainActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import javax.inject.Inject

class SplashActivity : AppCompatActivity() {
    lateinit var someString: String
    private var coroutineScope: Job? = null
    private var NAVIGATION_DELAY = 1 * 1000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Log.d(TAG, someString)
        coroutineScope = CoroutineScope(Job() + Dispatchers.Main).launch {
            delay(NAVIGATION_DELAY)

            coroutineScope?.let {
                if (it.isActive) {
                    if (BaseApplication.sessionManagement.isLoggedIn()) {
                        startActivity<MainActivity>()
                    } else {
                        startActivity<LoginActivity>()
                    }
                }

            }
        }


    }
}