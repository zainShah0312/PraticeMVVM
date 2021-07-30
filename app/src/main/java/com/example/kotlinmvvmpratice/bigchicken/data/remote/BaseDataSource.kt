package com.example.kotlinmvvmpratice.bigchicken.data.remote

import com.example.kotlinmvvmpratice.bigchicken.utils.ErrorUtils
import com.example.kotlinmvvmpratice.bigchicken.utils.LoggerUtils
import retrofit2.Response

abstract class BaseDataSource {

    protected suspend fun <T> getResult(call: suspend () -> Response<T> ):Response<T>{
        try {
            val response = call()
            val message = StringBuilder()

            if (response.isSuccessful){
                val body = response.body()
                if (body != null) return Response.success(body)
            }

            val errorRes = ErrorUtils.parseError(response?.errorBody()?.string())
            LoggerUtils.debug("Error",errorRes.toString())
            return error(errorRes.error_description)
        }
        catch (e: Exception){
            return error(e.message ?: e.toString())
        }
    }
}