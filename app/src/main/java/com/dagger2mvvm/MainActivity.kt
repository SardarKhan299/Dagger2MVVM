package com.dagger2mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dagger2mvvm.app.MyApplication

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val component = (application as MyApplication).appComponent
        component.inject(this)
    }
}