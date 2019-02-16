package com.example.admin.simpleproject.Application

import android.app.Activity
import android.app.Application
import com.example.admin.simpleproject.component.DaggerUserComponent
import com.example.admin.simpleproject.component.UserComponent
import com.example.admin.simpleproject.module.ContextModule
import timber.log.Timber



class UserApplication : Application() {
    private lateinit var userApplicationComponent : UserComponent
     companion object {
         fun get(activity: Activity) : UserApplication{
             return activity.application as UserApplication
         }
     }

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        userApplicationComponent = DaggerUserComponent.builder()
            .contextModule((ContextModule(this)))
            .build()
    }

    fun getUserApplicationComponent() : UserComponent{
        return userApplicationComponent
    }
}