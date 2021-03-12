package com.example.mamafuaprovider.data.repository

import com.example.mamafuaprovider.data.remote.apis.JobsApi

class JobsRepository(private val api: JobsApi): BaseRepository(api){

    suspend fun getJobs(id: String) = safeApiCall {
        api.getJobs(id)
    }
}