package com.example.marsphotos.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.create
import retrofit2.http.GET

//URL base del servicio web
//private const val BASE_URL =
//    "https://android-kotlin-fun-mars-server.appspot.com"

//Compilador retrofit y objeto retrofit
//private val retrofit = Retrofit.Builder()
//    .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
//    .baseUrl(BASE_URL)
//    .build()

//Interfaz
interface MarsApiService{
    @GET("photos")
    //Hacemos que sea una funcion de suspension para que sea asincrona
    suspend fun getPhotos(): List<MarsPhoto>
}