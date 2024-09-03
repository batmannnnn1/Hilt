package com.example.hilt

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dagger.hilt.EntryPoint
import javax.inject.Inject

@EntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegistration: UserRegistration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userRegistration.saveUser()
    }
}