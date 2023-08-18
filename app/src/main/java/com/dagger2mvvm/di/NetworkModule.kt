package com.dagger2mvvm.di

import com.dagger2mvvm.network.FakerAPI
import com.dagger2mvvm.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun providesRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun providesFakerApi(retrofit: Retrofit):FakerAPI{
        return retrofit.create(FakerAPI::class.java)
    }
}