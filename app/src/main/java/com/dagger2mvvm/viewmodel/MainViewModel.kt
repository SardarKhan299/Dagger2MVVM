package com.dagger2mvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dagger2mvvm.model.Product
import com.dagger2mvvm.repository.ProductRepo
import kotlinx.coroutines.launch

class MainViewModel(private val repo: ProductRepo):ViewModel() {

    val productsLiveData:LiveData<List<Product>>
        get() = repo.products
    init {
        viewModelScope.launch {
            repo.getProducts()
        }
    }

}