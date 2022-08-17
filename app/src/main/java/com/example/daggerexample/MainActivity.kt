package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService : UserRegistrationService
    @Inject
    lateinit var emailService: EmailService
    @Inject
    lateinit var emailService1: EmailService
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val component  = DaggerUserRegistrationComponent.factory().create(3)
//        emailService = component.getEmailService()
//        emailService1 = component.getEmailService()
//
//        val component2  = DaggerUserRegistrationComponent.factory().create(3)
//        emailService1 = component2.getEmailService()
//        emailService = component2.getEmailService()

        val component = (application as UserApplication).userRegistrationComponent
        component.inject(this)
        userRegistrationService.registerUser("nachiketa1097@gmail.com", "1000001")
        emailService.send("","","")
    }
}