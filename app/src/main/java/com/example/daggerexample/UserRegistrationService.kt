package com.example.daggerexample

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val notificationService: NotificationService
){

    fun registerUser(email : String, password : String){
        notificationService.send(email, "","User Registered") // Notification service yha pr sirf send method ko call krega
        //iske pichhe kon sa metod message sent hoga ya email sent hoga us se koi matlab nhi SO IT IS CALLED LOOSLY COPLE

        userRepository.saveUser(email, password) //IT IS ALSO LOOSLY COUPLE

    }

}