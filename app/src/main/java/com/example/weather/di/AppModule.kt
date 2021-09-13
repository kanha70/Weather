package com.example.weather.di

import com.example.weather.network.ApiService
import com.example.weather.utils.Constant
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent :: class)
object AppModule {
    @Provides
    fun provideBaseUrl() = Constant.BASE_URL

    @Provides
    @Singleton
    fun provideRetrofitInstance(BASE_URL: String) : ApiService =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService :: class.java)
}