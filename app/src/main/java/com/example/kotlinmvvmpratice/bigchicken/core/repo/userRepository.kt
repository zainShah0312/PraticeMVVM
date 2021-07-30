package com.example.kotlinmvvmpratice.bigchicken.core.repo

import com.example.kotlinmvvmpratice.bigchicken.core.model.UserModel
import com.example.kotlinmvvmpratice.bigchicken.data.remote.RemoteDataSource
import com.example.kotlinmvvmpratice.bigchicken.data.remote.performGetOperation
import javax.inject.Inject

class userRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
) {
    fun loginUserApi(model: UserModel) =
        performGetOperation(
            networkCall = { remoteDataSource.userLogin(model)}
        )

}