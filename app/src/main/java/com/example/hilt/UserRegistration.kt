package com.example.hilt

import android.util.Log
import javax.inject.Inject


interface UserRegistration{
    fun saveUser()
}

class SQLRepo @Inject constructor():UserRegistration{
    override fun saveUser() {
        Log.d("KOTLIN","User saved in DB")
    }

}