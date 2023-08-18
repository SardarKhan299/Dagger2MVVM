package com.dagger2mvvm.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dagger2mvvm.model.Product
import com.dagger2mvvm.network.FakerAPI
import javax.inject.Inject

class ProductRepo @Inject constructor(val fakerAPI: FakerAPI) {

    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>>
        get() = _products

    suspend fun getProducts(){
        val result = fakerAPI.getProducts()
        if(result.isSuccessful && result.body() != null){
            _products.postValue(result.body())
        }else{

        }
    }

}