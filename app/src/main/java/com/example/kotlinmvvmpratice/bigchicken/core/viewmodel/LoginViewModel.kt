package com.example.kotlinmvvmpratice.bigchicken.core.viewmodel

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.kotlinmvvmpratice.bigchicken.core.`interface`.LoginListener

class LoginViewModel : ViewModel()
{
    var email: String? = null
    var password: String? = null
    var loginListener: LoginListener? = null

    fun onLoginButtonClick(view: View)
    {

    }

}