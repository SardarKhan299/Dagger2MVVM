package com.dagger2mvvm.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dagger2mvvm.repository.ProductRepo
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(private val repo: ProductRepo):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repo) as T
    }
}