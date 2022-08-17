package com.example.daggerexample

import android.app.Application

class UserApplication : Application() { // Application class object is top level object

    lateinit var userRegistrationComponent : UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()
        userRegistrationComponent  = DaggerUserRegistrationComponent.factory().create(3)

    }
}