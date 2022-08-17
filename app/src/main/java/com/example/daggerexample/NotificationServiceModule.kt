package com.example.daggerexample

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

//@Module
//class NotificationServiceModule(private val retryCount : Int) {
//
//  //  @Named("message")
//    @MessageQualifier
//    @Provides
//    fun getMessageService() : NotificationService{
//        return MessageService(retryCount)
//    }
//
//    @Named("email")
//    @Provides
//    fun getEmailService(emailService: EmailService) : NotificationService{
//        return emailService
//    }
//}

@Module
class NotificationServiceModule() {

    @Singleton
    @MessageQualifier
    @Provides
    fun getMessageService(retryCount : Int) : NotificationService{
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService{
        return emailService
    }
}





























