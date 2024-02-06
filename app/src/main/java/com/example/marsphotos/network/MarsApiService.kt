package com.example.marsphotos.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create
import retrofit2.http.GET

//URL base del servicio web
private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"

//Compilador retrofit y objeto retrofit
private val retrofit =
    Retrofit.Builder().addConverterFactory(ScalarsConverterFactory.
    create()).baseUrl(BASE_URL).build()

//Interfaz
interface MarsApiService{
    @GET("photos")
    //Hacemos que sea una funcion de suspension para que sea asincrona
    suspend fun getPhotos(): String
}

//Objeto publico para inicializar el servicio de Retrofit
object MarsApi{
    val retrofitService : MarsApiService by lazy{
        retrofit.create(MarsApiService::class.java)
    }
}