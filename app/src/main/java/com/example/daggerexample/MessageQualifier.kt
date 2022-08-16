package com.example.daggerexample

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier

@Qualifier // use to make annotation qualifier
@Documented //it means it come under java doc or not
@Retention(RetentionPolicy.RUNTIME) //Retention define timeline
annotation class MessageQualifier()
