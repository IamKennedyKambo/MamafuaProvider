package com.example.mamafuaprovider.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Service(
    val __v: Int,
    @PrimaryKey
    val _id: String,
    val createdAt: String,
    val description: String,
    val imageUrl: String,
    val machinePrice: Int,
    val name: String,
    val offSitePrice: Int,
    val offerPc: Int,
    val onSitePrice: Int,
    val updatedAt: String
)