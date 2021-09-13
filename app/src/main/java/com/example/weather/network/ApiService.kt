package com.example.weather.network

import com.example.weather.model.Weather
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("weather/Delhi")
    suspend fun getWeather() : Response<Weather>
}