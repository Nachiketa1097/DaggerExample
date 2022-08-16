package com.example.daggerexample

import dagger.BindsInstance
import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory //factory will create object of UserRegistrationComponent
    interface Factory{
        fun create(@BindsInstance retryCount : Int) : UserRegistrationComponent
    }
}