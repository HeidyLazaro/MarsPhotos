package com.example.marsphotos.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MarsPhoto (
    val id: String,
    //val img_src: String
    @SerialName(value = "img_src")
    val imgSrc: String
    )