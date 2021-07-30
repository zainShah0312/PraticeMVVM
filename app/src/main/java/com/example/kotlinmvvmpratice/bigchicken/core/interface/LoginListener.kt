package com.example.kotlinmvvmpratice.bigchicken.core.`interface`

interface LoginListener {
    fun onStarted()
    fun onSuccess()
    fun onFailure(message: String)
}