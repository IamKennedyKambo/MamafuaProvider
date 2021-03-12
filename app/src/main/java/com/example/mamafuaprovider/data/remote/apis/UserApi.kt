package com.example.mamafuaprovider.data.remote.apis

import com.example.mamafuaprovider.data.responses.LoginResponse
import retrofit2.http.GET

interface UserApi : BaseApi {
    @GET("user")
    suspend fun getUser(): LoginResponse
}