package com.example.kotlinmvvmpratice.bigchicken.core.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinmvvmpratice.R
import com.example.kotlinmvvmpratice.bigchicken.core.`interface`.LoginListener
import com.example.kotlinmvvmpratice.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() , LoginListener{

    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //     setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onStarted() {

    }

    override fun onSuccess() {

    }

    override fun onFailure(message: String) {

    }
}