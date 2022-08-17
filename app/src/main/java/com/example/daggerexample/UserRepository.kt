package com.example.daggerexample

import android.content.ContentValues
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    fun saveUser(email: String, password: String)
    }

@ApplicationScope
class SQLRepository @Inject constructor() : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(ContentValues.TAG,"User Saved in SQL database")
    }
}

class FirebaseRepository : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(ContentValues.TAG,"User Saved in Firebase database")
    }
}