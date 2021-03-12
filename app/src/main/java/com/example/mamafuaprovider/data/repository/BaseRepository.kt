package com.example.mamafuaprovider.data.repository

import com.example.mamafuaprovider.data.remote.apis.BaseApi
import com.example.mamafuaprovider.data.remote.SafeApiCall

abstract class BaseRepository(private val api: BaseApi) : SafeApiCall {

    suspend fun logout() = safeApiCall {
        api.logout()
    }
}