package com.example.kotlinmvvmpratice.bigchicken.core.repo

import com.example.kotlinmvvmpratice.bigchicken.core.model.UserModel
import com.example.kotlinmvvmpratice.bigchicken.data.remote.RemoteDataSource
import com.example.kotlinmvvmpratice.bigchicken.data.remote.performGetOperation
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
) {
    fun authTokenApi(userModel: UserModel) =
        performGetOperation(
            networkCall = { remoteDataSource.userLogin(userModel)}
        )
    /*fun loginUserApi(model: UserModel) =
        performGetOperation(
            networkCall = { remoteDataSource.userLogin(model)}
        )*/

}