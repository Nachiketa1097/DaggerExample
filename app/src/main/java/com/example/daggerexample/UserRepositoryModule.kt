package com.example.daggerexample

import dagger.Binds
import dagger.Module

@Module
abstract class UserRepositoryModule {

//    @Provides
//    fun getFirebaseRepository() : UserRepository{
//        return FirebaseRepository()
//    }

//    @Provides
//    fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository{
//        return sqlRepository
//    }

    @Binds
    abstract fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository // Here bind is just used to bind UserRepository with SqlRepository

}