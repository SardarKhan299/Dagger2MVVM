package com.dagger2mvvm.di

import com.dagger2mvvm.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}