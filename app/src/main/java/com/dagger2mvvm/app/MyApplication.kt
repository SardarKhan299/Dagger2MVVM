package com.dagger2mvvm.app

import android.app.Application
import com.dagger2mvvm.di.AppComponent
import com.dagger2mvvm.di.DaggerAppComponent

class MyApplication:Application() {

    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build()
    }
}