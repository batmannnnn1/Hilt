package com.example.hilt

import android.app.Application
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MyApplication():Application(){

    override fun onCreate() {
        super.onCreate()
    }
}