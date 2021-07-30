package com.example.kotlinmvvmpratice.bigchicken.data.remote

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.kotlinmvvmpratice.bigchicken.utils.Resource
import com.example.kotlinmvvmpratice.bigchicken.utils.Status
import kotlinx.coroutines.Dispatchers


fun <T> performGetOperation(
    networkCall: suspend () -> com.example.kotlinmvvmpratice.bigchicken.utils.Resource<T>,
): LiveData<Resource<T>> =
    liveData(Dispatchers.IO) {
        emit(Resource.loading())
        val responseStatus = networkCall.invoke()
        if (responseStatus.status == Status.SUCCESS) {
            emit(Resource.success(responseStatus.data!!))
        } else if (responseStatus.status == Status.ERROR) {
            emit(Resource.error(responseStatus.message!!))
        }
    }