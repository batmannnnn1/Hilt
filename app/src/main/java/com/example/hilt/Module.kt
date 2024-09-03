package com.example.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
class Module {

    @Provides
    fun getSQLRepo():UserRegistration{
        return SQLRepo()
    }
}