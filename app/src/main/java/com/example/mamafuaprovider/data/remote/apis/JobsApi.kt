package com.example.mamafuaprovider.data.remote.apis

import com.example.mamafuaprovider.data.responses.OrdersResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface JobsApi : BaseApi {

    @GET("orders/{profileId}")
    suspend fun getJobs(@Query("profileId") id: String): Response<OrdersResponse>
}