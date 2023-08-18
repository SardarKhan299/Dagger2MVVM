package com.dagger2mvvm.network

import com.dagger2mvvm.model.Product
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {
    @GET("products")
    suspend fun getProducts() : Response<List<Product>>
}