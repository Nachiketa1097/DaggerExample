package com.example.daggerexample

import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
 //   @Named("message") private val notificationService: NotificationService
    @MessageQualifier private val notificationService: NotificationService
){

    fun registerUser(email : String, password : String){
        notificationService.send(email, "","User Registered")
        userRepository.saveUser(email, password)

    }

}