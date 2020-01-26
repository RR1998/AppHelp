package com.example.finalproject

import android.app.Application
import com.example.finalproject.di.appModule
import com.example.finalproject.di.coreModule
import com.example.finalproject.di.dataModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class HelpDeskApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@HelpDeskApplication)
            androidFileProperties()
            modules(listOf(appModule, dataModule, coreModule))
        }
    }
}