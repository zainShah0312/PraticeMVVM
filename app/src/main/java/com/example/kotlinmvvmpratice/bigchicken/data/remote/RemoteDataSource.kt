package com.example.kotlinmvvmpratice.bigchicken.data.remote

import com.example.kotlinmvvmpratice.bigchicken.core.model.UserModel
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val apiServices: ApiServices
) : BaseDataSource() {

    suspend fun userLogin(model: UserModel) =
        getResult {
            apiServices.userLogin(
                model.email!!,
                model.password!!,
                model.login!!,
                model.token!!
            )
        }
}