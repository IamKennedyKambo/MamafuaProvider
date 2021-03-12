package com.example.mamafuaprovider.data.repository

import com.example.mamafuaprovider.data.remote.apis.UserApi
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val api: UserApi
) : BaseRepository(api) {

    suspend fun getUser() = safeApiCall { api.getUser() }

}