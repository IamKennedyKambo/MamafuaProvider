package com.example.mamafuaprovider.data.responses

import com.example.mamafuaprovider.data.local.entities.Order

data class OrdersResponse(val message: String, val orders: List<Order>)
