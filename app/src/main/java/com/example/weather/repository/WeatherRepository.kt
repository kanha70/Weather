package com.example.weather.repository

import com.example.weather.network.ApiService
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val apiService: ApiService){
    suspend fun getWeather() = apiService.getWeather()
}